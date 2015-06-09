package Controlers;

import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Entity.*;
import GUI_final.*;

public class CreateFolder_Controller {

	private static  Folder_Entity model ;
	private static  CreateFolderScreen view;

	
	ActionListener loginActionListener ;
	ActionListener forgotActionListener ;
	

	CreateFolder_Controller(Folder_Entity model,CreateFolderScreen view){
		this.model = model;
		this.view = view;
	}
	
	public void control(){
		view.getBtnCancel().addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		 	    		 view.setVisible(false);
	    	}
	    });
		view.getBtnOk().addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		 final ImageIcon icon = new ImageIcon("images/imageyes.jpg");
	    		 if (view.getFolderNameField().getText().equals("") && view.getFolderNameField().getText() != null)
	    		 {
	        		 final ImageIcon icono = new ImageIcon("images/imageno.jpg");
	                 JOptionPane.showMessageDialog(null, "You have to insert a Name!", "About", JOptionPane.INFORMATION_MESSAGE, icono);
	    		 }
	    		 else
	    			 JOptionPane.showMessageDialog(null, "Folder with the name "  + view.getFolderNameField().getText() + " created\n" + "Description: " + view.getFolderNameField().getText(), "About", JOptionPane.INFORMATION_MESSAGE, icon);
	    	}
	    });

		
		
		
	}
	
	
}
