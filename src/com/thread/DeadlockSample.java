package com.thread;

public class DeadlockSample {
	private Object obj1 = new Object();
	private Object obj2 = new Object();
	public static void main(String[] args) {
		DeadlockSample sample = new DeadlockSample();
		sample.deadLock();

	}
	void deadLock(){
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					testLock1();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					testLock2();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		});
		thread1.start();
		thread2.start();
	}
	void testLock1() throws InterruptedException{
		synchronized (obj1) {
			Thread.sleep(100);
			System.out.println("thread"+Thread.currentThread().getName()+" wait obj2");
			synchronized (obj2) {
				System.out.println("ok");
			}
		}
	}
	
	void testLock2() throws InterruptedException{
		synchronized (obj2) {
			Thread.sleep(100);
			System.out.println("thread"+Thread.currentThread().getName()+" wait obj1");
			synchronized (obj1) {
				System.out.println("ok");
			}
		}
	}

}
