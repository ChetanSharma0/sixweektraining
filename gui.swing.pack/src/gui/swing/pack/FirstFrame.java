package gui.swing.pack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class FirstFrame {

	private JFrame frame;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUserName = new JLabel("User Name : ");
		lblUserName.setFont(new Font("Microsoft YaHei Light", Font.BOLD, 18));
		lblUserName.setBounds(57, 77, 127, 39);
		frame.getContentPane().add(lblUserName);
		
		JLabel lblPassword = new JLabel("PassWord : ");
		lblPassword.setFont(new Font("Microsoft YaHei Light", Font.BOLD, 18));
		lblPassword.setBounds(57, 143, 127, 39);
		frame.getContentPane().add(lblPassword);
		
		JButton btnLogIn = new JButton("Log in");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.out.println("action");
				
			}
		});
		btnLogIn.setBounds(201, 215, 89, 23);
		frame.getContentPane().add(btnLogIn);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("E:\\old workspace\\workspace\\StudentUtilityTool\\final.gif"));
		label.setBounds(10, 0, 424, 250);
		frame.getContentPane().add(label);
	}
}
