package GUI_final;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Settings_GUI extends AbstractGUI {

	private JPanel contentPane;
	private JTextField txtmyname;
	private JTextField txtfieldUserID;
	private JTextField txtDate;
	private JTextField txtActive;
	private JTextField txtChangePassword;
	private JPasswordField pwdCurrentPwd;
	private JPasswordField pwdNewPwd;
	private JTextField txtMail;
	private JButton btnChangeName;
	private JButton btnSaveSettings;
	private JButton btnCancel;
	private JLabel UserImage;
	private JPanel AccountPanel;
	private JPanel ProfilePanel;
	private JTabbedPane tabbedPane;
	private JButton btnDeleteAccount;
	private JPanel SecurityPanel;
	private JButton btnChangePwd;
	

	
	/**
	 * Create the frame.
	 * @throws MalformedURLException 
	 */
	public Settings_GUI() throws MalformedURLException {
		setTitle("Settings");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 800, 600);
		contentPane.add(tabbedPane);
		
		ProfilePanel = new JPanel();
		ProfilePanel.setBorder(null);
		ProfilePanel.setBackground(Color.WHITE);
		tabbedPane.addTab("Profile", null, ProfilePanel, null);
		ProfilePanel.setLayout(null);
		
		txtmyname = new JTextField();
		txtmyname.setBackground(Color.WHITE);
		txtmyname.setEditable(false);
		txtmyname.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtmyname.setText("MyName");
		txtmyname.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtmyname.setBounds(243, 182, 89, 50);
		ProfilePanel.add(txtmyname);
		txtmyname.setColumns(10);
		
		btnChangeName = new JButton("Change");
		btnChangeName.setBounds(444, 198, 116, 23);
		ProfilePanel.add(btnChangeName);
		
		btnSaveSettings = new JButton("Save settings");
		btnSaveSettings.setBounds(243, 474, 116, 23);
		ProfilePanel.add(btnSaveSettings);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setBounds(460, 474, 89, 23);
		ProfilePanel.add(btnCancel);
		  
		UserImage = new JLabel();
		UserImage.setIcon(new ImageIcon(Settings_GUI.class.getResource("/images_icons/user.png")));
		UserImage.setLocation(331, 45);
		UserImage.setSize(128, 128);
		ProfilePanel.add(UserImage);
		  
		JLabel LblUserID = new JLabel("Mybox user ID");
		LblUserID.setBounds(243, 250, 73, 14);
		ProfilePanel.add(LblUserID);
		  
		  txtfieldUserID = new JTextField();
		  txtfieldUserID.setBackground(Color.WHITE);
		  txtfieldUserID.setEditable(false);
		  txtfieldUserID.setText("3831163");
<<<<<<< HEAD
		  txtfieldUserID.setBounds(444, 244, 116, 25);
=======
		  txtfieldUserID.setBounds(444, 244, 148, 25);
>>>>>>> refs/heads/master
		  ProfilePanel.add(txtfieldUserID);
		  txtfieldUserID.setColumns(10);
		  
		  JLabel lblMemberSince = new JLabel("MEMBER SINCE");
		  lblMemberSince.setBounds(243, 327, 97, 14);
		  ProfilePanel.add(lblMemberSince);
		  
		  txtDate = new JTextField();
		  txtDate.setBackground(Color.WHITE);
		  txtDate.setEditable(false);
		  txtDate.setText("MAY. 27TH, 2013");
		  txtDate.setColumns(10);
<<<<<<< HEAD
		  txtDate.setBounds(444, 321,  116, 25);
=======
		  txtDate.setBounds(444, 321,  148, 25);
>>>>>>> refs/heads/master
		  ProfilePanel.add(txtDate);
		  
		  JLabel lblStatus = new JLabel("Status");
		  lblStatus.setBounds(243, 287, 73, 14);
		  ProfilePanel.add(lblStatus);
		  
		  txtActive = new JTextField();
		  txtActive.setBackground(Color.WHITE);
		  txtActive.setEditable(false);
		  txtActive.setText("Active");
<<<<<<< HEAD
		  txtActive.setBounds(444, 284, 116, 25);
=======
		  txtActive.setBounds(444, 284, 148, 25);
>>>>>>> refs/heads/master
		  ProfilePanel.add(txtActive);
		  txtActive.setColumns(10);
		
		AccountPanel = new JPanel();
		AccountPanel.setBackground(Color.WHITE);
		tabbedPane.addTab("Account", null, AccountPanel, null);
		AccountPanel.setLayout(null);
			  
			  btnDeleteAccount = new JButton("New button");
			  btnDeleteAccount.setIcon(new ImageIcon(Settings_GUI.class.getResource("/images_icons/deleteall.jpg")));
			  btnDeleteAccount.setBounds(141, 186, 412, 362);
			  AccountPanel.add(btnDeleteAccount);
		

		 
			  JLabel lblTopdeleteAccount = new JLabel();
			  lblTopdeleteAccount.setIcon(new ImageIcon(Settings_GUI.class.getResource("/images_icons/deleteaccount.jpg")));
			  lblTopdeleteAccount.setSize(684, 377);
			  lblTopdeleteAccount.setLocation(39, 6);
			  AccountPanel.add(lblTopdeleteAccount);
			  
		SecurityPanel = new JPanel();
		SecurityPanel.setBackground(Color.WHITE);
		tabbedPane.addTab("Security", null, SecurityPanel, null);
		SecurityPanel.setLayout(null);
		
		
		JLabel lblSecurity = new JLabel();
	    lblSecurity.setIcon(new ImageIcon(Settings_GUI.class.getResource("/images_icons/security.png")));
	    lblSecurity.setLocation(517, 6);
	    lblSecurity.setSize(256, 256);
		  SecurityPanel.add(lblSecurity);
		
		txtChangePassword = new JTextField();
		txtChangePassword.setBackground(Color.WHITE);
		txtChangePassword.setEditable(false);
		txtChangePassword.setText("Change Password");
		txtChangePassword.setBounds(20, 57, 200, 50);
		txtChangePassword.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		SecurityPanel.add(txtChangePassword);
		txtChangePassword.setColumns(10);
		
		pwdCurrentPwd = new JPasswordField();
		pwdCurrentPwd.setText("Current password");
		pwdCurrentPwd.setBounds(29, 135, 149, 20);
		SecurityPanel.add(pwdCurrentPwd);
		
		JLabel lblCurrentPassword = new JLabel("Current password");
		lblCurrentPassword.setBounds(30, 118, 124, 14);
		SecurityPanel.add(lblCurrentPassword);
		
		JLabel lblNewPassword = new JLabel("New password");
		lblNewPassword.setBounds(30, 187, 124, 14);
		SecurityPanel.add(lblNewPassword);
		
		pwdNewPwd = new JPasswordField();
		pwdNewPwd.setText("Current password");
		pwdNewPwd.setBounds(29, 202, 149, 20);
		SecurityPanel.add(pwdNewPwd);
		
		btnChangePwd = new JButton("Change");
		btnChangePwd.setBounds(47, 285, 89, 23);
		SecurityPanel.add(btnChangePwd);
		
		JTextField txtCurrentEmail = new JTextField();
		txtCurrentEmail.setBackground(Color.WHITE);
		txtCurrentEmail.setEditable(false);
		txtCurrentEmail.setText("Current email");
		txtCurrentEmail.setColumns(10);
		txtCurrentEmail.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtCurrentEmail.setBounds(336, 120, 200, 50);
		SecurityPanel.add(txtCurrentEmail);
		
		txtMail = new JTextField();
		txtMail.setBackground(Color.WHITE);
		txtMail.setEditable(false);
		txtMail.setText("100@einam.com");
		txtMail.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtMail.setBounds(336, 169, 200, 50);
		SecurityPanel.add(txtMail);
		txtMail.setColumns(10);
		
		
	}
	public JTextField getTxtmyname() {
		return txtmyname;
	}



