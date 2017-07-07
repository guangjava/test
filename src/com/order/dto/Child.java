package com.order.dto;

public class Child extends Person{

	public Child(Integer num) {
		super(num);
	}

	private static final long serialVersionUID = -8491403139641081682L;
	
	public static void printOk() {
		System.out.println("child");
	}
}
