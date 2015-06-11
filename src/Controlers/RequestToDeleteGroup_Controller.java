package Controlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Entity.Group_Entity;
import GUI_final.RequestToDeleteGroup;

public class RequestToDeleteGroup_Controller {

	private RequestToDeleteGroup theview;
	private Group_Entity themodel;
	
	public RequestToDeleteGroup_Controller(RequestToDeleteGroup theview,Group_Entity themodel) {
		this.theview = theview;
		this.themodel = themodel;
		
		}
	public void control() {
		this.theview.ButtonPressedActionlistinerOk(new ButtonPressedActionlistinerOk());
		this.theview.ButtonPressedActionlistinerNextBeck(new ButtonPressedActionlistinerNextBeck());
		this.theview.ButtonPressedActionlistinerBeck(new ButtonPressedActionlistinerBeck());
		//this.theview.ButtonPressedActionlistinersend(new ButtonPressedActionlistinersend());
		this.theview.isselected(new isselected());
	}
	
	public class ButtonPressedActionlistinerOk implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			theview.getAskTo().setVisible(false);
			theview.getPanelbutton().setVisible(false);
			theview.getAreUSure().setVisible(true);
			theview.getLgroup().setText(theview.getS()+" ?");
		}
		
	}
	
	public class ButtonPressedActionlistinerNextBeck implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			theview.getAreUSure().setVisible(false);
			theview.getAskTo().setVisible(true);
			theview.getPanelbutton().setVisible(true);
			
		}	
	}
	
	public class isselected implements ListSelectionListener
	{
		@Override
		public void valueChanged(ListSelectionEvent e) {
			// TODO Auto-generated method stub
			theview.setS(theview.getList().getSelectedValue().toString());
		}
	}

	public class ButtonPressedActionlistinerBeck implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			theview.getAreUSure().setVisible(false);
			theview.getAskTo().setVisible(true);
			theview.getPanelbutton().setVisible(true);
			
		}
	}
	/*++++++++++++++++++++++++++++++++++++++++++++++++++
	 * public class ButtonPressedActionlistinersend implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			theview.getAreUSure().setVisible(false);
			theview.getAskTo().setVisible(true);
			theview.getPanelbutton().setVisible(true);
			
		}
	}
	 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
	
	
}
