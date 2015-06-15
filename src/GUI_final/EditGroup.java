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
import javax.swing.ImageIcon;

public class EditGroup extends AbstractGUI {

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
					window.setVisible(true);
					window.setBounds(100, 100, 800, 600);
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
		JPanel panel = new JPanel();
		 panel.setBounds(6, 6, 507, 330);
		 panel.setLayout(null);
		
		JLabel lEdit = new JLabel("Request To Edit name /Description Group");
		lEdit.setBounds(271, 21, 307, 28);
		panel.add(lEdit);
		
		JLabel lSelected = new JLabel("Select Group");
		lSelected.setBounds(87, 73, 86, 16);
		panel.add(lSelected);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox.setMaximumRowCount(100);
		comboBox.setBounds(313, 61, 117, 42);
		panel.add(comboBox);
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
		lblNewName.setBounds(87, 169, 86, 16);
		panel.add(lblNewName);
		
		lblNewDescription = new JLabel("New Description");
		lblNewDescription.setEnabled(false);
		lblNewDescription.setBounds(87, 327, 128, 16);
		panel.add(lblNewDescription);
		
		b1X = new JButton("X");
		b1X.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editName.setText(null);
			}
		});
		b1X.setEnabled(false);
		b1X.setBounds(514, 164, 20, 29);
		panel.add(b1X);
		
		b2X = new JButton("X");
		b2X.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editDescription.setText(null);
			}
		});
		b2X.setEnabled(false);
		b2X.setBounds(514, 226, 20, 29);
		panel.add(b2X);
		
		b2Place = new JButton("Place");
		b2Place.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Name=editName.getText();
				b4Send.setEnabled(true);
			}
		});
		b2Place.setEnabled(false);
		b2Place.setBounds(604, 164, 117, 29);
		panel.add(b2Place);
		
		b3Place = new JButton("Place");
		b3Place.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Description=editDescription.getText();
				b4Send.setEnabled(true);
			}
		});
		b3Place.setEnabled(false);
		b3Place.setBounds(604, 226, 117, 29);
		panel.add(b3Place);
		
		editName = new JEditorPane();
		editName.setEnabled(false);
		editName.setBounds(271, 169, 176, 16);
		panel.add(editName);
		
		editDescription = new JEditorPane();
		editDescription.setEnabled(false);
		editDescription.setBounds(271, 327, 176, 66);
		panel.add(editDescription);
		
		b4Send = new JButton("Send Request");
		b4Send.setEnabled(false);
		b4Send.setIcon(new ImageIcon(EditGroup.class.getResource("/GUI_final/sendReuqest.png")));
		b4Send.setBounds(49, 493, 185, 50);
		panel.add(b4Send);
			
			b5Cancel = new JButton("Cancel");
			b5Cancel.setIcon(new ImageIcon(EditGroup.class.getResource("/GUI_final/cancelButton.jpg")));
			b5Cancel.setBounds(535, 493, 214, 50);
			panel.add(b5Cancel);
			getContentPane().add( panel);
			
			JLabel pic = new JLabel("");
			pic.setIcon(new ImageIcon(EditGroup.class.getResource("/GUI_final/EditGroupPic.png")));
			pic.setBounds(128, 6, 545, 566);
			panel.add(pic);
	}
	
	public JButton getB4Send() {
		return b4Send;
	}

	public void setB4Send(JButton b4Send) {
		this.b4Send = b4Send;
	}

	public JButton getB5Cancel() {
		return b5Cancel;
	}

	public void setB5Cancel(JButton b5Cancel) {
		this.b5Cancel = b5Cancel;
	}
}