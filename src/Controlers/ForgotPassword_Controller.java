package Controlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import GUI_final.*;
import SampleTreeFileView.Controller;

import java.net.MalformedURLException;

import javax.swing.JOptionPane;

import Client.MainClient;
import Entity.*;

public class ForgotPassword_Controller extends AbstractTransfer{

	static ForgotPassword_Entity model ;
	static ForgotPassword_GUI view;
	
	ForgotPassword_Controller(ForgotPassword_Entity model,ForgotPassword_GUI view){
		this.model = model;
		this.view = view;
		
	}
	
	void control()
	{

    view.getTxtEmail().addMouseListener(new MouseAdapter() {
    
		@Override
    	public void mouseClicked(MouseEvent e) {
			if(view.getTxtEmail().getText().equals("E-mail")) view.setTxtEmail("");
    	}
    });

    view.getTxtEmail().addFocusListener(new FocusAdapter() {
    	@Override
    	public void focusLost(FocusEvent e) {
    		if(view.getTxtEmail().getText().equals("")) view.setTxtEmail("E-mail");
    	}
    });
	
	 view.getSumbit().addActionListener(new ActionListener() {	
		@Override
		public void actionPerformed(ActionEvent e) {
			if(view.getTxtEmail().getText().equals("E-mail")) 
				{
				JOptionPane.showMessageDialog(view.getContentPane(),  "Nedd to put a valit mail address!.");
				}
			else {
				model.setEmail(view.getTxtEmail().getText());
				sendToServer(model);
			}
		}
	});
	 
	 view.getBtnBack().addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	});
	 
	}

	public static ForgotPassword_Entity getModel() {
		return model;
	}

	public static void setModel(ForgotPassword_Entity model) {
		ForgotPassword_Controller.model = model;
	}

	public static ForgotPassword_GUI getView() {
		return view;
	}

	public static void setView(ForgotPassword_GUI view) {
		ForgotPassword_Controller.view = view;
	}


}
