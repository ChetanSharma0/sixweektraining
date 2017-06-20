package com.thread;

public class Main extends Thread {
	public static void main(String[] args) {
		
		Main main = new Main();
		main.start();
		new Child().start();
			for (int i=0; i<=10; i++)
		{
			System.out.println("main thread");
		}
		
	}
	
	public void run()
	{
		
		for (int i=0; i<=10; i++)
		{
			System.out.println(this.getName());
		}
		
		
	}

}
