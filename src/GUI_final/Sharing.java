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

public class Sharing extends JFrame {

	private JPanel contentPane;
	private JTextPane txtpnFilesOrFolders;
	private JTextPane txtpnHowDoI ;
	

	/**
	 * Launch the application.
	 */
	public void init() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sharing frame = new Sharing();
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
	public Sharing() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtpnFilesOrFolders = new JTextPane();
		txtpnFilesOrFolders.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnFilesOrFolders.setText("Files or folders in your myBox folder can be shared, instantly. All you have to do is select the file and then select Share link from the myBox menu. Once you do,  People who whom you will share with, will get a preview of the file or folder on the myBox website. They'll also have the option to download a copy of the file. If the person you share the link with already has the file or folder saved in their myBox they will be taken directly to that file or folder's location");
		txtpnFilesOrFolders.setEditable(false);
		txtpnFilesOrFolders.setBounds(0, 65, 434, 197);
		contentPane.add(txtpnFilesOrFolders);
		
		txtpnHowDoI = new JTextPane();
		txtpnHowDoI.setFont(new Font("Tahoma", Font.PLAIN, 27));
		txtpnHowDoI.setText("How do I share  a file or folder?");
		txtpnHowDoI.setBounds(0, 0, 434, 66);
		contentPane.add(txtpnHowDoI);
	}

	public JTextPane getTxtpnFilesOrFolders() {
		return txtpnFilesOrFolders;
	}

	public void setTxtpnFilesOrFolders(JTextPane txtpnFilesOrFolders) {
		this.txtpnFilesOrFolders = txtpnFilesOrFolders;
	}

	public JTextPane getTxtpnHowDoI() {
		return txtpnHowDoI;
	}

	public void setTxtpnHowDoI(JTextPane txtpnHowDoI) {
		this.txtpnHowDoI = txtpnHowDoI;
	}

}
