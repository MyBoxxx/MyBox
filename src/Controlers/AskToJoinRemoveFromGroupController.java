package Controlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ResourceBundle.Control;

import javax.swing.JOptionPane;

import Client.MainClient;
import Controlers.AddPeopleToGroupController.cancelListnerer;
import Controlers.AddPeopleToGroupController.okListner;
import Entity.Group_Entity;
import Entity.User_Entity;
import GUI_final.Adminbar;
import GUI_final.AskToJoinRemoveFromGroup;
import GUI_final.GroupActions;

public class AskToJoinRemoveFromGroupController {
	
	private  User_Entity model ;
	private  AskToJoinRemoveFromGroup view;
	private GroupActions groupA;
	private GroupAction_controller groupw;
	
	AskToJoinRemoveFromGroupController(User_Entity model,AskToJoinRemoveFromGroup view){
		this.model = model;
		this.view = view;
		groupA = new GroupActions();
	}
	
	public void Control(){
			
			view.getBtCacel().addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					groupA=new GroupActions();
					groupw = new GroupAction_controller(MainClient.clien.currUser,groupA);
					view.dispose();
					groupA.setVisible(true);
					groupw.contol();
				}
			});
		}
}
