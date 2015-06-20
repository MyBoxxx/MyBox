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

import javax.swing.JTextField;


public class AdminDeletePeopleToGroup extends AbstractGUI {

	private JPanel contentPane;
	private JLabel join;
	private JButton cancelButton;
	private JButton DeleteButton;
	private TextField textField;
	private JTextPane textPane;
	private JTextPane txtpnChooseUser_1;
	private JTextPane txtpnChooseGroup;
	private JLabel deleteLabel;
	private JTextField UserTxt;
	private JTextField groupTxt;
	private String grp = new String();
	private String usr = new String();
	

	public String getGrp() {
		return grp;
	}

	public void setGrp(String grp) {
		this.grp = grp;
	}

	public String getUsr() {
		return usr;
	}

	public void setUsr(String usr) {
		this.usr = usr;
	}

	/**
	 * Launch the application.
	 */
	public void init(final String usr, final String grp) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDeletePeopleToGroup frame = new AdminDeletePeopleToGroup(usr ,grp);
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
	public AdminDeletePeopleToGroup(String usr, String grp) {
		this.usr = usr;
		this.grp = grp;
		
		getContentPane().setBackground(SystemColor.textHighlight);
		setBackground(SystemColor.textHighlight);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(214, 20, 20));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(contentPane);
		contentPane.setLayout(null);
		getContentPane().setLayout(null);
		
		txtpnChooseGroup = new JTextPane();
		txtpnChooseGroup.setForeground(SystemColor.textHighlightText);
		txtpnChooseGroup.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnChooseGroup.setText("Choose Group");
		txtpnChooseGroup.setBackground(new Color(214, 20, 20));
		txtpnChooseGroup.setBounds(218, 241, 107, 26);
	    getContentPane().add(txtpnChooseGroup);
		
		txtpnChooseUser_1 = new JTextPane();
		txtpnChooseUser_1.setForeground(SystemColor.textHighlightText);
		txtpnChooseUser_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnChooseUser_1.setText("Choose User");
		txtpnChooseUser_1.setBackground(new Color(214, 20, 20));
		txtpnChooseUser_1.setBounds(218, 171, 107, 26);
		getContentPane().add(txtpnChooseUser_1);
		
		textPane = new JTextPane();
		textPane.setForeground(SystemColor.textHighlightText);
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textPane.setText("Reason");
		textPane.setBackground(new Color(214, 20, 20));
		textPane.setBounds(218, 306, 107, 26);
		getContentPane().add(textPane);
		
		textField = new TextField();
		textField.setBounds(354, 313, 100, 19);
		getContentPane().add(textField);
		
		DeleteButton = new JButton();		
		DeleteButton.setIcon(new ImageIcon("src/GUI_final/remove.png"));
		DeleteButton.setBounds(10, 419, 192, 63);
		getContentPane().add(DeleteButton);
		
		cancelButton = new JButton();
		cancelButton.setIcon(new ImageIcon("src/GUI_final/cancelgreen.jpg"));
		cancelButton.setBounds(489, 408, 248, 74);
		getContentPane().add(cancelButton);
		
		join = new JLabel();
		join.setIcon(new ImageIcon("src/GUI_final/deleteFromGroup.png"));
		join.setBounds(325, 49, 0	, 0);
		getContentPane().add(join);
		
		deleteLabel = new JLabel();
		deleteLabel.setIcon(new ImageIcon("src/GUI_final/deletePeople.png"));
		deleteLabel.setBounds(37, 11, 700, 94);
		getContentPane().add(deleteLabel);
		
		UserTxt = new JTextField();
		UserTxt.setBounds(354, 171, 100, 19);
		getContentPane().add(UserTxt);
		UserTxt.setColumns(10);
		
		groupTxt = new JTextField();
		groupTxt.setColumns(10);
		groupTxt.setBounds(354, 241, 100, 19);
		getContentPane().add(groupTxt);
	}


	public JLabel getDeleteLabel() {
		return deleteLabel;
	}

	public void setDeleteLabel(JLabel deleteLabel) {
		this.deleteLabel = deleteLabel;
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

	public JTextField getUserTxt() {
		return UserTxt;
	}

	public void setUserTxt(JTextField userTxt) {
		UserTxt = userTxt;
	}

	public JTextField getGroupTxt() {
		return groupTxt;
	}

	public void setGroupTxt(JTextField groupTxt) {
		this.groupTxt = groupTxt;
	}


}
