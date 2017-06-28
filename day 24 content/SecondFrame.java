package gui.swing.pack;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class SecondFrame {

	 JFrame dframe;

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
	}

}
