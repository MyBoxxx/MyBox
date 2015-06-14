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
	private JTextField textField;
	private JTextField textField_1;
	Choice choice = new Choice();
	
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
		setBackground(Color.WHITE);
		/*setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 643, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null); */
		setLayout(null);
		choice.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		
		choice.setBounds(272, 398, 111, 17);
		choice.add("");
		choice.add("100");
		choice.add("ein");
		choice.add("ma");
		add(choice);
		
		JTextPane txtpnCurrentNumberOf = new JTextPane();
		txtpnCurrentNumberOf.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnCurrentNumberOf.setBackground(SystemColor.textHighlight);
		txtpnCurrentNumberOf.setText("Current Amount\r\n");
		txtpnCurrentNumberOf.setBounds(272, 191, 121, 34);
		add(txtpnCurrentNumberOf);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setEditable(false);
		textField.setBounds(423, 203, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JTextPane txtpnWriteNewNumber = new JTextPane();
		txtpnWriteNewNumber.setBackground(SystemColor.textHighlight);
		txtpnWriteNewNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnWriteNewNumber.setText("New amount\r\n");
		txtpnWriteNewNumber.setBounds(272, 229, 99, 34);
		add(txtpnWriteNewNumber);
		
		JButton btnOk = new JButton("");
		btnOk.setIcon(new ImageIcon("src/GUI_final/okButton.jpg"));
		btnOk.setBounds(0, 465, 159, 53);
		add(btnOk);
		
		JButton btnCancel = new JButton("");
		btnCancel.setIcon(new ImageIcon("src/GUI_final/cancelButton.jpg"));
		btnCancel.setBounds(448, 465, 236, 53);
		add(btnCancel);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(423, 243, 86, 20);
		add(textField_1);
		
		JLabel chooseGrouplabel = new JLabel("");
		chooseGrouplabel .setIcon(new ImageIcon("src/GUI_final/thechoosegroup.png"));
		chooseGrouplabel.setBounds(275, 288, 137, 86);
		add(chooseGrouplabel);
		
		JLabel Limit = new JLabel("");
		Limit  .setIcon(new ImageIcon("src/GUI_final/limit.png"));
		Limit.setBounds(128, 11, 411, 130);
		add(Limit);
		
		
	}
}
