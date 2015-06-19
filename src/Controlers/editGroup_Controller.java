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

import Client.MainClient;
import Entity.*;
import GUI_final.*;

public class editGroup_Controller extends AbstractTransfer{

	private static  User_Entity model ;
	private static  EditGroup view;
	GroupActions groupw;
	
	//Controllers
	GroupAction_controller groupA;

	editGroup_Controller(User_Entity model,EditGroup view){
		this.model = model;
		this.view = view;
		
	}
	
	public void control(){
		
		view.getB5Cancel().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				groupw=new GroupActions();
				groupA = new GroupAction_controller(MainClient.clien.currUser,groupw);
				view.dispose();
				groupw.setVisible(true);
				groupA.contol();
			}
		});
	
		
		
	}
	
	
}
