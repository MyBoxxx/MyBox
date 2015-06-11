package Controlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

import Controlers.AddPeopleToGroupController.cancelListnerer;
import Controlers.AddPeopleToGroupController.okListner;
import Entity.User_Entity;
import GUI_final.Adminbar;
import GUI_final.AskToJoinRemoveFromGroup;

public class AskToJoinRemoveFromGroupController {
	
	private  User_Entity model ;
	private  AskToJoinRemoveFromGroup view;
	
	AskToJoinRemoveFromGroupController(User_Entity model,AskToJoinRemoveFromGroup view){
		this.model = model;
		this.view = view;
		this.view.sendRequestListner(new okListner());	
		this.view.cancelListner(new cancelListnerer());
		
	}
	
	class okListner implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			view.getBtRequest().addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {				
					JOptionPane.showMessageDialog(null,"send request button pressed");	
				}
			});
		}		
	}
	
	class cancelListnerer implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			view.getBtCacel().addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {				
					JOptionPane.showMessageDialog(null,"cancel button pressed");				
				}
			});
		}
	}

}
