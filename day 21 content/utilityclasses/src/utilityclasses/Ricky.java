package utilityclasses;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Ricky {
final static int speed=500;	
	void run(int keycode[])
	{
		try {
			Robot robot = new Robot();
			
		for (int i = 0; i < keycode.length; i++) {
			
			robot.delay(500);
			robot.keyPress(keycode[i]);
			robot.keyRelease(keycode[i]);
		}
			
			
			
			
			
			
			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("********Ricky Robot Start******");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int[] notepad = {KeyEvent.VK_WINDOWS,KeyEvent.VK_N,KeyEvent.VK_O,KeyEvent.VK_T,KeyEvent.VK_E,KeyEvent.VK_P,KeyEvent.VK_A,KeyEvent.VK_D,KeyEvent.VK_ENTER};
	    int[] maxnotepad= {KeyEvent.VK_ALT,KeyEvent.VK_SPACE,KeyEvent.VK_X};
	    int[] msg= {KeyEvent.VK_R,KeyEvent.VK_I,KeyEvent.VK_C,KeyEvent.VK_K,KeyEvent.VK_Y,KeyEvent.VK_R,KeyEvent.VK_O,KeyEvent.VK_C,KeyEvent.VK_K,KeyEvent.VK_S};
		
		
		
		Ricky ricky = new Ricky();
		ricky.run(notepad);
		ricky.run(maxnotepad);
		ricky.run(msg);
		
	}

}
