package Entity;

import java.util.ArrayList;

import javax.swing.JTable;

public class SystemAdminRequestScree_List extends SystemAdminReequestScreen_Entity {
	
	private JTable table ;
	
	public  SystemAdminRequestScree_List(){
		
	}
	
	public JTable getListFromServer() {
		return table;
	}
	
	
	public void setListFromServer(JTable table) {
		this.table = table;
	}

	
	
}
