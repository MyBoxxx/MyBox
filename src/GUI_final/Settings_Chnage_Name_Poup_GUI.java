package GUI_final;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.Font;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.SystemColor;

public class Settings_Chnage_Name_Poup_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtNewName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Settings_Chnage_Name_Poup_GUI frame = new Settings_Chnage_Name_Poup_GUI();
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
	public Settings_Chnage_Name_Poup_GUI() throws MalformedURLException {
		setTitle("Change name");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 352);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNewName = new JTextField();
		txtNewName.setBackground(SystemColor.control);
		txtNewName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtNewName.setText("New name");
		txtNewName.setBounds(37, 128, 223, 57);
		contentPane.add(txtNewName);
		txtNewName.setColumns(10);
		
		URL url4 = new URL("http://weddingrepublic.com/blog/wp-content/uploads/2011/10/name-change.jpg");
	    Icon icon4 = new ImageIcon(url4);
	    JButton btnChangeName = new JButton("Change name");
	    btnChangeName.setBounds(270, 128, 117, 23);
	    contentPane.add(btnChangeName);
	    
	    JButton btnCancel = new JButton("Cancel\r\n");
	    btnCancel.setBounds(270, 162, 117, 23);
	    contentPane.add(btnCancel);
	    JLabel label4 = new JLabel(icon4);
	    label4.setLocation(0, 0);
	    label4.setSize(480, 320);
		contentPane.add(label4);
	}
}
