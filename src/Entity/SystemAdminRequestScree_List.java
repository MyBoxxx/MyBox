package Entity;

import java.util.ArrayList;

public class SystemAdminRequestScree_List extends Abstract_Entity {
	
	private ArrayList<SystemAdminReequestScreen_Entity> ListFromServer ;
	
	public  SystemAdminRequestScree_List(){
		ListFromServer = new ArrayList<SystemAdminReequestScreen_Entity>();
	}
	
	public ArrayList<SystemAdminReequestScreen_Entity> getListFromServer() {
		return ListFromServer;
	}
	
	
	
	public void setListFromServer(
			ArrayList<SystemAdminReequestScreen_Entity> listFromServer) {
		ListFromServer = listFromServer;
	}

	
	
}
