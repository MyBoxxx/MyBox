package Controlers;

import java.net.MalformedURLException;

import Controlers.*;
import Entity.*;
import GUI_final.*;
public class tempMain {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Login_GUI view = new Login_GUI();
			User_Entity model = new User_Entity();
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
