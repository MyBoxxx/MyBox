package GUI_final;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
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

import javax.swing.ImageIcon;

import java.awt.Color;

public class RequestToDeleteGroup extends AbstractGUI{

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
	private JComboBox<Object> choiceGroup;


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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		 getContentPane().setLayout(new CardLayout(0, 0));
		
		AskTo = new JPanel();
		AskTo.setBackground(new Color(59, 89, 151));
		 getContentPane().add(AskTo, "name_1433270169848162000");
		AskTo.setLayout(null);
		
		JLabel lblDeletGroupWindow = new JLabel("");
		lblDeletGroupWindow.setIcon(new ImageIcon(RequestToDeleteGroup.class.getResource("/images_icons/Delete-Group.png")));
		lblDeletGroupWindow.setBounds(138, 39, 487, 101);
		AskTo.add(lblDeletGroupWindow);
		
		

		choiceGroup = new JComboBox<Object>();
		choiceGroup.setBounds(6, 208, 185, 20);
		AskTo.add(choiceGroup);
		
		
		
		panelbutton = new JPanel();
		panelbutton.setBounds(74, 461, 800, 600);
		panelbutton.setOpaque(false);
		AskTo.add(panelbutton);
		panelbutton.setLayout(null);
		
		b1Ok = new JButton("Ok");
		b1Ok.setIcon(new ImageIcon(RequestToDeleteGroup.class.getResource("/images_icons/sendReuqest.PNG")));
		b1Ok.setBounds(22, 16, 180, 50);
		panelbutton.add(b1Ok);
		
		b1Beck = new JButton("");
		b1Beck.setIcon(new ImageIcon(RequestToDeleteGroup.class.getResource("/images_icons/cancelButton.jpg")));
		b1Beck.setBounds(424, 16, 227, 50);
		panelbutton.add(b1Beck);
		
		lblSelectGroup = new JLabel("Select Group");
		lblSelectGroup.setForeground(Color.ORANGE);
		lblSelectGroup.setBounds(35, 203, 116, 25);
		AskTo.add(lblSelectGroup);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(RequestToDeleteGroup.class.getResource("/images_icons/EditGroupPic.png")));
		lblNewLabel.setBounds(163, 6, 542, 566);
		AskTo.add(lblNewLabel);
		
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

	public JButton getB1Beck() {
		return b1Beck;
	}

	public void setB1Beck(JButton b1Beck) {
		this.b1Beck = b1Beck;
	}

	public JComboBox<Object> getChoiceGroup() {
		return choiceGroup;
	}

	public void setChoiceGroup(JComboBox<Object> choiceGroup) {
		this.choiceGroup = choiceGroup;
	}
	
	
}
