package Controlers;
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

