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

public class RequestToChangeGroupePremission_Controller extends AbstractTransfer{

	private   User_Entity model ;
	private  RequestToChangeGroupPermission view;

	GroupActions groupA;
	GroupAction_controller groupw;
	
	

	public RequestToChangeGroupePremission_Controller(User_Entity model, RequestToChangeGroupPermission view){
		this.model = model;
		this.view = view;
		
		
	

	}
		public void control(){
			view.getButtonCancel().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					groupA =new GroupActions();
					// TODO Auto-generated method stub
					groupw = new GroupAction_controller(MainClient.clien.currUser,groupA);
					view.dispose();
					groupA.setVisible(true);
					groupw.contol();
				}
			});
		}
	  
}
