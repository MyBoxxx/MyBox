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

public class GroupAction_controller extends AbstractTransfer{

	private   User_Entity model ;
	private  GroupActions view;

	
	ActionListener askListener;
	ActionListener requestchang;
	ActionListener reqtodelete;
	ActionListener backlistener;
	ActionListener editgroup;
	EditGroup groupc;
	RequestToChangeGroupPermission changepremission;
	AskToJoinRemoveFromGroup ask;
	RequestToDeleteGroup delete;
	
	

	public GroupAction_controller(User_Entity model,GroupActions view){
		this.model = model;
		this.view = view;
	groupc =new EditGroup();
	changepremission = new RequestToChangeGroupPermission();
	ask =new AskToJoinRemoveFromGroup();
	delete = new RequestToDeleteGroup();
	}
	public void setvisible()
	{
		this.view.setVisible(true);
	}
	
	  public void contol()
	  { 
		view.getEdit().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				view.setVisible(false);
				groupc.setVisible(true);
				
			}
		});  
		view.getRequestchang().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				view.setVisible(false);
				changepremission.setVisible(true);
			}
		});
		
	view.getAsk().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				view.setVisible(false);
				ask.setVisible(true);
			}
		});
		
	view.getRequ2().addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			view.setVisible(false);
			delete.setVisible(true);
		}
	});
		
	  }
	  
}

