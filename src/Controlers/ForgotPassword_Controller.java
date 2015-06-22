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

public class ForgotPassword_Controller extends AbstractTransfer{

	private ForgatPassword_Entity model;
	private ForgotPassword_GUI view;
	
	
	public ForgotPassword_Controller(ForgatPassword_Entity model,ForgotPassword_GUI view)
	{
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
			// TODO Auto-generated method stub
			sendToServer(model);
				
			}
		});
}
}


