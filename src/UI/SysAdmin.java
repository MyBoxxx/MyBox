package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;


public class SysAdmin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SysAdmin frame = new SysAdmin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SysAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(364, 87, 20, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1.setBounds(438, 87, 20, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JTextPane txtpnAccept = new JTextPane();
		txtpnAccept.setBounds(364, 60, 27, 20);
		txtpnAccept.setText("ok");
		contentPane.add(txtpnAccept);
		
		JTextPane txtpnCancel = new JTextPane();
		txtpnCancel.setBounds(428, 57, 36, 23);
		txtpnCancel.setText("cancel");
		contentPane.add(txtpnCancel);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("New check box");
		chckbxNewCheckBox_2.setBounds(364, 113, 20, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JCheckBox checkBox = new JCheckBox("New check box");
		checkBox.setBounds(438, 113, 20, 23);
		contentPane.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("New check box");
		checkBox_1.setBounds(364, 139, 20, 23);
		contentPane.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("New check box");
		checkBox_2.setBounds(438, 139, 20, 23);
		contentPane.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("New check box");
		checkBox_3.setBounds(364, 165, 20, 23);
		contentPane.add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("New check box");
		checkBox_4.setBounds(438, 165, 20, 23);
		contentPane.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("New check box");
		checkBox_5.setBounds(364, 191, 20, 23);
		contentPane.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("New check box");
		checkBox_6.setBounds(438, 191, 20, 23);
		contentPane.add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("New check box");
		checkBox_7.setBounds(364, 217, 20, 23);
		contentPane.add(checkBox_7);
		
		JCheckBox checkBox_8 = new JCheckBox("New check box");
		checkBox_8.setBounds(438, 217, 20, 23);
		contentPane.add(checkBox_8);
		
		JCheckBox checkBox_9 = new JCheckBox("New check box");
		checkBox_9.setBounds(364, 243, 20, 23);
		contentPane.add(checkBox_9);
		
		JCheckBox checkBox_10 = new JCheckBox("New check box");
		checkBox_10.setBounds(438, 243, 20, 23);
		contentPane.add(checkBox_10);
		
		JButton btnNewButton = new JButton("Change Request");
		btnNewButton.setBounds(92, 277, 172, 42);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reject");
		btnNewButton_1.setBounds(30, 358, 101, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnAprove = new JButton("Aprove");
		btnAprove.setBounds(235, 358, 101, 23);
		contentPane.add(btnAprove);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(0, 153, 358, 73);
		contentPane.add(comboBox);
		
		JLabel lblRequesstPage = new JLabel("System Admin Requesst Page");
		lblRequesstPage.setBounds(156, 20, 193, 16);
		contentPane.add(lblRequesstPage);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(44, 64, 61, 16);
		contentPane.add(lblNewLabel);
		ButtonSend.setIcon(new ImageIcon("images/sendrequest.gif"));
	}
}
