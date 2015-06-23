package GUI_final;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JMenu;

import java.awt.Choice;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;


public class Limitpeopleingroup extends AbstractGUI {
	
	private JPanel contentPane;
	private JTextField CuurenttextField;
	private JTextField newAmounText;
	private JTextPane txtpnCurrentNumberOf;
	private JTextPane txtpnWriteNewNumber;
	private JButton btnOk;
	private JButton btnCancel;
	private JLabel limitLabel;
	private JTextPane txtpnReason;
	String GroupLimit = new String();
	private JTextField ReasontextField;
	private JComboBox<Object> GroupcomboBox;
	private JTextPane txtpnChooseGroup;
	ArrayList <String> result = new ArrayList<String>();
	
	/**
	 * Launch the application.
	 */
	//public void initialize() {
	public void init() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Limitpeopleingroup frame = new Limitpeopleingroup(null,null);
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
	public Limitpeopleingroup(String GroupLimit, ArrayList <String> result ) {
		this.GroupLimit = GroupLimit;
		this.result = result;
		setBackground(SystemColor.textHighlight);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null); 
		getContentPane().setLayout(null);
		
		
		getContentPane().setLayout(null);
		
		txtpnCurrentNumberOf = new JTextPane();
		txtpnCurrentNumberOf.setBounds(129, 260, 121, 28);
		txtpnCurrentNumberOf.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnCurrentNumberOf.setBackground(Color.PINK);
		txtpnCurrentNumberOf.setText("Current Amount\r\n");
		getContentPane().add(txtpnCurrentNumberOf);
		
		CuurenttextField = new JTextField(GroupLimit);
		CuurenttextField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		CuurenttextField.setBounds(272, 268, 86, 20);
		CuurenttextField.setEditable(false);
		CuurenttextField.setBackground(Color.WHITE);
		getContentPane().add(CuurenttextField);
		CuurenttextField.setColumns(10);
		
		txtpnWriteNewNumber = new JTextPane();
		txtpnWriteNewNumber.setBounds(129, 312, 121, 22);
		txtpnWriteNewNumber.setBackground(Color.PINK);
		txtpnWriteNewNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnWriteNewNumber.setText("New amount\r\n");
		getContentPane().add(txtpnWriteNewNumber);
		
		btnOk = new JButton("");			
		btnOk.setBounds(10, 495, 150, 56);
		btnOk.setIcon(new ImageIcon(Login_GUI.class.getResource("/images_icons/okButton.png")));
		btnOk.setOpaque(false);
		btnOk.setContentAreaFilled(false); 
		btnOk.setBorderPainted(false);
		getContentPane().add(btnOk);
		
		btnCancel = new JButton("");
		btnCancel.setBounds(624, 495, 150, 56);
		btnCancel.setIcon(new ImageIcon(Login_GUI.class.getResource("/images_icons/cancelButton.png")));
		btnCancel.setOpaque(false);
		btnCancel.setContentAreaFilled(false); 
		btnCancel.setBorderPainted(false);
		getContentPane().add(btnCancel);
		
		newAmounText = new JTextField();
		newAmounText.setFont(new Font("Tahoma", Font.PLAIN, 16));
		newAmounText.setBounds(272, 314, 86, 20);
		newAmounText.setColumns(10);
		getContentPane().add(newAmounText);
		
		limitLabel = new JLabel();
		limitLabel.setBounds(10, -15, 691, 246);
		limitLabel.setOpaque(false);
		limitLabel .setIcon(new ImageIcon(Login_GUI.class.getResource("/images_icons/Limit-People-In-Group.png")));
		getContentPane().add(limitLabel);
		
		txtpnReason = new JTextPane();
		txtpnReason.setText("Reason\r\n");
		txtpnReason.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnReason.setBackground(Color.PINK);
		txtpnReason.setBounds(129, 365, 121, 22);
		getContentPane().add(txtpnReason);
		
		//String[] array = result.toArray(new String[result.size()]);
		GroupcomboBox = new JComboBox<Object>();
		
		GroupcomboBox.setFont(new Font("Dialog", Font.PLAIN, 16));
		GroupcomboBox.setBounds(399, 312, 121, 22);
		getContentPane().add(GroupcomboBox);
		
		ReasontextField = new JTextField();
		ReasontextField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ReasontextField.setColumns(10);
		ReasontextField.setBounds(272, 365, 86, 20);
		getContentPane().add(ReasontextField);
		
		txtpnChooseGroup = new JTextPane();
		txtpnChooseGroup.setText("Choose Group");
		txtpnChooseGroup.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnChooseGroup.setBackground(Color.PINK);
		txtpnChooseGroup.setBounds(399, 260, 121, 28);
		getContentPane().add(txtpnChooseGroup);
		
		
	}

	public JComboBox getGroupcomboBox() {
		return GroupcomboBox;
	}

	public void setGroupcomboBox(JComboBox groupcomboBox) {
		GroupcomboBox = groupcomboBox;
	}

	public JTextPane getTxtpnChooseGroup() {
		return txtpnChooseGroup;
	}

	public void setTxtpnChooseGroup(JTextPane txtpnChooseGroup) {
		this.txtpnChooseGroup = txtpnChooseGroup;
	}

	public JTextPane getTxtpnReason() {
		return txtpnReason;
	}

	public void setTxtpnReason(JTextPane txtpnReason) {
		this.txtpnReason = txtpnReason;
	}

	public JTextField getCuurenttextField() {
		return CuurenttextField;
	}

	public void setCuurenttextField(JTextField cuurenttextField) {
		CuurenttextField = cuurenttextField;
	}

	public JTextField getNewAmounText() {
		return newAmounText;
	}

	public void setNewAmounText(JTextField newAmounText) {
		this.newAmounText = newAmounText;
	}



	public String getGroupLimit() {
		return GroupLimit;
	}

	public void setGroupLimit(String groupLimit) {
		GroupLimit = groupLimit;
	}

	public JTextField getReasontextField() {
		return ReasontextField;
	}

	public void setReasontextField(JTextField reasontextField) {
		ReasontextField = reasontextField;
	}

	public JTextPane getTxtpnCurrentNumberOf() {
		return txtpnCurrentNumberOf;
	}

	public void setTxtpnCurrentNumberOf(JTextPane txtpnCurrentNumberOf) {
		this.txtpnCurrentNumberOf = txtpnCurrentNumberOf;
	}

	public JTextPane getTxtpnWriteNewNumber() {
		return txtpnWriteNewNumber;
	}

	public void setTxtpnWriteNewNumber(JTextPane txtpnWriteNewNumber) {
		this.txtpnWriteNewNumber = txtpnWriteNewNumber;
	}

	public JButton getBtnOk() {
		return btnOk;
	}

	public void setBtnOk(JButton btnOk) {
		this.btnOk = btnOk;
	}

	public JButton getBtnCancel() {
		return btnCancel;
	}

	public void setBtnCancel(JButton btnCancel) {
		this.btnCancel = btnCancel;
	}

	public JLabel getLimitLabel() {
		return limitLabel;
	}

	public void setLimitLabel(JLabel limitLabel) {
		this.limitLabel = limitLabel;
	}
}