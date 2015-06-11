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


public class RemovePeopleToGroup extends AbstractGUI {

	private JPanel contentPane;
	private JLabel join;
	private JButton cancelButton;
	private JButton OkButton;
	private TextField textField;
	private JTextPane textPane;
	private Choice choose_user;
	private JTextPane txtpnChooseUser_1;
	private JTextPane txtpnChooseGroup;
	private Choice choiceGroup;
	private JTextPane txtpnAddPeopleTo;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemovePeopleToGroup frame = new RemovePeopleToGroup();
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
	public RemovePeopleToGroup() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(59, 89, 151));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtpnAddPeopleTo = new JTextPane();
		txtpnAddPeopleTo.setForeground(SystemColor.textHighlightText);
		txtpnAddPeopleTo.setBackground(new Color(59, 89, 151));
		txtpnAddPeopleTo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnAddPeopleTo.setText("Add People To Group");		
		txtpnAddPeopleTo.setBounds(134, 0, 160, 20);
		contentPane.add(txtpnAddPeopleTo);
		
		choiceGroup = new Choice();
		choiceGroup.setBounds(301, 70, 185, 20);
		choiceGroup.add("");
		choiceGroup.add("100");
		choiceGroup.add("ein ma");
		choiceGroup.add("peter");
		contentPane.add(choiceGroup);
		
		txtpnChooseGroup = new JTextPane();
		txtpnChooseGroup.setForeground(SystemColor.textHighlightText);
		txtpnChooseGroup.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnChooseGroup.setText("Choose Group");
		txtpnChooseGroup.setBackground(new Color(59, 89, 151));
		txtpnChooseGroup.setBounds(301, 44, 185, 20);
		contentPane.add(txtpnChooseGroup);
		
		txtpnChooseUser_1 = new JTextPane();
		txtpnChooseUser_1.setForeground(SystemColor.textHighlightText);
		txtpnChooseUser_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnChooseUser_1.setText("Choose User");
		txtpnChooseUser_1.setBackground(new Color(59, 89, 151));
		txtpnChooseUser_1.setBounds(300, 93, 137, 20);
		contentPane.add(txtpnChooseUser_1);
		
		choose_user = new Choice();
		choose_user.add("");
		choose_user.add("100");
		choose_user.add("ein ma");
		choose_user.add("peter");
		choose_user.setBounds(301, 119, 185, 20);
		contentPane.add(choose_user);
		
		textPane = new JTextPane();
		textPane.setForeground(SystemColor.textHighlightText);
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textPane.setText("Reason");
		textPane.setBackground(new Color(59, 89, 151));
		textPane.setBounds(301, 142, 67, 20);
		contentPane.add(textPane);
		
		textField = new TextField();
		textField.setBounds(301, 168, 185, 20);
		contentPane.add(textField);
		
		OkButton = new JButton();	
		OkButton.setIcon(new ImageIcon("src/GUI_final/add.png"));
		OkButton.setBounds(20, 188, 192, 63);
		contentPane.add(OkButton);
		
		cancelButton = new JButton();
		cancelButton.setIcon(new ImageIcon("src/GUI_final/cancelButton.jpg"));
		cancelButton.setBounds(277, 209, 209, 42);
		contentPane.add(cancelButton);
		
		join= new JLabel();
		join.setIcon(new ImageIcon("src/GUI_final/join.jpeg"));
		join.setBounds(10, 27, 260	, 165);
		contentPane.add(join);
	}


	public void okListner(ActionListener listenForOkButton){
		OkButton.addActionListener(listenForOkButton);
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
		return OkButton;
	}

	public void setOkButton(JButton okButton) {
		OkButton = okButton;
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

	public JTextPane getTxtpnAddPeopleTo() {
		return txtpnAddPeopleTo;
	}

	public void setTxtpnAddPeopleTo(JTextPane txtpnAddPeopleTo) {
		this.txtpnAddPeopleTo = txtpnAddPeopleTo;
	}
}
