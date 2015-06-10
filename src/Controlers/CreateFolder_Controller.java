package Controlers;

import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.net.MalformedURLException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Entity.*;
import GUI_final.*;

public class CreateFolder_Controller {

	private static  File model ;
	private static  CreateFolderScreen view;

	
	ActionListener loginActionListener ;
	ActionListener forgotActionListener ;
	

	public CreateFolder_Controller(File model,CreateFolderScreen view){
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
	    		 if (view.getItemNameField().getText().equals("") || view.getBg().getSelection() == null )
	    		 {
	    			 final ImageIcon icono = new ImageIcon("images/imageno.jpg");
	    			 if(view.getBg().getSelection() == null) JOptionPane.showMessageDialog(null, "You have to choose File / Folder!", "About", JOptionPane.INFORMATION_MESSAGE, icono); 
	                 if(view.getItemNameField().getText().equals(""))JOptionPane.showMessageDialog(null, "You have to insert a Name!", "About", JOptionPane.INFORMATION_MESSAGE, icono);
	    		 }
	    		 else
	    			 JOptionPane.showMessageDialog(null, "Folder with the name "  + view.getItemNameField().getText() + " created\n" + "Description: " + view.getItemNameField().getText(), "About", JOptionPane.INFORMATION_MESSAGE, icon);
	    	}
	    });

		
		
		
	}
	
	
}
