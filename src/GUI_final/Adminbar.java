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


public class Adminbar extends AbstractGUI {

	 JPanel contentPane;
	private JLabel lblNotificationCenter;
	private JButton NotifcationNo;	
	private JButton NotifcationYes;	
	private JButton btnChangeFms;
	private JButton btnQuit;
	private JLabel lblSystemAdminWindow;
	private JLabel Cover;
	

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Adminbar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setBackground(new Color(2,98,158));
		
		contentPane.setLayout(null);
		
		lblNotificationCenter = new JLabel();
		lblNotificationCenter.setIcon(new ImageIcon("src/GUI_final/noti.png"));
		lblNotificationCenter.setBackground(new Color(41,91,150));
		lblNotificationCenter.setBounds(6, 113, 336, 52);
		add(lblNotificationCenter);
		
		NotifcationNo = new JButton();
		NotifcationNo.setIcon(new ImageIcon("src/GUI_final/notification_no.png"));
		NotifcationNo.setBounds(434, 113, 50, 52);
		NotifcationNo.setBackground(new Color(41,91,150));
		add(NotifcationNo);
		
		NotifcationYes = new JButton();
		NotifcationYes.setIcon(new ImageIcon("src/GUI_final/notification_yes.png"));
		NotifcationYes.setBackground(new Color(41,91,150));
		NotifcationYes.setBounds(354, 113, 52, 52);
		add(NotifcationYes);
		
		btnChangeFms = new JButton();		
		btnChangeFms.setToolTipText("Chnage FMS");
		btnChangeFms.setIcon(new ImageIcon("src/GUI_final/changeFMS.png"));
		btnChangeFms.setBorderPainted(false); 
		btnChangeFms.setContentAreaFilled(false); 
		btnChangeFms.setFocusPainted(false); 
		btnChangeFms.setOpaque(false);
		btnChangeFms.setBounds(6, 221, 230, 170);
		add(btnChangeFms);
		
		btnQuit = new JButton();
		btnQuit.setIcon(new ImageIcon("src/GUI_final/logout_button.png"));
		btnQuit.setBackground(new Color(41,91,150));
		btnQuit.setBounds(6, 434, 148, 138);
		btnQuit.setBorderPainted(false); 
		btnQuit.setContentAreaFilled(false); 
		btnQuit.setFocusPainted(false); 
		btnQuit.setOpaque(false);
		add(btnQuit);
		
		lblSystemAdminWindow = new JLabel();
		lblSystemAdminWindow.setBounds(290, 11, 800, 114);
		lblSystemAdminWindow.setIcon(new ImageIcon("src/GUI_final/admin.png"));
		lblSystemAdminWindow.setBackground(null);
		add(lblSystemAdminWindow);
		
	    Cover = new JLabel();
		Cover.setIcon(new ImageIcon("src/GUI_final/admin2.jpg"));
		Cover.setBounds(0, 0, 800, 600);
		add(Cover);		
		
	}
	
	public JLabel getLblNotificationCenter() {
		return lblNotificationCenter;
	}

	public void setLblNotificationCenter(JLabel lblNotificationCenter) {
		this.lblNotificationCenter = lblNotificationCenter;
	}

	public JButton getNotifcationNo() {
		return NotifcationNo;
	}

	public void setNotifcationNo(JButton notifcationNo) {
		NotifcationNo = notifcationNo;
	}

	public JButton getNotifcationYes() {
		return NotifcationYes;
	}

	public void setNotifcationYes(JButton notifcationYes) {
		NotifcationYes = notifcationYes;
	}

	public JButton getBtnChangeFms() {
		return btnChangeFms;
	}

	public void setBtnChangeFms(JButton btnChangeFms) {
		this.btnChangeFms = btnChangeFms;
	}

	public JButton getBtnQuit() {
		return btnQuit;
	}

	public void setBtnQuit(JButton btnQuit) {
		this.btnQuit = btnQuit;
	}

	public JLabel getLblSystemAdminWindow() {
		return lblSystemAdminWindow;
	}

	public void setLblSystemAdminWindow(JLabel lblSystemAdminWindow) {
		this.lblSystemAdminWindow = lblSystemAdminWindow;
	}

	public JLabel getCover() {
		return Cover;
	}

	public void setCover(JLabel cover) {
		Cover = cover;
	}

	public void ChangeFMSLitsner(ActionListener listenForChnageFMSButton){
		 btnChangeFms.addActionListener(listenForChnageFMSButton);
	}
	
	public void NotifcationYesLitsner(ActionListener listenForNotifcationYesButton){
		NotifcationYes.addActionListener(listenForNotifcationYesButton);
	}
	
	public void NotifcationNoLitsner(ActionListener listenForNotifcationNoButton){
		NotifcationYes.addActionListener(listenForNotifcationNoButton);
	}
	
	public void QuitLitsner(ActionListener listenForQuitButton){
		btnQuit.addActionListener(listenForQuitButton);
	}
}