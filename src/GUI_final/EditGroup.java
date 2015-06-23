package GUI_final;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
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

import java.awt.Color;

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
	private JPanel panel ;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public EditGroup() {
		
		getContentPane().setBackground(new Color(59, 89, 151));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		 panel = new JPanel();
		 getContentPane().setLayout(null);
		JLabel lEdit = new JLabel("Request To Edit name /Description Group");
		lEdit.setBounds(271, 21, 307, 28);
		getContentPane().add(lEdit);
		
		JLabel lSelected = new JLabel("Select Group");
		lSelected.setBounds(87, 73, 86, 16);
		getContentPane().add(lSelected);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox.setMaximumRowCount(100);
		comboBox.setBounds(313, 61, 117, 42);
		getContentPane().add(comboBox);
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
		getContentPane().add(lblNewName);
		
		lblNewDescription = new JLabel("New Description");
		lblNewDescription.setEnabled(false);
		lblNewDescription.setBounds(87, 327, 128, 16);
		getContentPane().add(lblNewDescription);
		
		b1X = new JButton("X");
		b1X.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editName.setText(null);
			}
		});
		b1X.setEnabled(false);
		b1X.setBounds(514, 164, 20, 29);
		getContentPane().add(b1X);
		
		b2X = new JButton("X");
		b2X.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editDescription.setText(null);
			}
		});
		b2X.setEnabled(false);
		b2X.setBounds(514, 226, 20, 29);
		getContentPane().add(b2X);
		
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
		getContentPane().add(b3Place);
		
		editName = new JEditorPane();
		editName.setEnabled(false);
		editName.setBounds(271, 169, 176, 16);
	getContentPane().add(editName);
		
		editDescription = new JEditorPane();
		editDescription.setEnabled(false);
		editDescription.setBounds(271, 327, 176, 66);
		getContentPane().add(editDescription);
		
		b4Send = new JButton("Send Request");
		b4Send.setEnabled(false);
		b4Send.setIcon(new ImageIcon(EditGroup.class.getResource("/GUI_final/sendReuqest.png")));
		b4Send.setBounds(49, 493, 185, 50);
		getContentPane().add(b4Send);
			
			b5Cancel = new JButton("Cancel");
			b5Cancel.setIcon(new ImageIcon(EditGroup.class.getResource("/GUI_final/cancelButton.jpg")));
			b5Cancel.setBounds(535, 493, 214, 50);
			getContentPane().add(b5Cancel);
			getContentPane().add( panel);
			
			JLabel pic = new JLabel("");
			pic.setIcon(new ImageIcon(EditGroup.class.getResource("/GUI_final/EditGroupPic.png")));
			pic.setBounds(128, 6, 545, 566);
			getContentPane().add(pic);
	}
	
	public JButton getB1X() {
		return b1X;
	}

	public void setB1X(JButton b1x) {
		b1X = b1x;
	}

	public JButton getB2X() {
		return b2X;
	}

	public void setB2X(JButton b2x) {
		b2X = b2x;
	}

	public JButton getB2Place() {
		return b2Place;
	}

	public void setB2Place(JButton b2Place) {
		this.b2Place = b2Place;
	}

	public JButton getB3Place() {
		return b3Place;
	}

	public void setB3Place(JButton b3Place) {
		this.b3Place = b3Place;
	}

	public JComboBox getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}

	public JLabel getLblNewName() {
		return lblNewName;
	}

	public void setLblNewName(JLabel lblNewName) {
		this.lblNewName = lblNewName;
	}

	public JLabel getLblNewDescription() {
		return lblNewDescription;
	}

	public void setLblNewDescription(JLabel lblNewDescription) {
		this.lblNewDescription = lblNewDescription;
	}

	public JEditorPane getEditDescription() {
		return editDescription;
	}

	public void setEditDescription(JEditorPane editDescription) {
		this.editDescription = editDescription;
	}

	public JEditorPane getEditName() {
		return editName;
	}

	public void setEditName(JEditorPane editName) {
		this.editName = editName;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
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
