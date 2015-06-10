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

public class newFile_gui extends JFrame {
	
	private JTextField FileNameField;
	

	private JTextField FileDescriptionField;
	private JButton btnCancel,btnOk;

	
   public newFile_gui() {
    final ContentPanel contentPanel = new ContentPanel();
    getContentPane().add(contentPanel);
    contentPanel.setLayout(null);
    this.setTitle("Create New File");
    JLabel lblFileName = new JLabel("File Name:");
    lblFileName.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblFileName.setBounds(20, 444, 90, 23);
    contentPanel.add(lblFileName);
    
    JLabel lblNewLabel = new JLabel("File Description:");
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
    
    FileNameField = new JTextField();
    FileNameField.setBounds(161, 444, 200, 23);
    contentPanel.add(FileNameField);
    FileNameField.setColumns(10);
    
    FileDescriptionField = new JTextField();
    FileDescriptionField.setColumns(10);
    FileDescriptionField.setBounds(161, 469, 200, 23);
    contentPanel.add(FileDescriptionField);
    setSize(460, 600);
  }

  public static void main(String[] args) {
    newFile_gui jrframe = new newFile_gui();
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	int x = (int) ((dimension.getWidth() - jrframe.getWidth()) / 2);
	int y = (int) ((dimension.getHeight() - jrframe.getHeight()) / 2);
	jrframe.setLocation(x, y);
    jrframe.setVisible(true);
  }
  
  
  public JTextField getFileNameField() {
		return FileNameField;
	}

	public void setFileNameField(JTextField FileNameField) {
		this.FileNameField = FileNameField;
	}

	public JTextField getFileDescriptionField() {
		return FileDescriptionField;
	}

	public void setFileDescriptionField(JTextField FileDescriptionField) {
		this.FileDescriptionField = FileDescriptionField;
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
    bgimage = Toolkit.getDefaultToolkit().getImage("/images/newFile.jpg");
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


