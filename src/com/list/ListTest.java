package com.list;

import java.io.IOException;
import java.util.zip.ZipException;

import com.javasrc.CrawSrcCode;

public class ListTest {
	public static void main(String[] args){
		try {
			CrawSrcCode.run();
		} catch (ZipException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
