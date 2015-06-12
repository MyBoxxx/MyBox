package SampleTreeFileView;


import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import Entity.User_Entity;



public class Main
{
   
	public static void main() { 
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {                                           
                Model model = new Model();
                View view = new View(); 
                Controller controller = new Controller(model,view);
                controller.contol();
                controller.setVisible(true);
                view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });  
    }
}
