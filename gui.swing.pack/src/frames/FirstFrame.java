package frames;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstFrame {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstFrame window = new FirstFrame();
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
	public FirstFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0,0, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		JLabel lblName = new JLabel("Name :");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblName.setBounds(94, 86, 92, 14);
		frame.getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setBounds(175, 86, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSendData = new JButton("Send Data");
		btnSendData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				SecondFrame frame = new SecondFrame();
				frame.frame.setVisible(true);
				frame.lblNewLabel.setText(textField.getText());
				
			}
		});
		btnSendData.setBounds(133, 141, 89, 23);
		frame.getContentPane().add(btnSendData);
	}
}
