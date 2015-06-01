package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JPasswordField;

import com.thehowtotutorial.splashscreen.JSplash;

import java.awt.Font;

public class Login_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JTextField txtOneOrMore;

	/**
	 * Launch the application.
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		
		JSplash splashs = new JSplash(Main.class.getResource("logo.png"), true, true, false, "V1",null,Color.RED,Color.BLACK);
		splashs.splashOn();
		//call Method;
		splashs.setProgress(20, "Init");
		Thread.sleep(1000);
		splashs.setProgress(40, "Loading");
		Thread.sleep(1000);
		splashs.setProgress(60, "Applying Configs");
		Thread.sleep(1000);
		splashs.setProgress(80, "Making JAVA");
		Thread.sleep(1000);
		splashs.setProgress(100, "100 Ein ma");
		Thread.sleep(1000);
		splashs.splashOff();
		
		
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
		
		 URL url = new URL("http://i.imgur.com/6Bq6MQr.gif");
		    Icon icon = new ImageIcon(url);
		    JLabel label = new JLabel(icon);
		    label.setBounds(10, 32, 773, 257);
		    label.setBackground(Color.WHITE);
		    label.addMouseListener(new MouseAdapter() {
		        public void mouseClicked(MouseEvent me) {
		          System.out.println("CLICKED");
		        }
		      });		    
		    contentPane.setLayout(null);
		    contentPane.add(label);
		    ///////////////////////
		    URL url1 = new URL("http://www.freevectors.net/files/small/LoginIcon.jpg");
		    Icon icon1 = new ImageIcon(url1);
		    JLabel label1 = new JLabel(icon1);
		    label1.setBounds(437, 396, 150, 150);
		    label.setBackground(Color.WHITE);
		    label1.addMouseListener(new MouseAdapter() {
		        public void mouseClicked(MouseEvent me) {
		        	JOptionPane.showMessageDialog(contentPane,  "Login OK!.");
		        	txtOneOrMore.setVisible(false);
		        }
		      });		    
		    contentPane.add(label1);
		    /////////////////////////////////////////////
		    
		    URL url2 = new URL("http://honourrollreports.com/Assets/Images/Icons/LargeHelp.png");
		    Icon icon2 = new ImageIcon(url2);
		    JLabel label2 = new JLabel(icon2);
		    label2.setLocation(143, 401);
		    label2.setSize(150, 150);
		    label2.setBounds(215, 396, 150, 155);
		    label2.setBackground(Color.WHITE);
		    label2.addMouseListener(new MouseAdapter() {
		        public void mouseClicked(MouseEvent me) {
		        	JOptionPane.showMessageDialog(contentPane,  "Forgot Password OK!.");
		        	txtOneOrMore.setVisible(true);
		        }
		      });		    
		    contentPane.add(label2);
		    ///////////////////////////////////////////
		    textField = new JTextField();
		    textField.setBounds(205, 317, 387, 20);
		    contentPane.add(textField);
		    textField.setColumns(10);
		    
		    passwordField = new JPasswordField();
		    passwordField.setBounds(205, 361, 387, 20);
		    contentPane.add(passwordField);
		    
		    txtUsername = new JTextField();
		    txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));
		    txtUsername.setBackground(Color.WHITE);
		    txtUsername.setEditable(false);
		    txtUsername.setText("Username");
		    txtUsername.setBounds(44, 317, 86, 20);
		    txtUsername.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		    contentPane.add(txtUsername);
		    txtUsername.setColumns(10);
		    
		    txtPassword = new JTextField();
		    txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		    txtPassword.setBackground(Color.WHITE);
		    txtPassword.setEditable(false);
		    txtPassword.setText("Password\r\n");
		    txtPassword.setColumns(10);
		    txtPassword.setBounds(44, 361, 107, 20);
		    txtPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		    contentPane.add(txtPassword);
		    
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
		  
		    //f.setVisible(true);
	}
}


