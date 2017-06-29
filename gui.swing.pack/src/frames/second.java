package frames;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ImageIcon;

public class second {

	private JFrame frame;
	JList list = new JList();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					second window = new second();
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
	public second() {
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Jalndhar", "Amritsar", "Patiala"}));
		comboBox.setBounds(126, 103, 139, 20);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			System.out.println(comboBox.getSelectedItem());
			System.out.println(list.getSelectedValue());
			}
		});
		btnNewButton.setBounds(114, 203, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Jalandhar", "Amritsar"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(271, 41, 153, 185);
		frame.getContentPane().add(list);
		
		JButton btnLogIn = new JButton("");
		btnLogIn.setIcon(new ImageIcon("E:\\old workspace\\workspace\\StudentUtilityTool\\log.png"));
		btnLogIn.setBounds(47, 38, 89, 23);
		
		btnLogIn.setBorderPainted(false); 
		btnLogIn.setEnabled(true);//disabled the button
		btnLogIn.setOpaque(false);
		btnLogIn.setContentAreaFilled(false);
		btnLogIn.setFocusPainted(false);
		btnLogIn.setToolTipText("Log In");
	
		
		
		
		
		
		
		
		
		
		
		frame.getContentPane().add(btnLogIn);
	}
}
