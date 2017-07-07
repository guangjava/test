package com.callback;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

@SuppressWarnings("unused")
public class CallDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		/*
		 *  第一种方式:Future + ExecutorService
		 * ExecutorService service = Executors.newCachedThreadPool();
		Task task = new Task();
		Future<Integer> futrue = service.submit(task);
		service.shutdown();
		
		Thread.sleep(1000);
		while(!futrue.isDone()){
			System.out.println("thread["+Thread.currentThread().getName()+"] is running.");
			Thread.sleep(2000);
		}
		Integer result = futrue.get();
		System.out.println("result is "+result);
		*/
		
		/*
		 *  第二种方式: FutureTask + ExecutorService
		 * ExecutorService service = Executors.newCachedThreadPool();
		Task task = new Task();
		FutureTask<Integer> futureTask = new FutureTask<>(task);
		 service.submit(futureTask);
		service.shutdown();*/
		
		 /**
         * 第三种方式:FutureTask + Thread
         */
		Task task = new Task();
		 // 2. 新建FutureTask,需要一个实现了Callable接口的类的实例作为构造函数参数
		FutureTask<Integer> futureTask = new FutureTask<>(task);
		 // 3. 新建Thread对象并启动
		Thread thread = new Thread(futureTask,"Task thread");
		thread.start();
		
		Thread.sleep(1000);
		 // 4. 调用isDone()判断任务是否结束
		while(!futureTask.isDone()){
			System.out.println("thread["+Thread.currentThread().getName()+"] is running.");
			Thread.sleep(2000);
		}
		 // 5. 调用get()方法获取任务结果,如果任务没有执行完成则阻塞等待
		Integer result = futureTask.get();
		System.out.println("result is "+result);
		

	}
	  // 1. 继承Callable接口,实现call()方法,泛型参数为要返回的类型
	static class Task implements Callable<Integer>{

		@Override
		public Integer call() throws Exception {
			System.out.println("thread["+Thread.currentThread().getName()+"] is running.");
			int result = 0;
			for(int i=0; i<100; i++){
				result+=i;
			}
			Thread.sleep(3000);
			return result;
		}
		
	}

}
