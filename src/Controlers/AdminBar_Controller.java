package Controlers;

import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.util.jar.JarOutputStream;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Entity.AdminAddPeopleFMS_Entity;
import Entity.AdminChangeFMS_Entity;
import Entity.AdminDeletePeopleFMS_Entity;
import Entity.Adminbar_model;
import Entity.LimitPeopleInGroup_Entity;
import Entity.adminRequestModel;
import GUI_final.AdminAddPeopleToGroupFMS;
import GUI_final.AdminDeletePeopleToGroupFMS;
import GUI_final.AdminRequest;
import GUI_final.Adminbar;
import GUI_final.Limitpeopleingroup;



public class AdminBar_Controller {

	private  Adminbar_model model ;
	private  Adminbar view;
	private AdminRequest requests;
	//private AdminChangeFMS_GUI adminChange;
	
	//GUIs
	Limitpeopleingroup limit;
	AdminDeletePeopleToGroupFMS admin_del;
	AdminAddPeopleToGroupFMS admin_add;
	
	//Controller's
	LimitPeopleInGroup_Controller controlLimit;
	DeletePeopleFMS_Controller controlDelete;
	AddPeopleFMS_Controller controlAdd;
	
	
	// Entity's
	LimitPeopleInGroup_Entity LimitEnt;
	AdminDeletePeopleFMS_Entity deleteEnt;
	AdminAddPeopleFMS_Entity addEnt;
	
	
	
	
	public AdminBar_Controller(Adminbar_model model,Adminbar view){
		this.model = model;
		this.view = view;
		requests = new AdminRequest();
		//adminChange = new AdminChangeFMS_GUI();
	}
	public void control(){
		limit = new Limitpeopleingroup(null, null);
		admin_del = new AdminDeletePeopleToGroupFMS();
		admin_add = new AdminAddPeopleToGroupFMS();
		
		view.getNotifcationNo().setVisible(false);
		view.getNotifcationYes().setVisible(false);
		requests.init();
		if (requests.table.getModel().getRowCount() != 0){
			view.getNotifcationYes().setVisible(true);
			
		}
		else
			view.getNotifcationNo().setVisible(true);
		
		view.getNotifcationNo().addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "No new requests");
				
			}
		});
		
		view.getNotifcationYes().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				adminRequestModel model=new adminRequestModel();
				AdminRequestController a = new AdminRequestController(requests, model);
				a.control();
				view.setVisible(false);
				requests.setVisible(true);
			}
		});
			
		
		view.getBtnQuit().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
    					view.dispose();
    					LoginMain.main(null);
    					//JOptionPane.showMessageDialog(null,"logout pressed");
    				}				
    			});	
		
		controlLimit = new LimitPeopleInGroup_Controller(limit  , LimitEnt);
		controlLimit.control();	
		
		view.getBtnLimit().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				view.setVisible(false);
				limit.setVisible(true);

			}
		});
		
		view.getBtnAddPeopleTo().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				view.setVisible(false);
				admin_add.setVisible(true);
				controlAdd = new AddPeopleFMS_Controller(addEnt, admin_add);
				controlAdd.control();
			}
		});
		
		view.getBtnRemovePeopleTo().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				view.setVisible(false);
				admin_del.setVisible(true);
				controlDelete = new DeletePeopleFMS_Controller(deleteEnt, admin_del);
				controlDelete.control();
			}
		
	});
	}	
}