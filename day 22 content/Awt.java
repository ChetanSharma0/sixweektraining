package gui.swing.pack;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Awt {
	public static void main(String[] args) {
		// diff awt and swing
		
		
		//Awt
//		Frame frame = new Frame("Awt Frame");
//		frame.setVisible(true);
//		
//		frame.setLayout(null);
//		frame.setSize(500, 500);
//		
//		
//		Button button = new Button("Awt Button");
//		button.setSize(150, 50);
//		button.setLocation(300, 50);
//	frame.add(button);
//		
		
		
		//Swings
		
		
	JFrame jframe = new JFrame("Swing Frame");
	jframe.setVisible(true);
	
	jframe.setLayout(null);
	jframe.setSize(500, 500);
	
	
	JButton jbutton = new JButton("Swing Button");
	jbutton.setSize(150, 50);
	jbutton.setLocation(300, 50);
	
	jbutton.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("Button pressed");
		}
	});
jframe.add(jbutton);
		
		
		
		
		
		
		
		
		
		
	}

}
