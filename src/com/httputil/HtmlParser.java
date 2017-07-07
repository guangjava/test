package com.httputil;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import com.regex.RegexTest;

/**
 * @comment 提取HTML源码中的GIF动画路径
 * @author zhouchenguang
 * @date 2016年6月20日下午4:51:01
 * @version 1.0.0
 * @see
 */
public class HtmlParser {

	private static final String PATH = "D:/testData/new.txt";
	private static final String REGEX = "<img data-type=\"gif\"(.*?)/>";
	private static final String REGEX_2 = "data-src=\"(.*?)\"";
	public static void main(String[] args) {

		try {
			getSrc(PATH);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**从文件中读取字符串
	 * @param path
	 * @return
	 * @throws Exception
	 * @exception
	 * @author zhouchenguang
	 * @date 2016年6月20日下午2:05:08
	 * @since 1.0.0
	 * @see
	 */
	public static void getSrc(String path) throws Exception{
		File file = new File(path);
		FileReader fileReader = new FileReader(file);
		
		File out = new File("D:\\testData\\html.txt");
		FileWriter fw = new FileWriter(out);
		char[] cbuf = new char[4096];
		String src = null;
		int n = 0;
		while ((n = fileReader.read(cbuf)) != -1) {
			src = new String(cbuf, 0, n);
			System.out.println(src);
			System.out.println("*****************");
			String result = RegexTest.removeHtmlMark(src);
			System.out.println(result);
			fw.write(result);
		}
		fileReader.close();
		fw.close();
	}
	
	private static void getSrc(String path,String regex,String regex2) throws Exception{
		File file = new File(path);
		FileReader fileReader = new FileReader(file);
		char[] cbuf = new char[4096];
		String src = null;
		while ((fileReader.read(cbuf)) != -1) {
			src = new String(cbuf);
			RegexTest.getStrings(src, regex,regex2);
		}
		fileReader.close();
	}

}
