package com.main;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import com.order.dto.Person;

import test.annotation.ChildClass;
import test.annotation.TestMyAnnotation;

public class Main {

	public static void main(String[] args) {
//		BrandModelQueryParamsDto item = new BrandModelQueryParamsDto();
//		item.getPerson().setName("test");
//		System.out.println(item.getPerson().getName());
		
		/*Person person = new Person();
		person.setName("11");
		rename(person, "22");
		System.out.println(person.getName());
		
		Date date = Calendar.getInstance().getTime();
		System.out.println(date);*/
		
		try {
			Method method = TestMyAnnotation.class.getMethod("testMethod", null);
//			Annotation annotation = method.getAnnotation(MyAnnotation.class);
			/*Annotation annotation = TestMyAnnotation.class.getAnnotation(MyAnnotation.class);
			System.out.println(annotation.annotationType());*/
			
//			Annotation[] annotations = TestMyAnnotation.class.getAnnotations();
			Annotation[] annotations = ChildClass.class.getDeclaredAnnotations();
			for (Annotation annotation : annotations) {
				System.out.println(annotation.annotationType());
			}
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}
	
	

	@SuppressWarnings("unused")
	private static String removeNull(String src){
		return src.replaceAll(">null</", "></");
	}
	
	@SuppressWarnings("unused")
	private static void rename(Person person,String name) {
		person.setName(name);
	}

}
