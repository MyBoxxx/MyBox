package Controlers;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

import Entity.Folder_Entity;
import Entity.User_Entity;
import GUI_final.AdminAddPeopleToGroup;
import GUI_final.CreateFolderScreen;
import GUI_final.Limitpeopleingroup;

public class LimitPeopleInGroupController {
	
	private User_Entity model ;
	private Limitpeopleingroup view;
	
	
	
	LimitPeopleInGroupController(User_Entity model,Limitpeopleingroup view){
		this.model = model;
		this.view = view;
		
		this.view.
		this.view.cancelListner(new cancelListnerer());
		
	}
	
	class okListner implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			view.getBtnOk().addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {				
					JOptionPane.showMessageDialog(null,"ok button pressed");	
				}
			});
		}
		
	}
	
	class cancelListnerer implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			view.getBtnCancel().addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {				
					JOptionPane.showMessageDialog(null,"cancel button pressed");				
				}
			});
		}
	}

}
