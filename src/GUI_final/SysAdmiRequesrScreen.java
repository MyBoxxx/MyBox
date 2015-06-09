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


public class SysAdmiRequesrScreen extends JFrame {

	private JPanel contentPane;
	private JList Requestlist; 
	private JLabel lblRequest;
	private JRadioButton rbaccept;
	private JRadioButton rbreject;
	private JButton okButton;
	private JButton Beckbutton; 
	private JButton btnReset;
	private JLabel pic;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SysAdmiRequesrScreen frame = new SysAdmiRequesrScreen();
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
	public SysAdmiRequesrScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Requestlist = new JList();
		Requestlist.setBounds(25, 68, 446, 141);
		contentPane.add(Requestlist);
		
		lblRequest = new JLabel("System Admin Requests");
		lblRequest.setBounds(214, 19, 167, 16);
		contentPane.add(lblRequest);
		
		rbaccept = new JRadioButton("Accept");
		rbaccept.setBounds(63, 233, 141, 23);
		contentPane.add(rbaccept);
		
		rbreject = new JRadioButton("Reject");
		rbreject.setBounds(251, 233, 141, 23);
		contentPane.add(rbreject);
		
		okButton = new JButton("Save");
		okButton.setBounds(53, 405, 117, 29);
		contentPane.add(okButton);
		
		Beckbutton = new JButton("Beck");
		Beckbutton.setBounds(354, 405, 117, 29);
		contentPane.add(Beckbutton);
		
		btnReset = new JButton("reset");
		btnReset.setBounds(418, 232, 81, 29);
		contentPane.add(btnReset);
		
		pic = new JLabel("");
		pic.setIcon(new ImageIcon("src/images_icons/rsz_requestsystemadmin.jpg"));
		pic.setBounds(6, 6, 488, 447);
		contentPane.add(pic);
		
		rbaccept.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			if (rbaccept.isSelected())
				rbreject.setSelected(false);
			if(!rbaccept.isSelected())
				rbaccept.setSelected(true);
			}
		});
		
		rbreject.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if (rbreject.isSelected())
					rbaccept.setSelected(false);
				if(!rbreject.isSelected())
					rbreject.setSelected(true);
			}
		});
		
		btnReset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				rbaccept.setSelected(false);
				rbreject.setSelected(false);
			}
		});
		
		
	}
	
}
