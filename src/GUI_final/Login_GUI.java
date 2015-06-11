package GUI_final;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
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

public class Login_GUI extends AbstractGUI {


	private JPanel contentPane;
	private JTextField txtUserName;
	private JTextField txtOneOrMore;
	private JPasswordField passwordField;
	private JButton btnLogin ,btnForgotPassword ;
		

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
		setBounds(100, 100, 820, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		    JLabel LoginTopBaner = new JLabel();
		    LoginTopBaner.setIcon(new ImageIcon(Login_GUI.class.getResource("/images_icons/Login_top_pic.gif")));
		    LoginTopBaner.setBounds(10, 32, 773, 257);
		    LoginTopBaner.setBackground(Color.WHITE);
		
		    contentPane.setLayout(null);
		    contentPane.add(LoginTopBaner);
		    btnLogin = new JButton(new ImageIcon(Login_GUI.class.getResource("/images_icons/subbmit_button.gif")));
		    btnLogin.setBorderPainted(false); 
		    btnLogin.setContentAreaFilled(false); 
		    btnLogin.setFocusPainted(false); 
		    btnLogin.setOpaque(false);
		    
		    btnLogin.setBounds(437, 396, 150, 150);
		    LoginTopBaner.setBackground(Color.WHITE);
		    contentPane.add(btnLogin);
		    btnForgotPassword = new JButton(new ImageIcon(Login_GUI.class.getResource("/images_icons/login_forgot_password.png")));
		    btnForgotPassword.setLocation(143, 401);
		    btnForgotPassword.setSize(150, 150);
		    btnForgotPassword.setBounds(215, 396, 150, 155);
		    btnForgotPassword.setBackground(Color.WHITE);
		    btnForgotPassword.setBorderPainted(false); 
		    btnForgotPassword.setContentAreaFilled(false); 
		    btnForgotPassword.setFocusPainted(false); 
		    btnForgotPassword.setOpaque(false);
		    contentPane.add(btnForgotPassword);
		    //////////////////
		/*   label2.addMouseListener(new MouseAdapter() {
		        public void mouseClicked(MouseEvent me) {
		        	
		        	ForgotPassword_GUI words = null;
					try {
						words = new ForgotPassword_GUI();
					} catch (MalformedURLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}		    		
		    		words.initialize();		        
		        }
		      });	*/	    

		    
		    txtUserName = new JTextField();
		    txtUserName.setBackground(Color.WHITE);
		    txtUserName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		    txtUserName.setText("UserName");
		   /* txtUserName.addFocusListener(new FocusAdapter() {
		    	@Override
		    	public void focusGained(FocusEvent arg0) {
		    		
		    		s = txtUserName.getText();
		    		//if ( txtUserName.getText() == null)
		    			txtUserName.setText(null);		    			
		    		
		    	//	else
		    			//txtUserName.setText(s);
		    		
		    	}
		    	@Override
		    	public void focusLost(FocusEvent e) {
		    		if ( txtUserName.getText() == null){
		    			s = txtUserName.getText();
		    		}
		    		
		    			 txtUserName.setText(s);
		    	}
		    });*/
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
		 
		 
		    passwordField.setToolTipText("");
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
		    passwordField.setText("password");;
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

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(String passwordField) {
		this.passwordField.setText(passwordField);
	}

	public JButton getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(JButton btnLogin) {
		this.btnLogin = btnLogin;
	}
	public void settxtOneOrMoreVisible(Boolean boo) {
		this.txtOneOrMore.setVisible(boo);
	}

	public JButton getBtnForgotPassword() {
		return btnForgotPassword;
	}

	public void setBtnForgotPassword(JButton btnForgotPassword) {
		this.btnForgotPassword = btnForgotPassword;
	}


}


