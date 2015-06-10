package Controlers;

import GUI_final.*;

import java.net.MalformedURLException;

import Entity.*;

public class LoginMain {
	static User_Entity model ;
	
	static Login_GUI view;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			 view = new Login_GUI();
			 model = new User_Entity();
			LogIn_Controller controler = new LogIn_Controller(model, view);
			view.setBounds(100, 100, 800, 600);
			controler.control();
			view.setVisible(true);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
