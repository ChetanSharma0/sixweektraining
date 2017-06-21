package com.thread.com;

public class Yield implements Runnable{
	
	
	public static void main(String[] args) {
		
		Yield  yield = new Yield();
		Thread thread = new Thread(yield);
		thread.start();
		for (int i = 0; i < 10; i++) {

			System.out.println(Thread.currentThread().getName());
		
		Thread.yield();
		
		}
		
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		
		for (int i = 0; i < 10; i++) {

			System.out.println(Thread.currentThread().getName());
		}

		
	}

}
