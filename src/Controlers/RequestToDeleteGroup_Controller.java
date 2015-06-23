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
import SampleTreeFileView.Main;

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
			//MainClient.clien.setCurrController(this); // Set The Current Controller to this	
			 
			sendToServer(new LoadGroup_Entity(1,MainClient.clien.currUser));
			
			view.getB1Cancel().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				view.setVisible(false);
			}
			});
	
			view.getB1Ok().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					view.getAreUSure().setVisible(true);
					view.getAskTo().setVisible(false);
				}
			});
			
			
			view.getB2Send().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Request_Entity re =new Request_Entity(MainClient.clien.currUser, 3);
					re.setUser(MainClient.clien.currUser);
					re.setChooise(view.getChoiceGroup().getSelectedItem().toString());
					if (re.getChooise().equals(null)==false)
					sendToServer(re);
					
				}
			});
		}
		public void FillGroup(LoadGroup_Entity ent) {
			List<String> ls = ent.getGroups();
			view.getChoiceGroup().setModel(new DefaultComboBoxModel<Object>(ls.toArray()));
		}
}
