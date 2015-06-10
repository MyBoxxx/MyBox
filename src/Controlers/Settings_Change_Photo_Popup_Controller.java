package Controlers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GUI_final.Settings_Change_Photo_Popup_GUI;
import Entity.User_Entity;

public class Settings_Change_Photo_Popup_Controller {

	private Settings_Change_Photo_Popup_GUI theview;  
	//private User_Entity themodel;
	
	public Settings_Change_Photo_Popup_Controller(Settings_Change_Photo_Popup_GUI theview)
	{
		this.theview=theview;
		
		this.theview.changeyourp(new changeyourp());
		this.theview.cancelbuttonpresses(new cancelbuttonpresses());
	}
	
	
	public class changeyourp implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	public class cancelbuttonpresses implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
}
