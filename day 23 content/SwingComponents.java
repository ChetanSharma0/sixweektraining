package gui.swing.pack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class SwingComponents {
	
	
	
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
		
		JTextField field = new JTextField();
		field.setSize(150, 30);
		field.setLocation(30, 20);
		
		
		JLabel jLabel = new JLabel("user nameeeeeeeeeeee");
	jLabel.setSize(100, 50);
	jLabel.setLocation(100, 100);
	jframe.add(jLabel);
	
		JButton jbutton = new JButton("Swing Button");
		jbutton.setSize(150, 50);
		jbutton.setLocation(300, 50);
		
		jbutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println(field.getText());
			}
		});
	jframe.add(jbutton);
			
		jframe.add(field);
		
		
	}

}
