package Controlers;

import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import jdk.internal.dynalink.beans.StaticClass;
import Entity.*;
import GUI_final.*;

public class LogIn_Controller {

	static User_Entity model ;
	static Login_GUI view;
	static ForgotPassword_GUI forgot;
	
	ActionListener loginActionListener ;
	ActionListener forgotActionListener ;
	
	
	
	LogIn_Controller(User_Entity model,Login_GUI view){
		this.model = model;
		this.view = view;
		view.setBounds(100, 100, 800, 600);
		view.setVisible(true);
		try {
			forgot = new ForgotPassword_GUI();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
		}
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
		forgotActionListener = new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					if(!forgot.isVisible()){
					forgot.setType(Type.POPUP);
					forgot.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					forgot.setVisible(true);}
					else forgot.toFront();
				
				
			}
		};
		
		
		
		view.getForgotPassword().addActionListener(forgotActionListener);
		view.getLoginButtun().addActionListener(loginActionListener);
		
		
		
		
		
	}
	
	
}
