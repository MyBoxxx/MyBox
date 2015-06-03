package GUI;

import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.CardLayout;

import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RequestToDeleteGroup {

	private JFrame frame;
	private JList list;
	private JButton b1Ok;
	private JButton b1Cancel;
	private JButton b2Send;
	private JButton b2Beck;
	private JPanel panelbutton;
	private JPanel AskTo;
	private JPanel AreUSure;
	private String s;
	private JLabel lgroup;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RequestToDeleteGroup window = new RequestToDeleteGroup();
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
	public RequestToDeleteGroup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 459, 345);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		AskTo = new JPanel();
		frame.getContentPane().add(AskTo, "name_1433270169848162000");
		AskTo.setLayout(null);
		
		JLabel lblDeletGroupWindow = new JLabel("Delet Group Window");
		lblDeletGroupWindow.setBounds(149, 34, 141, 44);
		AskTo.add(lblDeletGroupWindow);
		
		list = new JList();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBounds(32, 90, 125, 111);
		AskTo.add(list);
		DefaultListModel Glist = new DefaultListModel();
		Glist.addElement("sandra");
		Glist.addElement("yael");
		Glist.addElement("sigal");
		Glist.addElement("Sima ");
		Glist.addElement("Sveta");
		Glist.addElement("En Ma");
		list.setModel(Glist);
		list.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
					s=list.getSelectedValue().toString();
			}
		});
	
		
		panelbutton = new JPanel();
		panelbutton.setBounds(6, 233, 447, 84);
		AskTo.add(panelbutton);
		panelbutton.setLayout(null);
		
		b1Ok = new JButton("Ok");
		b1Ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AskTo.setVisible(false);
				panelbutton.setVisible(false);
				AreUSure.setVisible(true);
				lgroup.setText(s+" ?");
				
			}
		});
		b1Ok.setBounds(22, 16, 137, 50);
		panelbutton.add(b1Ok);
		
		b1Cancel = new JButton("Cancel");
		b1Cancel.setBounds(253, 16, 137, 50);
		panelbutton.add(b1Cancel);
		
		AreUSure = new JPanel();
		frame.getContentPane().add(AreUSure, "name_1433270172032557000");
		AreUSure.setLayout(null);
		
		JLabel lbSure = new JLabel("Are You Sure You Want To Delete The Group ");
		lbSure.setBounds(28, 55, 292, 16);
		AreUSure.add(lbSure);
		
		b2Send = new JButton("Send Request");
		b2Send.setBounds(33, 165, 117, 29);
		AreUSure.add(b2Send);
		
		b2Beck = new JButton("Beck");
		b2Beck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AreUSure.setVisible(false);
				AskTo.setVisible(true);
				panelbutton.setVisible(true);
			}
		});
		b2Beck.setBounds(254, 165, 117, 29);
		AreUSure.add(b2Beck);
		
		lgroup = new JLabel("");
		lgroup.setBounds(310, 55, 61, 16);
		AreUSure.add(lgroup);
	}
}
