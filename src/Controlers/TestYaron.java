package Controlers;
import java.awt.EventQueue; 

import Entity.User_Entity;
import GUI_final.*;

public class TestYaron {

	public static void main(String[] args) {
		/*RequesrToChangeGroupPermission theview = new RequesrToChangeGroupPermission();
		RequestToChangeGroupePremission_Controller thecontroller =new RequestToChangeGroupePremission_Controller(theview);
		theview.getFrmRequstToChange().setVisible(true);*/
		
		AddPeopleToGroup theview = new AddPeopleToGroup ();
		User_Entity themodel = new User_Entity();
		AddPeopleToGroupController  thecontroller = new AddPeopleToGroupController(themodel,theview);
		theview.setVisible(true);
		
	/*	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RequesrToChangeGroupPermission window = new RequesrToChangeGroupPermission();
					window.frmRequstToChange.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});*/
	}
}
