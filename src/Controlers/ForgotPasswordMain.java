package Controlers;

import GUI_final.*;

import java.net.MalformedURLException;

import Entity.*;

public class ForgotPasswordMain {
	static ForgotPassword_Entity model ;
	
	static ForgotPassword_GUI view;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			view = new ForgotPassword_GUI();
			ForgotPassword_Entity model = new ForgotPassword_Entity();
			ForgotPassword_Controller controler = new ForgotPassword_Controller(model, view);
			controler.control();
			view.setBounds(100, 100, 600, 450);
			view.setVisible(true);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
