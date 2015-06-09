package Controlers;

import GUI_final.*;

import java.net.MalformedURLException;

import Entity.*;

public class ForgotPasswordMain {
	static User_Entity model ;
	
	static ForgotPassword_GUI view;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			view = new ForgotPassword_GUI();
			User_Entity model = new User_Entity();
			ForgotPassword_Controller controler = new ForgotPassword_Controller(model, view);
			view.setBounds(100, 100, 800, 600);
			controler.control();
			view.setVisible(true);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
