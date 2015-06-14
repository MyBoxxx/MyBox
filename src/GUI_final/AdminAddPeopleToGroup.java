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


public class AdminAddPeopleToGroup extends JPanel {

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
	private JLabel joinLabel;
	private JLabel askLabel;
	

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminAddPeopleToGroup frame = new AdminAddPeopleToGroup();
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
	public AdminAddPeopleToGroup() {
		setBackground(SystemColor.textHighlight);
		/*setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(59, 89, 151));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);*/
		setLayout(null);
		
		choiceGroup = new Choice();
		choiceGroup.setBounds(429, 97, 185, 20);
		choiceGroup.add("");
		choiceGroup.add("100");
		choiceGroup.add("ein ma");
		choiceGroup.add("peter");
		add(choiceGroup);
		
		txtpnChooseGroup = new JTextPane();
		txtpnChooseGroup.setForeground(SystemColor.textHighlightText);
		txtpnChooseGroup.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnChooseGroup.setText("Choose Group");
		txtpnChooseGroup.setBackground(new Color(59, 89, 151));
		txtpnChooseGroup.setBounds(211, 97, 185, 20);
		add(txtpnChooseGroup);
		
		txtpnChooseUser_1 = new JTextPane();
		txtpnChooseUser_1.setForeground(SystemColor.textHighlightText);
		txtpnChooseUser_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnChooseUser_1.setText("Choose User");
		txtpnChooseUser_1.setBackground(new Color(59, 89, 151));
		txtpnChooseUser_1.setBounds(211, 128, 185, 20);
		add(txtpnChooseUser_1);
		
		choose_user = new Choice();
		choose_user.add("");
		choose_user.add("100");
		choose_user.add("ein ma");
		choose_user.add("peter");
		choose_user.setBounds(429, 128, 185, 20);
		add(choose_user);
		
		textPane = new JTextPane();
		textPane.setForeground(SystemColor.textHighlightText);
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textPane.setText("Reason");
		textPane.setBackground(new Color(59, 89, 151));
		textPane.setBounds(211, 161, 185, 20);
		add(textPane);
		
		textField = new TextField();
		textField.setBounds(429, 161, 185, 20);
		add(textField);
		
		joinLabel = new JLabel("");
		joinLabel.setIcon(new ImageIcon("src/GUI_final/join.jpeg"));
		joinLabel.setBounds(136, 205, 260, 165);
		add(joinLabel);
		
		OkButton = new JButton();	
		OkButton.setIcon(new ImageIcon("src/GUI_final/add.png"));
		setBounds(20, 188, 800, 600);
		
		JButton okbutton = new JButton("");
		okbutton.setIcon(new ImageIcon("src/GUI_final/okButton.jpg"));
		okbutton.setBounds(28, 450, 159, 53);
		add(okbutton);
		
		JButton cancelbutton = new JButton("");
		cancelbutton.setIcon(new ImageIcon("src/GUI_final/cancelButton.jpg"));
		cancelbutton.setBounds(457, 450, 236, 53);
		add(cancelbutton);
		
		askLabel = new JLabel("");
		askLabel.setIcon(new ImageIcon("src/GUI_final/addPeople.png"));
		askLabel.setBounds(10, 11, 720, 33);
		add(askLabel);
	}
}