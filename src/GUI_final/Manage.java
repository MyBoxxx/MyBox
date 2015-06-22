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

public class Manage extends JFrame {

	private JPanel contentPane;
	private JTextPane txtpnAtDropboxThe;
	private JTextPane txtpnHowSecureIs;

	/**
	 * Launch the application.
	 */
	public void init() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manage frame = new Manage();
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
	public Manage() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtpnAtDropboxThe = new JTextPane();
		txtpnAtDropboxThe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnAtDropboxThe.setText("At Dropbox, the security of your data is our highest priority. We have a dedicated security team using the best tools and engineering practices available to build and maintain Dropbox, and you can rest assured that we've implemented multiple levels of security to protect and back up your files.\r\nOther Dropbox users can't see your files in Dropbox unless you deliberately share links to files or share folders. Dropbox employees are prohibited from viewing the content of files you store in your account. Employees may access file metadata (e.g., file names and locations) when they have a legitimate reason, like providing technical support");
		txtpnAtDropboxThe.setBounds(0, 42, 434, 220);
		contentPane.add(txtpnAtDropboxThe);
		
		txtpnHowSecureIs = new JTextPane();
		txtpnHowSecureIs.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtpnHowSecureIs.setText("How secure is Dropbox?");
		txtpnHowSecureIs.setBounds(0, 0, 434, 44);
		contentPane.add(txtpnHowSecureIs);
	}

	public JTextPane getTxtpnAtDropboxThe() {
		return txtpnAtDropboxThe;
	}

	public void setTxtpnAtDropboxThe(JTextPane txtpnAtDropboxThe) {
		this.txtpnAtDropboxThe = txtpnAtDropboxThe;
	}

	public JTextPane getTxtpnHowSecureIs() {
		return txtpnHowSecureIs;
	}

	public void setTxtpnHowSecureIs(JTextPane txtpnHowSecureIs) {
		this.txtpnHowSecureIs = txtpnHowSecureIs;
	}

}
