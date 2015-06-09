package GUI_final;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Choice;
import java.awt.TextField;
import java.awt.Button;


public class BanUser extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BanUser frame = new BanUser();
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
	public BanUser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnBanUser = new JTextPane();
		txtpnBanUser.setText("Ban User");
		txtpnBanUser.setBounds(185, 0, 49, 20);
		contentPane.add(txtpnBanUser);
		
		Choice choice = new Choice();
		choice.setBounds(118, 69, 185, 20);
		contentPane.add(choice);
		
		JTextPane txtpnChooseGroup = new JTextPane();
		txtpnChooseGroup.setText("Choose Group");
		txtpnChooseGroup.setBounds(170, 43, 82, 20);
		contentPane.add(txtpnChooseGroup);
		
		Choice choice_1 = new Choice();
		choice_1.setBounds(118, 121, 185, 20);
		contentPane.add(choice_1);
		
		JTextPane txtpnChooseUser = new JTextPane();
		txtpnChooseUser.setText("Choose User");
		txtpnChooseUser.setBounds(170, 95, 82, 20);
		contentPane.add(txtpnChooseUser);
		
		JTextPane txtpnReason = new JTextPane();
		txtpnReason.setText("Reason");
		txtpnReason.setBounds(71, 177, 42, 20);
		contentPane.add(txtpnReason);
		
		TextField textField = new TextField();
		textField.setBounds(139, 177, 144, 20);
		contentPane.add(textField);
		
		Button button = new Button("Ok");
		button.setBounds(23, 222, 106, 29);
		contentPane.add(button);
		
		Button button_1 = new Button("Cancel");
		button_1.setBounds(307, 222, 106, 29);
		contentPane.add(button_1);
	}
}
