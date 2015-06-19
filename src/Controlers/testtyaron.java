package Controlers;

<<<<<<< HEAD
import GUI_final.*;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.MalformedURLException;

import Entity.*;

public class testtyaron {
	static SystemAdminReequestScreen_Entity model ;
	
	static SysAdminRequesrScreen view;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	}

}
=======

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import Entity.User_Entity;
import GUI_final.GroupActions;
import GUI_final.RequestToChangeGroupPermission;



public class testtyaron
{
   
	public static void main(String[] argv) { 
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {                                           
                User_Entity model = new User_Entity();
                GroupActions view = new GroupActions(); 
                GroupAction_controller controller = new GroupAction_controller(model,view);
                controller.contol();
                view.setVisible(true);
                view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });  
    }
	
}

>>>>>>> refs/heads/master
