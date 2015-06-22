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

import GUI_final.*;
import Entity.*;




public class AdminBar_Controller {

	private  Adminbar_model model ;
	private  Adminbar view;
	private AdminRequest requests;
	private AdminChangeFMS_GUI adminChange;
	//GUIs
	
	
	
	public AdminBar_Controller(Adminbar_model model,Adminbar view){
		this.model = model;
		this.view = view;
		requests = new AdminRequest();
		adminChange = new AdminChangeFMS_GUI();
	}
	public void control(){
		
		view.getNotifcationNo().setVisible(false);
		view.getNotifcationYes().setVisible(false);
		requests.init();
		if (requests.table.getModel().getRowCount() != 0){
			view.getNotifcationYes().setVisible(true);
			
		}
		else
			view.getNotifcationNo().setVisible(true);
		
		view.getNotifcationNo().addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "No new requests");
				
			}
		});
		
		view.getNotifcationYes().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				view.setVisible(false);
				requests.setVisible(true);
			}
		});
		
		view.getBtnChangeFms().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				view.setVisible(false);
				adminChange.setVisible(true);
			}
		});
		
		view.getBtnQuit().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
    					view.dispose();
    					//LoginMain.main(null);
    					//JOptionPane.showMessageDialog(null,"logout pressed");
    				}				
    			});			
				
			}
		}