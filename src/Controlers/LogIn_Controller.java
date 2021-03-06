package Controlers;

import java.awt.Dimension;
import java.awt.Toolkit;
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
import SampleTreeFileView.*;

public class LogIn_Controller extends AbstractTransfer{

	  Login_Entity model ;
	  Login_GUI view;
	
	 ForgotPassword_Controller forgot_con;
	 ForgotPassword_GUI forgot_gui;
	
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
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			forgot_gui.setLocation(dim.width/2-forgot_gui.getSize().width/2, dim.height/2-forgot_gui.getSize().height/2);
			forgot_gui.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
	}
	

	public void control(){
		MainClient.clien.setCurrController(this);
		
		view.getBtnLogin().addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			if(view.getPasswordField().getText().equals("password") || view.getTxtUserName().getText().equals("UserName"))
				{
				view.settxtOneOrMoreVisible(true);
				}
			else view.settxtOneOrMoreVisible(false);
				
			try{
				model.setUsername(view.getTxtUserName().getText());
				model.setPassword(view.getPasswordField().getText());
				sendToServer(model);
			}
			catch (Exception eee){
				
			}
			}
		});
		
		
		
		view.getBtnForgotPassword().addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					if(!forgot_gui.isVisible()){
						forgot_con.control();
						forgot_gui.setVisible(true);
						forgot_gui.setState(JFrame.NORMAL);
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
	    
		
			
		
	}//end control



	public void ErrorLogin() {
		JOptionPane.showMessageDialog(view.getContentPane(),  "Login Failed!."+view.getTxtUserName().getText()+ view.getPasswordField().getText());
	}

	public void MakeLogin() {
		
		if(MainClient.clien.getCurrUser().isLogedin()==true){
			if(MainClient.clien.getCurrUser().isAdmin()) 
				MainAdmin.main(null);
			//testtyaron.main(null);
			else Main.main(null);
			view.setVisible(false);
		}
		else showMessage("You Are Loged in");
	}
	public void showMessage(String pwd) {
		if (pwd!= null)
			JOptionPane.showMessageDialog(null, "Your password is: " + pwd);
		else
			JOptionPane.showMessageDialog(null, "You are not a valid user in mybox");
		
	}
	
}
