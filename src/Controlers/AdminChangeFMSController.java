package Controlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;




import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import Entity.User_Entity;
import GUI_final.AdminChangeFMS_GUI;
import GUI_final.Adminbar;
import GUI_final.Limitpeopleingroup;



public class AdminChangeFMSController extends AbstractTransfer {
	
	 User_Entity model;
	 AdminChangeFMS_GUI view;
	 Adminbar admin;
	 Limitpeopleingroup limit_view;
	 
	
	
	
	//ActionListener Home;
	
	AdminChangeFMSController(User_Entity model, AdminChangeFMS_GUI view){
		this.model = model;
		this.view = view;
		admin = new Adminbar();
		limit_view = view.getLimit();
	}	
	
	public void control(){
		//MainClient.clien.setCurrController(this);
		limit_view.getBtnOk().setEnabled(false);
	
		limit_view.getNewAmounText().getDocument().addDocumentListener(new DocumentListener() {		

			@Override
			public void changedUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
				changed();
			}

			@Override
			public void insertUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
				changed();
			}

			@Override
			public void removeUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
				changed();
			}
		}); 
		
		limit_view.getChoice().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 String selectedItem = (String) limit_view.getChoice().getSelectedItem();
				if ( !selectedItem.equals("")){					
					if(!limit_view.getNewAmounText().getText().equals(""))
						limit_view.getBtnOk().setEnabled(true);
					else
						limit_view.getBtnOk().setEnabled(false);
				}
				
					
			}
		});
		
		view.getHomeButton().addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {				
				view.setVisible(false);
				admin.setVisible(true);				
				
			}
		});						
		
	}
	 public void changed() {
		 String selectedItem = (String) limit_view.getChoice().getSelectedItem();
	     if (limit_view.getNewAmounText().getText().equals("")){
	    	 
	       if (!selectedItem.equals(""))	 
	    	   limit_view.getBtnOk().setEnabled(true);
	       else 
		    	 limit_view.getBtnOk().setEnabled(false);
	     }
	   

	  }
	
	
}	
