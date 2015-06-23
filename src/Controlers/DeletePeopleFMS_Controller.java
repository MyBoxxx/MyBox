package Controlers;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import Client.MainClient;
import Entity.AdminAddPeopleFMS_Entity;
import Entity.AdminDeletePeopleFMS_Entity;
import Entity.Adminbar_model;
import Entity.LoadGroup_Entity;
import GUI_final.AdminAddPeopleToGroupFMS;
import GUI_final.AdminDeletePeopleToGroupFMS;
import GUI_final.Adminbar;

public class DeletePeopleFMS_Controller extends AbstractTransfer {
	private AdminDeletePeopleFMS_Entity model;
	private AdminDeletePeopleToGroupFMS view;
	private	AdminDeletePeopleFMS_Entity ad=new AdminDeletePeopleFMS_Entity();
	
	//GUI's
	Adminbar mainAdmin;
	
	//Controller's
	AdminBar_Controller controlAdmin;
	
	//Model's
	Adminbar_model adminModels;

	public DeletePeopleFMS_Controller(AdminDeletePeopleFMS_Entity model,AdminDeletePeopleToGroupFMS view) {
		super();
		this.model = model;
		this.view = view;
		mainAdmin = new Adminbar();
	}


public void control(){
	MainClient.clien.setCurrController(this); // Set The Current Controller to this	
	 
	sendToServer(new LoadGroup_Entity(7,MainClient.clien.currUser));
	
	
	
	view.getButtonCancel().addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			view.setVisible(false);
			controlAdmin = new AdminBar_Controller(adminModels , mainAdmin);
			controlAdmin.control();
			mainAdmin.setVisible(true);;
		}
	});
	view.getGroupChoice().addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			view.getUserChoice().setEnabled(true);
			ad.setName(view.getGroupChoice().getSelectedItem().toString());
			sendToServer(ad);
		}
	});
	view.getButtonOk().addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			ad.setGroup(view.getGroupChoice().getSelectedItem().toString());
			ad.setId(1);
			sendToServer(ad);
			JOptionPane.showMessageDialog(null, "user Delete");
		}
	});

}


public void FillGroup(LoadGroup_Entity ent) {
	// TODO Auto-generated method stub
	List<String> ls = ent.getGroups();
	view.getGroupChoice().setModel(new DefaultComboBoxModel<Object>(ls.toArray()));
}


public void Filluser(AdminDeletePeopleFMS_Entity ent) {
	// TODO Auto-generated method stub
	List<String> ls = ent.getNames();
	view.getUserChoice().setModel(new DefaultComboBoxModel<Object>(ls.toArray()));
	
}
}
