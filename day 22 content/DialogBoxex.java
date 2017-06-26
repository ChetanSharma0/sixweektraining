package gui.swing.pack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class DialogBoxex {
	
	
	
	
	static {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
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
//			JOptionPane.showMessageDialog(null, "shudown","shutdown message",JOptionPane.QUESTION_MESSAGE);
//			
//			
//	JOptionPane.showMessageDialog(null, "shudown","shutdown message",JOptionPane.ERROR_MESSAGE);
//			
			
			
			
		int i=JOptionPane.showConfirmDialog(null, "are you want exit");	
			if (i==0)
			{
				System.out.println("yes clicked");
			}
			
			
			
			
			String msg =JOptionPane.showInputDialog(null, "Enter message");
			
			System.out.println(msg);
			
			
			
			}
		});
	jframe.add(jbutton);
			
		
		
	}

}
