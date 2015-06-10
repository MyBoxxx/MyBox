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

public class AdminBar_Controller {

	private static User_Entity model ;
	private static Adminbar view;
	private static ForgotPassword_GUI forgot;
	
	ActionListener loginActionListener ;
	ActionListener forgotActionListener ;
	
	
	
	AdminBar_Controller(User_Entity model,Adminbar view){
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
				if(view.getName().equals("eyal")) 
					{
					JOptionPane.showMessageDialog(view.getContentPane(),  "Login OK!.");
		        	view.setTxtOneOrMoreVisible(false);
					}
				else {
					JOptionPane.showMessageDialog(view.getContentPane(),  "Login Failed!."+view.getName().getText());
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

	public static User_Entity getModel() {
		return model;
	}

	public static void setModel(User_Entity model) {
		AdminBar_Controller.model = model;
	}

	public static Adminbar getView() {
		return view;
	}

	public static void setView(Adminbar view) {
		AdminBar_Controller.view = view;
	}

	public static ForgotPassword_GUI getForgot() {
		return forgot;
	}

	public static void setForgot(ForgotPassword_GUI forgot) {
		AdminBar_Controller.forgot = forgot;
	}
	
	
}
