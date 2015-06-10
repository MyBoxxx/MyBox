package GUI_final;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
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

public class AskToJoinRemoveFromGroup {

	private JFrame frame;
	private JLabel lblAskToJoin;
	private JList listGroup;
	private JButton btRequest;
	private JButton btCacel;
	private JLabel chooseGroup;
	private Choice choiceGroup;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AskToJoinRemoveFromGroup window = new AskToJoinRemoveFromGroup();
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
	public AskToJoinRemoveFromGroup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 598, 499);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	
		
		btRequest = new JButton();
		btRequest.setIcon(new ImageIcon("src/GUI_final/sendReuqest.PNG"));
		btRequest.setBounds(10, 390, 187, 60);
		frame.getContentPane().add(btRequest);
		
		btCacel = new JButton();
		btCacel.setIcon(new ImageIcon("src/GUI_final/cancelButton.jpg"));
		btCacel.setBounds(355, 390, 217, 60);
		frame.getContentPane().add(btCacel);
		
		chooseGroup = new JLabel();
		chooseGroup.setBounds(10, 11, 173, 146);
		frame.getContentPane().add(chooseGroup);
		chooseGroup.setIcon(new ImageIcon("src/GUI_final/thechoosegroup.png"));
		
		lblAskToJoin = new JLabel();
		lblAskToJoin.setBounds(247, -21, 325, 418);
		frame.getContentPane().add(lblAskToJoin);
		lblAskToJoin.setForeground(SystemColor.textHighlightText);
		lblAskToJoin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAskToJoin.setIcon(new ImageIcon("src/GUI_final/ask.png"));
		
		Choice choiceGroup = new Choice();
		choiceGroup.setBounds(10, 173, 185, 20);
		choiceGroup.add("");
		choiceGroup.add("100");
		choiceGroup.add("ein ma");
		choiceGroup.add("peter");
		frame.getContentPane().add(choiceGroup);
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

	
	public Choice getChoiceGroup() {
		return choiceGroup;
	}

	public void setChoiceGroup(Choice choiceGroup) {
		this.choiceGroup = choiceGroup;
	}

	public JLabel getChooseGroup() {
		return chooseGroup;
	}

	public void setChooseGroup(JLabel chooseGroup) {
		this.chooseGroup = chooseGroup;
	}
	
	public void sendRequestListner(ActionListener listenForOkButton){
		btRequest.addActionListener(listenForOkButton);
	}
	
	public void cancelListner(ActionListener listenForCancelButton){
		btCacel.addActionListener(listenForCancelButton);		
	}
}
