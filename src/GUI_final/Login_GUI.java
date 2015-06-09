package GUI_final;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import java.util.prefs.Preferences;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Popup;
import javax.swing.PopupFactory;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JPasswordField;

import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Login_GUI extends JFrame {


	JButton ForgotPassword;
	JButton LoginButtun;
	
	private JPanel contentPane;
	private JTextField txtUserName;
	private JTextField txtOneOrMore;
	private JPasswordField passwordField;
	private String s;
	 
		

	/**
	 * Launch the application.
	 */
	public void initialize() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_GUI frame = new Login_GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws MalformedURLException 
	 */
	public Login_GUI() throws MalformedURLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		//////////////////////////
		    JLabel TopPicture = new JLabel(new ImageIcon(Login_GUI.class.getResource("/images_icons/Login_top_pic.gif")));
		    TopPicture.setBounds(10, 32, 773, 257);
		    TopPicture.setBackground(Color.WHITE);
		    
		    contentPane.setLayout(null);
		    contentPane.add(TopPicture);
		    ///////////////////////
		  
		    LoginButtun = new JButton(new ImageIcon(Login_GUI.class.getResource("/images_icons/LoginIcon.jpg")));
		    LoginButtun.setBounds(437, 396, 150, 150);
		    TopPicture.setBackground(Color.WHITE);
			    
		    contentPane.add(LoginButtun);

		  
		    ForgotPassword = new JButton(new ImageIcon(Login_GUI.class.getResource("/images_icons/login_forgot_password.png")));
		    ForgotPassword.setLocation(143, 401);
		    ForgotPassword.setSize(150, 150);
		    ForgotPassword.setBounds(215, 396, 150, 155);
		    ForgotPassword.setBackground(Color.WHITE);
		    ForgotPassword.setOpaque(false);
		    ForgotPassword.setContentAreaFilled(false);
		    ForgotPassword.setBorderPainted(false);
		    contentPane.add(ForgotPassword);
		    
		    ///////////////////////////////////////////
		   
		    
		    txtUserName = new JTextField();
		
		    txtUserName.setBackground(Color.WHITE);
		    txtUserName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		    txtUserName.setText("User name");
		  
		    txtUserName.setBounds(205, 317, 387, 20);
		    contentPane.add(txtUserName);
		    txtUserName.setColumns(10);
		    
		    txtOneOrMore = new JTextField();
		    txtOneOrMore.setFont(new Font("Tahoma", Font.PLAIN, 20));
		    txtOneOrMore.setBackground(Color.RED);
		    txtOneOrMore.setEnabled(false);
		    txtOneOrMore.setEditable(false);
		    txtOneOrMore.setText("One or more fields are incorrect");
		    txtOneOrMore.setBounds(205, 291, 319, 25);
		    txtOneOrMore.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		    txtOneOrMore.setVisible(false);
		    //txtOneOrMore.setForeground(Color.RED);
		    contentPane.add(txtOneOrMore);
		    txtOneOrMore.setColumns(10);
		    
		    passwordField = new JPasswordField();
		    passwordField.setEchoChar((char) 0);
		    passwordField.setText("Password");
		  /*  passwordField.addFocusListener(new FocusAdapter() {
		    	@Override
		    	public void focusGained(FocusEvent e) {
		    		passwordField.setEchoChar('*');
		    		passwordField.setText("");
		    	}
		    	@Override
		    	public void focusLost(FocusEvent e) {
		    		passwordField.setEchoChar((char) 0);
		    		passwordField.setText("Password");
		    	}
		    }); */
		    passwordField.setBounds(205, 348, 387, 20);
		    contentPane.add(passwordField);
		  
		    //f.setVisible(true);
	}
	public JTextField getTxtUserName() {
		return txtUserName;
	}

	public void setTxtUserName(String txtUserName) {
		this.txtUserName.setText(txtUserName);
	}

	public void setTxtOneOrMoreVisible(Boolean b) {
		txtOneOrMore.setVisible(b);;
	}


	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}
	public JButton getForgotPassword() {
		return ForgotPassword;
	}

	public JButton getLoginButtun() {
		return LoginButtun;
	}


}


