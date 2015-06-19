package GUI_final;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
<<<<<<< HEAD

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
=======
import javax.swing.ImageIcon;
import java.awt.Font;

public class GroupActions extends AbstractGUI {

	private JFrame frame;
	private JLabel lblGroupActions;
	private JButton creategroup;
	private JButton ask;
	private JButton edit;
	private JButton requestchang;
	private JButton requ2;
	private JButton back;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.


	/**
	 * Create the application.
	 */
//	public GroupActions() {
	//	initialize();
	//}

	/**
	 * Initialize the contents of the frame.
	 */
	public GroupActions(){
		getContentPane().setBackground(new Color(59, 89, 151));
		frame = new JFrame();
		getContentPane().setForeground(Color.WHITE);
		setBounds(100, 100, 800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		lblGroupActions = new JLabel("");
		lblGroupActions.setIcon(new ImageIcon(GroupActions.class.getResource("/GUI_final/Group-Action.png")));
		lblGroupActions.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblGroupActions.setBounds(104, 40, 679, 83);
		getContentPane().add(lblGroupActions);
		
		creategroup = new JButton("create ");
		creategroup.setBounds(104, 184, 200, 29);
		getContentPane().add(creategroup);
		
		ask = new JButton("Ask To Join Remove");
		ask.setBounds(94, 276, 210, 29);
		getContentPane().add(ask);
		
		edit = new JButton("Edit group");
		edit.setBounds(545, 184, 183, 29);
		getContentPane().add(edit);
		
		requestchang = new JButton("Change Permission");
		requestchang.setBounds(545, 276, 183, 29);
		getContentPane().add(requestchang);
		
		requ2 = new JButton("Request To Delete Group");
		requ2.setBounds(104, 406, 200, 29);
		getContentPane().add(requ2);
		
		back = new JButton("back");
		back.setBounds(382, 474, 117, 29);
		getContentPane().add(back);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(GroupActions.class.getResource("/GUI_final/EditGroupPic.png")));
		lblNewLabel.setBounds(187, -20, 822, 592);
		getContentPane().add(lblNewLabel);
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

	public JButton getRequ2() {
		return requ2;
	}

	public void setRequ2(JButton requ2) {
		this.requ2 = requ2;
	}

	public JButton getBack() {
		return back;
	}

	public void setBack(JButton back) {
		this.back = back;
>>>>>>> refs/heads/master
	}
}
