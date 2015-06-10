package Controlers;

import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Entity.*;
import GUI_final.*;
import Client.*;
import SampleTreeFileView.Main;

public class LogIn_Controller extends AbstractTransfer{

	static Login_Entity model ;
	static Login_GUI view;
	
	static ForgotPassword_Controller forgot_con;
	static ForgotPassword_GUI forgot_gui;
	
	ActionListener loginActionListener ;
	ActionListener forgotActionListener ;
	
	
	
	LogIn_Controller(Login_Entity model,Login_GUI view){
		this.model = model;
		this.view = view;
		view.setBounds(100, 100, 800, 600);
		view.setVisible(true);
		try {
			forgot_gui = new ForgotPassword_GUI();
			forgot_con = new ForgotPassword_Controller(new ForgotPassword_Entity(), forgot_gui);
			forgot_con.control();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
	}
	
	public void control(){
		
		view.getBtnLogin().addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			if(view.getPasswordField().getText().equals("password") || view.getTxtUserName().getText().equals("UserName"))
				{
				JOptionPane.showMessageDialog(view.getContentPane(),  "Login Failed!."+view.getTxtUserName().getText()+ view.getPasswordField().getText());
				view.settxtOneOrMoreVisible(true);
				}
			else view.settxtOneOrMoreVisible(false);
				
			try{
				model.setUser(view.getTxtUserName().getText());
				model.setPassword(view.getPasswordField().getText());
				sendToServer(model);
				
			}
			catch (Exception eee){
				
			}
			
			if(view.getTxtUserName().getText().equals("eyal")) 
					{
					//JOptionPane.showMessageDialog(view.getContentPane(),  "Login OK!.");
					//redirect to systemfileview
		        	view.settxtOneOrMoreVisible(false);
		        	String []User = {"eyal","pano"};
		        	Main.main(User);
					}
				else {

				}
			}
		});
		
		
		
		view.getBtnForgotPassword().addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					if(!forgot_gui.isVisible()){
						forgot_gui.setType(Type.POPUP);
						forgot_gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						forgot_gui.setVisible(true);
						}
					else forgot_gui.toFront();
				
				
			}
		});

		view.getPasswordField().addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) { {

	    		if(view.getPasswordField().getText().equals("password"))
	    			view.setPasswordField("");
	    	}
		}});
		view.getPasswordField().addFocusListener(new FocusAdapter() {
	    	@Override
	    	public void focusLost(FocusEvent e) {
	    		if(view.getPasswordField().getText().equals("")) view.setPasswordField("password");
	    	}
	    });

		
	    view.getTxtUserName().addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		if(view.getTxtUserName().getText().equals("UserName"))
	    			view.setTxtUserName("");
	    	}
	    });

	    view.getTxtUserName().addFocusListener(new FocusAdapter() {
	    	@Override
	    	public void focusLost(FocusEvent e) {
	    		if(view.getTxtUserName().getText().equals("")) view.setTxtUserName("UserName");
	    	}
	    });
	    
		
		
		
		
		
	}
	
	
}
