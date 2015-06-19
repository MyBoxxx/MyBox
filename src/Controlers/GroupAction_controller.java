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
import SampleTreeFileView.Controller;
import SampleTreeFileView.Main;
import SampleTreeFileView.Model;
import SampleTreeFileView.View;

public class GroupAction_controller extends AbstractTransfer{

	private  User_Entity model ;
	private  GroupActions view;
	

	//ActionListeners//
	ActionListener askListener;
	ActionListener requestchang;
	ActionListener reqtodelete;
	ActionListener backlistener;
	ActionListener editgroup;
	
	//Guis//
	EditGroup groupc;
	RequestToChangeGroupPermission changepremission;
	AskToJoinRemoveFromGroup ask;
	RequestToDeleteGroup delete;
	View treeView;
	Model modelView;
	
	//Controllers
	editGroup_Controller egc;
	AskToJoinRemoveFromGroupController atjrfgc;
	RequestToDeleteGroup_Controller rtdgc;
	RequestToChangeGroupePremission_Controller rtcgpc;
	Controller c;
	
	

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
				egc = new editGroup_Controller(MainClient.clien.currUser,groupc);
				view.dispose();
				groupc.setVisible(true);
				egc.control();
				
			}
		});  
		view.getRequestchang().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub=
				rtcgpc = new RequestToChangeGroupePremission_Controller(MainClient.clien.currUser,changepremission);
				view.dispose();
				changepremission.setVisible(true);
				rtcgpc.control();
			}
		});
		
	view.getAsk().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				atjrfgc = new AskToJoinRemoveFromGroupController(MainClient.clien.currUser,ask);
				view.dispose();
				ask.setVisible(true);
				atjrfgc.Control();
			}
		});
		
	view.getRequ2().addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			rtdgc = new RequestToDeleteGroup_Controller(MainClient.clien.currUser,delete);
			view.dispose();
			delete.setVisible(true);
			rtdgc.control();
		}
	});
	
	view.getBack().addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//view.dispose();
			treeView = new View();
			c = new Controller(model, treeView);
			treeView.setType(Type.NORMAL);
			treeView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			view.dispose();
			treeView.setVisible(true);
			//bla.contol();
		}
	});
		
	  }
	  
}

