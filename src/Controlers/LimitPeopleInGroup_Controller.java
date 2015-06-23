package Controlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import Client.MainClient;
import Entity.Adminbar_model;
import Entity.LimitPeopleInGroup_Entity;
import Entity.LoadGroup_Entity;
import GUI_final.Adminbar;
import GUI_final.Limitpeopleingroup;

public class LimitPeopleInGroup_Controller extends AbstractTransfer {
	
	private Limitpeopleingroup view;
	private LimitPeopleInGroup_Entity model;
	LimitPeopleInGroup_Entity Lp;
	
	//GUI's
	Adminbar mainAdmin;
	
	//Controller's
	AdminBar_Controller controlAdmin;
	
	//Model's
	Adminbar_model adminModels;
	
	public LimitPeopleInGroup_Controller(Limitpeopleingroup view,LimitPeopleInGroup_Entity model) {
		super();
		this.view = view;
		this.model = model;
		mainAdmin = new Adminbar();
	}
	
	public void control(){
		
		MainClient.clien.setCurrController(this); // Set The Current Controller to this	
		 
		sendToServer(new LoadGroup_Entity(5,null));
		
		view.getBtnCancel().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.setVisible(false);
				controlAdmin = new AdminBar_Controller(adminModels , mainAdmin);
				controlAdmin.control();
				mainAdmin.setVisible(true);;
			}
		});
		
		view.getGroupcomboBox().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			   Lp=new LimitPeopleInGroup_Entity();
				String s =view.getGroupcomboBox().getSelectedItem().toString();
				Lp.setName(s);
				sendToServer(Lp);
				view.getCuurenttextField().setText((String)Lp.getName());
				
				}
		});
		
		view.getBtnOk().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Lp.setNewAmount(Integer.parseInt(view.getNewAmounText().getText()));
				if(Lp.getNewAmount()>0){
				sendToServer(Lp);
				JOptionPane.showMessageDialog(null, "update seccessfully");
			}
				else JOptionPane.showMessageDialog(null, "illigal value");
				}
			
				
		});	
		
		
	}

	public void FillGroup(LoadGroup_Entity ent) {
		// TODO Auto-generated method stub
		List<String> ls = ent.getGroups();
		view.getGroupcomboBox().setModel(new DefaultComboBoxModel<Object>(ls.toArray()));
		
	}
	
	
}
