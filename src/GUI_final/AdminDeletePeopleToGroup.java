package GUI_final;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
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


public class AdminDeletePeopleToGroup extends JPanel {

	private JPanel contentPane;
	private JLabel join;
	private JButton cancelButton;
	private JButton DeleteButton;
	private TextField textField;
	private JTextPane textPane;
	private Choice choose_user;
	private JTextPane txtpnChooseUser_1;
	private JTextPane txtpnChooseGroup;
	private Choice choiceGroup;
	private JLabel deleteLabel;
	

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDeletePeopleToGroup frame = new AdminDeletePeopleToGroup();
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
	public AdminDeletePeopleToGroup() {
		setBackground(SystemColor.textHighlight);
	/*	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(214, 20, 20));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);*/
		setLayout(null);
		
		choiceGroup = new Choice();
		choiceGroup.setBounds(354, 176, 100, 17);
		choiceGroup.add("");
		choiceGroup.add("100");
		choiceGroup.add("ein ma");
		choiceGroup.add("peter");
		add(choiceGroup);
		
		txtpnChooseGroup = new JTextPane();
		txtpnChooseGroup.setForeground(SystemColor.textHighlightText);
		txtpnChooseGroup.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnChooseGroup.setText("Choose Group");
		txtpnChooseGroup.setBackground(new Color(214, 20, 20));
		txtpnChooseGroup.setBounds(218, 241, 107, 26);
	    add(txtpnChooseGroup);
		
		txtpnChooseUser_1 = new JTextPane();
		txtpnChooseUser_1.setForeground(SystemColor.textHighlightText);
		txtpnChooseUser_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnChooseUser_1.setText("Choose User");
		txtpnChooseUser_1.setBackground(new Color(214, 20, 20));
		txtpnChooseUser_1.setBounds(218, 179, 107, 26);
		add(txtpnChooseUser_1);
		
		choose_user = new Choice();
		choose_user.add("");
		choose_user.add("100");
		choose_user.add("ein ma");
		choose_user.add("peter");
		choose_user.setBounds(354, 241, 100, 17);
		add(choose_user);
		
		textPane = new JTextPane();
		textPane.setForeground(SystemColor.textHighlightText);
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textPane.setText("Reason");
		textPane.setBackground(new Color(214, 20, 20));
		textPane.setBounds(218, 306, 107, 26);
		add(textPane);
		
		textField = new TextField();
		textField.setBounds(354, 313, 100, 19);
		add(textField);
		
		DeleteButton = new JButton();		
		DeleteButton.setIcon(new ImageIcon("src/GUI_final/remove.png"));
		DeleteButton.setBounds(10, 419, 192, 63);
		add(DeleteButton);
		
		cancelButton = new JButton();
		cancelButton.setIcon(new ImageIcon("src/GUI_final/cancelgreen.jpg"));
		cancelButton.setBounds(489, 408, 248, 74);
		add(cancelButton);
		
		join = new JLabel();
		join.setIcon(new ImageIcon("src/GUI_final/deleteFromGroup.png"));
		join.setBounds(325, 49, 0	, 0);
		add(join);
		
		deleteLabel = new JLabel();
		deleteLabel.setIcon(new ImageIcon("src/GUI_final/deletePeople.png"));
		deleteLabel.setBounds(37, 11, 700, 94);
		add(deleteLabel);
	}


	public void deleteListner(ActionListener listenForDeleteButton){
		DeleteButton.addActionListener(listenForDeleteButton);
	}
	
	public JButton getDeleteButton() {
		return DeleteButton;
	}

	public void setDeleteButton(JButton deleteButton) {
		DeleteButton = deleteButton;
	}

	public void cancelListner(ActionListener listenForCancelButton){
		cancelButton.addActionListener(listenForCancelButton);		
	}

	public JLabel getJoin() {
		return join;
	}

	public void setJoin(JLabel join) {
		this.join = join;
	}

	public JButton getCancelButton() {
		return cancelButton;
	}

	public void setCancelButton(JButton cancelButton) {
		this.cancelButton = cancelButton;
	}

	public JButton getOkButton() {
		return DeleteButton;
	}

	public void setOkButton(JButton okButton) {
		DeleteButton = okButton;
	}

	public TextField getTextField() {
		return textField;
	}

	public void setTextField(TextField textField) {
		this.textField = textField;
	}

	public JTextPane getTextPane() {
		return textPane;
	}

	public void setTextPane(JTextPane textPane) {
		this.textPane = textPane;
	}

	public Choice getChoose_user() {
		return choose_user;
	}

	public void setChoose_user(Choice choose_user) {
		this.choose_user = choose_user;
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

	public Choice getChoiceGroup() {
		return choiceGroup;
	}

	public void setChoiceGroup(Choice choiceGroup) {
		this.choiceGroup = choiceGroup;
	}


}
