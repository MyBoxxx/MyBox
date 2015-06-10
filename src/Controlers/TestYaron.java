package Controlers;
import java.awt.EventQueue; 

import GUI_final.*;
import Entity.*;

public class TestYaron {

	public static void main(String[] args) {
		RequestToDeleteGroup theview = new RequestToDeleteGroup();
		//Group_Entity themodel =new Group_Entity();  
		RequestToDeleteGroup_Controller thecontroller =new RequestToDeleteGroup_Controller(theview);
		theview.getFrame().setVisible(true);
	
	}
}
