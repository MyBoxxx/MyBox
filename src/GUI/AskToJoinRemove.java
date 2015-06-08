package GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
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

public class AskToJoinRemove {

	private JFrame frame;
	private JRadioButton rbRead;
	private JRadioButton rbWrite;
	private JLabel lblAskToJoin;
	private JList listGroup;
	private JPanel panel_1;
	private JButton btRequest;
	private JButton btCacel;
	private JScrollBar scrool;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AskToJoinRemove window = new AskToJoinRemove();
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
	public AskToJoinRemove() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 542, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 6, 536, 282);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblAskToJoin = new JLabel("Ask To Join Remove Group");
		lblAskToJoin.setBounds(211, 27, 191, 16);
		panel.add(lblAskToJoin);
		
		rbRead = new JRadioButton("Read");
		rbRead.setBounds(32, 54, 141, 23);
		panel.add(rbRead);
		
		rbWrite = new JRadioButton("Write");
		rbWrite.setBounds(32, 89, 141, 23);
		panel.add(rbWrite);
		
		listGroup = new JList();
		listGroup.setEnabled(false);
		listGroup.setBounds(32, 122, 141, 139);
		panel.add(listGroup);
		DefaultListModel Dl = new DefaultListModel();
		Dl.addElement("100");
		Dl.addElement("Yaron");
		Dl.addElement("Eran");
		Dl.addElement("Sima ");
		Dl.addElement("Sveta");
		Dl.addElement("En Ma");
		listGroup.setModel(Dl);
		
		scrool = new JScrollBar();
		scrool.setBounds(185, 134, 15, 96);
		panel.add(scrool);
		
		panel_1 = new JPanel();
		panel_1.setBounds(10, 300, 526, 122);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		btRequest = new JButton("sendRequet");
		btRequest.setBounds(28, 34, 142, 60);
		panel_1.add(btRequest);
		
		btCacel = new JButton("Cancel");
		btCacel.setBounds(290, 34, 142, 60);
		panel_1.add(btCacel);
		
		rbRead.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				listGroup.setEnabled(true);
				scrool.setEnabled(true);
				rbWrite.setSelected(false);
				if (!rbRead.isSelected())
					rbRead.setSelected(true);
			}
		});
		
		rbWrite.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				listGroup.setEnabled(true);
				scrool.setEnabled(true);
				rbRead.setSelected(false);
				if (!rbWrite.isSelected())
					rbWrite.setSelected(true);
				
			}
		});
	}
}
