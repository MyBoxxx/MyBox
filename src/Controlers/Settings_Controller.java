package Controlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle.Control;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Entity.Settings_Entity;
import GUI_final.Login_GUI;
import GUI_final.Settings_GUI;

public class Settings_Controller extends AbstractTransfer {
	
	private Settings_Entity model;
	private Settings_GUI view;
	
	public Settings_Controller(Settings_Entity model, Settings_GUI view) {
		super();
		this.model = model;
		this.view = view;
	}
	
	public void control(){
		view.getBtnChangeName().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result = JOptionPane.showInputDialog(view, "Enter New Name");
				view.setTxtmyname(result);
			}
		});
		
		view.getBtnSaveSettings().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sendToServer(model);
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
				model.setOldPassword(view.getPwdCurrentPwd().getText());
				model.setNewPassword(view.getPwdNewPwd().getText());
				sendToServer(model);
				JOptionPane.showMessageDialog(view, "Password Changed");
			}
		});
		
	}
	
}