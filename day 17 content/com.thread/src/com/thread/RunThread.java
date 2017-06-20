package com.thread;

public class RunThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0; i<=10; i++)
		{
			System.out.println("child thread");
		}
		
	}

	
	public static void main(String[] args) {
		
RunThread runThread = new RunThread();

Thread thread = new Thread(runThread);
thread.start();




for (int i=0; i<=10; i++)
{
	System.out.println("main thread");
}


	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
}
