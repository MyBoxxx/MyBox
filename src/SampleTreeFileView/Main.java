package SampleTreeFileView;


import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import Entity.User_Entity;



public class Main
{
<<<<<<< HEAD
	static String []user;
   
	public static void main(String[] args) { 
    	user = args;
=======
   
	public static void main() { 
>>>>>>> refs/heads/master
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {                                           
                Model model = new Model();
                View view;
                if(user.length == 0) view = new View(new User_Entity("moshe")); 
                else view = new View(new User_Entity(user[0])); 
                Controller controller = new Controller(model,view);
                controller.contol();
                controller.setVisible(true);
                view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });  
    }
}
