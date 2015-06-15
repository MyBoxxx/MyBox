package Controlers;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

import Client.MainClient;
import Entity.ForgotPassword_Entity;
import Entity.User_Entity;
import GUI_final.AdminChangeFMS_GUI;
import GUI_final.ForgotPassword_GUI;

public class AdminChangeFMSController extends AbstractTransfer {
	
	static User_Entity model;
	static AdminChangeFMS_GUI view;
	
	static ForgotPassword_Controller forgot_con;
	static ForgotPassword_GUI forgot_gui;
	
	//ActionListener Home;
	
	AdminChangeFMSController(User_Entity model, AdminChangeFMS_GUI view){
		this.model = model;
		this.view = view;
		view.setBounds(100, 100, 800, 600);
		view.setVisible(true);
		/*try {
			forgot_gui = new ForgotPassword_GUI();
			forgot_con = new ForgotPassword_Controller(new ForgotPassword_Entity(), forgot_gui);
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			forgot_gui.setLocation(dim.width/2-forgot_gui.getSize().width/2, dim.height/2-forgot_gui.getSize().height/2);
			forgot_con.control();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}*/
	}		
	
	
	public void control(){
		MainClient.clien.setCurrController(this);
		view.getHomeButton().addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e){
				JOptionPane.showInputDialog("10000");
				System.out.println("sgsfgfsgs");
			
			}
		});
	}
	
}	
