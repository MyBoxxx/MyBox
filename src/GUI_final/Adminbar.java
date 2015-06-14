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
	private JButton btnChangeFms;
	private JButton btnQuit;
	private JLabel lblSystemAdminWindow;
	private JLabel Cover;
	

	/**
	 * Launch the application.
	 */
	public void initialize(){//*void main(String[] args) {*//
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
		
		lblNotificationCenter = new JLabel();
		lblNotificationCenter.setIcon(new ImageIcon("src/GUI_final/noti.png"));
		lblNotificationCenter.setBackground(new Color(41,91,150));
		lblNotificationCenter.setBounds(182, 122, 336, 52);
		contentPane.add(lblNotificationCenter);
		
		NotifcationNo = new JButton();
		NotifcationNo.setIcon(new ImageIcon("src/GUI_final/notification_no.png"));
		NotifcationNo.setBounds(385, 180, 50, 52);
		NotifcationNo.setBackground(new Color(41,91,150));
		contentPane.add(NotifcationNo);
		
		NotifcationYes = new JButton();
		NotifcationYes.setIcon(new ImageIcon("src/GUI_final/notification_yes.png"));
		NotifcationYes.setBackground(new Color(41,91,150));
		NotifcationYes.setBounds(327, 180, 52, 52);
		contentPane.add(NotifcationYes);
		
		btnChangeFms = new JButton();		
		btnChangeFms.setToolTipText("Chnage FMS");
		btnChangeFms.setIcon(new ImageIcon("src/GUI_final/changeFMS.png"));
		//btnChangeFms.setBackground(Color.WHITE);
		btnChangeFms.setOpaque(false);
		//btnChangeFms.setContentAreaFilled(false);
		//btnChangeFms.setBorderPainted(false);
		btnChangeFms.setBounds(6, 381, 230, 170);
		contentPane.add(btnChangeFms);
		
		btnQuit = new JButton();
		btnQuit.setIcon(new ImageIcon("src/GUI_final/logout_button.png"));
		btnQuit.setBackground(new Color(41,91,150));
		btnQuit.setBounds(576, 409, 148, 138);
		contentPane.add(btnQuit);
		
		lblSystemAdminWindow = new JLabel();
		lblSystemAdminWindow.setBounds(290, 11, 800, 114);
		lblSystemAdminWindow.setIcon(new ImageIcon("src/GUI_final/admin.png"));
		lblSystemAdminWindow.setBackground(null);
		contentPane.add(lblSystemAdminWindow);
		
	    Cover = new JLabel();
		Cover.setIcon(new ImageIcon("src/GUI_final/admin2.jpg"));
		Cover.setBounds(0, 0, 800, 600);
		contentPane.add(Cover);		
		
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
