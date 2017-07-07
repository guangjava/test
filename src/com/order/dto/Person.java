package com.order.dto;

import java.io.Serializable;

public class Person implements Serializable,Runnable{
	private static final long serialVersionUID = 2718148117493823697L;
	private Integer num;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void printOk() {
		System.out.println("panret");
	}
	
	public void addNum(Integer num) {
		num++;
	}
	
	@Override
	public void run() {
		
	}

	public Person(Integer num) {
		super();
		this.num = num;
	}
	
	public static void main(String[] args) {
		Integer num = new Integer(5);
		Person person = new Person(num);
		person.addNum(num);
		Person person2 = new Person(num);
		System.out.println(person2.num);
		person.run();
	}
}
