package Controlers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JTable;

import Client.MainClient;
import Entity.GetNotification_Entity;
import Entity.SetNotification_Entity;
import GUI_final.Notification;

public class Notification_Controller extends AbstractTransfer {
	
	Notification view;
	GetNotification_Entity model;
	
	int row;
	int column;
	boolean flag;
	
	
	public Notification_Controller( GetNotification_Entity model,Notification view){
		this.view = view;
		this.model = model;
	}
	
	
	public void control(){
		//change from 0 to Unread
		
		for (int i = 0; i < view.getTable().getRowCount(); i++)
		       {
			if (view.getTable().getValueAt(i, 2).equals(0))		          
				{
				view.getTable().setValueAt("Unread", i, 2);
				}
			else	
				{
				view.getTable().setValueAt("Read", i, 2);		
				}
		       }
		
		
	    
	      
	       view.getBtnBack().addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				sendToServer(new SetNotification_Entity(MainClient.clien.getCurrUser())); 
				view.setVisible(false);
			}
		});
		
		
	}


	public void populate(GetNotification_Entity message) {
		view.getTable().setModel(message.getFileTable());
		view.revalidate();
		
	}
}
