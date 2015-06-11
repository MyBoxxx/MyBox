package Controlers;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

import Entity.Folder_Entity;
import Entity.User_Entity;
<<<<<<< HEAD
import GUI_final.AddPeopleToGroup;
import GUI_final.CreateFolderScreen;

public class AddPeopleToGroupController {
	
	private User_Entity model ;
	private AddPeopleToGroup view;
	
	
	
	AddPeopleToGroupController(User_Entity model,AddPeopleToGroup view){
=======
import GUI_final.AdminAddPeopleToGroup;
import GUI_final.CreateFolderScreen;

public class AddPeopleToGroupController {
	
	private User_Entity model ;
	private AdminAddPeopleToGroup view;
	
	
	
	AddPeopleToGroupController(User_Entity model,AdminAddPeopleToGroup view){
>>>>>>> refs/heads/eran
		this.model = model;
		this.view = view;
		
		this.view.okListner(new okListner());	
		this.view.cancelListner(new cancelListnerer());
		
	}
	
	class okListner implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			view.getOkButton().addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {				
					JOptionPane.showMessageDialog(null,"ok button pressed");	
				}
			});
		}
		
	}
	
	class cancelListnerer implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			view.getCancelButton().addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {				
					JOptionPane.showMessageDialog(null,"cancel button pressed");				
				}
			});
		}
	}

}
