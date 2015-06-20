package Controlers;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.MalformedURLException;

import Entity.Login_Entity;
import GUI_final.Login_GUI;

public class testush{// TODO Auto-generated method stub
	public void bla(){
		Login_Entity model ;
		Login_GUI view;
	try {
		view = new Login_GUI();
		model = new Login_Entity();
		LogIn_Controller controler = new LogIn_Controller(model, view);
		view.setBounds(100, 100, 800, 600);
		System.out.println("BKLAVJADVD");
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		view.setLocation(dim.width/2-view.getSize().width/2, dim.height/2-view.getSize().height/2);
		controler.control();
		view.setVisible(true);
		
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}