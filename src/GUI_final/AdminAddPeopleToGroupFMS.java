package GUI_final;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.print.DocFlavor.STRING;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;

import java.awt.Choice;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;


import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class AdminAddPeopleToGroupFMS extends  JPanel {

	private JPanel contentPane;
	private JTextPane txtpnUser;
	private JTextPane txtpnGroup;
	
	private JTextPane txtpnReason;
	private JLabel addLabel;
	private JButton btnOk;
	private JButton buttonCancel;
	private Choice userChoice;
	private Choice groupChoice;
	private JTextPane ReasontextPane;
	

	/**
	 * Launch the application.
	 */
	/*public void init() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminAddPeopleToGroupFMS frame = new AdminAddPeopleToGroupFMS();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	
	public AdminAddPeopleToGroupFMS() {
		setBackground(SystemColor.textHighlight);
		
		
		/*frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(59, 89, 151));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);*/
		setLayout(null);
		
		txtpnUser = new JTextPane();
		txtpnUser.setBackground(Color.GREEN);
		txtpnUser.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnUser.setText("Choose user");
		txtpnUser.setBounds(176, 291, 110, 26);
		add(txtpnUser);
		
		txtpnGroup = new JTextPane();
		txtpnGroup.setBackground(Color.GREEN);
		txtpnGroup.setText("Choose group\r\n");
		txtpnGroup.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnGroup.setBounds(176, 235, 110, 26);
		add(txtpnGroup);
		
		txtpnReason = new JTextPane();
		txtpnReason.setText("Reason\r\n");
		txtpnReason.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnReason.setBackground(Color.GREEN);
		txtpnReason.setBounds(176, 343, 110, 26);
		add(txtpnReason);
		
		addLabel = new JLabel("");
		addLabel.setIcon(new ImageIcon("images/Add-People-To-Group.png"));
		addLabel.setBounds(70, 11, 535, 199);
		add(addLabel);
		
		userChoice = new Choice();
		userChoice.setFont(new Font("Dialog", Font.PLAIN, 16));
		userChoice.setBounds(302, 291, 129, 17);
		add(userChoice);
		
		groupChoice = new Choice();
		groupChoice.setFont(new Font("Dialog", Font.PLAIN, 16));
		groupChoice.setBounds(302, 235, 129, 17);
		add(groupChoice);
		
		ReasontextPane = new JTextPane();
		ReasontextPane.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ReasontextPane.setBounds(302, 343, 129, 20);
		add(ReasontextPane);
		
		btnOk = new JButton("");
		btnOk.setIcon(new ImageIcon("images/okButton.png"));
		btnOk.setOpaque(false);
		btnOk.setContentAreaFilled(false); 
		btnOk.setBorderPainted(false);
		btnOk.setBounds(23, 434, 150, 56);
		add(btnOk);
		
		buttonCancel = new JButton("");
		buttonCancel.setIcon(new ImageIcon("images/cancelButton.png"));
		buttonCancel.setOpaque(false);
		buttonCancel.setContentAreaFilled(false);
		buttonCancel.setBorderPainted(false);
		buttonCancel.setBounds(594, 434, 150, 56);
		add(buttonCancel);
	}


	public Choice getUserChoice() {
		return userChoice;
	}


	public void setUserChoice(Choice userChoice) {
		this.userChoice = userChoice;
	}


	public Choice getGroupChoice() {
		return groupChoice;
	}


	public void setGroupChoice(Choice groupChoice) {
		this.groupChoice = groupChoice;
	}


	public JTextPane getReasontextPane() {
		return ReasontextPane;
	}


	public void setReasontextPane(JTextPane reasontextPane) {
		ReasontextPane = reasontextPane;
	}


	public JTextPane getTxtpnU() {
		return txtpnUser;
	}

	public void setTxtpnU(JTextPane txtpnU) {
		this.txtpnUser = txtpnU;
	}

	public JTextPane getTxtpnGroup() {
		return txtpnGroup;
	}

	public void setTxtpnGroup(JTextPane txtpnGroup) {
		this.txtpnGroup = txtpnGroup;
	}

	public JTextPane getTxtpnReason() {
		return txtpnReason;
	}

	public void setTxtpnReason(JTextPane txtpnReason) {
		this.txtpnReason = txtpnReason;
	}


	public JTextPane getTxtpnUser() {
		return txtpnUser;
	}


	public void setTxtpnUser(JTextPane txtpnUser) {
		this.txtpnUser = txtpnUser;
	}


	public JButton getBtnOk() {
		return btnOk;
	}


	public void setBtnOk(JButton btnOk) {
		this.btnOk = btnOk;
	}


	public JButton getButtonCancel() {
		return buttonCancel;
	}


	public void setButtonCancel(JButton buttonCancel) {
		this.buttonCancel = buttonCancel;
	}


	public JLabel getAddLabel() {
		return addLabel;
	}


	public void setAddLabel(JLabel addLabel) {
		this.addLabel = addLabel;
	}


}
