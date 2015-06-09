package GUI_final;

import java.awt.BorderLayout;
import java.awt.Color;
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
		setBounds(100, 100, 599, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		JButton btnNotifications = new JButton("Notifications");
		btnNotifications.setBounds(10, 136, 160, 50);
		contentPane.add(btnNotifications);

		JLabel lblNotificationCenter = new JLabel();
		lblNotificationCenter.setIcon(new ImageIcon("src/GUI_final/noti.png"));
		lblNotificationCenter.setBackground(new Color(41,91,150));
		lblNotificationCenter.setBounds(182, 122, 336, 52);
		contentPane.add(lblNotificationCenter);
		
		JButton NotifcationNo = new JButton();
		NotifcationNo.setIcon(new ImageIcon("src/GUI_final/notification_no.png"));
		NotifcationNo.setBounds(385, 180, 50, 52);
		NotifcationNo.setBackground(new Color(41,91,150));
		contentPane.add(NotifcationNo);

		

		JButton btnChangeFms = new JButton("Change FMS");
		btnChangeFms.setBounds(277, 136, 160, 50);

		JButton NotifcationYes = new JButton();
		NotifcationYes.setIcon(new ImageIcon("src/GUI_final/notification_yes.png"));
		NotifcationYes.setBackground(new Color(41,91,150));
		NotifcationYes.setBounds(327, 180, 52, 52);
		contentPane.add(NotifcationYes);
		
		JButton btnChangeFms1 = new JButton();		
		btnChangeFms1.setToolTipText("Chnage FMS");
		btnChangeFms1.setIcon(new ImageIcon("src/GUI_final/changeFMS.png"));
		//btnChangeFms.setBackground(Color.WHITE);
		btnChangeFms1.setOpaque(false);
		//btnChangeFms.setContentAreaFilled(false);
		//btnChangeFms.setBorderPainted(false);
		btnChangeFms1.setBounds(10, 180, 230, 170);
		contentPane.add(btnChangeFms1);
		

		

		JButton btnQuit1 = new JButton();
		btnQuit1.setIcon(new ImageIcon("src/GUI_final/logout_button.png"));
		btnQuit1.setBackground(new Color(41,91,150));
		btnQuit1.setBounds(445, 200, 148, 138);
		contentPane.add(btnQuit1);
		
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
		Cover.setBounds(20, 109, 554, 181);
		contentPane.add(Cover);
	}
}
