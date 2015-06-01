package UI;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CreateFolderScreen extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
  CreateFolderScreen() {
    UI.ContentPanel contentPanel = new ContentPanel();
    getContentPane().add(contentPanel);
    contentPanel.setLayout(null);
    
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
    
    JButton btnCancel = new JButton("Cancel");
    btnCancel.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent arg0) {
    	}
    });
    btnCancel.setBounds(73, 514, 89, 23);
    contentPanel.add(btnCancel);
    
    JButton btnOk = new JButton("OK");
    btnOk.setBounds(272, 514, 89, 23);
    contentPanel.add(btnOk);
    
    JLabel lblOptional = new JLabel("* Optional");
    lblOptional.setForeground(Color.RED);
    lblOptional.setBounds(10, 537, 67, 14);
    contentPanel.add(lblOptional);
    
    textField = new JTextField();
    textField.setBounds(161, 444, 200, 23);
    contentPanel.add(textField);
    textField.setColumns(10);
    
    textField_1 = new JTextField();
    textField_1.setColumns(10);
    textField_1.setBounds(161, 469, 200, 23);
    contentPanel.add(textField_1);
    setSize(460, 600);
  }

  public static void main(String[] args) {
    CreateFolderScreen jrframe = new CreateFolderScreen();
    jrframe.setVisible(true);
  }
}

class ContentPanel extends JPanel {
  Image bgimage = null;

  ContentPanel() {
    MediaTracker mt = new MediaTracker(this);
    bgimage = Toolkit.getDefaultToolkit().getImage("src/UI/folder.jpg");
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


