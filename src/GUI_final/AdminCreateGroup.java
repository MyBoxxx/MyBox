package GUI_final;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.SystemColor;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextPane;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JButton;

public class AdminCreateGroup extends AbstractGUI {

	private JPanel contentPane;
	private JTextField UsertextField;
	private JTextField GrouptextField;
	private JTextField ReasontextField;
	private JLabel CreateLabel;
	private JTextPane UsertextPane;
	private JTextPane GrouptextPane;
	private JTextPane ReasontextPane;
	private JButton okButton;
	private JButton cancelButton;
	private String grp = new String();
	private String usr = new String();

	/**
	 * Launch the application.
	 */
	public void init(final String grp, final String usr) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminCreateGroup frame = new AdminCreateGroup(grp ,usr);
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
	public AdminCreateGroup(String grp, String usr) {
		this.grp = grp;
		this.usr = usr;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(59, 89, 151));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		CreateLabel = new JLabel("");
		CreateLabel.setIcon(new ImageIcon(Login_GUI.class.getResource("/images_icons/Create-group.png")));
		CreateLabel.setForeground(SystemColor.window);
		CreateLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		CreateLabel.setBounds(24, 24, 695, 94);
		contentPane.add(CreateLabel);
		
		UsertextPane = new JTextPane();
		UsertextPane.setText("User");
		UsertextPane.setFont(new Font("Tahoma", Font.PLAIN, 16));
		UsertextPane.setBackground(Color.PINK);
		UsertextPane.setBounds(269, 138, 73, 20);
		contentPane.add(UsertextPane);
		
		UsertextField = new JTextField(usr);
		UsertextField.setEditable(false);
		UsertextField.setColumns(10);
		UsertextField.setBounds(368, 139, 198, 19);
		contentPane.add(UsertextField);
		
		GrouptextPane = new JTextPane();
		GrouptextPane.setText("Group\r\n");
		GrouptextPane.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GrouptextPane.setBackground(Color.PINK);
		GrouptextPane.setBounds(269, 191, 73, 20);
		contentPane.add(GrouptextPane);
		
		GrouptextField = new JTextField(grp);
		GrouptextField.setEditable(false);
		GrouptextField.setColumns(10);
		GrouptextField.setBounds(368, 191, 198, 19);
		contentPane.add(GrouptextField);
		
		ReasontextPane = new JTextPane();
		ReasontextPane.setText("Reason");
		ReasontextPane.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ReasontextPane.setBackground(Color.PINK);
		ReasontextPane.setBounds(269, 246, 73, 20);
		contentPane.add(ReasontextPane);
		
		ReasontextField = new JTextField();
		ReasontextField.setBounds(368, 246, 198, 20);
		contentPane.add(ReasontextField);
		
		okButton = new JButton();
		okButton.setIcon(new ImageIcon(Login_GUI.class.getResource("/images_icons/approved.png")));
		okButton.setOpaque(false);
		okButton.setContentAreaFilled(false); 
		okButton.setBorderPainted(false);
		okButton.setBounds(10, 453, 150, 54);
		contentPane.add(okButton);
		
		cancelButton = new JButton();
		cancelButton.setIcon(new ImageIcon(Login_GUI.class.getResource("/images_icons/reject.png")));
		cancelButton.setOpaque(false);
		cancelButton.setContentAreaFilled(false); 
		cancelButton.setBorderPainted(false);
		cancelButton.setBounds(492, 442, 150, 54);
		contentPane.add(cancelButton);
	}

	public JTextField getUsertextField() {
		return UsertextField;
	}

	public void setUsertextField(JTextField usertextField) {
		UsertextField = usertextField;
	}

	public JTextField getGrouptextField() {
		return GrouptextField;
	}

	public void setGrouptextField(JTextField grouptextField) {
		GrouptextField = grouptextField;
	}

	public JTextField getReasontextField() {
		return ReasontextField;
	}

	public void setReasontextField(JTextField reasontextField) {
		ReasontextField = reasontextField;
	}

	public JLabel getCreateLabel() {
		return CreateLabel;
	}

	public void setCreateLabel(JLabel createLabel) {
		CreateLabel = createLabel;
	}

	public JTextPane getUsertextPane() {
		return UsertextPane;
	}

	public void setUsertextPane(JTextPane usertextPane) {
		UsertextPane = usertextPane;
	}

	public JTextPane getGrouptextPane() {
		return GrouptextPane;
	}

	public void setGrouptextPane(JTextPane grouptextPane) {
		GrouptextPane = grouptextPane;
	}

	public JTextPane getReasontextPane() {
		return ReasontextPane;
	}

	public void setReasontextPane(JTextPane reasontextPane) {
		ReasontextPane = reasontextPane;
	}

	public JButton getOkButton() {
		return okButton;
	}

	public void setOkButton(JButton okButton) {
		this.okButton = okButton;
	}

	public JButton getCancelButton() {
		return cancelButton;
	}

	public void setCancelButton(JButton cancelButton) {
		this.cancelButton = cancelButton;
	}
	
	

}
