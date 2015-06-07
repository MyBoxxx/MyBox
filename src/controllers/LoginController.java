package controllers;


import view.Login_GUI;
import model.LoginMod;
import model.User;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Observable;
import java.util.concurrent.Executors;


/**
 * This Class is a Login Controller, which extends AbstractTransfer
 * @author jacob
 *
 */
public class LoginController extends AbstractTransfer
{
	
	private Login_GUI loginG;

	private LoginMod loginM;
	private LoginController tempL;
	private User user;
	
	/**
	 * 
	 * @param lC is gui instance
	 * @param lM Login Model instance - that include user name and password
	 */

	LoginController(Login_GUI lC,LoginMod lM ) {
		//super(lC,lM);
		loginG = lC;
		loginM = lM;
		tempL = this;
		loginG.addLoginActionListener(new LoginListener());
		loginG.addporgotPasswordActionListener(new forgotPassListener());
		
	}
	
	class forgotPassListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	
	}
/**
 * Inner class that handles when Button login Pressed, implements ActiontListener
 * @author jacob
 *
 */
	class LoginListener implements ActionListener {
		
		
           public void actionPerformed(ActionEvent ev){
        	  
        		  String pass = loginG.getTextPassword();
        		  String user = loginG.getTextUserName();
        		  
        		  if(pass.equals("")|| user.equals("") ) {
        			  loginG.setWarningMessageVisibleTrue();
        			  return;
        		  }
        		  else
        		  {
        			  loginG.undisplayWarningMessage();
        			  try{ //set the user name and password and sent to server
        				 loginM.setPassword(pass);
        				 loginM.setUserName(user);
        				 User en = new User(loginM,"login");
    
        				 sendToServer(en);
        				 MyBoxClientApp.clien.setCurrObj(getTempL());
        				 
        			  }
        			  catch(Exception e){
        				  
        			  }
			
		      }
           }
	}
	
	/*
	 * (non-Javadoc)
	 * @see controllers.AbstractTransfer#handleDBResult(java.lang.Object)
	 */
	 public void handleDBResult(Object message) {
		 user = (Employee)message;
			if(user.getStatus() == 1)
				loginG.setWarningMessageVisibleTrue("This user name is already Login to system");
			   
			else{
				if ((user.getPosition() > 0) && (user.getPosition() < 6)) {
					UpdateDB(); //update the status to 1 that we know the user is login the system 
					 CcrmApp.clien.setCurrUser(user);
				   loginG.dispose();
				  }
				
				if(user.getPosition() == 1){
					//open marketing Gui and create model view controller
					
					MarketingGui MarkGui = new MarketingGui();
					MarketingController MarkCon = new MarketingController(user,MarkGui,this);
					
				}
				if(user.getPosition() == 2){
					//open director of marketing Gui and create model view controller
					
					MarketingManagerGui MarkManGui = new MarketingManagerGui();
					MarketingManagController MarkManCon = new MarketingManagController(user,MarkManGui,this);
					
					
				}
				if(user.getPosition() == 3){
					//open sales man Gui and create model view controller
					SalesManGui salemanG = new SalesManGui();
					SalesManControllers salemanCon = new SalesManControllers(this,user,salemanG);
				}
				if(user.getPosition() == 4){
					
					//open costumer relation employee Gui and create model view controller
					CostumerRelEmpGui CostReModel = new CostumerRelEmpGui();
					 CostumerRelEmpCont CostReCont = new CostumerRelEmpCont(CostReModel,this,user);
					
				}	
				if(user.getPosition() == 5) {
					//open Human Resources Gui and create model view controller
					HumanResourcesGui HRGui = new HumanResourcesGui();
					HRcontroller HRcon = new HRcontroller(user,HRGui,this);
				}
			}//else	
		 
	 }
	 
	 public void UpdateDB(){
		 //update the status of user to 1 - it's mean that is login to system
		 Envelope en1 = new Envelope(user,"updateStatus1");
		 sendToServer(en1);
	 }
	 
	/**
	 * get the login Gui 
	 * @return LoginGui1
	 */
	public LoginGui1 getLoginG() {
		return loginG;
	}
	/**
	 * set login gui
	 * @param loginG
	 */
	public void setLoginG(LoginGui1 loginG) {
		this.loginG = loginG;
	}

	/**
	 * get login model(entity)
	 * @return LoginMod
	 */
	public LoginMod getLoginM() {
		return loginM;
	}

	/**
	 * set log in model(entity)
	 * @param loginM
	 */
	public void setLoginM(LoginMod loginM) {
		this.loginM = loginM;
	}
	/**
	 * get instance  of current controller
	 * @return LoginController
	 */
	public LoginController getTempL() {
		return tempL;
	}
	
}
