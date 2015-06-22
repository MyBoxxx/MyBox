package GUI_final;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Font;

public class DelAndRec extends JFrame {

	private JPanel contentPane;
	private JTextPane txtpnWhenYouDelete;
	private JTextPane txtpnWhatHappensWhen;
	private JTextPane txtpnDoesDropboxKeep;
	private JTextPane txtpnEvenIfYour;

	/**
	 * Launch the application.
	 */
	public void init() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DelAndRec frame = new DelAndRec();
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
	public DelAndRec() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtpnWhenYouDelete = new JTextPane();
		txtpnWhenYouDelete.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnWhenYouDelete.setText("When you delete a file from your myBox it is removed from your visible folder structure (the folders you see in your myBox However, the file is not yet permanently deleted. Rather, it's moved into a queue for permanent deletion (see below for info specific to your account type). This queuing enables features like file recovery and version history.\r\n files are recoverable for 30 days");
		txtpnWhenYouDelete.setBounds(0, 39, 434, 93);
		contentPane.add(txtpnWhenYouDelete);
		
		txtpnWhatHappensWhen = new JTextPane();
		txtpnWhatHappensWhen.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtpnWhatHappensWhen.setText("What happens when I delete a file?");
		txtpnWhatHappensWhen.setBounds(0, 0, 434, 42);
		contentPane.add(txtpnWhatHappensWhen);
		
		txtpnDoesDropboxKeep = new JTextPane();
		txtpnDoesDropboxKeep.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtpnDoesDropboxKeep.setText("Does myBox keep backups of my files?");
		txtpnDoesDropboxKeep.setBounds(0, 132, 448, 42);
		contentPane.add(txtpnDoesDropboxKeep);
		
		txtpnEvenIfYour = new JTextPane();
		txtpnEvenIfYour.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnEvenIfYour.setText("Even if your computer has a meltdown, your stuff is safe in myBox and can be restored in a snap. By default, myBox saves a history of all deleted and earlier versions of files for 30 days for all myBox accounts, All files stored online by Dropbox are encrypted and are kept in secure storage servers across several data centers.");
		txtpnEvenIfYour.setBounds(0, 173, 434, 100);
		contentPane.add(txtpnEvenIfYour);
	}

}
