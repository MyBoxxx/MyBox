package GUI_final;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
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

public class CreateFolderScreen extends JFrame {
	
	private JTextField folderNameField;
	

	private JTextField folderDescriptionField;
	private JButton btnCancel,btnOk;

	
   public CreateFolderScreen() {
    final ContentPanel contentPanel = new ContentPanel();
    getContentPane().add(contentPanel);
    contentPanel.setLayout(null);
    this.setTitle("Create New Folder");
    JLabel lblFolderName = new JLabel("Folder Name:");
    lblFolderName.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblFolderName.setBounds(20, 444, 90, 23);
    contentPanel.add(lblFolderName);
    
    JLabel lblNewLabel = new JLabel("Folder Description:");
    lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblNewLabel.setBounds(20, 469, 122, 23);
    contentPanel.add(lblNewLabel);
    
    JLabel labelStarString = new JLabel("*");
    labelStarString.setFont(new Font("Tahoma", Font.PLAIN, 14));
    labelStarString.setForeground(Color.RED);
    labelStarString.setBounds(10, 478, 46, 14);
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
    
    folderNameField = new JTextField();
    folderNameField.setBounds(161, 444, 200, 23);
    contentPanel.add(folderNameField);
    folderNameField.setColumns(10);
    
    folderDescriptionField = new JTextField();
    folderDescriptionField.setColumns(10);
    folderDescriptionField.setBounds(161, 469, 200, 23);
    contentPanel.add(folderDescriptionField);
    setSize(460, 600);
  }

  public static void main(String[] args) {
    CreateFolderScreen jrframe = new CreateFolderScreen();
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	int x = (int) ((dimension.getWidth() - jrframe.getWidth()) / 2);
	int y = (int) ((dimension.getHeight() - jrframe.getHeight()) / 2);
	jrframe.setLocation(x, y);
    jrframe.setVisible(true);
  }
  
  
  public JTextField getFolderNameField() {
		return folderNameField;
	}

	public void setFolderNameField(JTextField folderNameField) {
		this.folderNameField = folderNameField;
	}

	public JTextField getFolderDescriptionField() {
		return folderDescriptionField;
	}

	public void setFolderDescriptionField(JTextField folderDescriptionField) {
		this.folderDescriptionField = folderDescriptionField;
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
}

class ContentPanel extends JPanel {
  Image bgimage = null;

  ContentPanel() {
    MediaTracker mt = new MediaTracker(this);
    bgimage = Toolkit.getDefaultToolkit().getImage("images/folder.jpg");
    mt.addImage(bgimage, 0);
    try {
      mt.waitForAll();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    int imwidth = bgimage.getWidth(null);
    int imheight = bgimage.getHeight(null);
    g.drawImage(bgimage, 1, 1, null);
  }
}


