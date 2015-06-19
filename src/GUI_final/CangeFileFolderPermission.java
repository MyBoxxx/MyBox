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
import java.awt.Font;


public class CangeFileFolderPermission extends AbstractGUI{

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
	

	/**
	 * Create the application.
	 */
    
    public static  void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CangeFileFolderPermission frame = new CangeFileFolderPermission();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
    
    
	public CangeFileFolderPermission() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		 getContentPane().setBackground(new Color(59, 89, 151));
		 setTitle("My Box");
		 setBounds(100, 100, 800, 600);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 getContentPane().setLayout(null);
		
		
		buttonSend = new JButton();
		buttonSend.setBounds(27, 501, 187, 41);
		 getContentPane().add(buttonSend);
		buttonSend.setIcon(new ImageIcon("src/GUI_final/sendReuqest.PNG"));
		
		
		buttonCancel = new JButton();
		buttonCancel.setBounds(554, 501, 198, 41);
		 getContentPane().add(buttonCancel);
		buttonCancel.setIcon(new ImageIcon("src/GUI_final/cancelButton.jpg"));
		
	    lblChageFilefolderPermission = new JLabel();
		lblChageFilefolderPermission.setIcon(new ImageIcon(CangeFileFolderPermission.class.getResource("/GUI_final/Change-FileFolder-Permi.png")));
		lblChageFilefolderPermission.setBounds(50, 20, 702, 86);
		 getContentPane().add(lblChageFilefolderPermission);
		
		Private = new JRadioButton("Private");
		Private.setForeground(Color.WHITE);
		Private.setBackground(Color.WHITE);
		Private.setBounds(6, 225, 84, 23);
		 getContentPane().add(Private);
		
		All = new JRadioButton("All");
		All.setForeground(Color.WHITE);
		All.setBackground(Color.WHITE);
		All.setBounds(6, 393, 72, 23);
		 getContentPane().add(All);
		
		Group = new JRadioButton("Group");
		Group.setForeground(Color.WHITE);
		Group.setBackground(Color.WHITE);
		Group.setBounds(6, 307, 72, 23);
		 getContentPane().add(Group);
		
		list = new JList();
		list.setBounds(0, 0, -19, -38);
		 getContentPane().add(list);
		
		readAll = new JRadioButton("Read");
		readAll.setForeground(Color.WHITE);
		readAll.setBackground(Color.WHITE);
		readAll.setBounds(231, 393, 96, 23);
		 getContentPane().add(readAll);
		readAll.setEnabled(false);
		
		writeGroup = new JRadioButton("Write");
		writeGroup.setForeground(Color.WHITE);
		writeGroup.setBackground(Color.WHITE);
		writeGroup.setBounds(231, 342, 96, 23);
		 getContentPane().add(writeGroup);
		writeGroup.setEnabled(false);
		
		comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(535, 270, 141, 60);
		 getContentPane().add(comboBox);
		comboBox.setMaximumRowCount(100);
		comboBox.setEnabled(false);
		
		ReadGroup = new JRadioButton("Read");
		ReadGroup.setForeground(Color.WHITE);
		ReadGroup.setBackground(Color.WHITE);
		ReadGroup.setBounds(231, 307, 121, 23);
		 getContentPane().add(ReadGroup);
		ReadGroup.setEnabled(false);
		
		writeAll = new JRadioButton("Write");
		writeAll.setForeground(Color.WHITE);
		writeAll.setBackground(Color.WHITE);
		writeAll.setBounds(231, 427, 114, 23);
		 getContentPane().add(writeAll);
		writeAll.setEnabled(false);
		
		ChooseType = new JLabel();
		ChooseType.setForeground(Color.ORANGE);
		ChooseType.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		ChooseType.setText("Select Group");
		ChooseType.setIcon(null);
		ChooseType.setBounds(535, 158, 137, 47);
		 getContentPane().add(ChooseType);
		
		ReadWrite = new JLabel();
		ReadWrite.setForeground(Color.ORANGE);
		ReadWrite.setText("Read/Write");
		ReadWrite.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		ReadWrite.setIcon(null);
		ReadWrite.setBounds(231, 167, 104, 27);
		 getContentPane().add(ReadWrite);
		
		Permission = new JLabel();
		Permission.setForeground(Color.ORANGE);
		Permission.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		Permission.setText("Select Permission");
		Permission.setIcon(null);
		Permission.setBounds(6, 167, 137, 27);
		 getContentPane().add(Permission);
	
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
