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


public class AdminAddPeopleToGroup extends AbstractGUI {

	private JPanel contentPane;
	private JLabel join;
	private JButton cancelButton;
	private JButton OkButton;
	private TextField textField;
	private JTextField UserText;
	private JTextField GroupFiled;
	private JTextPane txtpnU;
	private JTextPane txtpnGroup;
	private String grp = new String();
	private String usr = new String();
	private JTextPane txtpnReason;
	private JLabel CreateLabel;
	

	/**
	 * Launch the application.
	 */
	public void init(final String grp, final String usr) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminAddPeopleToGroup frame = new AdminAddPeopleToGroup(grp ,usr);
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
	
	public AdminAddPeopleToGroup(String grp, String usr) {
		this.usr = usr;
		this.grp = grp;
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(59, 89, 151));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new TextField();
		textField.setBounds(427, 359, 185, 20);
		contentPane.add(textField);
		
		OkButton = new JButton();	
		OkButton.setIcon(new ImageIcon("images/approved.png"));
		OkButton.setOpaque(false);
		OkButton.setContentAreaFilled(false); 
		OkButton.setBorderPainted(false); 
		OkButton.setBounds(174, 426, 150, 54);
		contentPane.add(OkButton);
		
		cancelButton = new JButton();
		cancelButton.setIcon(new ImageIcon("images/reject.png"));
		cancelButton.setOpaque(false);
		cancelButton.setContentAreaFilled(false); 
		cancelButton.setBorderPainted(false); 
		cancelButton.setBounds(442, 426, 150, 54);
		contentPane.add(cancelButton);
		
		join= new JLabel();
		join.setIcon(new ImageIcon("images/join.jpeg"));
		join.setBounds(47, 250, 260	, 165);
		contentPane.add(join);
		
		UserText = new JTextField(usr);
		UserText.setHorizontalAlignment(JTextField.LEFT);
		UserText.setEditable(false);
		UserText.setText(getUsr());
		UserText.setBounds(426, 255, 185, 20);
		contentPane.add(UserText);
		
		GroupFiled = new JTextField();
		GroupFiled.setHorizontalAlignment(JTextField.LEFT);
		GroupFiled.setEditable(false);
		GroupFiled.setText(getGrp());
		GroupFiled.setBounds(427, 309, 185, 20);
		contentPane.add(GroupFiled);
		
		txtpnU = new JTextPane();
		txtpnU.setBackground(Color.GREEN);
		txtpnU.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnU.setText("User");
		txtpnU.setBounds(338, 256, 73, 20);
		contentPane.add(txtpnU);
		
		txtpnGroup = new JTextPane();
		txtpnGroup.setBackground(Color.GREEN);
		txtpnGroup.setText("Group\r\n");
		txtpnGroup.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnGroup.setBounds(338, 308, 73, 20);
		contentPane.add(txtpnGroup);
		
		txtpnReason = new JTextPane();
		txtpnReason.setText("Reason\r\n");
		txtpnReason.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnReason.setBackground(Color.GREEN);
		txtpnReason.setBounds(339, 359, 73, 20);
		contentPane.add(txtpnReason);
		
		CreateLabel = new JLabel("");
		CreateLabel.setIcon(new ImageIcon("images/Add-People-To-Group.png"));
		CreateLabel.setBounds(37, 32, 535, 199);
		contentPane.add(CreateLabel);
	}


	public JTextPane getTxtpnU() {
		return txtpnU;
	}

	public void setTxtpnU(JTextPane txtpnU) {
		this.txtpnU = txtpnU;
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

	public JTextField getUserText() {
		return UserText;
	}

	public void setUserText(JTextField userText) {
		UserText = userText;
	}

	public JTextField getGroupFiled() {
		return GroupFiled;
	}

	public void setGroupFiled(JTextField groupFiled) {
		GroupFiled = groupFiled;
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



	public JLabel getCreateLabel() {
		return CreateLabel;
	}

	public void setCreateLabel(JLabel createLabel) {
		CreateLabel = createLabel;
	}

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
}
