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

public class ForgotPassword_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtEmail;
	private JButton sumbit;
	private JLabel show_password;


	public static  void main(String[] args) {
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
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 * @throws MalformedURLException 
	 */
	public ForgotPassword_GUI() {
		setBackground(Color.WHITE);
		setTitle("Forgot Password\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		    JLabel ForgotPass = new JLabel(new ImageIcon(ForgotPassword_GUI.class.getResource("/images_icons/forgot-password_top.gif")));
		   
		    ForgotPass.setBounds(226, 6, 360, 267);
		    ForgotPass.setBackground(Color.WHITE);
		 	
		    contentPane.setLayout(null);
		    contentPane.add(ForgotPass);
		    sumbit = new JButton(new ImageIcon(ForgotPassword_GUI.class.getResource("/images_icons/subbmit_button.gif")));
		    sumbit.setBorderPainted(false); 
		    sumbit.setContentAreaFilled(false); 
		    sumbit.setFocusPainted(false); 
		    sumbit.setOpaque(false);
		    sumbit.setBounds(598, 256, 196, 141);
		    sumbit.setBackground(Color.WHITE);
		    contentPane.setLayout(null);
		    contentPane.add(sumbit);
		    
		    JLabel txtEnterYourEmail = new JLabel();
		    txtEnterYourEmail.setBackground(Color.WHITE);
		    txtEnterYourEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		    txtEnterYourEmail.setText("Enter your email address to show your password");
		    txtEnterYourEmail.setBounds(226, 308, 360, 20);
		    txtEnterYourEmail.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		    contentPane.add(txtEnterYourEmail);
		    
		    txtEmail = new JTextField();
		    txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		    
		   
		    txtEmail.setText("E-mail");
		    txtEmail.setBounds(226, 353, 360, 20);
		    contentPane.add(txtEmail);
		    txtEmail.setColumns(10);
		    
		    show_password = new JLabel("");
		    show_password.setForeground(Color.RED);
		    show_password.setBounds(226, 409, 360, 29);
		    contentPane.add(show_password);
	}
	public JTextField getTxtEmail() {
		return txtEmail;
	}

	public JLabel getShow_password() {
		return show_password;
	}


	public void setShow_password(JLabel show_password) {
		this.show_password = show_password;
	}


	public void setTxtEmail(String newtxtEmail) {
		this.txtEmail.setText(newtxtEmail); 
	}

	public JButton getSumbit() {
		return sumbit;
	}

	public void setSumbit(JButton sumbit) {
		this.sumbit = sumbit;
	}
}
