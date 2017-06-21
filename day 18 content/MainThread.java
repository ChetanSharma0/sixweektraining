package com.thread.com;

public class MainThread implements Runnable {

	public static void main(String[] args) {

		MainThread mainThread = new MainThread();
		Thread thread = new Thread(mainThread);
		System.out.println("befor sleep");
//		try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("after sleep");
		thread.start();
////		thread.setPriority(1);
//		
		
		for (int i = 0; i < 10; i++) {

			System.out.println(Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getPriority());
//try {
//	Thread.sleep(10000);
//} catch (InterruptedException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}			
			if (i==7)
			{
				thread.interrupt();
			}

		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {

		
			System.out.println(Thread.currentThread().getName());
		
			System.out.println(Thread.currentThread().getPriority());
			
try {
	Thread.sleep(10000);
} catch (InterruptedException e) {
//	// TODO Auto-generated catch block

System.out.println("interrupted");
}
		}
	
		
		
		
		
		
		
		
	}
	
}
