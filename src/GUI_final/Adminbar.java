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

	private JPanel contentPane;
	private JLabel lblNotificationCenter;
	private JButton NotifcationNo;	
	private JButton NotifcationYes;	
	private JLabel ChangeFms;
	private JButton btnQuit;
	private JLabel lblSystemAdminWindow;
	private JLabel Cover;
	private JButton btnLimit;
	private JButton btnAddPeopleTo;
	private JButton btnRemovePeopleTo;
	

	/**
	 * Launch the application.
	 */
	public void Initialize() {
		//public static void main(String [ ] args) {
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
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setBackground(new Color(2,98,158));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnLimit = new JButton("Change Limit ");
		btnLimit.setBounds(277, 221, 207, 23);
		contentPane.add(btnLimit);
		
		btnAddPeopleTo = new JButton("Add people to group");
		btnAddPeopleTo.setBounds(277, 290, 207, 23);
		contentPane.add(btnAddPeopleTo);
		
		btnRemovePeopleTo = new JButton("Remove people to group");
		btnRemovePeopleTo.setBounds(277, 357, 207, 23);
		contentPane.add(btnRemovePeopleTo);
		
		lblNotificationCenter = new JLabel();
		lblNotificationCenter.setIcon(new ImageIcon(Login_GUI.class.getResource("/images_icons/noti.png")));
		lblNotificationCenter.setBackground(new Color(41,91,150));
		lblNotificationCenter.setBounds(6, 113, 336, 52);
		contentPane.add(lblNotificationCenter);
		
		NotifcationNo = new JButton();
		NotifcationNo.setIcon(new ImageIcon(Login_GUI.class.getResource("/images_icons/notification_no.png")));
		NotifcationNo.setBounds(434, 113, 50, 52);
		NotifcationNo.setBackground(new Color(41,91,150));
		contentPane.add(NotifcationNo);
		
		NotifcationYes = new JButton();
		NotifcationYes.setIcon(new ImageIcon(Login_GUI.class.getResource("/images_icons/notification_yes.png")));
		NotifcationYes.setBackground(new Color(41,91,150));
		NotifcationYes.setBounds(354, 113, 52, 52);
		contentPane.add(NotifcationYes);
		
		ChangeFms = new JLabel();		
		ChangeFms.setToolTipText("Change FMS");
		ChangeFms.setIcon(new ImageIcon(Login_GUI.class.getResource("/images_icons/changeFMS.png")));
		
		ChangeFms.setOpaque(false);
		ChangeFms.setBounds(6, 221, 230, 170);
		contentPane.add(ChangeFms);
		
		btnQuit = new JButton();
		btnQuit.setIcon(new ImageIcon(Login_GUI.class.getResource("/images_icons/logout_button.png")));
		btnQuit.setBackground(new Color(41,91,150));
		btnQuit.setBounds(6, 434, 148, 138);
		btnQuit.setBorderPainted(false); 
		btnQuit.setContentAreaFilled(false); 
		btnQuit.setFocusPainted(false); 
		btnQuit.setOpaque(false);
		contentPane.add(btnQuit);
		
		lblSystemAdminWindow = new JLabel();
		lblSystemAdminWindow.setBounds(290, 11, 800, 114);
		lblSystemAdminWindow.setIcon(new ImageIcon(Login_GUI.class.getResource("/images_icons/admin.png")));
		lblSystemAdminWindow.setBackground(null);
		contentPane.add(lblSystemAdminWindow);
		
	    Cover = new JLabel();
		Cover.setIcon(new ImageIcon(Login_GUI.class.getResource("/images_icons/admin2.jpg")));
		Cover.setBounds(0, 0, 800, 600);
		contentPane.add(Cover);
		
	}
	
	public JButton getBtnLimit() {
		return btnLimit;
	}

	public void setBtnLimit(JButton btnLimit) {
		this.btnLimit = btnLimit;
	}

	public JButton getBtnAddPeopleTo() {
		return btnAddPeopleTo;
	}

	public void setBtnAddPeopleTo(JButton btnAddPeopleTo) {
		this.btnAddPeopleTo = btnAddPeopleTo;
	}

	public JButton getBtnRemovePeopleTo() {
		return btnRemovePeopleTo;
	}

	public void setBtnRemovePeopleTo(JButton btnRemovePeopleTo) {
		this.btnRemovePeopleTo = btnRemovePeopleTo;
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

	
	
	public JLabel getChangeFms() {
		return ChangeFms;
	}

	public void setChangeFms(JLabel changeFms) {
		ChangeFms = changeFms;
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