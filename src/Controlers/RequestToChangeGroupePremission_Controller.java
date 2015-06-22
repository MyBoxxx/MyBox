package Controlers;

import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.net.MalformedURLException;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
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
			
			MainClient.clien.setCurrController(this); // Set The Current Controller to this	
			 
			sendToServer(new LoadGroup_Entity(1,MainClient.clien.currUser));
			
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
			
			view.getRAdioRead().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(view.getRAdioRead().isSelected())
						view.getButtonSend().setEnabled(true);
					else if(!view.getRAdioRead().isSelected() && !view.getRawrite().isSelected())
						view.getButtonSend().setEnabled(false);
				}
			});
			
			view.getRawrite().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(view.getRawrite().isSelected())
						view.getButtonSend().setEnabled(true);
					else if(!view.getRawrite().isSelected() && !view.getRAdioRead().isSelected())
						view.getButtonSend().setEnabled(false);
				}
			});
		view.getButtonSend().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(view.getRAdioRead().isSelected()==true && view.getRawrite().isSelected()==true)
				{	Request_Entity re =new Request_Entity(MainClient.clien.currUser, 6);
				re.setUser(MainClient.clien.currUser);
				re.setChooise(view.getComboBox().getSelectedItem().toString());
				if (re.getChooise().equals(null)==false)
					sendToServer(re);
			}
				
				if(view.getRAdioRead().isSelected()==true && view.getRawrite().isSelected()==false)
				{	Request_Entity re =new Request_Entity(MainClient.clien.currUser, 4);
				re.setUser(MainClient.clien.currUser);
				re.setChooise(view.getComboBox().getSelectedItem().toString());
				if (re.getChooise().equals(null)==false)
					sendToServer(re);
			}
				if(view.getRAdioRead().isSelected()==false && view.getRawrite().isSelected()==true)
				{	Request_Entity re =new Request_Entity(MainClient.clien.currUser, 5);
				re.setUser(MainClient.clien.currUser);
				re.setChooise(view.getComboBox().getSelectedItem().toString());
				if (re.getChooise().equals(null)==false)
					sendToServer(re);
			}
				}
			
		});
		}
		public void FillGroup(LoadGroup_Entity ent) {
			// TODO Auto-generated method stub
			List<String> ls = ent.getGroups();
			view.getComboBox().setModel(new DefaultComboBoxModel<Object>(ls.toArray()));
		}
	  
}
