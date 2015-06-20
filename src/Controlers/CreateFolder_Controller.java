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

import Client.MainClient;
import Entity.*;
import GUI_final.*;

public class CreateFolder_Controller extends AbstractTransfer{

	private static  MyFile model ;
	private static  CreateFolderScreen view;

	

	public CreateFolder_Controller(MyFile model,CreateFolderScreen view){
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
	    			 if(view.getItemNameField().getText().equals("")) JOptionPane.showMessageDialog(null, "You have to insert a Name!", "About", JOptionPane.INFORMATION_MESSAGE, icono);
	    			 else{
	                 CreateDirectory dir = new CreateDirectory();
	                 dir.getMyDir().setFileName(view.getItemNameField().getText());
	                 dir.getMyDir().setPath(model.getPath());
	                 if(view.getItemDescriptionField().getText().equals("") == false) dir.getMyDir().setDescription(view.getItemDescriptionField().getText());
	                 dir.setUser(MainClient.clien.currUser);
	                 sendToServer(dir);
	                 view.dispose();
	    			 }
	    		 }
	    		 else
	    			 JOptionPane.showMessageDialog(null, "Folder with the name "  + view.getItemNameField().getText() + " created\n" + "Description: " + view.getItemNameField().getText(), "About", JOptionPane.INFORMATION_MESSAGE, icon);
	    	}
	    });

		
		
		
	}
	
	
}
