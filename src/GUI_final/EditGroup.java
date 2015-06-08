package GUI_final;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JEditorPane;

public class EditGroup {

	private JFrame frame;
	private JButton b1X;
	private JButton b2X;
	private JButton b2Place;
	private JButton b3Place;
	private JButton b4Send;
	private JButton b5Cancel;
	private JComboBox comboBox;
	private JLabel lblNewName;
	private JLabel lblNewDescription;
	private JEditorPane editDescription;
	private JEditorPane editName;
	private String Name,Description;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditGroup window = new EditGroup();
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
	public EditGroup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 519, 386);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panelUpper = new JPanel();
		panelUpper.setBounds(6, 6, 507, 263);
		frame.getContentPane().add(panelUpper);
		panelUpper.setLayout(null);
		
		JLabel lEdit = new JLabel("Edit name /Description");
		lEdit.setBounds(131, 23, 161, 16);
		panelUpper.add(lEdit);
		
		JLabel lSelected = new JLabel("Select Group");
		lSelected.setBounds(20, 61, 86, 16);
		panelUpper.add(lSelected);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox.setMaximumRowCount(100);
		comboBox.setBounds(396, 78, 86, 59);
		panelUpper.add(comboBox);
		comboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				b1X.setEnabled(true);
				b2X.setEnabled(true);
				b2Place.setEnabled(true);
				b3Place.setEnabled(true);
				b5Cancel.setEnabled(true);
				lblNewName.setEnabled(true);
				lblNewDescription.setEnabled(true);
				editName.setEnabled(true);
				editDescription.setEnabled(true);
				
				
			}
		});
		
		lblNewName = new JLabel("New Name");
		lblNewName.setEnabled(false);
		lblNewName.setBounds(6, 154, 86, 16);
		panelUpper.add(lblNewName);
		
		lblNewDescription = new JLabel("New Description");
		lblNewDescription.setEnabled(false);
		lblNewDescription.setBounds(6, 199, 128, 16);
		panelUpper.add(lblNewDescription);
		
		b1X = new JButton("X");
		b1X.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editName.setText(null);
			}
		});
		b1X.setEnabled(false);
		b1X.setBounds(304, 149, 20, 29);
		panelUpper.add(b1X);
		
		b2X = new JButton("X");
		b2X.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editDescription.setText(null);
			}
		});
		b2X.setEnabled(false);
		b2X.setBounds(304, 194, 20, 29);
		panelUpper.add(b2X);
		
		b2Place = new JButton("Place");
		b2Place.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Name=editName.getText();
				b4Send.setEnabled(true);
			}
		});
		b2Place.setEnabled(false);
		b2Place.setBounds(336, 149, 117, 29);
		panelUpper.add(b2Place);
		
		b3Place = new JButton("Place");
		b3Place.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Description=editDescription.getText();
				b4Send.setEnabled(true);
			}
		});
		b3Place.setEnabled(false);
		b3Place.setBounds(336, 194, 117, 29);
		panelUpper.add(b3Place);
		
		editName = new JEditorPane();
		editName.setEnabled(false);
		editName.setBounds(131, 160, 134, 16);
		panelUpper.add(editName);
		
		editDescription = new JEditorPane();
		editDescription.setEnabled(false);
		editDescription.setBounds(131, 199, 134, 42);
		panelUpper.add(editDescription);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 282, 507, 65);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		b4Send = new JButton("Send Request");
		b4Send.setEnabled(false);
		b4Send.setBounds(18, 19, 117, 29);
		panel.add(b4Send);
		
		b5Cancel = new JButton("Cancel");
		b5Cancel.setBounds(351, 19, 117, 29);
		panel.add(b5Cancel);
	}
}
