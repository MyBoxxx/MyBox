package Controlers;
import java.awt.EventQueue; 

import GUI_final.*;

public class TestYaron {

	public static void main(String[] args) {
		RequesrToChangeGroupPermission theview = new RequesrToChangeGroupPermission();
		RequestToChangeGroupePremission_Controller thecontroller =new RequestToChangeGroupePremission_Controller(theview);
		theview.getFrmRequstToChange().setVisible(true);
		
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
