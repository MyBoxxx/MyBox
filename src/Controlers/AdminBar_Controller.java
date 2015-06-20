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
import Client.MainClient;
import Client.myBoxClient;
import Entity.*;
import GUI_final.*;

public class AdminBar_Controller {

	private  Adminbar_model model ;
	private  Adminbar view;
	
	//GUIs
	
	
	
	public AdminBar_Controller(Adminbar_model model,Adminbar view){
		this.model = model;
		this.view = view;
	}
	public void control(){
		
	/*	view.getBtnChangeFms().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				groupw=new GroupActions();
				groupA = new GroupAction_controller(MainClient.clien.currUser,groupw);
				view.dispose();
				groupw.setVisible(true);
				groupA.contol();				
			}
		});
	*/
		
	//	view.NotifcationYesLitsner(new NotificationYesLitsner());
		
	//	view.NotifcationNoLitsner(new NotificationNoLitsner());
		
		view.getBtnQuit().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
    					view.dispose();
    					LoginMain.main(null);
    					//JOptionPane.showMessageDialog(null,"logout pressed");
    				}				
    			});			
				
			}
		}