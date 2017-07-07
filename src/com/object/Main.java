 package com.object;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.NonWritableChannelException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.order.dto.Child;
import com.order.dto.Person;

public class Main {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fi = new FileInputStream("d:\\testData\\new8.txt");
		byte[] buf = new byte[1000];
		HashMap<String,String> map = new HashMap<>();
		map.keySet();
		while(fi.read(buf)!=-1){
			String string = new String(buf,"big5");
			byte[] newbyte = string.getBytes("gbk");
			String newstring = new String(newbyte, "gbk");
			System.out.println("buf"+buf);
			System.out.println("newbyte:"+newbyte);
			System.out.println(newstring);
		}
		
		Person person = new Person(1);
		Child.printOk();
		person.setName("deva");
		Prototype prototype = new Prototype(1, "xavi", person);
		try {
			Prototype shalowclone = (Prototype) prototype.clone();
			Prototype deepclone = (Prototype) prototype.deepClone();
			person.setName("leo");
			System.out.println("origin:"+prototype.getObj().getName());
			System.out.println("shalowclone:"+shalowclone.getObj().getName());
			System.out.println("deepclone:"+deepclone.getObj().getName());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static class PageWithData <E>{
		private List<E> data ;

		public List<E> getData() {
			return data;
		}

		public void setData(List<E> data) {
			this.data = data;
		}


	}

	static class Page<E> extends ArrayList<E> {

	}

	static class Order{
		private String id;
		private int num;
		public Order(String id, int num) {
			super();
			this.id = id;
			this.num = num;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
	}

	static <E> PageWithData<E> convertPage(Page<E> page){
		PageWithData<E> pageWithData = new PageWithData<>();
		pageWithData.setData(page);
		return pageWithData;
		
	}
	
	static PageWithData generatePage(Page page){
		PageWithData pageWithData = new PageWithData<>();
		pageWithData.setData(page);
		return pageWithData;
		
	}
}