<<<<<<< HEAD
	public void setTxtmyname(JTextField txtmyname) {
		this.txtmyname = txtmyname;
=======
	public void setTxtmyname(String txtmyname) {
		this.txtmyname.setText(txtmyname);
>>>>>>> refs/heads/master
	}



	public JTextField getTxtfieldUserID() {
		return txtfieldUserID;
	}



	public void setTxtfieldUserID(JTextField txtfieldUserID) {
		this.txtfieldUserID = txtfieldUserID;
	}



	public JTextField getTxtDate() {
		return txtDate;
	}



	public void setTxtDate(JTextField txtDate) {
		this.txtDate = txtDate;
	}



	public JTextField getTxtActive() {
		return txtActive;
	}



	public void setTxtActive(JTextField txtActive) {
		this.txtActive = txtActive;
	}



	public JTextField getTxtChangePassword() {
		return txtChangePassword;
	}



	public void setTxtChangePassword(JTextField txtChangePassword) {
		this.txtChangePassword = txtChangePassword;
	}



	public JPasswordField getPwdCurrentPwd() {
		return pwdCurrentPwd;
	}



	public void setPwdCurrentPwd(JPasswordField pwdCurrentPwd) {
		this.pwdCurrentPwd = pwdCurrentPwd;
	}



	public JPasswordField getPwdNewPwd() {
		return pwdNewPwd;
	}



	public void setPwdNewPwd(JPasswordField pwdNewPwd) {
		this.pwdNewPwd = pwdNewPwd;
	}



	public JTextField getTxtMail() {
		return txtMail;
	}



	public void setTxtMail(JTextField txtMail) {
		this.txtMail = txtMail;
	}



	public JButton getBtnChangeName() {
		return btnChangeName;
	}



	public void setBtnChangeName(JButton btnChangeName) {
		this.btnChangeName = btnChangeName;
	}



	public JButton getBtnSaveSettings() {
		return btnSaveSettings;
	}



	public void setBtnSaveSettings(JButton btnSaveSettings) {
		this.btnSaveSettings = btnSaveSettings;
	}



	public JButton getBtnCancel() {
		return btnCancel;
	}



	public void setBtnCancel(JButton btnCancel) {
		this.btnCancel = btnCancel;
	}



	public JLabel getUserImage() {
		return UserImage;
	}



	public void setUserImage(JLabel userImage) {
		UserImage = userImage;
	}



	public JPanel getAccountPanel() {
		return AccountPanel;
	}



	public void setAccountPanel(JPanel accountPanel) {
		AccountPanel = accountPanel;
	}



	public JPanel getProfilePanel() {
		return ProfilePanel;
	}



	public void setProfilePanel(JPanel profilePanel) {
		ProfilePanel = profilePanel;
	}



	public JTabbedPane getTabbedPane() {
		return tabbedPane;
	}



	public void setTabbedPane(JTabbedPane tabbedPane) {
		this.tabbedPane = tabbedPane;
	}



	public JButton getBtnDeleteAccount() {
		return btnDeleteAccount;
	}



	public void setBtnDeleteAccount(JButton btnDeleteAccount) {
		this.btnDeleteAccount = btnDeleteAccount;
	}



	public JPanel getSecurityPanel() {
		return SecurityPanel;
	}



	public void setSecurityPanel(JPanel securityPanel) {
		SecurityPanel = securityPanel;
	}



	public JButton getBtnChangePwd() {
		return btnChangePwd;
	}



	public void setBtnChangePwd(JButton btnChangePwd) {
		this.btnChangePwd = btnChangePwd;
	}


}
