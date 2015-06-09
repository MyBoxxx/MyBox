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


public class AddPeopleToGroup extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddPeopleToGroup frame = new AddPeopleToGroup();
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
	public AddPeopleToGroup() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(59, 89, 151));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnAddPeopleTo = new JTextPane();
		txtpnAddPeopleTo.setForeground(SystemColor.textHighlightText);
		txtpnAddPeopleTo.setBackground(new Color(59, 89, 151));
		txtpnAddPeopleTo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnAddPeopleTo.setText("Add People To Group");		
		txtpnAddPeopleTo.setBounds(134, 0, 160, 20);
		contentPane.add(txtpnAddPeopleTo);
		
		Choice choice = new Choice();
		choice.setBounds(301, 70, 185, 20);
		contentPane.add(choice);
		
		JTextPane txtpnChooseUser = new JTextPane();
		txtpnChooseUser.setForeground(SystemColor.textHighlightText);
		txtpnChooseUser.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnChooseUser.setText("Choose Group");
		txtpnChooseUser.setBackground(new Color(59, 89, 151));
		txtpnChooseUser.setBounds(301, 44, 185, 20);
		contentPane.add(txtpnChooseUser);
		
		JTextPane txtpnChooseUser_1 = new JTextPane();
		txtpnChooseUser_1.setForeground(SystemColor.textHighlightText);
		txtpnChooseUser_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnChooseUser_1.setText("Choose User");
		txtpnChooseUser_1.setBackground(new Color(59, 89, 151));
		txtpnChooseUser_1.setBounds(300, 93, 137, 20);
		contentPane.add(txtpnChooseUser_1);
		
		Choice choice_1 = new Choice();
		choice_1.setBounds(301, 119, 185, 20);
		contentPane.add(choice_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setForeground(SystemColor.textHighlightText);
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textPane.setText("Reason");
		textPane.setBackground(new Color(59, 89, 151));
		textPane.setBounds(301, 142, 67, 20);
		contentPane.add(textPane);
		
		TextField textField = new TextField();
		textField.setBounds(301, 168, 185, 20);
		contentPane.add(textField);
		
		JButton button = new JButton();
		button.setIcon(new ImageIcon("src/GUI_final/OkButton.jpg"));
		button.setBounds(10, 209, 120, 42);
		contentPane.add(button);
		
		JButton button_1 = new JButton();
		button_1.setIcon(new ImageIcon("src/GUI_final/cancelButton.jpg"));
		button_1.setBounds(277, 209, 209, 42);
		contentPane.add(button_1);
		
		JLabel join= new JLabel();
		join.setIcon(new ImageIcon("src/GUI_final/join.jpeg"));
		join.setBounds(10, 27, 260	, 165);
		contentPane.add(join);
	}
}
