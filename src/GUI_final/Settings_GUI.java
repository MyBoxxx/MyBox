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

public class Settings_GUI extends AbstractGUI {

	private JPanel contentPane;
	private JTextField txtmyname;
	private JTextField txtPreferences;
	private JTextField textField;
	private JTextField txtMayth;
	private JTextField txtActive;
	private JTextField txtChangePassword;
	private JPasswordField pwdCurrentPassword;
	private JPasswordField passwordField;
	private JTextField txtCurrentEmail;
	private JTextField txteinamcom;

	
	/**
	 * Create the frame.
	 * @throws MalformedURLException 
	 */
	public Settings_GUI() throws MalformedURLException {
		setTitle("Settings");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 683, 472);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 20, 647, 403);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(Color.WHITE);
		tabbedPane.addTab("Profile", null, panel, null);
		panel.setLayout(null);
		
		txtmyname = new JTextField();
		txtmyname.setBackground(Color.WHITE);
		txtmyname.setEditable(false);
		txtmyname.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtmyname.setText("MyName");
		txtmyname.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtmyname.setBounds(10, 33, 89, 50);
		panel.add(txtmyname);
		txtmyname.setColumns(10);
		
		JButton btnChange = new JButton("Change");
		btnChange.setBounds(141, 49, 89, 23);
		panel.add(btnChange);
		
		JButton btnChangePhoto = new JButton("Change photo");
		btnChangePhoto.setBounds(141, 139, 126, 23);
		panel.add(btnChangePhoto);
		
		txtPreferences = new JTextField();
		txtPreferences.setBackground(Color.WHITE);
		txtPreferences.setEditable(false);
		txtPreferences.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtPreferences.setText("Preferences");
		txtPreferences.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtPreferences.setBounds(232, 213, 200, 50);
		panel.add(txtPreferences);
		txtPreferences.setColumns(10);
		
		JCheckBox chckbxShowName = new JCheckBox("Show name");
		chckbxShowName.setBackground(Color.WHITE);
		chckbxShowName.setBounds(40, 288, 97, 23);
		panel.add(chckbxShowName);
		
		JCheckBox chckbxPhotoNotification = new JCheckBox("Photo notification");
		chckbxPhotoNotification.setBackground(Color.WHITE);
		chckbxPhotoNotification.setBounds(182, 288, 139, 23);
		panel.add(chckbxPhotoNotification);
		
		JButton btnSaveSettings = new JButton("Save settings");
		btnSaveSettings.setBounds(36, 325, 101, 23);
		panel.add(btnSaveSettings);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(182, 325, 89, 23);
		panel.add(btnCancel);
		
		JCheckBox chckbxIncludeMeIn = new JCheckBox("Include me in early accsses");
		chckbxIncludeMeIn.setBackground(Color.WHITE);
		chckbxIncludeMeIn.setBounds(336, 288, 249, 23);
		panel.add(chckbxIncludeMeIn);
		URL url1 = new URL("https://cf.dropboxstatic.com/static/images/avatar/faceholder-64-vflHTEplh.png");
	    Icon icon1 = new ImageIcon(url1);
		  JLabel label1 = new JLabel(icon1);
		  label1.setBounds(26, 116, 73, 64);
		  panel.add(label1);
		  
		  URL url2 = new URL("http://png-3.findicons.com/files/icons/1580/devine_icons_part_2/128/account_and_control.png");
		    Icon icon2 = new ImageIcon(url2);
		    JLabel label2 = new JLabel(icon2);
		    label2.setLocation(246, 12);
		    label2.setSize(128, 128);
			 panel.add(label2);
		  
		  JLabel lblNewLabel = new JLabel("Mybox user ID");
		  lblNewLabel.setBounds(384, 53, 73, 14);
		  panel.add(lblNewLabel);
		  
		  textField = new JTextField();
		  textField.setBackground(Color.WHITE);
		  textField.setEditable(false);
		  textField.setText("3831163");
		  textField.setBounds(384, 78, 86, 20);
		  panel.add(textField);
		  textField.setColumns(10);
		  
		  JLabel lblMemberSince = new JLabel("MEMBER SINCE");
		  lblMemberSince.setBounds(507, 53, 97, 14);
		  panel.add(lblMemberSince);
		  
		  txtMayth = new JTextField();
		  txtMayth.setBackground(Color.WHITE);
		  txtMayth.setEditable(false);
		  txtMayth.setText("MAY. 27TH, 2013");
		  txtMayth.setColumns(10);
		  txtMayth.setBounds(507, 78, 97, 20);
		  panel.add(txtMayth);
		  
		  JLabel lblStatus = new JLabel("Status");
		  lblStatus.setBounds(384, 126, 73, 14);
		  panel.add(lblStatus);
		  
		  txtActive = new JTextField();
		  txtActive.setBackground(Color.WHITE);
		  txtActive.setEditable(false);
		  txtActive.setText("Active");
		  txtActive.setBounds(384, 143, 106, 14);
		  panel.add(txtActive);
		  txtActive.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		tabbedPane.addTab("Account", null, panel_1, null);
		panel_1.setLayout(null);
		
		URL url4 = new URL("http://www.jigsawbox.com/blog/wp-content/uploads/2011/06/delete.jpg");
	    Icon icon4 = new ImageIcon(url4);
	    JLabel label4 = new JLabel(icon4);
	    label4.setLocation(126, 156);
	    label4.setSize(300, 219);
		JButton btnDelte = new JButton("",icon4);
		btnDelte.setLocation(94, 147);
		btnDelte.setSize(400, 228);
		  panel_1.add(btnDelte);

		  URL url3 = new URL("http://i.imgur.com/9J0j1KT.jpg");
		    Icon icon3 = new ImageIcon(url3);
			  JLabel label3 = new JLabel(icon3);
			  label3.setSize(622, 370);
			  label3.setLocation(10, -21);
			  panel_1.add(label3);
			  
			
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		tabbedPane.addTab("Security", null, panel_2, null);
		panel_2.setLayout(null);
		
		URL url5 = new URL("http://www.wufoo.com/images/powered/security.png");
	    Icon icon5 = new ImageIcon(url5);
	    JLabel label5 = new JLabel(icon5);
	    label5.setLocation(386, -10);
	    label5.setSize(256, 256);
		  panel_2.add(label5);
		
		txtChangePassword = new JTextField();
		txtChangePassword.setBackground(Color.WHITE);
		txtChangePassword.setEditable(false);
		txtChangePassword.setText("Change Password");
		txtChangePassword.setBounds(20, 57, 200, 50);
		txtChangePassword.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		panel_2.add(txtChangePassword);
		txtChangePassword.setColumns(10);
		
		pwdCurrentPassword = new JPasswordField();
		pwdCurrentPassword.setText("Current password");
		pwdCurrentPassword.setBounds(29, 135, 149, 20);
		panel_2.add(pwdCurrentPassword);
		
		JLabel lblCurrentPassword = new JLabel("Current password");
		lblCurrentPassword.setBounds(30, 118, 124, 14);
		panel_2.add(lblCurrentPassword);
		
		JLabel lblNewPassword = new JLabel("New password");
		lblNewPassword.setBounds(30, 187, 124, 14);
		panel_2.add(lblNewPassword);
		
		passwordField = new JPasswordField();
		passwordField.setText("Current password");
		passwordField.setBounds(29, 202, 149, 20);
		panel_2.add(passwordField);
		
		JButton btnChange_1 = new JButton("Change");
		btnChange_1.setBounds(461, 257, 89, 23);
		panel_2.add(btnChange_1);
		
		txtCurrentEmail = new JTextField();
		txtCurrentEmail.setBackground(Color.WHITE);
		txtCurrentEmail.setEditable(false);
		txtCurrentEmail.setText("Current email");
		txtCurrentEmail.setColumns(10);
		txtCurrentEmail.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtCurrentEmail.setBounds(300, 105, 200, 50);
		panel_2.add(txtCurrentEmail);
		
		txteinamcom = new JTextField();
		txteinamcom.setBackground(Color.WHITE);
		txteinamcom.setEditable(false);
		txteinamcom.setText("100@einam.com");
		txteinamcom.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txteinamcom.setBounds(300, 151, 200, 50);
		panel_2.add(txteinamcom);
		txteinamcom.setColumns(10);
		
		
	}
}
