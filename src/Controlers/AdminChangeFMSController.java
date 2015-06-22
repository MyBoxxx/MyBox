package Controlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;




import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import Entity.AdminChangeFMS_Entity;
import Entity.User_Entity;
import GUI_final.AdminAddPeopleToGroupFMS;
import GUI_final.AdminChangeFMS_GUI;
import GUI_final.Adminbar;
import GUI_final.Limitpeopleingroup;




public class AdminChangeFMSController extends AbstractTransfer {
	
	 AdminChangeFMS_Entity model;
	 AdminChangeFMS_GUI view;
	 Adminbar admin;
	 Limitpeopleingroup limit_view;
	 AdminAddPeopleToGroupFMS add_view;
	 AdminChangeFMS_Entity admin_entity = new AdminChangeFMS_Entity();
	 private String currentQuantity = new String();
	 int value ;
	
	
	
	//ActionListener Home;
	
	
	
	public AdminChangeFMSController(AdminChangeFMS_Entity model,
			AdminChangeFMS_GUI view){
		// TODO Auto-generated constructor stub\
		this.model = model;
		this.view = view;
		admin = new Adminbar();
		limit_view = view.getLimit();
		add_view = view.getAdd();
		
	}

	//public AdminChangeFMSController(AdminChangeFMS_Entity model2,
	//		AdminChangeFMS_GUI view2) {
	//	// TODO Auto-generated constructor stub
	//}

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
		
		limit_view.getGroupcomboBox().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 String selectedItem = (String) limit_view.getGroupcomboBox().getSelectedItem();
				if ( !selectedItem.equals("")){					
					if(!limit_view.getNewAmounText().getText().equals(""))
						limit_view.getBtnOk().setEnabled(true);
					else
						limit_view.getBtnOk().setEnabled(false);
				}
				
					
			}
		});
		
		
		limit_view.getGroupcomboBox().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JComboBox combo = (JComboBox)e.getSource();
				currentQuantity = (String)combo.getSelectedItem();
				//System.out.println("ggfgfg");
				admin_entity.setCurrentQuantity(currentQuantity);
				//System.out.println(admin_entity.getCurrentQuantity());
			}
		});
		
		
		view.getHomeButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
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
		
		/*add_view.getOkButton().setEnabled(false);	
		
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
		});	*/	
	
		
		///END //// LIMIT TAB
	}
	 public AdminChangeFMS_Entity getModel() {
		return model;
	}

	public void setModel(AdminChangeFMS_Entity model) {
		this.model = model;
	}

	public AdminChangeFMS_GUI getView() {
		return view;
	}

	public void setView(AdminChangeFMS_GUI view) {
		this.view = view;
	}

	public Adminbar getAdmin() {
		return admin;
	}

	public void setAdmin(Adminbar admin) {
		this.admin = admin;
	}

	public Limitpeopleingroup getLimit_view() {
		return limit_view;
	}

	public void setLimit_view(Limitpeopleingroup limit_view) {
		this.limit_view = limit_view;
	}

	public AdminAddPeopleToGroupFMS getAdd_view() {
		return add_view;
	}

	public void setAdd_view(AdminAddPeopleToGroupFMS add_view) {
		this.add_view = add_view;
	}

	public String getCurrentQuantity() {
		return currentQuantity;
	}

	public void setCurrentQuantity(String currentQuantity) {
		this.currentQuantity = currentQuantity;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void changed() {
		 String selectedItem = (String) add_view.getUserChoice().getSelectedItem();
	     if (limit_view.getNewAmounText().getText().equals("")){
	    	 
	       if (!selectedItem.equals(""))	 
	    	   add_view.getBtnOk().setEnabled(true);
	       else 
		    	 add_view.getBtnOk().setEnabled(false);
	     }
	   

	  }	 	
	
}	
