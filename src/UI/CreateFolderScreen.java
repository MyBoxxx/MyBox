package UI;

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
	
	private JTextField textField;
	private JTextField textField_1;
  CreateFolderScreen() {
    final UI.ContentPanel contentPanel = new ContentPanel();
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
    
    JButton btnCancel = new JButton("Cancel");
    btnCancel.addMouseListener(new MouseAdapter() {
    	@SuppressWarnings("deprecation")
		@Override
    	public void mouseClicked(MouseEvent arg0) {
    		 final ImageIcon icon = new ImageIcon("src/UI/imageno.jpg");
             JOptionPane.showMessageDialog(null, "No Folder created", "About", JOptionPane.INFORMATION_MESSAGE, icon);
             System.exit(0);
    	}
    });
    btnCancel.setBounds(73, 514, 89, 23);
    contentPanel.add(btnCancel);
    
    JButton btnOk = new JButton("OK");
    btnOk.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		 final ImageIcon icon = new ImageIcon("src/UI/imageyes.jpg");
    		 if (textField.getText().equals("") && textField.getText() != null)
    		 {
        		 final ImageIcon icono = new ImageIcon("src/UI/imageno.jpg");
                 JOptionPane.showMessageDialog(null, "You have to insert a Name!", "About", JOptionPane.INFORMATION_MESSAGE, icono);
    		 }
    		 else
    			 JOptionPane.showMessageDialog(null, "Folder with the name "  + textField.getText() + " created\n" + "Description: " + textField_1.getText(), "About", JOptionPane.INFORMATION_MESSAGE, icon);
    	}
    });
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
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	int x = (int) ((dimension.getWidth() - jrframe.getWidth()) / 2);
	int y = (int) ((dimension.getHeight() - jrframe.getHeight()) / 2);
	jrframe.setLocation(x, y);
    jrframe.setVisible(true);
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


