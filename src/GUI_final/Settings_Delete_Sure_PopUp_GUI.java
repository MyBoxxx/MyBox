package GUI_final;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.Normalizer.Form;

import javax.swing.JTextField;

import java.awt.TextField;
import java.awt.TextArea;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JPasswordField;

public class Settings_Delete_Sure_PopUp_GUI extends AbstractGUI {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JButton btnNewButton;
	private JButton btnCancel;

	/**
	 * Create the frame.
	 * @throws MalformedURLException 
	 */
	public Settings_Delete_Sure_PopUp_GUI() throws MalformedURLException {
		setTitle("Are you sure you want to delete your account?");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 611);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		URL url4 = new URL("http://www.corbisimages.com/images/Corbis-42-22125844.jpg?size=67&uid=dc018dc5-ccd0-4e11-aa47-6afd6bc33319");
	    Icon icon4 = new ImageIcon(url4);
	    contentPane.setLayout(null);
	    JLabel label4 = new JLabel(icon4);
	    label4.setBounds(5, 5, 518, 310);
	    contentPane.add(label4);
	    
	    JTextPane txtpn = new JTextPane();
	    txtpn.setFont(new Font("Tahoma", Font.PLAIN, 13));
	    txtpn.setEditable(false);
	    txtpn.setText("Are you sure you want to delete your Dropbox account? \r\nWe'll be sad to see you go!  If you have an issue and think\r\nwe might be able to help, please try contacting support first.\r\n\r\nAre you sure you want to delete your Dropbox account? \r\nOnce you do, your files will cease syncing. Don't worry,\r\ndeleting your account will leave your files untouched  on your computer(s).\r\n");
	    txtpn.setBounds(10, 341, 470, 122);
	    contentPane.add(txtpn);
	    
	    JTextPane txtpnPleaseEnterYour = new JTextPane();
	    txtpnPleaseEnterYour.setText("Please enter your password");
	    txtpnPleaseEnterYour.setBounds(20, 474, 213, 20);
	    contentPane.add(txtpnPleaseEnterYour);
	    
	    passwordField = new JPasswordField();
	    passwordField.setBounds(267, 474, 152, 20);
	    contentPane.add(passwordField);
	    
	    JTextPane txtpnWhyAreYou = new JTextPane();
	    txtpnWhyAreYou.setText("Why are you leaving (optional)");
	    txtpnWhyAreYou.setBounds(20, 505, 179, 20);
	    contentPane.add(txtpnWhyAreYou);
	    
	    JTextPane textPane = new JTextPane();
	    textPane.setBounds(267, 517, 6, 20);
	    contentPane.add(textPane);
	    
	    passwordField_1 = new JPasswordField();
	    passwordField_1.setBounds(267, 505, 152, 20);
	    contentPane.add(passwordField_1);
	    
	     btnNewButton = new JButton("Delete my account");
	    btnNewButton.setBounds(30, 539, 152, 23);
	    contentPane.add(btnNewButton);
	    
	     btnCancel = new JButton("Cancel");
	    btnCancel.setBounds(277, 539, 89, 23);
	    contentPane.add(btnCancel);
	    
	}
}
