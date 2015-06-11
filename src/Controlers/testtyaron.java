package Controlers;

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
		
		conctroller.control();
		
		view.setVisible(true);


}
}
