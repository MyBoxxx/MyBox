package GUI_final;
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


public class RequesrToChangeGroupPermission extends AbstractGUI{

	private JPanel UpperPanel;
	private JLabel ChooseLabel;
	private JRadioButton RAdioRead;
	private JRadioButton Rawrite;
	private JPanel ButtonPanel;
	private JButton ButtonSend;
	private JButton ButtonCancel;
	private JLabel lblChangeGroupPremm;
	
	/**
	 * Launch the application.
	 */
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
		 setTitle("Requesr To Change Group Permission");
		 setBounds(100, 100, 549, 331);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 getContentPane().setLayout(null);
		
		UpperPanel = new JPanel();
		UpperPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Please Select Group Premission", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		UpperPanel.setForeground(Color.BLACK);
		UpperPanel.setToolTipText("");
		UpperPanel.setBounds(37, 36, 491, 167);
		 getContentPane().add(UpperPanel);
		UpperPanel.setLayout(null);
		
		ChooseLabel = new JLabel("Choose One/bouth");
		ChooseLabel.setBounds(20, 27, 141, 16);
		UpperPanel.add(ChooseLabel);
		
		RAdioRead = new JRadioButton("Read");
		RAdioRead.setBounds(18, 55, 141, 23);
		UpperPanel.add(RAdioRead);
		
		Rawrite = new JRadioButton("Write");
		Rawrite.setBounds(20, 90, 141, 23);
		UpperPanel.add(Rawrite);
		
		ButtonPanel = new JPanel();
		ButtonPanel.setBounds(6, 215, 522, 76);
		 getContentPane().add(ButtonPanel);
		ButtonPanel.setLayout(null);
		
		ButtonSend = new JButton("Send Request");
		ButtonSend.setIcon(new ImageIcon("/Users/yaronoz/Desktop/email_icon_small.gif"));
		ButtonSend.setBounds(33, 10, 152, 66);
		ButtonPanel.add(ButtonSend);
		
		ButtonCancel = new JButton("Cancel");
		ButtonCancel.setIcon(new ImageIcon("/Users/yaronoz/Desktop/delete.png"));
		ButtonCancel.setBounds(331, 10, 152, 66);
		ButtonPanel.add(ButtonCancel);
		
		lblChangeGroupPremm = new JLabel("              Change Group permission");
		lblChangeGroupPremm.setBounds(97, 8, 302, 16);
		 getContentPane().add(lblChangeGroupPremm);
	}
	
	 public void ButtonPressedActionlistiner(ActionListener listenforbutton) {
			ButtonSend.addActionListener(listenforbutton);
		}

	public JPanel getUpperPanel() {
		return UpperPanel;
	}

	public void setUpperPanel(JPanel upperPanel) {
		UpperPanel = upperPanel;
	}

	public JLabel getChooseLabel() {
		return ChooseLabel;
	}

	public void setChooseLabel(JLabel chooseLabel) {
		ChooseLabel = chooseLabel;
	}

	public JRadioButton getRAdioRead() {
		return RAdioRead;
	}

	public void setRAdioRead(JRadioButton rAdioRead) {
		RAdioRead = rAdioRead;
	}

	public JRadioButton getRawrite() {
		return Rawrite;
	}

	public void setRawrite(JRadioButton rawrite) {
		Rawrite = rawrite;
	}

	public JPanel getButtonPanel() {
		return ButtonPanel;
	}

	public void setButtonPanel(JPanel buttonPanel) {
		ButtonPanel = buttonPanel;
	}

	public JButton getButtonSend() {
		return ButtonSend;
	}

	public void setButtonSend(JButton buttonSend) {
		ButtonSend = buttonSend;
	}

	public JButton getButtonCancel() {
		return ButtonCancel;
	}

	public void setButtonCancel(JButton buttonCancel) {
		ButtonCancel = buttonCancel;
	}

	public JLabel getLblChangeGroupPremm() {
		return lblChangeGroupPremm;
	}

	public void setLblChangeGroupPremm(JLabel lblChangeGroupPremm) {
		this.lblChangeGroupPremm = lblChangeGroupPremm;
	}
}
