package Controlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import GUI_final.*;

import java.net.MalformedURLException;

import javax.swing.JOptionPane;

import Entity.*;

public class ForgotPassword_Controller {

	static User_Entity model ;
	static ForgotPassword_GUI view;
	
	ForgotPassword_Controller(User_Entity model,ForgotPassword_GUI view){
		this.model = model;
		this.view = view;
		view.setBounds(100, 100, 800, 600);
		view.setVisible(true);
	}
	
	void control()
	{
    view.getTxtEmail().addMouseListener(new MouseAdapter() {
    
		@Override
    	public void mouseClicked(MouseEvent e) {
			if(view.getTxtEmail().getText().equals("e-mail")) view.setTxtEmail("");
    	}
    });

    view.getTxtEmail().addFocusListener(new FocusAdapter() {
    	@Override
    	public void focusLost(FocusEvent e) {
    		if(view.getTxtEmail().getText().equals("")) view.setTxtEmail("e-mail");
    	}
    });
	
	 view.getSumbit().addActionListener(new ActionListener() {	
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(view.getTxtEmail().getText().equals("eyal")) 
				{
				JOptionPane.showMessageDialog(view.getContentPane(),  "Login OK!.");
	        	
				}
			else {
				JOptionPane.showMessageDialog(view.getContentPane(),  "Login Failed!.");
				
			}
		}
	});
	}

	public static User_Entity getModel() {
		return model;
	}

	public static void setModel(User_Entity model) {
		ForgotPassword_Controller.model = model;
	}

	public static ForgotPassword_GUI getView() {
		return view;
	}

	public static void setView(ForgotPassword_GUI view) {
		ForgotPassword_Controller.view = view;
	}
}
