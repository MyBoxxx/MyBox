package GUI_final;

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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ForgotPassword_GUI extends JFrame {

	private JPanel contentPane;
	private JLabel txtEnterYourEmail;
	private JTextField txtEmail;
	private JButton sumbit;
	
	/**
	 * Launch the application.
	 */
	public void fpScreen() {
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
	
		    JLabel ForgotPass = new JLabel(new ImageIcon(ForgotPassword_GUI.class.getResource("/images_icons/forgot-password_top.gif")));
		   
		    ForgotPass.setBounds(10, 11, 360, 267);
		    ForgotPass.setBackground(Color.WHITE);
		 	
		    contentPane.setLayout(null);
		    contentPane.add(ForgotPass);
		    /////////////////////////////////////////
		  
		    sumbit = new JButton(new ImageIcon(ForgotPassword_GUI.class.getResource("/images_icons/subbmit_button.gif")));
		  
		    sumbit.setBounds(421, 255, 196, 141);
		    sumbit.setBackground(Color.WHITE);
		    sumbit.setOpaque(false);
		    sumbit.setContentAreaFilled(false);
		    sumbit.setBorderPainted(false);
		    contentPane.setLayout(null);
		    contentPane.add(sumbit);
		    
		    
		    /////////////////////////////////////////////////
		    txtEnterYourEmail = new JLabel();
		    txtEnterYourEmail.setBackground(Color.WHITE);
		    txtEnterYourEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		    txtEnterYourEmail.setText("Enter your email address to show your password");
		    txtEnterYourEmail.setBounds(10, 309, 360, 20);
		    txtEnterYourEmail.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		    contentPane.add(txtEnterYourEmail);
		    
		    txtEmail = new JTextField();
		    txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));

		    
		    txtEmail.setText("E-mail");
		    txtEmail.setBounds(10, 350, 360, 20);
		    contentPane.add(txtEmail);
		    txtEmail.setColumns(10);
	}

	public JTextField getTxtEmail() {
		return txtEmail;
	}

	public void setTxtEmail(String txtEmail) {
		this.txtEmail.setText(txtEmail);
	}
	public JButton getSumbit() {
		return sumbit;
	}


}
