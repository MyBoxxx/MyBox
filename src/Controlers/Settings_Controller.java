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
		// TODO Auto-generated method stub
		view.getTxtfieldUserID().setText(model.getUsername());
		
	}
	
	
	public void control(){
		view.getBtnChangeName().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result = JOptionPane.showInputDialog(view, "Enter New Name");
				view.setTxtmyname(result);
				s=result;
				
			}
		});
		
		view.getBtnSaveSettings().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SettingsName_Entitiy sett= new SettingsName_Entitiy();
				sett.setOlduser(MainClient.clien.currUser);
				sett.getNewuser().setUsername(s);
				sendToServer(sett);
			}
		});
		
		view.getBtnCancel().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				view.dispose();
			}
		});
		
		view.getBtnDeleteAccount().addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent e) {
		  		int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to Delete this account?", "Warning",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
		          
	            if (p == JOptionPane.YES_OPTION) {
	            	sendToServer(model);
	            	JOptionPane.showMessageDialog(null, "The account is deleted, GoodBye", "Account deleted", JOptionPane.INFORMATION_MESSAGE);
			  		view.dispose();
			  		}
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