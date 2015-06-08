package Controlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

import Entity.*;
import GUI_final.*;

public class LogIn_Controller {

	User_Entity model ;
	Login_GUI view;
	ActionListener loginActionListener ;
	
	LogIn_Controller(User_Entity model,Login_GUI view){
		this.model = model;
		this.view = view;
		view.setBounds(100, 100, 800, 600);
		view.setVisible(true);
	}
	
	public void control(){
		
		loginActionListener = new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(view.getTxtUserName().getText().equals("eyal")) 
					{
					JOptionPane.showMessageDialog(view.getContentPane(),  "Login OK!.");
		        	view.setTxtOneOrMoreVisible(false);
					}
				else {
					JOptionPane.showMessageDialog(view.getContentPane(),  "Login Failed!."+view.getTxtUserName().getText());
					view.setTxtOneOrMoreVisible(true);
				}
			}
		};
		view.getLoginButtun().addActionListener(loginActionListener);
		
		
		
		
		
	}
	
	
}
