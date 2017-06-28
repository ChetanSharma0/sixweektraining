package gui.swing.pack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstFram {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstFram window = new FirstFram();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FirstFram() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnFrameOpen = new JButton("Frame Open");
		btnFrameOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				SecondFrame frame = new SecondFrame();
				frame.dframe.setVisible(true);
				
				
				
				
				
				
			}
		});
		btnFrameOpen.setBounds(64, 143, 89, 23);
		frame.getContentPane().add(btnFrameOpen);
	}

}
