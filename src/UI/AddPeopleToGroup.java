package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Choice;
import java.awt.TextField;
import java.awt.Button;


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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnAddPeopleTo = new JTextPane();
		txtpnAddPeopleTo.setText("Add People To Group");
		txtpnAddPeopleTo.setBounds(153, 11, 112, 20);
		contentPane.add(txtpnAddPeopleTo);
		
		Choice choice = new Choice();
		choice.setBounds(114, 67, 185, 20);
		contentPane.add(choice);
		
		JTextPane txtpnChooseUser = new JTextPane();
		txtpnChooseUser.setText("Choose Group");
		txtpnChooseUser.setBounds(173, 41, 74, 20);
		contentPane.add(txtpnChooseUser);
		
		JTextPane txtpnChooseUser_1 = new JTextPane();
		txtpnChooseUser_1.setText("Choose User");
		txtpnChooseUser_1.setBounds(173, 93, 74, 20);
		contentPane.add(txtpnChooseUser_1);
		
		Choice choice_1 = new Choice();
		choice_1.setBounds(114, 119, 185, 20);
		contentPane.add(choice_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("Reason");
		textPane.setBounds(64, 172, 42, 20);
		contentPane.add(textPane);
		
		TextField textField = new TextField();
		textField.setBounds(134, 172, 144, 20);
		contentPane.add(textField);
		
		Button button = new Button("Ok");
		button.setBounds(10, 222, 106, 29);
		contentPane.add(button);
		
		Button button_1 = new Button("Cancel");
		button_1.setBounds(318, 222, 106, 29);
		contentPane.add(button_1);
	}

}
