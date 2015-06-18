package Controlers;

import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.util.jar.JarOutputStream;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import view.Login_GUI;
import view.MainWindow_GUI;
import Client.myBoxClient;
import Entity.*;
import GUI_final.*;

public class AdminBar_Controller {


	private  Adminbar_model model ;
	private  AdminMainWindow view;

	public AdminBar_Controller(Adminbar_model model,Adminbar view){
		this.model = model;
		this.view = view;
	}
	public void control(){
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
					view.setVisible(false);
					testtyaron.main(null);
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
					view.dispose();
					LoginMain.main(null);
					//JOptionPane.showMessageDialog(null,"logout pressed");
					
				}				
			});			
		}		
	}	
	
}
