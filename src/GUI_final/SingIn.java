package GUI_final;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;

import java.awt.Font;

public class SingIn extends JFrame {

	private JPanel contentPane;
	private JTextPane txtpnYouCanChange;
	private JTextPane txtpnHowDoI;
	private JTextPane txtpnEnterYourEmail;
	private JTextPane txtpnForgotYourPassword;

	/**
	 * Launch the application.
	 */
	public void init() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SingIn frame = new SingIn();
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
	public SingIn() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtpnYouCanChange = new JTextPane();
		txtpnYouCanChange.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtpnYouCanChange.setText("You can change your password from the account settings page on the myBox app. You only need to make the change once and when you do, it will automatically apply to any computers ");
		txtpnYouCanChange.setBounds(0, 50, 434, 102);
		contentPane.add(txtpnYouCanChange);
		
		txtpnHowDoI = new JTextPane();
		txtpnHowDoI.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtpnHowDoI.setText("How do I change my password?");
		txtpnHowDoI.setBounds(0, 0, 434, 51);
		contentPane.add(txtpnHowDoI);
		
		txtpnEnterYourEmail = new JTextPane();
		txtpnEnterYourEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtpnEnterYourEmail.setText("Enter your email address at the forgot password page on the myBox website. An email will be sent with a link you can use to reset your password.");
		txtpnEnterYourEmail.setBounds(0, 191, 406, 71);
		contentPane.add(txtpnEnterYourEmail);
		
		txtpnForgotYourPassword = new JTextPane();
		txtpnForgotYourPassword.setText("Forgot your password?");
		txtpnForgotYourPassword.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtpnForgotYourPassword.setBounds(0, 145, 434, 51);
		contentPane.add(txtpnForgotYourPassword);
	}

	public JTextPane getTxtpnYouCanChange() {
		return txtpnYouCanChange;
	}

	public void setTxtpnYouCanChange(JTextPane txtpnYouCanChange) {
		this.txtpnYouCanChange = txtpnYouCanChange;
	}

	public JTextPane getTxtpnHowDoI() {
		return txtpnHowDoI;
	}

	public void setTxtpnHowDoI(JTextPane txtpnHowDoI) {
		this.txtpnHowDoI = txtpnHowDoI;
	}

	public JTextPane getTxtpnEnterYourEmail() {
		return txtpnEnterYourEmail;
	}

	public void setTxtpnEnterYourEmail(JTextPane txtpnEnterYourEmail) {
		this.txtpnEnterYourEmail = txtpnEnterYourEmail;
	}

	public JTextPane getTxtpnForgotYourPassword() {
		return txtpnForgotYourPassword;
	}

	public void setTxtpnForgotYourPassword(JTextPane txtpnForgotYourPassword) {
		this.txtpnForgotYourPassword = txtpnForgotYourPassword;
	}

}
