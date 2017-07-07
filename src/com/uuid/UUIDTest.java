package com.uuid;

import java.util.UUID;

public class UUIDTest {
	public static void main(String[] args)  {
		String id = UUID.randomUUID().toString();
		id = id.replaceAll("-", "");
		System.out.println("length:"+id.length()+" "+id);
	}

}
