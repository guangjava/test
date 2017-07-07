package com.javasrc;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class CrawSrcCode {
	// http://grepcode.com/file_/repository.grepcode.com/java/root/jdk/openjdk/6-b14/javax/crypto/Cipher.java?v=source&disposition=attachment
	/**
	 * 基础的下载url地址
	 * 
	 * <pre>
	 * 基本用法：
	 * System.out.println(String.format(baseUrl, &quot;java/crypto/Cipher&quot;));
	 * </pre>
	 */
	private static final String urlBasePath = "http://grepcode.com/snapshot/repository.grepcode.com/java/root/jdk/openjdk/7u40-b43/%s.java?v=source&disposition=attachment";
	/**
	 * jar包文件的存放目录地址
	 */
	private static String fileBasePath = "D:/Fwp/java-api/";
	public static void run()
	 throws ZipException, IOException {
		// 读取jar文件
		File file = new File(fileBasePath);
		if (!file.isDirectory())
			return;
		System.out.println("now we will begin!");

		File[] fileList = file.listFiles();
		if (fileList != null) {

			// 先初始化一个httpClient，共用这个
			HttpClient httpClient = new DefaultHttpClient();

			for (int i = 0; i < fileList.length; i++) {
				File tempFile = fileList[i];
				if (tempFile.isFile() && tempFile.getName().endsWith("jar")) {
					System.out.println(tempFile.getName());
					// 解析这些jar文件
					ZipFile jarZf = new ZipFile(tempFile);
					Enumeration<? extends ZipEntry> enumerZipEntry = jarZf.entries();
					while (enumerZipEntry.hasMoreElements()) {
						ZipEntry ze = enumerZipEntry.nextElement();
						// 得到class文件
						String classPathName = ze.getName();
						if (classPathName.endsWith(".class")) {
							String urlClassPath = classPathName.substring(0, classPathName.length() - 6);
							// 创建目录
							createFileDir(urlClassPath);
							String urlClassFullPath = String.format(urlBasePath, urlClassPath);

							// 从网络上拉
							getFromSourceNet(urlClassFullPath, fileBasePath + urlClassPath + ".java", httpClient);
						}
					}
				}
			}

			// 关闭httpClient
			httpClient.getConnectionManager().shutdown();
		}
		
	}

	/** 创建文件夹 */
	private static void createFileDir(String classPathName) {
		int slashIndex = classPathName.lastIndexOf('/');
		if (slashIndex != -1) {
			File storeFile = new File(fileBasePath + classPathName.substring(0, slashIndex));
			if (!storeFile.exists()) {
				storeFile.mkdirs();
			}
		} else {
			return;
		}
	}

	/** 从网络上拉取源码 */
	private static void getFromSourceNet(String urlPath, String filePath, HttpClient httpClient) {
		// 拉取
		System.out.println("进入拉取" + urlPath + "--->" + filePath);
		if (filePath.contains("$")) {
			System.out.println("有$，不拉取--->" + filePath);
			return;
		}

		try {
			File file = new File(filePath);
			if (file.exists()) {
				System.out.println("skip:--->" + filePath);
				return;
			}
			HttpGet httpGet = new HttpGet(urlPath);
			HttpResponse httpResponse = httpClient.execute(httpGet);
			// 如果得到正确的返回
			if (httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
				InputStream ips = null;
				OutputStream ops = null;
				try {
					ips = httpResponse.getEntity().getContent();
					byte[] bufferBytes = new byte[1024];
					int len = -1;
					// 60为坐尖括号，表示拉取网站转发的html，不拉取
					if ((len = ips.read(bufferBytes)) != -1 && bufferBytes[0] != 60) {
						if (!file.exists()) {
							file.createNewFile();
						}
						ops = new FileOutputStream(file);
						ops.write(bufferBytes, 0, len);
						while ((len = ips.read(bufferBytes)) != -1) {
							ops.write(bufferBytes, 0, len);
						}
					}
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("error in file:拉取" + urlPath + "--->" + filePath);
				} finally {
					if (ips != null)
						ips.close();
					if (ops != null)
						ops.close();
				}
			} else {
				System.out.println("error in http code = " + httpResponse.getStatusLine().getStatusCode() + "--->"
						+ filePath);
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
