package Controlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GUI_final.RequesrToChangeGroupPermission;

public class RequestToChangeGroupePremission_Controller {

	private RequesrToChangeGroupPermission theview;
	
	public RequestToChangeGroupePremission_Controller(RequesrToChangeGroupPermission theview)
	{
		this.theview=theview;
		this.theview.ButtonPressedActionlistiner(new ButtonPressedActionlistiner());
	}
	public class ButtonPressedActionlistiner implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("100");
		}
		
	}
	
}

