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
		
		 URL url = new URL("http://i.imgur.com/6Bq6MQr.gif");
		    Icon icon = new ImageIcon(url);
		    JLabel TopPicture = new JLabel(icon);
		    TopPicture.setBounds(10, 32, 773, 257);
		    TopPicture.setBackground(Color.WHITE);
		    TopPicture.addMouseListener(new MouseAdapter() {
		        public void mouseClicked(MouseEvent me) {
		          System.out.println("CLICKED");
		        }
		      });	
		    
		    contentPane.setLayout(null);
		    contentPane.add(TopPicture);
		    ///////////////////////
		    URL url1 = new URL("http://www.freevectors.net/files/small/LoginIcon.jpg");
		    Icon icon1 = new ImageIcon(url1);
		    LoginButtun = new JButton(icon1);
		    LoginButtun.setBounds(437, 396, 150, 150);
		    TopPicture.setBackground(Color.WHITE);
			    
		    contentPane.add(LoginButtun);
		    /////////////////////////////////////////////
		    
		 
		    
		    /////////////////////////////////////
		    URL url2 = new URL("http://honourrollreports.com/Assets/Images/Icons/LargeHelp.png");
		    Icon icon2 = new ImageIcon(url2);
		    ForgotPassword = new JButton(icon2);
		    ForgotPassword.setLocation(143, 401);
		    ForgotPassword.setSize(150, 150);
		    ForgotPassword.setBounds(215, 396, 150, 155);
		    ForgotPassword.setBackground(Color.WHITE);
		    contentPane.add(ForgotPassword);
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
		    ////////////////////////////
		
		    
		    
		    ///////////////////////////////////////////
		   
		    
		    txtUserName = new JTextField();
		    txtUserName.setBackground(Color.WHITE);
		    txtUserName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		    txtUserName.setText("User name");
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

	public void setTxtUserName(JTextField txtUserName) {
		this.txtUserName = txtUserName;
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


