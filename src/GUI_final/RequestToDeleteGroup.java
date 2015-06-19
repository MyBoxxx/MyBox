package GUI_final;

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
<<<<<<< HEAD

public class RequestToDeleteGroup extends AbstractGUI{

	private JList list;
	private JButton b1Ok;
	private JButton b1Beck;
	private JButton b2Send;
	private JButton b2Beck;
	private JPanel panelbutton;
	private JPanel AskTo;
	private JPanel AreUSure;
	private String s;
	private JLabel lgroup;


	/**
	 * Create the application.
	 */
	public RequestToDeleteGroup() {
		initialize();
	}

	/**
	 * Initialize the contents of the  
	 */
	private void initialize() {
		 setBounds(100, 100, 459, 345);
		 getContentPane().setLayout(new CardLayout(0, 0));
		
		AskTo = new JPanel();
		 getContentPane().add(AskTo, "name_1433270169848162000");
		AskTo.setLayout(null);
		
		JLabel lblDeletGroupWindow = new JLabel("Delet Group Window");
		lblDeletGroupWindow.setBounds(149, 34, 141, 44);
		AskTo.add(lblDeletGroupWindow);
		
		list = new JList();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBounds(32, 90, 125, 111);
		AskTo.add(list);
		DefaultListModel Glist = new DefaultListModel(); // need to fix get info from db
		Glist.addElement("sandra");
		Glist.addElement("yael");
		Glist.addElement("sigal");
		Glist.addElement("Sima ");
		Glist.addElement("Sveta");
		Glist.addElement("En Ma");
		list.setModel(Glist);
		
		
		panelbutton = new JPanel();
		panelbutton.setBounds(6, 233, 447, 84);
		AskTo.add(panelbutton);
		panelbutton.setLayout(null);
		
		b1Ok = new JButton("Ok");
		b1Ok.setBounds(22, 16, 137, 50);
		panelbutton.add(b1Ok);
		
		b1Beck = new JButton("Beck");
		b1Beck.setBounds(253, 16, 137, 50);
		panelbutton.add(b1Beck);
=======
import javax.swing.ImageIcon;
import java.awt.Color;

public class RequestToDeleteGroup extends AbstractGUI{

	private JList list;
	private JButton b1Ok;
	private JButton b1Beck;
	private JButton b2Send;
	private JButton b2Beck;
	private JPanel panelbutton;
	private JPanel AskTo;
	private JPanel AreUSure;
	private String s;
	private JLabel lgroup;
	private JLabel lblSelectGroup;
	private JLabel lblNewLabel;


	/**
	 * Create the application.
	 */
	public RequestToDeleteGroup() {
		initialize();
	}

	/**
	 * Initialize the contents of the  
	 */
	private void initialize() {
		 setBounds(100, 100, 800, 600);
		 getContentPane().setLayout(new CardLayout(0, 0));
		
		AskTo = new JPanel();
		AskTo.setBackground(new Color(59, 89, 151));
		 getContentPane().add(AskTo, "name_1433270169848162000");
		AskTo.setLayout(null);
		
		JLabel lblDeletGroupWindow = new JLabel("");
		lblDeletGroupWindow.setIcon(new ImageIcon(RequestToDeleteGroup.class.getResource("/GUI_final/Delete-Group.png")));
		lblDeletGroupWindow.setBounds(138, 39, 487, 101);
		AskTo.add(lblDeletGroupWindow);
		
		list = new JList();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBounds(35, 240, 172, 176);
		AskTo.add(list);
		DefaultListModel Glist = new DefaultListModel(); // need to fix get info from db
		Glist.addElement("sandra");
		Glist.addElement("yael");
		Glist.addElement("sigal");
		Glist.addElement("Sima ");
		Glist.addElement("Sveta");
		Glist.addElement("En Ma");
		list.setModel(Glist);
		
		
		panelbutton = new JPanel();
		panelbutton.setBounds(74, 461, 800, 600);
		panelbutton.setOpaque(false);
		AskTo.add(panelbutton);
		panelbutton.setLayout(null);
		
		b1Ok = new JButton("Ok");
		b1Ok.setIcon(new ImageIcon(RequestToDeleteGroup.class.getResource("/GUI_final/sendReuqest.PNG")));
		b1Ok.setBounds(22, 16, 180, 50);
		panelbutton.add(b1Ok);
		
		b1Beck = new JButton("");
		b1Beck.setIcon(new ImageIcon(RequestToDeleteGroup.class.getResource("/GUI_final/cancelButton.jpg")));
		b1Beck.setBounds(424, 16, 227, 50);
		panelbutton.add(b1Beck);
		
		lblSelectGroup = new JLabel("Select Group");
		lblSelectGroup.setForeground(Color.ORANGE);
		lblSelectGroup.setBounds(35, 203, 116, 25);
		AskTo.add(lblSelectGroup);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(RequestToDeleteGroup.class.getResource("/GUI_final/EditGroupPic.png")));
		lblNewLabel.setBounds(163, 6, 542, 566);
		AskTo.add(lblNewLabel);
>>>>>>> refs/heads/master
		
		AreUSure = new JPanel();
		 getContentPane().add(AreUSure, "name_1433270172032557000");
		AreUSure.setLayout(null);
		
		JLabel lbSure = new JLabel("Are You Sure You Want To Delete The Group ");
		lbSure.setBounds(28, 55, 292, 16);
		AreUSure.add(lbSure);
		
		b2Send = new JButton("Send Request");
		b2Send.setBounds(33, 165, 117, 29);
		AreUSure.add(b2Send);
		
		b2Beck = new JButton("Beck");
		b2Beck.setBounds(254, 165, 117, 29);
		AreUSure.add(b2Beck);
		
		lgroup = new JLabel("");
		lgroup.setBounds(310, 55, 61, 16);
		AreUSure.add(lgroup);
	}
	
	 public void ButtonPressedActionlistinerOk(ActionListener listenforokbutton) {
			b1Ok.addActionListener(listenforokbutton);
		}
	 public void ButtonPressedActionlistinerNextBeck(ActionListener listenforbeckbutton) {
			b2Beck.addActionListener(listenforbeckbutton);
		}
	 
	 public void ButtonPressedActionlistinerBeck(ActionListener listenforbeckbutton) {
			b1Beck.addActionListener(listenforbeckbutton);
		}
	 
	 public void isselected(ListSelectionListener listsection)
	 {
		 list.getSelectionModel().addListSelectionListener(listsection);;
	 }
	/*--------------------------------------------------- 
	 public void ButtonPressedActionlistinersend(ActionListener listenforbeckbutton) {
			b2Send.addActionListener(listenforbeckbutton);
		}
	---------------------------------------------- */


	public JList getList() {
		return list;
	}

	public void setList(JList list) {
		this.list = list;
	}

	public JButton getB1Ok() {
		return b1Ok;
	}

	public void setB1Ok(JButton b1Ok) {
		this.b1Ok = b1Ok;
	}

	public JButton getB1Cancel() {
		return b1Beck;
	}

	public void setB1Cancel(JButton b1Cancel) {
		this.b1Beck = b1Cancel;
	}

	public JButton getB2Send() {
		return b2Send;
	}

	public void setB2Send(JButton b2Send) {
		this.b2Send = b2Send;
	}

	public JButton getB2Beck() {
		return b2Beck;
	}

	public void setB2Beck(JButton b2Beck) {
		this.b2Beck = b2Beck;
	}

	public JPanel getPanelbutton() {
		return panelbutton;
	}

	public void setPanelbutton(JPanel panelbutton) {
		this.panelbutton = panelbutton;
	}

	public JPanel getAskTo() {
		return AskTo;
	}

	public void setAskTo(JPanel askTo) {
		AskTo = askTo;
	}

	public JPanel getAreUSure() {
		return AreUSure;
	}

	public void setAreUSure(JPanel areUSure) {
		AreUSure = areUSure;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public JLabel getLgroup() {
		return lgroup;
	}

	public void setLgroup(JLabel lgroup) {
		this.lgroup = lgroup;
	}
}
