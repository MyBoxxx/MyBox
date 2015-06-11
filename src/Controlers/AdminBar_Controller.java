package Controlers;

import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Entity.*;
import GUI_final.*;

public class AdminBar_Controller {

	private  User_Entity model ;
<<<<<<< HEAD
	private  AdminMainWindow view;
	
	AdminBar_Controller(User_Entity model,AdminMainWindow view){
=======
	private  Adminbar view;
	
	AdminBar_Controller(User_Entity model,Adminbar view){
>>>>>>> refs/heads/eran
		this.model = model;
		this.view = view;
		
		this.view.ChangeFMSLitsner(new ChangeFMSLitsner());
		this.view.NotifcationYesLitsner(new NotificationYesLitsner());
		this.view.NotifcationNoLitsner(new NotificationNoLitsner());
		this.view.QuitLitsner(new QuitLitsner());
		
	}
	
	
	class ChangeFMSLitsner implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			view.getBtnChangeFms().addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					JOptionPane.showMessageDialog(null,"FMS button pressed");
				}				
			});			
		}		
	}
	
	class NotificationYesLitsner implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			view.getNotifcationYes().addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					JOptionPane.showMessageDialog(null,"Notification yes pressed");
				}				
			});			
		}		
	}
	
	class NotificationNoLitsner implements ActionListener{

		@Override		
		public void actionPerformed(ActionEvent e) {
			view.getNotifcationNo().addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					JOptionPane.showMessageDialog(null,"Notification no pressed");
				}				
			});			
		}		
	}
	class QuitLitsner implements ActionListener{

		@Override		
		public void actionPerformed(ActionEvent e) {
			view.getBtnQuit().addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					JOptionPane.showMessageDialog(null,"logout pressed");
				}				
			});			
		}		
	}	
	
}
