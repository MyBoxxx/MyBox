package Controlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle.Control;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import Client.MainClient;
import Controlers.AddPeopleToGroupController.cancelListnerer;
import Controlers.AddPeopleToGroupController.okListner;
import Entity.Group_Entity;
import Entity.LoadGroup_Entity;
import Entity.Request_Entity;
import Entity.User_Entity;
import GUI_final.Adminbar;
import GUI_final.AskToJoinRemoveFromGroup;
import GUI_final.GroupActions;

public class AskToJoinRemoveFromGroupController extends AbstractTransfer {
	
	private  User_Entity model ;
	private  AskToJoinRemoveFromGroup view;
	private GroupActions groupA;
	private GroupAction_controller groupw;
	private boolean jselected=false;
	private boolean rselected=false;
	
	AskToJoinRemoveFromGroupController(User_Entity model,AskToJoinRemoveFromGroup view){
		this.model = model;
		this.view = view;
		groupA = new GroupActions();
	}
	
	public void Control(){
		MainClient.clien.setCurrController(this); // Set The Current Controller to this	
		 
		sendToServer(new LoadGroup_Entity(2,MainClient.clien.currUser));
		
			view.getBtCacel().addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					groupA=new GroupActions();
					groupw = new GroupAction_controller(MainClient.clien.currUser,groupA);
					view.dispose();
					groupA.setVisible(true);
					groupw.contol();
				}
			});
		
			
		view.getBtRequest().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Request_Entity re =new Request_Entity(MainClient.clien.currUser, 0);
				re.setUser(MainClient.clien.currUser);
				re.setChooise(view.getChoiceGroup().getSelectedItem().toString());
				jselected = view.getRbjoin().isSelected();
				rselected = view.getRbremove().isSelected();
				if(jselected==true && rselected==false)
					re.setRadio(1);
				else if (jselected==false && rselected==true)
					re.setRadio(2);
				sendToServer(re);
			}
		});
		
		
		
		}
	
	
	public void FillGroup(LoadGroup_Entity ent)
	{
		List<String> ls = ent.getGroups();
		view.getChoiceGroup().setModel(new DefaultComboBoxModel<Object>(ls.toArray()));
	//	view.setChoiceGroup(array);
	}

}
