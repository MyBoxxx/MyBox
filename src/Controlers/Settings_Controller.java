package Controlers;

import java.awt.event.ActionEvent;

import Client.MainClient;
import Entity.*;

import java.awt.event.ActionListener;
import java.util.ResourceBundle.Control;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Entity.Settings_Entity;
import Entity.User_Entity;
import GUI_final.Login_GUI;
import GUI_final.Settings_GUI;
import SampleTreeFileView.Controller;

public class Settings_Controller extends AbstractTransfer {
	
	private User_Entity model;
	private Settings_GUI view;
	public String s;
	
	public Settings_Controller(User_Entity model, Settings_GUI view) {
		super();
		this.model = model;
		this.view = view;
		init();
	}
	private void init() {
		this.model = MainClient.clien.currUser;
		// TODO Auto-generated method stub
		view.getTxtfieldUserID().setText(model.getUsername());
		
	}
	
	
	public void control(){
		view.getBtnChangeName().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result = JOptionPane.showInputDialog(view, "Enter New Name");
				if(result != null){
				view.setTxtmyname(result);
				s=result;
				}
			}
		});
		
		view.getBtnSaveSettings().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SettingsName_Entitiy sett= new SettingsName_Entitiy();
				sett.setOlduser(MainClient.clien.currUser);
				sett.getNewuser().setUsername(s);
				if (sett.getNewuser().getUsername().equals(null)==false)
					{
					sendToServer(sett);
					MainClient.clien.currUser.setUsername(s);
					}
			}
		});
		
		view.getBtnCancel().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				view.setVisible(false);
				((Controller) MainClient.clien.getCurrController() ).repaint();
				((Controller) MainClient.clien.getCurrController() ).setVisible(true);
			}
		});
		
		
		view.getBtnChangePwd().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Settings_Entity settp= new Settings_Entity();
				settp.setOlduser(MainClient.clien.currUser);
				settp.getNewuser().setPassword((view.getPwdNewPwd()).getText());
				sendToServer(settp);
				JOptionPane.showMessageDialog(view, "Password Changed");
			}
		});
		
	}
	
}