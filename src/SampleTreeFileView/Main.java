package SampleTreeFileView;


import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import Entity.User_Entity;
	


public class Main
{
	public static Controller controller;
	static  Model model;
	public static  View view;
	public static void main(String[] argv) { 
       
                  try{
                	  
                	  model = new Model();
                	  view = new View(); 
                	   controller = new Controller(model,view);
                	  controller.contol();
                	view.setBounds(100, 100, 800, 600);
              		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
              		view.setLocation(dim.width/2-view.getSize().width/2, dim.height/2-view.getSize().height/2);
                	  controller.setVisible(true);
                	  view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
                  } catch (Exception e)
                  {
                	  e.printStackTrace();
                  }
    
    }
}
