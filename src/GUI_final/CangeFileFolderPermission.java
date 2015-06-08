package GUI_final;
import java.awt.EventQueue;

import javax.naming.ldap.Rdn;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.JTree;
import javax.swing.AbstractAction;

import java.awt.event.ActionEvent;

import javax.swing.Action;
import javax.swing.JButton;

import java.awt.event.ActionListener;

import javax.swing.JRadioButtonMenuItem;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


public class CangeFileFolderPermission {

	private JFrame frmMyBox;
	private final Action action = new SwingAction();
	//private JRadioButton  rb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CangeFileFolderPermission window = new CangeFileFolderPermission();
					window.frmMyBox.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CangeFileFolderPermission() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMyBox = new JFrame();
		frmMyBox.setTitle("My Box");
		frmMyBox.setBounds(100, 100, 602, 465);
		frmMyBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMyBox.getContentPane().setLayout(null);
		
		final JLabel Label = new JLabel("Chage File/Folder Permission");
		Label.setBounds(146, 20, 192, 16);
		frmMyBox.getContentPane().add(Label);
		
		final JPanel UperPanel = new JPanel();
		UperPanel.setBorder(new TitledBorder(null, "Change Permission", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		UperPanel.setBounds(6, 39, 581, 292);
		frmMyBox.getContentPane().add(UperPanel);
		UperPanel.setLayout(null);
		
		final JPanel panelButtom = new JPanel();
		panelButtom.setBounds(6, 343, 581, 94);
		frmMyBox.getContentPane().add(panelButtom);
		panelButtom.setLayout(null);
		
		final JPanel PanelHelpP = new JPanel();
		PanelHelpP.setBounds(0, 6, 596, 431);
		frmMyBox.getContentPane().add(PanelHelpP);
		PanelHelpP.setLayout(null);
		
		JButton ButtonOk = new JButton("OK");
		ButtonOk.setBounds(0, 0, 117, 29);
		PanelHelpP.add(ButtonOk);
		
		final JRadioButton rbPrivate = new JRadioButton("Private");
		rbPrivate.setBounds(27, 40, 84, 23);
		UperPanel.add(rbPrivate);
	
		
		final JRadioButton rbGroup = new JRadioButton("Group");
		rbGroup.setBounds(27, 90, 72, 23);
		UperPanel.add(rbGroup);
		
		
		final JRadioButton rbAll = new JRadioButton("All");
		rbAll.setBounds(27, 140, 72, 23);
		UperPanel.add(rbAll);
		
		
		final JLabel lbselect = new JLabel("Select Group");
		lbselect.setEnabled(false);
		lbselect.setBounds(136, 94, 96, 16);
		UperPanel.add(lbselect);
		
		final JList list = new JList();
		list.setBounds(322, 133, -19, -38);
		UperPanel.add(list);
		
		final JComboBox cbgroup = new JComboBox();
		cbgroup.setModel(new DefaultComboBoxModel(new String[] {"Yaron", "Eran", "Eyal ", "Misha", "Ofir"}));
		cbgroup.setMaximumRowCount(100);
		cbgroup.setEnabled(false);
		cbgroup.setBounds(257, 73, 141, 60);
		UperPanel.add(cbgroup);
		
		final JRadioButton rbGRead = new JRadioButton("Read");
		rbGRead.setEnabled(false);
		rbGRead.setBounds(431, 90, 96, 23);
		UperPanel.add(rbGRead);
		
		final JRadioButton rbGWrite = new JRadioButton("Write");
		rbGWrite.setEnabled(false);
		rbGWrite.setBounds(431, 140, 96, 23);
		UperPanel.add(rbGWrite);
		
		final JRadioButton rbARead = new JRadioButton("Read");
		rbARead.setEnabled(false);
		rbARead.setBounds(118, 140, 121, 23);
		UperPanel.add(rbARead);
		
		final JRadioButton rbAWrite = new JRadioButton("Write");
		rbAWrite.setEnabled(false);
		rbAWrite.setBounds(118, 175, 114, 23);
		UperPanel.add(rbAWrite);
		
		final JButton buttonHelp = new JButton("?");
		buttonHelp.setBounds(534, 17, 41, 29);
		UperPanel.add(buttonHelp);
		buttonHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UperPanel.setVisible(false);
				panelButtom.setVisible(false);
				PanelHelpP.setVisible(true);
				Label.setVisible(false);
			}
		});
		
		
		JButton buttonSend = new JButton("Send Request");
		buttonSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("100");
			}
		});
		buttonSend.setBounds(22, 19, 140, 41);
		panelButtom.add(buttonSend);
		
		
		JButton buttonCancel = new JButton("cancel");
		buttonCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("bye bye");
			}
		});
		buttonCancel.setBounds(400, 19, 140, 41);
		panelButtom.add(buttonCancel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(28, 25, 117, 29);
		panelButtom.add(btnNewButton);
		
		
	rbPrivate.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			rbGroup.setSelected(false);
			rbAll.setSelected(false);
			rbGRead.setEnabled(false);
			rbGWrite.setEnabled(false);
			cbgroup.setEnabled(false);
			lbselect.setEnabled(false);
			if (!rbPrivate.isSelected())
				rbPrivate.setSelected(true);
			rbARead.setEnabled(false);
			rbAWrite.setEnabled(false);
			
		}
	});
	
	rbGroup.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			rbPrivate.setSelected(false);
			rbAll.setSelected(false);
			lbselect.setEnabled(true);
			if (!rbGroup.isSelected())
				rbGroup.setSelected(true);
			cbgroup.setEnabled(true);
			rbGRead.setEnabled(true);
			rbGWrite.setEnabled(true);
			rbARead.setEnabled(false);
			rbAWrite.setEnabled(false);
		}
	});	
	
	rbAll.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			rbPrivate.setSelected(false);
			rbGroup.setSelected(false);
			lbselect.setEnabled(false);
			if (!rbAll.isSelected())
				rbAll.setSelected(true);
			rbGRead.setEnabled(false);
			rbGWrite.setEnabled(false);
			cbgroup.setEnabled(false);
			rbARead.setEnabled(true);
			rbAWrite.setEnabled(true);
		}
	});	
	

	
	rbGRead.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (rbGRead.isSelected())
			{
				rbGWrite.setSelected(false);
			}
				if (!rbGRead.isSelected())
					rbGRead.setSelected(true);
				rbARead.setSelected(false);
				rbAWrite.setSelected(false);
			
		}
	});
	rbGWrite.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (rbGWrite.isSelected())
			{
				rbGRead.setSelected(false);}
				if (!rbGWrite.isSelected())
					rbGWrite.setSelected(true);
				rbARead.setSelected(false);
				rbAWrite.setSelected(false);
			
			
		}
	});
	
	rbARead.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			rbAWrite.setSelected(false);
			if (!rbARead.isSelected())
				rbARead.setSelected(true);
			rbGRead.setSelected(false);
			rbGWrite.setSelected(false);
		}
	});
	
	rbAWrite.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			rbARead.setSelected(false);
			if (!rbAWrite.isSelected())
				rbAWrite.setSelected(true);
			rbGRead.setSelected(false);
			rbGWrite.setSelected(false);
		}
	});
	
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
