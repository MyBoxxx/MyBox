package Controlers;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Entity.adminRequestModel;
import GUI_final.AdminAddPeopleToGroup;
import GUI_final.AdminChangePermission;
import GUI_final.AdminCreateGroup;
import GUI_final.AdminDeletePeopleToGroup;
import GUI_final.AdminRequest;
import GUI_final.Adminbar;

public class AdminRequestController extends AbstractTransfer {
	
	AdminRequest view;
	adminRequestModel model;
	Adminbar adminbar_view;
	
	AdminAddPeopleToGroup admin_add;
	AdminDeletePeopleToGroup admin_del;
	AdminChangePermission admin_ch;
	AdminCreateGroup admin_cr;
	
	public AdminRequestController(AdminRequest view,adminRequestModel model ){
		this.view = view;
		this.model = model;			
		adminbar_view = new Adminbar();
	}
		
	public void control(){
		
		 view.getBtnBack().addMouseListener(new MouseAdapter() {
	        	@Override
	        	public void mouseClicked(MouseEvent e) {
	        		view.setVisible(false);
	        		adminbar_view.setVisible(true);
	        	}
	        });
		
		 view.getScrollPane().getViewport().setBackground(java.awt.Color.WHITE);
	        
	       view.getTable().addMouseListener(new java.awt.event.MouseAdapter() {
	            @Override
	            public void mouseClicked(java.awt.event.MouseEvent e) {            	
	                int row = view.getTable().rowAtPoint(e.getPoint());
	                int column = view.getTable().columnAtPoint(e.getPoint());
	                if (row >= 0 && column >= 0) {  	                	
	                	String group = "";
	                	String user = "";                   
	                    group = group + " " + view.getTable().getValueAt(row, column).toString();                   
	                    String[] splited = group.split("\\s+");                    
	                    user = user + " " + view.getTable().getValueAt(row , column + 2).toString();                 
	                    if (group.startsWith(" Add")){ 	                    	
	                    	if (admin_add == null){	                    		
	                    		admin_add = new AdminAddPeopleToGroup(splited[2],user); 	
	                    		admin_add.init(splited[2],user); 
	                    	}
	                    	else
	                    		admin_add.toFront();                    	
	                    	              	
	                    }
	                    
	                    if (group.startsWith(" Rem")){  
	                    	if(admin_del == null){
		                    	admin_del = new AdminDeletePeopleToGroup(splited[2],user); 
		                    	admin_del.init(splited[2],user); 
	                    	}
	                    	else
	                    		admin_del.toFront();                		
	                    		                    	
	                    }
	                    
	                    if (group.startsWith(" Cha")){
	                    	if (admin_ch == null){
		                    	admin_ch = new AdminChangePermission(splited[2], user,splited[3], splited[4]);
		                    	admin_ch.init(splited[2], user,splited[3], splited[4]);
	                    	}
	                    	else
	                    		admin_ch.toFront();
	                    }
	                    
	                    if(group.startsWith(" Cre")){
	                    	if(admin_cr == null){
		                    	admin_cr = new AdminCreateGroup(splited[2], user);
		                    	admin_cr.init(splited[2], user);
	                    	}
	                    	else
	                    		admin_cr.toFront();
	                    }                    
	                                      
	                 }
	            }
	        });
		
	}

}
