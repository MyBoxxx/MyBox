package Controlers;

import GUI_final.*;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.MalformedURLException;

import Entity.*;

public class LoginMain {
	static Login_Entity model ;
	static Login_GUI view;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			view = new Login_GUI();
			model = new Login_Entity();
			LogIn_Controller controler = new LogIn_Controller(model, view);
			view.setBounds(100, 100, 800, 600);
			controler.control();
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			view.setLocation(dim.width/2-view.getSize().width/2, dim.height/2-view.getSize().height/2);
			view.setVisible(true);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
