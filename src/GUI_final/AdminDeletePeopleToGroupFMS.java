package GUI_final;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
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
import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import java.awt.Label;


public class AdminDeletePeopleToGroupFMS extends  AbstractGUI {

	private JPanel contentPane;
	private TextField ReasontextField;
	private JTextPane textPane;
	private JTextPane txtpnChooseUser_1;
	private JTextPane txtpnChooseGroup;
	private JComboBox<Object> groupChoice;
	private JComboBox<Object> UserChoice;
	private JLabel deleteLabel;
	private JButton buttonOk;
	private JButton buttonCancel;


	/**
	 * Launch the application.
	 */
	public void init() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDeletePeopleToGroupFMS frame = new AdminDeletePeopleToGroupFMS();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdminDeletePeopleToGroupFMS(){
		setBackground(SystemColor.textHighlight);		
		
		getContentPane().setBackground(new Color(59, 89, 151));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(214, 20, 20));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(contentPane);
		contentPane.setLayout(null);
		getContentPane().setLayout(null);
		setLayout(null);
		
		txtpnChooseGroup = new JTextPane();
		txtpnChooseGroup.setForeground(SystemColor.textHighlightText);
		txtpnChooseGroup.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnChooseGroup.setText("Choose group");
		txtpnChooseGroup.setBackground(new Color(214, 20, 20));
		txtpnChooseGroup.setBounds(163, 282, 118, 26);
	    add(txtpnChooseGroup);
		
		txtpnChooseUser_1 = new JTextPane();
		txtpnChooseUser_1.setForeground(SystemColor.textHighlightText);
		txtpnChooseUser_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnChooseUser_1.setText("Choose user");
		txtpnChooseUser_1.setBackground(new Color(214, 20, 20));
		txtpnChooseUser_1.setBounds(163, 321, 118, 26);
		add(txtpnChooseUser_1);
		
		textPane = new JTextPane();
		textPane.setForeground(SystemColor.textHighlightText);
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textPane.setText("Reason");
		textPane.setBackground(new Color(214, 20, 20));
		textPane.setBounds(163, 362, 118, 26);
		add(textPane);
		
		ReasontextField = new TextField();
		ReasontextField.setFont(new Font("Dialog", Font.PLAIN, 16));
		ReasontextField.setBounds(307, 369, 100, 19);
		add(ReasontextField);
		
		groupChoice = new JComboBox<Object>();
		groupChoice.setFont(new Font("Dialog", Font.PLAIN, 16));
		groupChoice.setBounds(307, 286, 100, 17);
		add(groupChoice);
		
		UserChoice = new JComboBox<Object>();
		UserChoice.setFont(new Font("Dialog", Font.PLAIN, 16));
		UserChoice.setBounds(307, 325, 100, 17);
		add(UserChoice);
		
		deleteLabel = new JLabel("");
		deleteLabel.setIcon(new ImageIcon(Login_GUI.class.getResource("/images_icons/Remove-People-From-Group.png")));
		deleteLabel.setBounds(20, 42, 722, 197);
		add(deleteLabel);
		
		buttonOk = new JButton("");		
		buttonOk.setIcon(new ImageIcon(Login_GUI.class.getResource("/images_icons/okButton.png")));
		buttonOk.setOpaque(false);
		buttonOk.setContentAreaFilled(false); 
		buttonOk.setBorderPainted(false);
		buttonOk.setBounds(20, 429, 150, 56);
		add(buttonOk);
		
		buttonCancel = new JButton("");
		buttonCancel.setBounds(592, 429, 150, 56);
		buttonCancel.setIcon(new ImageIcon(Login_GUI.class.getResource("/images_icons/cancelButton.png")));
		buttonCancel.setOpaque(false);
		buttonCancel.setContentAreaFilled(false);
		buttonCancel.setBorderPainted(false);
		add(buttonCancel);
	}


	public TextField getReasontextField() {
		return ReasontextField;
	}


	public void setReasontextField(TextField reasontextField) {
		ReasontextField = reasontextField;
	}


	public JTextPane getTextPane() {
		return textPane;
	}


	public void setTextPane(JTextPane textPane) {
		this.textPane = textPane;
	}


	public JTextPane getTxtpnChooseUser_1() {
		return txtpnChooseUser_1;
	}


	public void setTxtpnChooseUser_1(JTextPane txtpnChooseUser_1) {
		this.txtpnChooseUser_1 = txtpnChooseUser_1;
	}


	public JTextPane getTxtpnChooseGroup() {
		return txtpnChooseGroup;
	}


	public void setTxtpnChooseGroup(JTextPane txtpnChooseGroup) {
		this.txtpnChooseGroup = txtpnChooseGroup;
	}

	public JLabel getDeleteLabel() {
		return deleteLabel;
	}


	public void setDeleteLabel(JLabel deleteLabel) {
		this.deleteLabel = deleteLabel;
	}


	public JComboBox<Object> getGroupChoice() {
		return groupChoice;
	}

	public void setGroupChoice(JComboBox<Object> groupChoice) {
		this.groupChoice = groupChoice;
	}

	public JComboBox<Object> getUserChoice() {
		return UserChoice;
	}

	public void setUserChoice(JComboBox<Object> userChoice) {
		UserChoice = userChoice;
	}

	public JButton getButtonOk() {
		return buttonOk;
	}


	public void setButtonOk(JButton buttonOk) {
		this.buttonOk = buttonOk;
	}


	public JButton getButtonCancel() {
		return buttonCancel;
	}


	public void setButtonCancel(JButton buttonCancel) {
		this.buttonCancel = buttonCancel;
	}


}
