package GUI_final;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.TextArea;

import javax.swing.JTextPane;

import java.awt.Font;

public class Share extends JFrame {

	private JPanel contentPane;
	private JTextPane txtpnDropboxOffersEasy;
	private JTextPane txtpnHowDoI;

	/**
	 * Launch the application.
	 */
	public void init() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Share frame = new Share();
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
	public Share() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtpnDropboxOffersEasy = new JTextPane();
		txtpnDropboxOffersEasy.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnDropboxOffersEasy.setText("myBox offers easy ways to share files or folders. Shared folders are ideal for groups of\r\n \r\npeople who would like to collaborate on the same files together. When you create a shared folder and add other people to it, its files will appear in their myBox just as they do in yours. Any member of the folder can add, delete, or edit files within that folder.\r\n\r\nSee below for step-by-step instructions on how to share folders from the Mybox app\r\n\r\nAll you need to do is send a request to our admin and he will carefully go over the request ");
		txtpnDropboxOffersEasy.setBounds(0, 39, 424, 262);
		contentPane.add(txtpnDropboxOffersEasy);
		
		txtpnHowDoI = new JTextPane();
		txtpnHowDoI.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnHowDoI.setText("How do I share folders with other people?\r\n\r\n");
		txtpnHowDoI.setBounds(0, 0, 424, 38);
		contentPane.add(txtpnHowDoI);
	}

	public JTextPane getTxtpnDropboxOffersEasy() {
		return txtpnDropboxOffersEasy;
	}

	public void setTxtpnDropboxOffersEasy(JTextPane txtpnDropboxOffersEasy) {
		this.txtpnDropboxOffersEasy = txtpnDropboxOffersEasy;
	}

	public JTextPane getTxtpnHowDoI() {
		return txtpnHowDoI;
	}

	public void setTxtpnHowDoI(JTextPane txtpnHowDoI) {
		this.txtpnHowDoI = txtpnHowDoI;
	}
	
}
