package GUI_final;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JRadioButton;

public class CreateFolderScreen extends AbstractGUI {
	
	private JTextField ItemNameField;
	
	private final JPanel contentPanel = new JPanel();
	private JTextField ItemDescriptionField;
	private JButton btnCancel,btnOk;
	private ButtonGroup bg;
	

public CreateFolderScreen() {
	getContentPane().setLayout(new BorderLayout());
    getContentPane().add(contentPanel);
    contentPanel.setLayout(null);
    this.setTitle("Create File/Folder");
    JLabel lblItemName = new JLabel("Name:");
    lblItemName.setFont(new Font("Tahoma", Font.BOLD, 14));
    lblItemName.setBounds(20, 434, 90, 23);
    contentPanel.add(lblItemName);
    
    JLabel lblNewLabel = new JLabel("Description:");
    lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblNewLabel.setBounds(20, 459, 122, 23);
    contentPanel.add(lblNewLabel);
    
    JLabel labelStarString = new JLabel("*");
    labelStarString.setFont(new Font("Tahoma", Font.PLAIN, 14));
    labelStarString.setForeground(Color.RED);
    labelStarString.setBounds(10, 468, 46, 14);
    contentPanel.add(labelStarString);
    
    btnCancel = new JButton("Cancel");
    btnCancel.setBounds(73, 514, 89, 23);
    contentPanel.add(btnCancel);
    
     btnOk = new JButton("OK");
     btnOk.setBounds(272, 514, 89, 23);
    contentPanel.add(btnOk);
    
    JLabel lblOptional = new JLabel("* Optional");
    lblOptional.setForeground(Color.RED);
    lblOptional.setBounds(10, 537, 67, 14);
    contentPanel.add(lblOptional);
    
    ItemNameField = new JTextField();
    ItemNameField.setBounds(161, 434, 200, 23);
    contentPanel.add(ItemNameField);
    ItemNameField.setColumns(10);
    
    ItemDescriptionField = new JTextField();
    ItemDescriptionField.setColumns(10);
    ItemDescriptionField.setBounds(161, 459, 200, 23);
    contentPanel.add(ItemDescriptionField);
     bg = new ButtonGroup();
    
    JRadioButton rdbtnFile = new JRadioButton("File");
    rdbtnFile.setFont(new Font("Tahoma", Font.BOLD, 11));
    rdbtnFile.setBounds(141, 489, 109, 23);
    contentPanel.add(rdbtnFile);
    
    JRadioButton rdbtnFolder = new JRadioButton("Folder");
    rdbtnFolder.setFont(new Font("Tahoma", Font.BOLD, 11));
    rdbtnFolder.setBounds(252, 489, 109, 23);
    contentPanel.add(rdbtnFolder);
    setSize(460, 600);
    bg.add(rdbtnFolder);
    bg.add(rdbtnFile);
    
    JLabel lblLogo = new JLabel("Logo");
    lblLogo.setIcon(new ImageIcon(CreateFolderScreen.class.getResource("/images_icons/folder.jpg")));
    lblLogo.setBounds(10, 0, 424, 423);
    contentPanel.add(lblLogo);
  }

  public static void main(String[] args) {
    CreateFolderScreen jrframe = new CreateFolderScreen();
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	int x = (int) ((dimension.getWidth() - jrframe.getWidth()) / 2);
	int y = (int) ((dimension.getHeight() - jrframe.getHeight()) / 2);
	jrframe.setLocation(x, y);
    jrframe.setVisible(true);
  }
  
  
  public JTextField getItemNameField() {
		return ItemNameField;
	}

	public void setItemNameField(JTextField folderNameField) {
		this.ItemNameField = folderNameField;
	}

	public JTextField getItemDescriptionField() {
		return ItemDescriptionField;
	}

	public void setItemDescriptionField(JTextField ItemDescriptionField) {
		this.ItemDescriptionField = ItemDescriptionField;
	}

	public JButton getBtnCancel() {
		return btnCancel;
	}

	public void setBtnCancel(JButton btnCancel) {
		this.btnCancel = btnCancel;
	}

	public JButton getBtnOk() {
		return btnOk;
	}

	public void setBtnOk(JButton btnOk) {
		this.btnOk = btnOk;
	}
	   public ButtonGroup getBg() {
			return bg;
		}

}



