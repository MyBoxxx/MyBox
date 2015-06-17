package Controlers;
<<<<<<< HEAD
<<<<<<< HEAD
import java.net.MalformedURLException;

import Entity.Settings_Entity;
import Entity.SystemadminReequestScreen_Entity;
import GUI_final.*;
=======

import GUI_final.*;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.MalformedURLException;

import Entity.*;
>>>>>>> refs/heads/master
=======

import GUI_final.*;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.MalformedURLException;

import Entity.*;
>>>>>>> refs/heads/master

public class testtyaron {
<<<<<<< HEAD
<<<<<<< HEAD

	private static Settings_Entity model;
	private static Settings_GUI view; 
	
	
	public static void main(String[] args) throws MalformedURLException {
=======
=======
>>>>>>> refs/heads/master
	static SystemAdminReequestScreen_Entity model ;
	
	static SysAdminRequesrScreen view;
	
	
	public static void main(String[] args) {
>>>>>>> refs/heads/master
		// TODO Auto-generated method stub
<<<<<<< HEAD
<<<<<<< HEAD
		model = new Settings_Entity();
		view = new Settings_GUI();
		Settings_Controller conctroller = new Settings_Controller(model, view);
		
		conctroller.control();
		
		view.setVisible(true);
		
=======
		try {
			view = new SysAdminRequesrScreen();
			model = new SystemAdminReequestScreen_Entity();
			SystemAdminRequestsScreen_Controller controler = new SystemAdminRequestsScreen_Controller(model, view);
			view.setBounds(100, 100, 800, 600);
			controler.control();
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			view.setLocation(dim.width/2-view.getSize().width/2, dim.height/2-view.getSize().height/2);
			view.setVisible(true);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
>>>>>>> refs/heads/master
=======
		try {
			view = new SysAdminRequesrScreen();
			model = new SystemAdminReequestScreen_Entity();
			SystemAdminRequestsScreen_Controller controler = new SystemAdminRequestsScreen_Controller(model, view);
			view.setBounds(100, 100, 800, 600);
			controler.control();
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			view.setLocation(dim.width/2-view.getSize().width/2, dim.height/2-view.getSize().height/2);
			view.setVisible(true);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
>>>>>>> refs/heads/master
	}

}
