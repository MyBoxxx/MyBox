package Controlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import Client.MainClient;
import Entity.AdminAddPeopleFMS_Entity;
import Entity.Adminbar_model;
import Entity.LoadGroup_Entity;
import GUI_final.AdminAddPeopleToGroupFMS;
import GUI_final.Adminbar;

public class AddPeopleFMS_Controller extends AbstractTransfer {
	
	private AdminAddPeopleFMS_Entity model;
	private AdminAddPeopleToGroupFMS view;
	
	//GUI's
	Adminbar mainAdmin;
	
	//Controller's
	AdminBar_Controller controlAdmin;
	
	//Model's
	Adminbar_model adminModels;

	public AddPeopleFMS_Controller(AdminAddPeopleFMS_Entity model,AdminAddPeopleToGroupFMS view) {
		super();
		this.model = model;
		this.view = view;
		mainAdmin = new Adminbar();
	}


public void control(){
	
	MainClient.clien.setCurrController(this); // Set The Current Controller to this	
	 
	sendToServer(new LoadGroup_Entity(6,MainClient.clien.currUser));
	
	sendToServer(new AdminAddPeopleFMS_Entity());
	
	view.getButtonCancel().addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			view.setVisible(false);
			controlAdmin = new AdminBar_Controller(adminModels , mainAdmin);
			controlAdmin.control();
			mainAdmin.setVisible(true);;
		}
	});
	
	view.getBtnOk().addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			AdminAddPeopleFMS_Entity aap=new AdminAddPeopleFMS_Entity();
			aap.setName(view.getUserChoice().getSelectedItem().toString());
			aap.setGroup(view.getGroupChoice().getSelectedItem().toString());
			sendToServer(aap);
			
			
			
			JOptionPane.showMessageDialog(null, "add seccessfully");
		}
	});

}


public void FillGroup(LoadGroup_Entity ent) {
	// TODO Auto-generated method stub
	List<String> ls = ent.getGroups();
	view.getGroupChoice().setModel(new DefaultComboBoxModel<Object>(ls.toArray()));
}


public void Filluser(AdminAddPeopleFMS_Entity ent) {
	// TODO Auto-generated method stub
	List<String> ls = ent.getNames();
	view.getUserChoice().setModel(new DefaultComboBoxModel<Object>(ls.toArray()));
}

}