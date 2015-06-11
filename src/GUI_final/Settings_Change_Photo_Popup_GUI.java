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
import java.net.MalformedURLException;
import java.net.URL;

public class Settings_Change_Photo_Popup_GUI extends AbstractGUI {

	private JPanel contentPane;
	private JButton btnChangeYourProfile,btnCancel;


	/**
	 * Create the frame.
	 * @throws MalformedURLException 
	 */
	public Settings_Change_Photo_Popup_GUI()  {
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
	    btnCancel.setBounds(372, 402, 89, 23);
	    contentPane.add(btnCancel);
	    
	    btnChangeYourProfile = new JButton("Change your profile picture");
	    btnChangeYourProfile.setBounds(32, 402, 192, 23);
	    contentPane.add(btnChangeYourProfile);
	    JLabel label4 = new JLabel(new ImageIcon(Settings_Change_Photo_Popup_GUI.class.getResource("/images_icons/ChangePic.jpg")));
	    label4.setLocation(0, 11);
	    label4.setSize(759, 450);
	   
	    contentPane.add(label4);
	}
	public JButton getBtnChangeYourProfile() {
		return btnChangeYourProfile;
	}

	public void setBtnChangeYourProfile(JButton btnChangeYourProfile) {
		this.btnChangeYourProfile = btnChangeYourProfile;
	}

	public JButton getBtnCancel() {
		return btnCancel;
	}

	public void setBtnCancel(JButton btnCancel) {
		this.btnCancel = btnCancel;
	}

}
