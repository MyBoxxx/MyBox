package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
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
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class ForgotPassword_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtEnterYourEmail;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgotPassword_GUI frame = new ForgotPassword_GUI();
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
	public ForgotPassword_GUI() throws MalformedURLException {
		setBackground(Color.WHITE);
		setTitle("Forgot Password\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 677, 434);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//////////////////////////////////////////
		 URL url = new URL("http://www.nifiindia.com/images/forgot-password.gif");
		    Icon icon = new ImageIcon(url);
		    JLabel ForgotPass = new JLabel(icon);
		   
		    ForgotPass.setBounds(10, 11, 360, 267);
		    ForgotPass.setBackground(Color.WHITE);
		 	
		    contentPane.setLayout(null);
		    contentPane.add(ForgotPass);
		    /////////////////////////////////////////
		    URL url1 = new URL("http://www.ccj-online.com/wp-content/uploads/2011/03/button_1.gif");
		    Icon icon1 = new ImageIcon(url1);
		    JLabel sumbit = new JLabel(icon1);
		  
		    sumbit.setBounds(421, 255, 196, 141);
		    sumbit.setBackground(Color.WHITE);
		    sumbit.addMouseListener(new MouseAdapter() {
		        public void mouseClicked(MouseEvent me) {
		        	JOptionPane.showMessageDialog(contentPane,  "Sumbit OK!");
		        }
		      });
		    contentPane.setLayout(null);
		    contentPane.add(sumbit);
		    
		    
		    /////////////////////////////////////////////////
		    txtEnterYourEmail = new JTextField();
		    txtEnterYourEmail.setBackground(Color.WHITE);
		    txtEnterYourEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		    txtEnterYourEmail.setEditable(false);
		    txtEnterYourEmail.setText("Enter your email address to show your password");
		    txtEnterYourEmail.setBounds(10, 309, 360, 20);
		    txtEnterYourEmail.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		    contentPane.add(txtEnterYourEmail);
		    txtEnterYourEmail.setColumns(10);
		    
		    txtEmail = new JTextField();
		    txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		    txtEmail.addFocusListener(new FocusAdapter() {
		    	@Override
		    	public void focusGained(FocusEvent arg0) {
		    		txtEmail.setText("");
		    	}
		    	@Override
		    	public void focusLost(FocusEvent e) {
		    		txtEmail.setText("E-mail");
		    	}
		    });
		    
		   
		    txtEmail.setText("E-mail");
		    txtEmail.setBounds(10, 350, 136, 20);
		    contentPane.add(txtEmail);
		    txtEmail.setColumns(10);
	}
}
