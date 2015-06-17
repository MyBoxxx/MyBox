package Client;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.MalformedURLException;

import Controlers.AdminBar_Controller;
import Entity.Adminbar_model;
import Entity.Login_Entity;
import GUI_final.Adminbar;
import GUI_final.Login_GUI;

public class MainAdmin {
	static Adminbar_model model ;
	
	static Adminbar view;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			view = new Adminbar();
			model = new Adminbar_model();
			AdminBar_Controller controler = new AdminBar_Controller(model, view);
			view.setBounds(100, 100, 800, 600);
			controler.control();
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			view.setLocation(dim.width/2-view.getSize().width/2, dim.height/2-view.getSize().height/2);
			view.setVisible(true);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
