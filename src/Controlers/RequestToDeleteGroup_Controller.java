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

public class RequestToDeleteGroup_Controller extends AbstractTransfer{

	private   User_Entity model ;
	private  RequestToDeleteGroup view;

	GroupActions groupA;
	
	GroupAction_controller groupw;
	
	

	public RequestToDeleteGroup_Controller(User_Entity model, RequestToDeleteGroup view){
		this.model = model;
		this.view =view;
	}
		public void control(){
			
			view.getB1Cancel().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub=
				groupA =new GroupActions();
				groupw = new GroupAction_controller(MainClient.clien.currUser,groupA);
				view.dispose();
				groupA.setVisible(true);
				groupw.contol();
			}
			});
		}
}
