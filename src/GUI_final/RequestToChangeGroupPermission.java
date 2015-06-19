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
<<<<<<< HEAD


public class RequestToChangeGroupPermission {

	private JFrame frmRequstToChange;
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
/*	public static void main(String[] args) {
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
**/
	/**
	 * Create the application.
	 */
	public RequestToChangeGroupPermission() {
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
		
		RAdioRead = new JRadioButton("Read");
		RAdioRead.setBounds(18, 55, 141, 23);
		UpperPanel.add(RAdioRead);
		
		Rawrite = new JRadioButton("Write");
		Rawrite.setBounds(20, 90, 141, 23);
		UpperPanel.add(Rawrite);
		
		ButtonPanel = new JPanel();
		ButtonPanel.setBounds(6, 215, 522, 76);
		frmRequstToChange.getContentPane().add(ButtonPanel);
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
		frmRequstToChange.getContentPane().add(lblChangeGroupPremm);
	}
	
	 public void ButtonPressedActionlistinersend(ActionListener listenforbutton) {
			ButtonSend.addActionListener(listenforbutton);
		}
	 public void ButtonPressedActionlistinercancel(ActionListener listenforbutton) {
			ButtonCancel.addActionListener(listenforbutton);
		}

	public JFrame getFrmRequstToChange() {
		return frmRequstToChange;
	}

	public void setFrmRequstToChange(JFrame frmRequstToChange) {
		this.frmRequstToChange = frmRequstToChange;
	}
=======
import java.awt.Font;


public class RequestToChangeGroupPermission extends AbstractGUI{

	private JFrame frmRequstToChange;
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
	
	/**
	 * Initialize the contents of the frame.
	 */
	public RequestToChangeGroupPermission() {
		getContentPane().setBackground(new Color(59, 89, 151));
		frmRequstToChange = new JFrame();
		setBounds(100, 100, 800, 600);
		getContentPane().setForeground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		UpperPanel = new JPanel();
		UpperPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Please Select Group Premission", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 0, 0)));
		UpperPanel.setForeground(Color.BLACK);
		UpperPanel.setToolTipText("");
		UpperPanel.setOpaque(false);
		UpperPanel.setBounds(183, 131, 491, 186);
		getContentPane().add(UpperPanel);
		UpperPanel.setLayout(null);
		
		ChooseLabel = new JLabel("Choose One/bouth");
		ChooseLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		ChooseLabel.setForeground(new Color(128, 0, 0));
		ChooseLabel.setBounds(23, 45, 209, 29);
		UpperPanel.add(ChooseLabel);
		
		RAdioRead = new JRadioButton("Read");
		RAdioRead.setBounds(20, 86, 141, 23);
		UpperPanel.add(RAdioRead);
		
		Rawrite = new JRadioButton("Write");
		Rawrite.setBounds(20, 121, 141, 23);
		UpperPanel.add(Rawrite);
		
		ButtonPanel = new JPanel();
		ButtonPanel.setBounds(135, 477, 561, 76);
		ButtonPanel.setOpaque(false);
		getContentPane().add(ButtonPanel);
		ButtonPanel.setLayout(null);
		
		ButtonSend = new JButton("Send Request");
		ButtonSend.setIcon(new ImageIcon(RequestToChangeGroupPermission.class.getResource("/GUI_final/sendReuqest.PNG")));
		ButtonSend.setBounds(33, 10, 167, 66);
		ButtonPanel.add(ButtonSend);
		
		ButtonCancel = new JButton("Cancel");
		ButtonCancel.setIcon(new ImageIcon(RequestToChangeGroupPermission.class.getResource("/GUI_final/cancelButton.jpg")));
		ButtonCancel.setBounds(329, 10, 226, 66);
		ButtonPanel.add(ButtonCancel);
		
		lblChangeGroupPremm = new JLabel("");
		lblChangeGroupPremm.setIcon(new ImageIcon(RequestToChangeGroupPermission.class.getResource("/GUI_final/Change-Group-Permission-2.png")));
		lblChangeGroupPremm.setBounds(174, 26, 522, 58);
		getContentPane().add(lblChangeGroupPremm);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(RequestToChangeGroupPermission.class.getResource("/GUI_final/EditGroupPic.png")));
		lblNewLabel.setBounds(172, 6, 816, 583);
		getContentPane().add(lblNewLabel);
	}
	
>>>>>>> refs/heads/master

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
