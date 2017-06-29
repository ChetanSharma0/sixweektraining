package frames;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class SecondFrame {

	 JFrame frame;
	JLabel lblNewLabel = new JLabel("");
	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the application.
	 */
	public SecondFrame() {
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
		
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(48, 110, 289, 41);
		frame.getContentPane().add(lblNewLabel);
	}

}
