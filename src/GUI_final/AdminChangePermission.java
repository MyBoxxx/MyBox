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

import javax.swing.JTextField;
import javax.swing.JTextPane;

import java.awt.Color;
import java.awt.TextField;

import javax.swing.JButton;

public class AdminChangePermission extends AbstractGUI {

	private JPanel contentPane;
	private JTextField UsertextField;
	private JTextField GrouptextField;
	private JTextField OldtextField;
	private JTextField NewtextField;
	private JLabel lblNewLabel;
	private JTextPane UsertextPane;
	private JTextPane GrouptextPane;
	private JTextPane txtpnOldPermission;
	private JTextPane txtpnNewPermission;
	private JTextField ReasontextField;		
	private JButton okButton ;
	private JTextPane txtpnReason;
	private JButton cancelButton;
	private String grp = new String();
	private String usr = new String();
	private String oldp = new String();
	private String newp = new String();

	/**
	 * Launch the application.
	 */
	public void init(final String grp, final String usr,final String oldp,final String newp) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminChangePermission frame = new AdminChangePermission(grp ,usr,oldp,newp);
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
	public AdminChangePermission(String grp, String usr,String oldp,String newp) {
		this.usr = usr;
		this.grp = grp;
		this.oldp = oldp;
		this.newp = newp;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(59, 89, 151));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("images/Change-Permission.png"));
		lblNewLabel.setForeground(SystemColor.window);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel.setBounds(25, 11, 699, 74);
		contentPane.add(lblNewLabel);
		
		UsertextField = new JTextField(usr);
		UsertextField.setEditable(false);
		UsertextField.setColumns(10);
		UsertextField.setBounds(447, 157, 198, 19);
		contentPane.add(UsertextField);
		
		GrouptextField = new JTextField(grp);
		GrouptextField.setEditable(false);
		GrouptextField.setColumns(10);
		GrouptextField.setBounds(448, 210, 198, 19);
		contentPane.add(GrouptextField);
		
		UsertextPane = new JTextPane();
		UsertextPane.setText("User");
		UsertextPane.setFont(new Font("Tahoma", Font.PLAIN, 16));
		UsertextPane.setBackground(Color.ORANGE);
		UsertextPane.setBounds(346, 155, 73, 20);
		contentPane.add(UsertextPane);
		
		GrouptextPane = new JTextPane();
		GrouptextPane.setText("Group\r\n");
		GrouptextPane.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GrouptextPane.setBackground(Color.ORANGE);
		GrouptextPane.setBounds(345, 209, 73, 20);
		contentPane.add(GrouptextPane);
		
		txtpnOldPermission = new JTextPane();
		txtpnOldPermission.setText("Old permission");
		txtpnOldPermission.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnOldPermission.setBackground(Color.ORANGE);
		txtpnOldPermission.setBounds(25, 259, 145, 20);
		contentPane.add(txtpnOldPermission);
		
		OldtextField = new JTextField(oldp);
		OldtextField.setEditable(false);
		OldtextField.setColumns(10);
		OldtextField.setBounds(201, 261, 101, 19);
		contentPane.add(OldtextField);
		
		NewtextField = new JTextField(newp);
		NewtextField.setEditable(false);
		NewtextField.setColumns(10);
		NewtextField.setBounds(518, 258, 101, 19);
		contentPane.add(NewtextField);
		
		txtpnNewPermission = new JTextPane();
		txtpnNewPermission.setText("New permission");
		txtpnNewPermission.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnNewPermission.setBackground(Color.ORANGE);
		txtpnNewPermission.setBounds(345, 258, 145, 20);
		contentPane.add(txtpnNewPermission);
		
		ReasontextField = new JTextField();
		ReasontextField.setBounds(447, 303, 198, 20);
		contentPane.add(ReasontextField);
		
		txtpnReason = new JTextPane();
		txtpnReason.setText("Reason");
		txtpnReason.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnReason.setBackground(Color.ORANGE);
		txtpnReason.setBounds(345, 303, 73, 20);
		contentPane.add(txtpnReason);
		
		okButton = new JButton();
		okButton.setIcon(new ImageIcon("images/approved.png"));
		okButton.setOpaque(false);
		okButton.setContentAreaFilled(false); 
		okButton.setBorderPainted(false);
		okButton.setBounds(22, 426, 150, 54);
		contentPane.add(okButton);
		
		cancelButton = new JButton();
		cancelButton.setIcon(new ImageIcon("images/reject.png"));
		cancelButton.setOpaque(false);
		cancelButton.setContentAreaFilled(false); 
		cancelButton.setBorderPainted(false);
		cancelButton.setBounds(450, 415, 150, 54);
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

	public JTextField getOldtextField() {
		return OldtextField;
	}

	public void setOldtextField(JTextField oldtextField) {
		OldtextField = oldtextField;
	}

	public JTextField getNewtextField() {
		return NewtextField;
	}

	public void setNewtextField(JTextField newtextField) {
		NewtextField = newtextField;
	}

	public JLabel getLblNewLabel() {
		return lblNewLabel;
	}

	public void setLblNewLabel(JLabel lblNewLabel) {
		this.lblNewLabel = lblNewLabel;
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

	public JTextPane getTxtpnOldPermission() {
		return txtpnOldPermission;
	}

	public void setTxtpnOldPermission(JTextPane txtpnOldPermission) {
		this.txtpnOldPermission = txtpnOldPermission;
	}

	public JTextPane getTxtpnNewPermission() {
		return txtpnNewPermission;
	}

	public void setTxtpnNewPermission(JTextPane txtpnNewPermission) {
		this.txtpnNewPermission = txtpnNewPermission;
	}

	public JTextField getReasontextField() {
		return ReasontextField;
	}

	public void setReasontextField(JTextField reasontextField) {
		ReasontextField = reasontextField;
	}

	public JButton getOkButton() {
		return okButton;
	}

	public void setOkButton(JButton okButton) {
		this.okButton = okButton;
	}

	public JTextPane getTxtpnReason() {
		return txtpnReason;
	}

	public void setTxtpnReason(JTextPane txtpnReason) {
		this.txtpnReason = txtpnReason;
	}

	public JButton getCancelButton() {
		return cancelButton;
	}

	public void setCancelButton(JButton cancelButton) {
		this.cancelButton = cancelButton;
	}

}
