package com.num;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadLocalRandom;

public class RandomTest {
	private static final long COUNT = 10000000;
	private static final int THREADS = 2;
	public static void main(String[] args) {
//		 System.out.println( "Shared Random" );
//		    testRandom(THREADS, COUNT);
//		  System.out.println("ThreadLocal<Random>");
//		  testTL_Random(THREADS, COUNT);
//		  System.out.println("ThreadLocalRandom");
//		  testTLRandom(THREADS, COUNT);
//		  System.out.println("Shared Random[] with no padding");
//		  testRandomArray(THREADS, COUNT, 1);
		  System.out.println("Shared Random[] with padding");
		  testRandomArray(THREADS, COUNT, 2);

	}
	//runner for all tests
	private static class RandomTask implements Runnable{
		private final Random rnd;
		private final int id;
		private final long cnt;
		private final CountDownLatch latch;
		public RandomTask(Random rdm,int id,long count,CountDownLatch cd) {
			this.cnt = count;
			this.id = id;
			this.rnd = rdm;
			this.latch = cd;
		}
		Random getRandom(){
			return rnd;
		}
		@Override
		public void run() {
			try {
				final Random rnd = getRandom();
				latch.countDown();
				latch.await();
				long begin = System.currentTimeMillis();
				long sum = 0;
				for(int i=0;i<cnt;i++){
					sum += rnd.nextInt();
				}
				System.out.println("Thread#"+id+" Time:"+(System.currentTimeMillis()-begin)/1000.0+"secs sum="+sum);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	private static void testRandom(final int threads,final long cnt){
		Random rdm = new Random(100);
		CountDownLatch latch = new CountDownLatch(threads);
		for(int i=0; i<threads; i++){
			Thread thread = new Thread(new RandomTask(rdm, i, cnt, latch));
			thread.start();
		}
	}
	private static void testRandomArray(final int threads,final long cnt,final int padding){
		Random[] randomArray = new Random[threads * padding];
		for(int i=0;i<threads*padding;i++){
			randomArray[i] = new Random(100);
		}
		CountDownLatch latch = new CountDownLatch(threads);
		for(int i=0; i<threads; i++){
			Thread thread = new Thread(new RandomTask(randomArray[i*padding], i, cnt, latch));
			thread.start();
		}
	}
	private static void testTLRandom(final int threads,final long cnt){
		CountDownLatch latch = new CountDownLatch(threads);
		for(int i=0;i<threads;i++){
			Thread thread = new Thread(new RandomTask(null, i, cnt, latch){
				@Override
				Random getRandom() {
					
					return ThreadLocalRandom.current();
				}
			});
			thread.start();
		}
	}
	private static void testTL_Random(final int threads,final long cnt){
		CountDownLatch latch = new CountDownLatch(threads);
		final ThreadLocal<Random> rnd = new ThreadLocal<Random>(){

			@Override
			protected Random initialValue() {
				return new Random(100);
			}
			
		};
		for(int i=0;i<threads;i++){
			Thread thread = new Thread(new RandomTask(null, i, cnt, latch){

				@Override
				Random getRandom() {
					return rnd.get();
				}
				
			});
			thread.start();
		}
	}

}
