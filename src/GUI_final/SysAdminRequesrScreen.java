package GUI_final;
import images_icons.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.ldap.Rdn;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JDesktopPane;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class SysAdminRequesrScreen extends AbstractGUI {

	private JPanel contentPane;
	private JLabel lblRequest;
	private JRadioButton rbaccept;
	private JRadioButton rbreject;
	private JButton SendButton;
	private JButton Beckbutton; 
	private JButton btnReset;
	private JTable table;

	/**
	 * Create the frame.
	 */
	public SysAdminRequesrScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 551, 514);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblRequest = new JLabel("System Admin Requests");
		lblRequest.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblRequest.setForeground(Color.BLACK);
		lblRequest.setBounds(190, 6, 191, 50);
		contentPane.add(lblRequest);
		
		rbaccept = new JRadioButton("Accept");
		rbaccept.setBackground(new Color(6,139,224)); 
		rbaccept.setBounds(63, 234, 141, 23);
		contentPane.add(rbaccept);
		
		rbreject = new JRadioButton("Reject");
		rbreject.setBackground(new Color(6,139,224)); 
		rbreject.setBounds(63, 269, 141, 23);
		contentPane.add(rbreject);
		
		SendButton = new JButton("Send & Close");
		SendButton.setBounds(380, 386, 117, 29);
		contentPane.add(SendButton);
		
		Beckbutton = new JButton("back");
		Beckbutton.setBounds(63, 386, 117, 29);
		contentPane.add(Beckbutton);
		
		btnReset = new JButton("reset");
		btnReset.setBounds(63, 304, 81, 29);
		contentPane.add(btnReset);
		
		table = new JTable();
		table.setBounds(63, 50, 434, 173);
		contentPane.add(table);
		
	}

	

	public JTable getTable() {
		return table;
	}



	public void setTable(JTable table) {
		this.table = table;
	}


	public JLabel getLblRequest() {
		return lblRequest;
	}

	public void setLblRequest(JLabel lblRequest) {
		this.lblRequest = lblRequest;
	}

	public JRadioButton getRbaccept() {
		return rbaccept;
	}

	public void setRbaccept(JRadioButton rbaccept) {
		this.rbaccept = rbaccept;
	}

	public JRadioButton getRbreject() {
		return rbreject;
	}

	public void setRbreject(JRadioButton rbreject) {
		this.rbreject = rbreject;
	}

	public JButton getSendButton() {
		return SendButton;
	}

	public void setSendButton(JButton SendButton) {
		this.SendButton = SendButton;
	}

	public JButton getBeckbutton() {
		return Beckbutton;
	}

	public void setBeckbutton(JButton beckbutton) {
		Beckbutton = beckbutton;
	}

	public JButton getBtnReset() {
		return btnReset;
	}

	public void setBtnReset(JButton btnReset) {
		this.btnReset = btnReset;
	}
}