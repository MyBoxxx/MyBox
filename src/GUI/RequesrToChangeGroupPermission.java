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
		
		JPanel UpperPanel = new JPanel();
		UpperPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Please Select Group Premission", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		UpperPanel.setForeground(Color.BLACK);
		UpperPanel.setToolTipText("");
		UpperPanel.setBounds(37, 36, 491, 167);
		frmRequstToChange.getContentPane().add(UpperPanel);
		UpperPanel.setLayout(null);
		
		JLabel ChooseLabel = new JLabel("Choose One/bouth");
		ChooseLabel.setBounds(20, 27, 141, 16);
		UpperPanel.add(ChooseLabel);
		
		JRadioButton RAdioRead = new JRadioButton("Read");
		RAdioRead.setBounds(18, 55, 141, 23);
		UpperPanel.add(RAdioRead);
		
		JRadioButton Rawrite = new JRadioButton("Write");
		Rawrite.setBounds(20, 90, 141, 23);
		UpperPanel.add(Rawrite);
		
		JPanel ButtonPanel = new JPanel();
		ButtonPanel.setBounds(6, 215, 522, 76);
		frmRequstToChange.getContentPane().add(ButtonPanel);
		ButtonPanel.setLayout(null);
		
		JButton ButtonSend = new JButton("Send Request");
		ButtonSend.setIcon(new ImageIcon("/Users/yaronoz/Desktop/email_icon_small.gif"));
		ButtonSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(100);
			}
		});
		ButtonSend.setBounds(33, 10, 152, 66);
		ButtonPanel.add(ButtonSend);
		
		JButton ButtonCancel = new JButton("Cancel");
		ButtonCancel.setIcon(new ImageIcon("/Users/yaronoz/Desktop/delete.png"));
		ButtonCancel.setBounds(331, 10, 152, 66);
		ButtonPanel.add(ButtonCancel);
		
		JLabel lblChangeGroupPremm = new JLabel("              Change Group permission");
		lblChangeGroupPremm.setBounds(97, 8, 302, 16);
		frmRequstToChange.getContentPane().add(lblChangeGroupPremm);
	}
}
