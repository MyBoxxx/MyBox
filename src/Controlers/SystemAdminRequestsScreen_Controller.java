package Controlers;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTable;

import Client.MainClient;
import Entity.SystemAdminReequestScreen_Entity;
import Entity.SystemAdminRequestScree_List;
import GUI_final.SysAdminRequesrScreen;


public class SystemAdminRequestsScreen_Controller extends AbstractTransfer {
<<<<<<< HEAD
	static SystemAdminReequestScreen_Entity model ;
	static SysAdminRequesrScreen view;
	
	static SystemAdminRequestScree_List List_entity;
	
	ActionListener loginActionListener ;
	ActionListener forgotActionListener ;
	
	SystemAdminRequestsScreen_Controller(SystemAdminReequestScreen_Entity model,SysAdminRequesrScreen view){
		this.model = model;
		this.view = view;
		view.getTable().setVisible(true);
		view.setBounds(100, 100, 800, 600);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		view.setLocation(dim.width/2-view.getSize().width/2, dim.height/2-view.getSize().height/2);
		view.setVisible(true);
	}
	
	public void control(){
		MainClient.clien.setCurrController(this); // Set The Current Controller to this
		view.setTable(new JTable());
		SendRefreshList(); 	
		//request the list
		
		view.getBtnReset().addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			view.getRbaccept().setSelected(false);
			view.getRbreject().setSelected(false);
			model.setStatus(0);
			}
		});
		
		view.getBeckbutton().addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				//////to do a back  step to the admin screen////
			}
		});
		
		view.getSendButton().addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
			if (model.getName()!=null && model.getRequestID()!=-1 && model.getStatus()!=-1)
				sendToServer(model);
		//////to do a back  step to the admin screen////
			}
		});
		
		view.getTable().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int selectedRow = view.getTable().getSelectedRow();
		    	Object ID = view.getTable().getValueAt(selectedRow, 0);
		    	Object Name = view.getTable().getValueAt(selectedRow, 1);
		    	model.setRequestID((int) ID);
		    	model.setName((String) Name);
			}
		});
		
		view.getRbaccept().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				view.getRbreject().setSelected(false);
				model.setStatus(1);
			}
		});
		
		view.getRbreject().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				view.getRbaccept().setSelected(false);
				model.setStatus(2);
			}
		});
		
		}

	private void SendRefreshList() {
		List_entity = new  SystemAdminRequestScree_List();
		sendToServer(List_entity);
	}
	
	public void refreshList(){
		view.setTable(List_entity.getListFromServer());
	}	
=======
	 SystemAdminReequestScreen_Entity model ;
	 SysAdminRequesrScreen view;
	
	ActionListener loginActionListener ;
	ActionListener forgotActionListener ;
	
	SystemAdminRequestsScreen_Controller(SystemAdminReequestScreen_Entity model,SysAdminRequesrScreen view){
		this.model = model;
		this.view = view;
		view.getTable().setVisible(true);
		view.setBounds(100, 100, 800, 600);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		view.setLocation(dim.width/2-view.getSize().width/2, dim.height/2-view.getSize().height/2);
		view.setVisible(true);
	}
	
	public void control(){
		MainClient.clien.setCurrController(this); // Set The Current Controller to this	
		SendRefreshList();
		//request the list
		
		view.getBtnLoad().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SendRefreshList();		
			}
		});
		view.getBtnReset().addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			view.getRbaccept().setSelected(false);
			view.getRbreject().setSelected(false);
			model.setStatus(0);
			}
		});
		
		view.getBeckbutton().addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				// TODO Auto-generated method stub
				
				//////to do a back  step to the admin screen////
			}
		});
		
		view.getSendButton().addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {

			if (model.getName()!=null && model.getRequestID()!=-1 && model.getStatus()!=-1)
				sendToServer(model);
		//////to do a back  step to the admin screen////
			}
		});
		
		view.getTable().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int selectedRow = view.getTable().getSelectedRow();
		    	Object ID = view.getTable().getValueAt(selectedRow, 0);
		    	Object Name = view.getTable().getValueAt(selectedRow, 1);
		    	model.setRequestID((int) ID);
		    	model.setName((String) Name);
			}
		});
		
		view.getRbaccept().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				view.getRbreject().setSelected(false);
				model.setStatus(1);
			}
		});
		
		view.getRbreject().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				view.getRbaccept().setSelected(false);
				model.setStatus(2);
			}
		});
		
		}

	private void SendRefreshList() {
		
		sendToServer(model);
	}
	
	public void refreshList(){
		view.getTable().setModel(model.getTablemodel());
		view.getTable().repaint();
		}

	public void setModel(SystemAdminReequestScreen_Entity message) {
		// TODO Auto-generated method stub
		this.model = message;
	}	
	

>>>>>>> refs/heads/master
		
	}


