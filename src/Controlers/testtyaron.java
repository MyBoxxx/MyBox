package Controlers;
import GUI_final.Settings_Change_Photo_Popup_GUI;

public class testtyaron {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Settings_Change_Photo_Popup_GUI theview = new Settings_Change_Photo_Popup_GUI();
		
		Settings_Change_Photo_Popup_Controller thecontroller = new Settings_Change_Photo_Popup_Controller(theview);
		theview.getContentPane().setVisible(true);
		
	}

}
