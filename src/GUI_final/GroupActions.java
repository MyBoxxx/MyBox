package GUI_final;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;

public class GroupActions {

	private JFrame frame;
	private JButton creategroup;
	private JButton ask;
	private JButton edit;
	private JButton requestchang;
	private JButton back;
	private JButton requ2;
	
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
		
		creategroup = new JButton("create ");
		creategroup.setBounds(94, 83, 117, 29);
		frame.getContentPane().add(creategroup);
		
		ask = new JButton("askto");
		ask.setBounds(94, 156, 117, 29);
		frame.getContentPane().add(ask);
		
		 edit = new JButton("editgroup");
		edit.setBounds(412, 83, 117, 29);
		frame.getContentPane().add(edit);
		
		 requestchang = new JButton("requesttochange");
		requestchang.setBounds(412, 156, 117, 29);
		frame.getContentPane().add(requestchang);
		
		 requ2 = new JButton("requesttodelete");
		requ2.setBounds(94, 207, 117, 29);
		frame.getContentPane().add(requ2);
		
		 back = new JButton("back");
		back.setBounds(130, 290, 117, 29);
		frame.getContentPane().add(back);
	}

	public JButton getCreategroup() {
		return creategroup;
	}

	public void setCreategroup(JButton creategroup) {
		this.creategroup = creategroup;
	}

	public JButton getAsk() {
		return ask;
	}

	public void setAsk(JButton ask) {
		this.ask = ask;
	}

	public JButton getEdit() {
		return edit;
	}

	public void setEdit(JButton edit) {
		this.edit = edit;
	}

	public JButton getRequestchang() {
		return requestchang;
	}

	public void setRequestchang(JButton requestchang) {
		this.requestchang = requestchang;
	}

	public JButton getBack() {
		return back;
	}

	public void setBack(JButton back) {
		this.back = back;
	}

	public JButton getRequ2() {
		return requ2;
	}

	public void setRequ2(JButton requ2) {
		this.requ2 = requ2;
	}
}
