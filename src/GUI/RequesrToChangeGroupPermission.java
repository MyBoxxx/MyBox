package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Button;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class RequesrToChangeGroupPermission {

	private JFrame frmRequstToChange;
	private JPanel UpperPanel; 
	private JLabel ChooseLabel;
	private JRadioButton rbRead;
	private JRadioButton rbWrite;
	private JPanel ButtonPanel;
	private JButton ButtonSend;
	private JButton ButtonCancel;
	private JLabel lblChangeGroupPremm;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RequesrToChangeGroupPermission window = new RequesrToChangeGroupPermission();
					window.frmRequstToChange.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RequesrToChangeGroupPermission() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRequstToChange = new JFrame();
		frmRequstToChange.setTitle("My Box");
		frmRequstToChange.setBounds(100, 100, 549, 331);
		frmRequstToChange.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRequstToChange.getContentPane().setLayout(null);
		
		UpperPanel = new JPanel();
		UpperPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Please Select Group Premission", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		UpperPanel.setForeground(Color.BLACK);
		UpperPanel.setToolTipText("");
		UpperPanel.setBounds(37, 36, 491, 167);
		frmRequstToChange.getContentPane().add(UpperPanel);
		UpperPanel.setLayout(null);
		
		ChooseLabel = new JLabel("Choose One/bouth");
		ChooseLabel.setBounds(20, 27, 141, 16);
		UpperPanel.add(ChooseLabel);
		
		rbRead = new JRadioButton("Read");
		rbRead.setBounds(18, 55, 141, 23);
		UpperPanel.add(rbRead);
		rbRead.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(rbRead.isSelected())
					ButtonSend.setEnabled(true);
				if(!rbRead.isSelected() && !rbWrite.isSelected())
					ButtonSend.setEnabled(false);
			}
		});
		
		rbWrite = new JRadioButton("Write");
		rbWrite.setBounds(20, 90, 141, 23);
		UpperPanel.add(rbWrite);
		rbWrite.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(rbWrite.isSelected())
					ButtonSend.setEnabled(true);
				if(!rbWrite.isSelected() && !rbRead.isSelected())
					ButtonSend.setEnabled(false);
			}
		});
		
		ButtonPanel = new JPanel();
		ButtonPanel.setBounds(6, 215, 522, 76);
		frmRequstToChange.getContentPane().add(ButtonPanel);
		ButtonPanel.setLayout(null);
		
		ButtonSend = new JButton("Send Request");
		ButtonSend.setEnabled(false);
		ButtonSend.setIcon(new ImageIcon("images/sendrequest.gif"));
		ButtonSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(100);
			}
		});
		ButtonSend.setBounds(33, 10, 152, 66);
		ButtonPanel.add(ButtonSend);
		
		ButtonCancel = new JButton("Cancel");
		ButtonCancel.setIcon(new ImageIcon("images/delete1.png"));
		ButtonCancel.setBounds(331, 10, 152, 66);
		ButtonPanel.add(ButtonCancel);
		
		lblChangeGroupPremm = new JLabel("              Change Group permission");
		lblChangeGroupPremm.setBounds(97, 8, 302, 16);
		frmRequstToChange.getContentPane().add(lblChangeGroupPremm);
	}
}
