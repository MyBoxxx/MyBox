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
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


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
		setBounds(100, 100, 609, 512);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setBackground(new Color(2,98,158));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton NotifcationNo = new JButton();
		NotifcationNo.setIcon(new ImageIcon("src/GUI_final/notification_no.png"));
		NotifcationNo.setBounds(277, 136, 50, 52);
		NotifcationNo.setBackground(new Color(41,91,150));
		contentPane.add(NotifcationNo);
		
		JButton NotifcationYes = new JButton();
		NotifcationYes.setIcon(new ImageIcon("src/GUI_final/notification_yes.png"));
		NotifcationYes.setBackground(new Color(41,91,150));
		NotifcationYes.setBounds(334, 136, 52, 52);
		contentPane.add(NotifcationYes);
		
		JButton btnChangeFms = new JButton();		
		btnChangeFms.setToolTipText("Chnage FMS");
		btnChangeFms.setIcon(new ImageIcon("src/GUI_final/rename.png"));
		//btnChangeFms.setBackground(Color.WHITE);
		btnChangeFms.setOpaque(false);
		btnChangeFms.setContentAreaFilled(false);
		//btnChangeFms.setBorderPainted(false);
		btnChangeFms.setBounds(10, 79, 257, 202);
		contentPane.add(btnChangeFms);
		
		JButton btnQuit = new JButton();
		btnQuit.setIcon(new ImageIcon("src/GUI_final/logout_button.png"));
		btnQuit.setBackground(new Color(41,91,150));
		btnQuit.setBounds(435, 136, 148, 138);
		contentPane.add(btnQuit);
		
		JLabel lblSystemAdminWindow = new JLabel();
		lblSystemAdminWindow.setBounds(290, 11, 293, 114);
		lblSystemAdminWindow.setIcon(new ImageIcon("src/GUI_final/admin.png"));
		lblSystemAdminWindow.setBackground(null);
		contentPane.add(lblSystemAdminWindow);
		
		JLabel Cover = new JLabel();
		Cover.setIcon(new ImageIcon("src/GUI_final/admin.jpg"));
		Cover.setBounds(0, 0, 593, 474);
		contentPane.add(Cover);
	}
}
