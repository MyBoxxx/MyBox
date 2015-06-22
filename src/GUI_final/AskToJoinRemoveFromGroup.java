package GUI_final;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.AbstractListModel;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollBar;
import javax.swing.JButton;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.UIManager;
import javax.swing.ButtonGroup;

public class AskToJoinRemoveFromGroup extends AbstractGUI{

	private JLabel lblAskToJoin;
	private JList listGroup;
	private JButton btRequest;
	private JButton btCacel;
	private JLabel chooseGroup;
	private JComboBox<Object> choiceGroup;
	private JRadioButton rbjoin,rbremove;
	private final ButtonGroup buttonGroup = new ButtonGroup();



	public JRadioButton getRbjoin() {
		return rbjoin;
	}

	public void setRbjoin(JRadioButton rbjoin) {
		this.rbjoin = rbjoin;
	}

	public JRadioButton getRbremove() {
		return rbremove;
	}

	public void setRbremove(JRadioButton rbremove) {
		this.rbremove = rbremove;
	}

	/**
	 * Create the application.
	 */
	
	public AskToJoinRemoveFromGroup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		getContentPane().setBackground(new Color(59, 89, 151));
		setBounds(100, 100, 800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
	
		
		btRequest = new JButton();
		btRequest.setIcon(new ImageIcon("src/GUI_final/sendReuqest.PNG"));
		btRequest.setBounds(6, 495, 187, 60);
		getContentPane().add(btRequest);
		
		btCacel = new JButton();
		btCacel.setIcon(new ImageIcon("src/GUI_final/cancelButton.jpg"));
		btCacel.setBounds(554, 495, 217, 60);
		getContentPane().add(btCacel);
		
		chooseGroup = new JLabel();
		chooseGroup.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		chooseGroup.setText("Select Group");
		chooseGroup.setBounds(26, 137, 141, 47);
		getContentPane().add(chooseGroup);
		chooseGroup.setIcon(null);
		
		lblAskToJoin = new JLabel();
		lblAskToJoin.setBounds(89, 53, 682, 82);
		getContentPane().add(lblAskToJoin);
		lblAskToJoin.setForeground(SystemColor.textHighlightText);
		lblAskToJoin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAskToJoin.setIcon(new ImageIcon(AskToJoinRemoveFromGroup.class.getResource("/GUI_final/Ask-To-Join-Remove-From-.png")));
		
		choiceGroup = new JComboBox<Object>();
		choiceGroup.setBounds(6, 208, 185, 20);
	
		getContentPane().add(choiceGroup);
		
		rbjoin = new JRadioButton("Join");
		buttonGroup.add(rbjoin);
		rbjoin.setBounds(26, 285, 141, 23);
		getContentPane().add(rbjoin);
		
		rbremove = new JRadioButton("Remove");
		buttonGroup.add(rbremove);
		rbremove.setBounds(26, 320, 141, 23);
		getContentPane().add(rbremove);
	}

	public JLabel getLblAskToJoin() {
		return lblAskToJoin;
	}

	public void setLblAskToJoin(JLabel lblAskToJoin) {
		this.lblAskToJoin = lblAskToJoin;
	}

	public JList getListGroup() {
		return listGroup;
	}

	public void setListGroup(JList listGroup) {
		this.listGroup = listGroup;
	}

	public JButton getBtRequest() {
		return btRequest;
	}

	public void setBtRequest(JButton btRequest) {
		this.btRequest = btRequest;
	}

	public JButton getBtCacel() {
		return btCacel;
	}

	public void setBtCacel(JButton btCacel) {
		this.btCacel = btCacel;
	}


	public JComboBox<Object> getChoiceGroup() {
		return choiceGroup;
	}

	public void setChoiceGroup(JComboBox<Object> choiceGroup) {
		this.choiceGroup = choiceGroup;
	}

	public JLabel getChooseGroup() {
		return chooseGroup;
	}

	public void setChooseGroup(JLabel chooseGroup) {
		this.chooseGroup = chooseGroup;
	}

	public ButtonGroup getButtonGroup() {
		return buttonGroup;
	}
	
}
