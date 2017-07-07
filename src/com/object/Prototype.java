package com.object;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Hashtable;

import com.order.dto.Person;

public class Prototype implements Cloneable,Serializable,Runnable{

	private static final long serialVersionUID = 7530752993321225070L;
	private HashMap<String, String> hashMap = new HashMap<>();
	private Hashtable<String, String> hashtable = new Hashtable<>();
	private int count;
	private String string;
	private Person obj;
	public Prototype(int count, String string, Person obj) {
		super();
		this.count = count;
		this.string = string;
		this.obj = obj;
	}
	/* 浅克隆
	 * (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		Prototype clone = (Prototype) super.clone();
		return clone;
	}
	
	public Object deepClone() throws IOException, ClassNotFoundException {
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bo);
		oos.writeObject(this);
		
		ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bi);
		return ois.readObject();
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}
	public Person getObj() {
		return obj;
	}
	public void setObj(Person obj) {
		this.obj = obj;
	}
	@Override
	public void run() {
		hashMap.put(null, null);
	}

	
}
