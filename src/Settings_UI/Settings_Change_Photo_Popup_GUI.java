package Settings_UI;

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

public class Settings_Change_Photo_Popup_GUI extends JFrame {

	private JPanel contentPane;

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
	public Settings_Change_Photo_Popup_GUI() throws MalformedURLException {
		setTitle("Change photo");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 489);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		URL url4 = new URL("http://sdtimes.com/wp-content/uploads/2015/03/APR15-0323-OPINION-GUESTVIEW-CUSHARD.jpg");
	    Icon icon4 = new ImageIcon(url4);
	    
	    JButton btnCancel = new JButton("Cancel");
	    btnCancel.setBounds(372, 402, 89, 23);
	    contentPane.add(btnCancel);
	    
	    JButton btnChangeYourProfile = new JButton("Change your profile picture");
	    btnChangeYourProfile.setBounds(32, 402, 192, 23);
	    contentPane.add(btnChangeYourProfile);
	    JLabel label4 = new JLabel(icon4);
	    label4.setLocation(0, 11);
	    label4.setSize(759, 450);
	   
	    contentPane.add(label4);
	}

}
