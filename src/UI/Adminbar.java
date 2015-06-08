package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JTextArea;


public class Adminbar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Adminbar frame = new Adminbar();
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
	public Adminbar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 463, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnSystemAdminWindow = new JTextPane();
		txtpnSystemAdminWindow.setText("System Admin Window");
		txtpnSystemAdminWindow.setBounds(144, 11, 160, 30);
		contentPane.add(txtpnSystemAdminWindow);
		
		JButton btnNotifications = new JButton("Notifications");
		btnNotifications.setBounds(10, 65, 160, 50);
		contentPane.add(btnNotifications);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(180, 75, 44, 30);
		contentPane.add(textArea);
		
		JTextPane txtpnNumberOfNew = new JTextPane();
		txtpnNumberOfNew.setText("number of new notifications");
		txtpnNumberOfNew.setBounds(247, 75, 198, 30);
		contentPane.add(txtpnNumberOfNew);
		
		JButton btnChangeFms = new JButton("Change FMS");
		btnChangeFms.setBounds(160, 146, 160, 50);
		contentPane.add(btnChangeFms);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.setBounds(10, 240, 160, 50);
		contentPane.add(btnQuit);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(277, 240, 160, 50);
		contentPane.add(btnNext);
	}

}
