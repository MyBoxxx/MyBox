package GUI_final;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Font;

public class Storage extends JFrame {

	private JPanel contentPane;
	private JTextPane txtpnTheMyboxApp;
	private JTextPane txtpnHowMuchCan;
	/**
	 * Launch the application.
	 */
	public void init() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Storage frame = new Storage();
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
	public Storage() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtpnTheMyboxApp = new JTextPane();
		txtpnTheMyboxApp.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtpnTheMyboxApp.setText("The myBox app can save as many files,  can hold or your myBox storage limit allows. If you find yourself running out of space on your device, removing files from your Favorites list will clear space on your computer. If you run out of myBox space, you can move or delete some of your old, outdated files or you might want to consider upgrading to a bigger myBox.");
		txtpnTheMyboxApp.setBounds(0, 49, 434, 213);
		contentPane.add(txtpnTheMyboxApp);
		
		txtpnHowMuchCan = new JTextPane();
		txtpnHowMuchCan.setFont(new Font("Tahoma", Font.PLAIN, 27));
		txtpnHowMuchCan.setText("How much can I store?");
		txtpnHowMuchCan.setBounds(0, 0, 434, 52);
		contentPane.add(txtpnHowMuchCan);
	}

	public JTextPane getTxtpnTheMyboxApp() {
		return txtpnTheMyboxApp;
	}

	public void setTxtpnTheMyboxApp(JTextPane txtpnTheMyboxApp) {
		this.txtpnTheMyboxApp = txtpnTheMyboxApp;
	}

	public JTextPane getTxtpnHowMuchCan() {
		return txtpnHowMuchCan;
	}

	public void setTxtpnHowMuchCan(JTextPane txtpnHowMuchCan) {
		this.txtpnHowMuchCan = txtpnHowMuchCan;
	}

}
