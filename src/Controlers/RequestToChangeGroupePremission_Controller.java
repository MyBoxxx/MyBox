package Controlers;
<<<<<<< HEAD
import GUI_final.RequestToChangeGroupPermission;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class RequestToChangeGroupePremission_Controller {

	private RequestToChangeGroupPermission theview;
	
	public RequestToChangeGroupePremission_Controller(RequestToChangeGroupPermission theview)
	{
		this.theview=theview;
		this.theview.ButtonPressedActionlistinersend(new ButtonPressedActionlistinersend());
		this.theview.ButtonPressedActionlistinercancel(new ButtonPressedActionlistinercancel());
	}
	
	public class ButtonPressedActionlistinersend implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("100");
		}
		
	}
	
	public class ButtonPressedActionlistinercancel implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("ein ma");
		}
		
	}
	
	
}

=======

import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.net.MalformedURLException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Entity.*;
import GUI_final.*;

public class RequestToChangeGroupePremission_Controller extends AbstractTransfer{

	private   User_Entity model ;
	private  RequestToChangeGroupPermission view;

	GroupActions groupw;
	
	

	public RequestToChangeGroupePremission_Controller(User_Entity model, RequestToChangeGroupPermission view){
		this.model = model;
		this.view = view;
		
		groupw =new GroupActions();
	

	}
		public void control(){
			view.getButtonCancel().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					view.setVisible(false);
					groupw.setVisible(true);
				}
			});
		}
	  
}
>>>>>>> refs/heads/master
