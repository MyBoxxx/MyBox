package Controlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;
import javax.swing.JPanel;




import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import Entity.User_Entity;
import GUI_final.AdminAddPeopleToGroup;
import GUI_final.AdminChangeFMS_GUI;
import GUI_final.Adminbar;
import GUI_final.Limitpeopleingroup;



public class AdminChangeFMSController extends AbstractTransfer {
	
	 User_Entity model;
	 AdminChangeFMS_GUI view;
	 Adminbar admin;
	 Limitpeopleingroup limit_view;
	 AdminAddPeopleToGroup add_view;
	 
	
	
	
	//ActionListener Home;
	
	AdminChangeFMSController(User_Entity model, AdminChangeFMS_GUI view){
		this.model = model;
		this.view = view;
		admin = new Adminbar();
		limit_view = view.getLimit();
		add_view = view.getAdd();
	}	
	
	public void control(){
		//MainClient.clien.setCurrController(this);
		///////LIMIT TAB
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
		
		limit_view.getBtnOk().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if ( limit_view.getBtnOk().isEnabled()){
					JOptionPane.showMessageDialog(null,"thnaks");
				}
					
			}
		});
		
		limit_view.getBtnCancel().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (limit_view.getBtnOk().isEnabled()){
				view.setVisible(false);
				admin.setVisible(true);	
				}
			}
		});
		
		///END ///////LIMIT TAB
		
		
		///ADD TAB
		
		add_view.getOkButton().setEnabled(false);	
		
		add_view.getChoose_user().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 String selectedItem = (String) add_view.getChoose_user().getSelectedItem();
				if ( !selectedItem.equals("")){	
					add_view.getOkButton().setEnabled(true);
				}
				
					
			}
		});		
		
		add_view.getChoiceGroup().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				 String selectedItem = (String) add_view.getChoiceGroup().getSelectedItem();
					if ( !selectedItem.equals("")){	
						add_view.getOkButton().setEnabled(true);
					}
			}
		});
		
		add_view.getOkButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if ( add_view.getOkButton().isEnabled()){
					JOptionPane.showMessageDialog(null,"thnaks");
				}
					
			}
		});		
	
		
		///END //// LIMIT TAB
	}
	 public void changed() {
		 String selectedItem = (String) add_view.getChoose_user().getSelectedItem();
	     if (limit_view.getNewAmounText().getText().equals("")){
	    	 
	       if (!selectedItem.equals(""))	 
	    	   add_view.getOkButton().setEnabled(true);
	       else 
		    	 add_view.getOkButton().setEnabled(false);
	     }
	   

	  }	 	
	
}	
