package Controlers;
import GUI_final.RequestToChangeGroupPermission;

public class testtyaron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RequestToChangeGroupPermission theview = new RequestToChangeGroupPermission();
		
		RequestToChangeGroupePremission_Controller thecontroller = new RequestToChangeGroupePremission_Controller(theview);
		theview.getFrmRequstToChange().setVisible(true);
		
	}

}
