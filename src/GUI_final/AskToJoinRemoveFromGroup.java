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
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

public class AskToJoinRemoveFromGroup {

	private JFrame frame;
	private JLabel lblAskToJoin;
	private JList listGroup;
	private JButton btRequest;
	private JButton btCacel;
	private JScrollBar scrool;
	private JLabel chooseGroup;

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
		DefaultListModel Dl = new DefaultListModel();
		Dl.addElement("100");
		Dl.addElement("Yaron");
		Dl.addElement("Eran");
		Dl.addElement("Sima ");
		Dl.addElement("Sveta");
		Dl.addElement("En Ma");
		
		btRequest = new JButton();
		btRequest.setIcon(new ImageIcon("src/GUI_final/sendReuqest.PNG"));
		btRequest.setBounds(10, 390, 187, 60);
		frame.getContentPane().add(btRequest);
		
		btCacel = new JButton();
		btCacel.setIcon(new ImageIcon("src/GUI_final/cancelButton.jpg"));
		btCacel.setBounds(355, 390, 217, 60);
		frame.getContentPane().add(btCacel);
		
		chooseGroup = new JLabel();
		chooseGroup.setBounds(0, 0, 173, 146);
		frame.getContentPane().add(chooseGroup);
		chooseGroup.setIcon(new ImageIcon("src/GUI_final/thechoosegroup.png"));
		
		lblAskToJoin = new JLabel();
		lblAskToJoin.setBounds(247, -21, 325, 418);
		frame.getContentPane().add(lblAskToJoin);
		lblAskToJoin.setForeground(SystemColor.textHighlightText);
		lblAskToJoin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAskToJoin.setIcon(new ImageIcon("src/GUI_final/ask.png"));
		
		listGroup = new JList();
		listGroup.setBounds(0, 142, 141, 139);
		frame.getContentPane().add(listGroup);
		listGroup.setEnabled(false);
		listGroup.setModel(Dl);
		
		scrool = new JScrollBar();
		scrool.setBounds(157, 178, 15, 96);
		frame.getContentPane().add(scrool);
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

	public JScrollBar getScrool() {
		return scrool;
	}

	public void setScrool(JScrollBar scrool) {
		this.scrool = scrool;
	}

	public JLabel getChooseGroup() {
		return chooseGroup;
	}

	public void setChooseGroup(JLabel chooseGroup) {
		this.chooseGroup = chooseGroup;
	}
}
