package com.httputil;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @comment 发送post请求
 * @author zhouchenguang
 * @date 2016年4月19日下午3:47:54
 * @version 1.0.0
 * @see
 */
public class HttpRequest {
	public static String sendPostRequest(String url,String postData){
		String data = null;
		try {
			URL dataUrl = new URL(url);
			
			HttpURLConnection con = (HttpURLConnection) dataUrl.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Proxy-Connection", "Keep-Alive");
			con.setDoOutput(true);
			con.setDoInput(true);
			
			OutputStream os = con.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			
			dos.write(postData.getBytes());
			dos.flush();
			dos.close();
			
			InputStream is = con.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			
			byte[] d = new byte[dis.available()];
			dis.read(d);
			data = new String(d);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}

}
