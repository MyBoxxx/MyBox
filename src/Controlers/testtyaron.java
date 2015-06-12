package Controlers;
<<<<<<< HEAD
import Entity.SystemadminReequestScreen_Entity;
import GUI_final.*;

public class testtyaron {

	private static SystemadminReequestScreen_Entity model;
	private static SysAdminRequesrScreen view; 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		model = new SystemadminReequestScreen_Entity();
		view = new SysAdminRequesrScreen();
		SystemAdminRequestsScreen_Controller conctroller = new SystemAdminRequestsScreen_Controller(model, view);
=======
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
>>>>>>> refs/heads/master
		
		conctroller.control();
		
		view.setVisible(true);
		
	}

}
