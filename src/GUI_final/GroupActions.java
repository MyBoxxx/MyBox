package GUI_final;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;

public class GroupActions {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GroupActions window = new GroupActions();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GroupActions() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("GroupActions");
		label.setBounds(331, 25, 164, 16);
		frame.getContentPane().add(label);
		
		JButton creategroup = new JButton("create ");
		creategroup.setBounds(94, 83, 117, 29);
		frame.getContentPane().add(creategroup);
		
		JButton ask = new JButton("askto");
		ask.setBounds(94, 156, 117, 29);
		frame.getContentPane().add(ask);
		
		JButton edit = new JButton("editgroup");
		edit.setBounds(412, 83, 117, 29);
		frame.getContentPane().add(edit);
		
		JButton requestchang = new JButton("requesttochange");
		requestchang.setBounds(412, 156, 117, 29);
		frame.getContentPane().add(requestchang);
		
		JButton requ2 = new JButton("requesttodelete");
		requ2.setBounds(94, 207, 117, 29);
		frame.getContentPane().add(requ2);
		
		JButton back = new JButton("back");
		back.setBounds(130, 290, 117, 29);
		frame.getContentPane().add(back);
	}
}
