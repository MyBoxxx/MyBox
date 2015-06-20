package Controlers;



import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import Controlers.AdminChangeFMSController;
import Entity.User_Entity;
import GUI_final.AdminChangeFMS_GUI;



public class TestOfir
{
   
	public static void main(String[] argv) { 
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {                                           
                User_Entity model = new User_Entity();
                AdminChangeFMS_GUI view = new AdminChangeFMS_GUI(); 
                AdminChangeFMSController controller = new AdminChangeFMSController(model,view);
                controller.control();
                //controller.set
                view.setVisible(true);
                view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });  
    }
}
