package Controlers;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

import Client.MainClient;
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
		view.setBounds(100, 100, 800, 600);
		view.setVisible(true);
		
	}
	
	public void control(){
		
		MainClient.clien.setCurrController(this);
		view.getBtnOk().setEnabled(false);
		if ( !view.getCuurenttextField().equals("") && !view.getNewAmounText().equals("") && !view.getChoice().getSelectedItem().equals("")){
			view.getBtnOk().setEnabled(true);
			view.getBtnOk().addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e){
				JOptionPane.showInputDialog("10000");
				System.out.println("sgsfgfsgs");
				}
			});
		}
		
	}
}