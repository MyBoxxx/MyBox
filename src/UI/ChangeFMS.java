package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JButton;


public class ChangeFMS extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangeFMS frame = new ChangeFMS();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChangeFMS() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnChangeFms = new JTextPane();
		txtpnChangeFms.setText("Change FMS");
		txtpnChangeFms.setBounds(173, 22, 71, 28);
		contentPane.add(txtpnChangeFms);
		
		JButton btnLimitNumberOf = new JButton("Limit Number Of People In The Group");
		btnLimitNumberOf.setBounds(10, 56, 216, 44);
		contentPane.add(btnLimitNumberOf);
		
		JButton btnBanUser = new JButton("Ban User");
		btnBanUser.setBounds(10, 115, 216, 44);
		contentPane.add(btnBanUser);
		
		JButton btnAddPeopleTo = new JButton("Add People To Group");
		btnAddPeopleTo.setBounds(10, 176, 216, 44);
		contentPane.add(btnAddPeopleTo);
		
		JButton btnBackToMain = new JButton("Back To Main Window");
		btnBackToMain.setBounds(256, 208, 148, 44);
		contentPane.add(btnBackToMain);
	}

}
