package GUI_final;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JLabel;


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
		setBounds(100, 100, 601, 505);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNotifications = new JButton("Notifications");
		btnNotifications.setBounds(10, 136, 160, 50);
		contentPane.add(btnNotifications);
		
		JButton btnChangeFms = new JButton("Change FMS");
		btnChangeFms.setBounds(277, 136, 160, 50);
		contentPane.add(btnChangeFms);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.setBounds(10, 240, 160, 50);
		contentPane.add(btnQuit);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(277, 240, 160, 50);
		contentPane.add(btnNext);
		
		JLabel lblSystemAdminWindow = new JLabel();
		lblSystemAdminWindow.setBounds(10, -7, 564, 116);
		lblSystemAdminWindow.setIcon(new ImageIcon("src/GUI_final/admin.png"));
		contentPane.add(lblSystemAdminWindow);
		
		JLabel lblNumberOfNew = new JLabel("number of new notifications:");
		lblNumberOfNew.setBounds(10, 109, 187, 16);
		contentPane.add(lblNumberOfNew);
		
		JLabel lblNone = new JLabel("none");
		lblNone.setBounds(177, 109, 61, 16);
		contentPane.add(lblNone);
		
		JLabel Cover = new JLabel();
		Cover.setIcon(new ImageIcon("src/GUI_final/admin.jpg"));
		Cover.setBounds(10, 109, 564, 347);
		contentPane.add(Cover);
	}
}
