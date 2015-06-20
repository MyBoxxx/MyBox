package SampleTreeFileView;


import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import Entity.User_Entity;
	


public class Main
{
	static Model model;
	static View view;
	public static void main(String[] argv) { 
       
                  try{
                	  
                	  model = new Model();
                	  view = new View(); 
                	  Controller controller = new Controller(model,view);
                	  controller.contol();
                	  controller.setVisible(true);
                	  view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
                  } catch (Exception e)
                  {
                	  e.printStackTrace();
                  }
    
    }
}
