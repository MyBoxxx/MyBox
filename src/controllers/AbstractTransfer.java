package controllers;

import java.io.IOException;

import view.AbstractGUI;

/**
 * this class is abstract transfer 
 * @author jacob
 *
 */
public abstract class AbstractTransfer 
{

		
		/** The model. */
		protected Object theModel;
		
		/** The view. */
		protected AbstractGUI theView;
		
		

		/**
		 * Instantiates a new abstract controller.
		 *
		 * @param theView the the view
		 * @param theModel the the model
		 * 
		 */
		public AbstractTransfer(){}
		
		public AbstractTransfer( AbstractGUI theView , Object theModel) 
		{
			this.theModel = theModel;
			this.theView = theView;
		}
		
		/**
		 * Send to server with String
		 *
		 * @param request the request
		 */
		protected void sendToServer(String request)
		{
			try 
			{
				client.MyBoxClient.getClient().sendToServer(request);
			} 
			catch (IOException e)
			{
				theView.displayInfoMessage("Error: Server comunication problem","Commuinication Error",0);
				e.printStackTrace();
			}
		}
	/**
	 * sent to server with Object	
	 * @param request
	 */
		protected void sendToServer(Object request)
		{
			try 
			{
				client.MyBoxClient.getClient().sendToServer(request);
			} 
			catch (IOException e)
			{
				theView.displayInfoMessage("Error: Server comunication problem","Commuinication Error",0);
				e.printStackTrace();
			}
		}
	/**
	 * this function is handle the DB result 	
	 * @param message
	 */
		 public void handleDBResult(Object message) {
			 
			 //
		 }
		 
		 public void UpdateDB(){
			 //
		 }
		
		
			
		
	}
