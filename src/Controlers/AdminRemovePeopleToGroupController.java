package Controlers;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

import Entity.Folder_Entity;
import Entity.User_Entity;
import GUI_final.AdminAddPeopleToGroup;
import GUI_final.AdminDeletePeopleToGroup;
import GUI_final.CreateFolderScreen;

public class AdminRemovePeopleToGroupController {
	
	private User_Entity model ;
	private AdminDeletePeopleToGroup view;
	
	
	
	AdminRemovePeopleToGroupController(User_Entity model,AdminDeletePeopleToGroup view){
		this.model = model;
		this.view = view;

		this.view.deleteListner(new deleteListner());
	}
	//To-do control
	class deleteListner implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			view.getDeleteButton().addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {				
					JOptionPane.showMessageDialog(null,"delete button pressed");	
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
