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


public class Limitpeopleingroup extends JPanel {

	private JPanel contentPane;
	private JTextField CuurenttextField;
	private JTextField newAmounText;
	private Choice choice;
	private JTextPane txtpnCurrentNumberOf;
	private JTextPane txtpnWriteNewNumber;
	private JButton btnOk;
	private JButton btnCancel;
	private JLabel limitLabel;
	
	/**
	 * Launch the application.
	 */
	/*public void initialize() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Limitpeopleingroup frame = new Limitpeopleingroup();
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
	public Limitpeopleingroup() {
		setBackground(SystemColor.textHighlight);
		/*setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 643, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null); */
		//setLayout(null);
		
		
		choice = new Choice();
		choice.setFont(new Font("Dialog", Font.PLAIN, 16));
		choice.setBounds(433, 270, 86, 22);
		choice.add("");
		choice.add("100");
		choice.add("ein");
		choice.add("ma");
		setLayout(null);
		add(choice);
		
		txtpnCurrentNumberOf = new JTextPane();
		txtpnCurrentNumberOf.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnCurrentNumberOf.setBackground(SystemColor.textHighlight);
		txtpnCurrentNumberOf.setText("Current Amount\r\n");
		txtpnCurrentNumberOf.setBounds(141, 272, 121, 28);
		add(txtpnCurrentNumberOf);
		
		CuurenttextField = new JTextField();
		CuurenttextField.setEditable(false);
		CuurenttextField.setBackground(Color.WHITE);
		CuurenttextField.setBounds(272, 272, 86, 20);
		add(CuurenttextField);
		CuurenttextField.setColumns(10);
		
		txtpnWriteNewNumber = new JTextPane();
		txtpnWriteNewNumber.setBackground(SystemColor.textHighlight);
		txtpnWriteNewNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnWriteNewNumber.setText("New amount\r\n");
		txtpnWriteNewNumber.setBounds(142, 311, 96, 22);
		add(txtpnWriteNewNumber);
		
		btnOk = new JButton("");
		btnOk.setIcon(new ImageIcon("src/GUI_final/okButton.jpg"));
		btnOk.setBounds(10, 436, 159, 53);
		add(btnOk);
		
		btnCancel = new JButton("");
		btnCancel.setIcon(new ImageIcon("src/GUI_final/cancelButton.jpg"));
		btnCancel.setBounds(433, 436, 273, 53);
		add(btnCancel);
		
		newAmounText = new JTextField();
		newAmounText.setColumns(10);
		newAmounText.setBounds(272, 311, 86, 20);
		add(newAmounText);
		
		JLabel chooseLabel = new JLabel();
		chooseLabel .setIcon(new ImageIcon("src/GUI_final/thechoosegroup.png"));
		chooseLabel.setBounds(414, 162, 137, 86);
		add(chooseLabel);
		
		limitLabel = new JLabel();
		limitLabel .setIcon(new ImageIcon("src/GUI_final/limit.png"));
		limitLabel.setBounds(165, 29, 411, 130);
		add(limitLabel);
		
		
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

	public Choice getChoice() {
		return choice;
	}

	public void setChoice(Choice choice) {
		this.choice = choice;
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