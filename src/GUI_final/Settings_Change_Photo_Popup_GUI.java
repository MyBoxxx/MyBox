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

import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

public class Settings_Change_Photo_Popup_GUI extends JFrame {

	private JPanel contentPane;
	private JButton btnCancel;
	private JButton btnChangeYourProfile ;
	private JLabel pic; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Settings_Change_Photo_Popup_GUI frame = new Settings_Change_Photo_Popup_GUI();
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
	public Settings_Change_Photo_Popup_GUI() {
		setTitle("Change photo");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 489);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
	    contentPane.setLayout(null);
		
		
	    
	    btnCancel = new JButton("Cancel");
	    btnCancel.setBounds(365, 373, 89, 23);
	    contentPane.add(btnCancel);
	    
	    btnChangeYourProfile = new JButton("Change your profile picture");
	    btnChangeYourProfile.setBounds(29, 373, 192, 23);
	    contentPane.add(btnChangeYourProfile);
	    
	    pic = new JLabel("");
	    pic.setBounds(112, 6, 478, 296);
	    pic.setIcon(new ImageIcon("images/ChangePhoto.jpg"));
	    contentPane.add(pic);
	  
	}
	public void changeyourp(ActionListener waitforbutton)
	{
		btnChangeYourProfile.addActionListener(waitforbutton);
	}
	
	public void cancelbuttonpresses(ActionListener waitforbutton)
	{
		btnCancel.addActionListener(waitforbutton);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public JButton getBtnCancel() {
		return btnCancel;
	}

	public void setBtnCancel(JButton btnCancel) {
		this.btnCancel = btnCancel;
	}

	public JButton getBtnChangeYourProfile() {
		return btnChangeYourProfile;
	}

	public void setBtnChangeYourProfile(JButton btnChangeYourProfile) {
		this.btnChangeYourProfile = btnChangeYourProfile;
	}
}
