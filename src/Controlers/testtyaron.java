package Controlers;
import java.net.MalformedURLException;

import Entity.Settings_Entity;
import Entity.SystemadminReequestScreen_Entity;
import GUI_final.*;

public class testtyaron {

	private static Settings_Entity model;
	private static Settings_GUI view; 
	
	
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		model = new Settings_Entity();
		view = new Settings_GUI();
		Settings_Controller conctroller = new Settings_Controller(model, view);
		
		conctroller.control();
		
		view.setVisible(true);
		
	}

}
