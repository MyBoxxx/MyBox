package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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


public class Limitpeopleingroup extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
	}

	/**
	 * Create the frame.
	 */
	public Limitpeopleingroup() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnLimitPeopleIn = new JTextPane();
		txtpnLimitPeopleIn.setText("Limit People In The Group");
		txtpnLimitPeopleIn.setBounds(110, 11, 174, 20);
		contentPane.add(txtpnLimitPeopleIn);
		
		JTextPane txtpnChooseGroup = new JTextPane();
		txtpnChooseGroup.setText("Choose Group");
		txtpnChooseGroup.setBounds(66, 42, 81, 20);
		contentPane.add(txtpnChooseGroup);
		
		Choice choice = new Choice();
		choice.setBounds(10, 70, 185, 26);
		contentPane.add(choice);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(82, 132, 41, 28);
		contentPane.add(textArea);
		
		JTextPane txtpnCurrentNumberOf = new JTextPane();
		txtpnCurrentNumberOf.setText("Current Number of People In Group");
		txtpnCurrentNumberOf.setBounds(10, 107, 201, 20);
		contentPane.add(txtpnCurrentNumberOf);
		
		textField = new JTextField();
		textField.setBounds(272, 131, 75, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextPane txtpnWriteNewNumber = new JTextPane();
		txtpnWriteNewNumber.setText("Write New Number Of People");
		txtpnWriteNewNumber.setBounds(235, 107, 151, 20);
		contentPane.add(txtpnWriteNewNumber);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(32, 209, 113, 41);
		contentPane.add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(298, 209, 113, 41);
		contentPane.add(btnCancel);
	}
}
