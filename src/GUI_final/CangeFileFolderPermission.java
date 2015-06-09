package GUI_final;
import java.awt.EventQueue;

import javax.naming.ldap.Rdn;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.JTree;
import javax.swing.AbstractAction;

import java.awt.event.ActionEvent;

import javax.swing.Action;
import javax.swing.JButton;

import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;


public class CangeFileFolderPermission {

	private JFrame frmMyBox;
	private final Action action = new SwingAction();
	private JButton buttonSend;
	private JButton buttonCancel;
	private JLabel lblChageFilefolderPermission;
    private JRadioButton Private;
    private JRadioButton All;
    private JRadioButton Group;
    private JList list;
    private JRadioButton readAll;
    private JRadioButton writeGroup;
    private JComboBox comboBox;
    private JRadioButton ReadGroup ;
    private JRadioButton writeAll;
    private JLabel ChooseType ;
    private JLabel ReadWrite ;
    private JLabel Permission ;
	//private JRadioButton  rb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CangeFileFolderPermission window = new CangeFileFolderPermission();
					window.frmMyBox.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CangeFileFolderPermission() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMyBox = new JFrame();
		frmMyBox.getContentPane().setBackground(Color.WHITE);
		frmMyBox.setTitle("My Box");
		frmMyBox.setBounds(100, 100, 602, 465);
		frmMyBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMyBox.getContentPane().setLayout(null);
		
		
		buttonSend = new JButton();
		buttonSend.setBounds(389, 375, 187, 41);
		frmMyBox.getContentPane().add(buttonSend);
		buttonSend.setIcon(new ImageIcon("src/GUI_final/sendReuqest.PNG"));
		
		
		buttonCancel = new JButton();
		buttonCancel.setBounds(10, 375, 198, 41);
		frmMyBox.getContentPane().add(buttonCancel);
		buttonCancel.setIcon(new ImageIcon("src/GUI_final/cancelButton.jpg"));
		
	    lblChageFilefolderPermission = new JLabel();
		lblChageFilefolderPermission.setIcon(new ImageIcon("src/GUI_final/changePermission.png"));
		lblChageFilefolderPermission.setBounds(176, 0, 229, 128);
		frmMyBox.getContentPane().add(lblChageFilefolderPermission);
		
		Private = new JRadioButton("Private");
		Private.setBackground(Color.WHITE);
		Private.setBounds(0, 126, 84, 23);
		frmMyBox.getContentPane().add(Private);
		
		All = new JRadioButton("All");
		All.setBackground(Color.WHITE);
		All.setBounds(0, 284, 72, 23);
		frmMyBox.getContentPane().add(All);
		
		Group = new JRadioButton("Group");
		Group.setBackground(Color.WHITE);
		Group.setBounds(0, 211, 72, 23);
		frmMyBox.getContentPane().add(Group);
		
		list = new JList();
		list.setBounds(0, 0, -19, -38);
		frmMyBox.getContentPane().add(list);
		
		readAll = new JRadioButton("Read");
		readAll.setBackground(Color.WHITE);
		readAll.setBounds(168, 284, 96, 23);
		frmMyBox.getContentPane().add(readAll);
		readAll.setEnabled(false);
		
		writeGroup = new JRadioButton("Write");
		writeGroup.setBackground(Color.WHITE);
		writeGroup.setBounds(168, 240, 96, 23);
		frmMyBox.getContentPane().add(writeGroup);
		writeGroup.setEnabled(false);
		
		comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(430, 211, 141, 60);
		frmMyBox.getContentPane().add(comboBox);
		comboBox.setMaximumRowCount(100);
		comboBox.setEnabled(false);
		
		ReadGroup = new JRadioButton("Read");
		ReadGroup.setBackground(Color.WHITE);
		ReadGroup.setBounds(168, 211, 121, 23);
		frmMyBox.getContentPane().add(ReadGroup);
		ReadGroup.setEnabled(false);
		
		writeAll = new JRadioButton("Write");
		writeAll.setBackground(Color.WHITE);
		writeAll.setBounds(168, 310, 114, 23);
		frmMyBox.getContentPane().add(writeAll);
		writeAll.setEnabled(false);
		
		ChooseType = new JLabel();
		ChooseType.setIcon(new ImageIcon("src/GUI_final/thechoosegroup.png"));
		ChooseType.setBounds(430, 114, 137, 86);
		frmMyBox.getContentPane().add(ChooseType);
		
		ReadWrite = new JLabel();
		ReadWrite.setIcon(new ImageIcon("src/GUI_final/readWrite.png"));
		ReadWrite.setBounds(168, 177, 180, 27);
		frmMyBox.getContentPane().add(ReadWrite);
		
		Permission = new JLabel();
		Permission.setIcon(new ImageIcon("src/GUI_final/permission.png"));
		Permission.setBounds(10, 102, 137, 17);
		frmMyBox.getContentPane().add(Permission);
	
	}
	public JButton getButtonSend() {
		return buttonSend;
	}

	public void setButtonSend(JButton buttonSend) {
		this.buttonSend = buttonSend;
	}

	public JButton getButtonCancel() {
		return buttonCancel;
	}

	public void setButtonCancel(JButton buttonCancel) {
		this.buttonCancel = buttonCancel;
	}

	public JLabel getLblChageFilefolderPermission() {
		return lblChageFilefolderPermission;
	}

	public void setLblChageFilefolderPermission(JLabel lblChageFilefolderPermission) {
		this.lblChageFilefolderPermission = lblChageFilefolderPermission;
	}

	public JRadioButton getPrivate() {
		return Private;
	}

	public void setPrivate(JRadioButton private1) {
		Private = private1;
	}

	public JRadioButton getAll() {
		return All;
	}

	public void setAll(JRadioButton all) {
		All = all;
	}

	public JRadioButton getGroup() {
		return Group;
	}

	public void setGroup(JRadioButton group) {
		Group = group;
	}

	public JList getList() {
		return list;
	}

	public void setList(JList list) {
		this.list = list;
	}

	public JRadioButton getReadAll() {
		return readAll;
	}

	public void setReadAll(JRadioButton readAll) {
		this.readAll = readAll;
	}

	public JRadioButton getWriteGroup() {
		return writeGroup;
	}

	public void setWriteGroup(JRadioButton writeGroup) {
		this.writeGroup = writeGroup;
	}

	public JComboBox getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}

	public JRadioButton getReadGroup() {
		return ReadGroup;
	}

	public void setReadGroup(JRadioButton readGroup) {
		ReadGroup = readGroup;
	}

	public JRadioButton getWriteAll() {
		return writeAll;
	}

	public void setWriteAll(JRadioButton writeAll) {
		this.writeAll = writeAll;
	}

	public JLabel getChooseType() {
		return ChooseType;
	}

	public void setChooseType(JLabel chooseType) {
		ChooseType = chooseType;
	}

	public JLabel getReadWrite() {
		return ReadWrite;
	}

	public void setReadWrite(JLabel readWrite) {
		ReadWrite = readWrite;
	}

	public JLabel getPermission() {
		return Permission;
	}

	public void setPermission(JLabel permission) {
		Permission = permission;
	}

	public Action getAction() {
		return action;
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
