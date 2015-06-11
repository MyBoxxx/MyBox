package Controlers;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Entity.SystemadminReequestScreen_Entity;
import GUI_final.SysAdminRequesrScreen;


public class SystemAdminRequestsScreen_Controller extends AbstractTransfer {
	static SystemadminReequestScreen_Entity model ;
	static SysAdminRequesrScreen view;
	
	ActionListener loginActionListener ;
	ActionListener forgotActionListener ;
	
	SystemAdminRequestsScreen_Controller(SystemadminReequestScreen_Entity model,SysAdminRequesrScreen view){
		this.model = model;
		this.view = view;
		view.setBounds(100, 100, 800, 600);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		view.setLocation(dim.width/2-view.getSize().width/2, dim.height/2-view.getSize().height/2);
		view.setVisible(true);
	}
	
	public void control(){
		
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
		
		
		
	}


