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

public class Settings_Chnage_Name_Poup_GUI extends AbstractGUI {

	private JPanel contentPane;
	private JTextField txtNewName;
	private JButton btnChangeName;
	private JButton btnCancel;
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
		
	    btnChangeName = new JButton("Change name");
	    btnChangeName.setBounds(270, 128, 117, 23);
	    contentPane.add(btnChangeName);
	    
	    JButton btnCancel = new JButton("Cancel\r\n");
	    btnCancel.setBounds(270, 162, 117, 23);
	    contentPane.add(btnCancel);
	    JLabel label4 = new JLabel();
	    label4.setIcon(new ImageIcon(Settings_Chnage_Name_Poup_GUI.class.getResource("/images_icons/name-change.jpg")));
	    label4.setLocation(0, 0);
	    label4.setSize(480, 320);
		contentPane.add(label4);
	}
	

	public JTextField getTxtNewName() {
		return txtNewName;
	}
	public void setTxtNewName(JTextField txtNewName) {
		this.txtNewName = txtNewName;
	}
	public JButton getBtnChangeName() {
		return btnChangeName;
	}
	public void setBtnChangeName(JButton btnChangeName) {
		this.btnChangeName = btnChangeName;
	}
	public JButton getBtnCancel() {
		return btnCancel;
	}
	public void setBtnCancel(JButton btnCancel) {
		this.btnCancel = btnCancel;
	}
}
