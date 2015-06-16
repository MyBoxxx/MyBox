package Controlers;


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
                RequestToChangeGroupPermission view = new RequestToChangeGroupPermission(); 
                RequestToChangeGroupePremission_Controller controller = new RequestToChangeGroupePremission_Controller(model,view);
                controller.control();
                view.setVisible(true);
                view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });  
    }
	
}

