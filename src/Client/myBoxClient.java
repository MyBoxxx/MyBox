// This file contains material supporting section 3.7 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 

package Client;

import ocsf.client.*;
import ocsftester.FileTable;
import Controlers.AddPeopleFMS_Controller;
import Controlers.AskToJoinRemoveFromGroupController;
import Controlers.DeletePeopleFMS_Controller;
import Controlers.ForgotPassword_Controller;
import Controlers.LimitPeopleInGroup_Controller;
import Controlers.LogIn_Controller;
import Controlers.RecycleBin_controller;
import Controlers.RequestToChangeGroupePremission_Controller;
import Controlers.RequestToDeleteGroup_Controller;
import Controlers.SystemAdminRequestsScreen_Controller;
import Controlers.editGroup_Controller;
import Entity.*;

import java.io.*;

import Entity.*;

import java.lang.reflect.Array;
import java.util.Date;
import java.util.Enumeration;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;

import org.apache.commons.io.FileUtils;

import Entity.*;
import SampleTreeFileView.Controller;
import SampleTreeFileView.DirectoryTreeModel;
import SampleTreeFileView.FileModel;
import SampleTreeFileView.Model;

/**
 * This class overrides some of the methods defined in the abstract superclass
 * in order to give more functionality to the client.
 *
 * @author Dr Timothy C. Lethbridge
 * @author Dr Robert Lagani&egrave;
 * @author Fran&ccedil;ois B&eacute;langer
 * @version July 2000
 */
public class myBoxClient extends ObservableClient {

	/**
	 * The interface type variable. It allows the implementation of the display
	 * method in the client.
	 */
	
	private  Object currController;
	public  User_Entity currUser;

	static String  filePath;


	/**
	 * Constructs an instance of the chat client.
	 *
	 * @param host
	 *            The server to connect to.
	 * @param port
	 *            The port number to connect on.
	 * @param clientUI
	 *            The interface type variable.
	 */

	public myBoxClient(String host, int port) throws IOException {
	
		 super(host, port); // Call the superclass constructor
		
		openConnection();
	}


	/**
	 * This method handles all data that comes in from the server.
	 *
	 * @param msg
	 *            The message from the server.
	 */
	public synchronized void handleMessageFromServer(Object message) {
		System.out.println("Message received: " + message + " from Server" + MainClient.clien.getCurrController());
		try {

			if (message instanceof Login_Entity){ // user name and password is found ( 1.setCurrUser that is using application, 2.set status to 1)
				if(((Login_Entity) message).isUser() == true ){
					this.currUser = (User_Entity) message;
					((LogIn_Controller) currController).MakeLogin();
				}
				else {
					((LogIn_Controller) currController).ErrorLogin();	
				}
			}
			if(message instanceof ForgotPassword_Entity){
				((LogIn_Controller) currController).showMessage(((ForgotPassword_Entity) message).getPwd());
			}
			
			if(message instanceof SystemAdminReequestScreen_Entity)
			{
				( (SystemAdminRequestsScreen_Controller) currController).setModel((SystemAdminReequestScreen_Entity) message);
				( (SystemAdminRequestsScreen_Controller) currController).refreshList();
			}
			
			//The View Update 
			if(message instanceof DirectoryTreeModel){	
				((Controller) currController).setTree(((DirectoryTreeModel)message).getDir(),((DirectoryTreeModel)message).getShared());
			}
			if(message instanceof FileModel)
			{
				((Controller) currController).updateFileTable(((FileModel) message));
			}
			
			
			//Actions on Files 
			if(message instanceof UpLoadFile){
				((Controller) currController).ShowMessage(((UpLoadFile) message).getAnser());
				((Controller) currController).refreshListAndTree();
			}
			if(message instanceof CreateDirectory){
				((Controller) currController).ShowMessage(((CreateDirectory) message).getAnser());
				((Controller) currController).refreshListAndTree();
			}
			
			
			if(message instanceof DeleteFile){
				((Controller) currController).ShowMessage(((DeleteFile) message).getAnswer());
				((Controller) currController).refreshListAndTree();
			}
			if(message instanceof RecycleScreen_Entity){
				
				((Controller) currController).RecycleBin(((RecycleScreen_Entity)message));
				((Controller) currController).refreshListAndTree();
			}
			if(message instanceof Move_Entity){
				
				((Controller) currController).ShowMessage(((Move_Entity)message).getAnswer());;
				((Controller) currController).refreshListAndTree();
			}
			if(message instanceof Rename_Entity){
				((Controller) currController).ShowMessage(((Rename_Entity)message).getAnswer());;
				((Controller) currController).refreshListAndTree();
			}
			//***************************Edit File******************************
			if(message instanceof EditFile_Entity){
				File temp = new File ("C:/temp/"+ ((EditFile_Entity)message).getFile().getFileName());
	    		FileUtils.writeByteArrayToFile(temp,((EditFile_Entity)message).getFile().mybytearray );	    		
	    	    // Create the monitor
	    		((Controller) currController).ShowMessage("Downloaded To c:/temp");
	    		((Controller) currController).openFile("C:/temp/"+ ((EditFile_Entity)message).getFile().getFileName());
	    		filePath = ((EditFile_Entity)message).getFile().getPath();
	    		TimerTask task = new FileWatcher( temp ) {
	    	        protected void onChange( File file ) {
	    	          // here we code the action on a change
	    	          System.out.println( "File "+ file.getName() +" have change !" );
	    	          ReplaceFile_Entity replaceFile = new ReplaceFile_Entity();
	    	         File afile = new File("c:/temp/"+file.getName() );
			    	       try {
								((ReplaceFile_Entity)replaceFile).getFile().mybytearray = FileUtils.readFileToByteArray(afile);        
			    	    	} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
	    	          replaceFile.getFile().setFileName(file.getName() );
	    	          replaceFile.getFile().setPath(filePath);
		    	          try {
							sendToServer(replaceFile);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	    	        }
	    	      };

	    	      Timer timer = new Timer();
	    	      // repeat the check every second
	    	      timer.schedule( task , new Date(), 1000 );
			}
			
		//**********************************Download File *******************************************//
			if(message instanceof DownloadFile_Entity){
				File temp = new File ("C:/downloads/"+ ((DownloadFile_Entity)message).getFile().getFileName());
				FileUtils.writeByteArrayToFile(temp,((DownloadFile_Entity)message).getFile().mybytearray );	  
				((Controller) currController).ShowMessage("Downloaded To c:/downloads");
			}
			
			//Group Actions 
			if(message instanceof LoadGroup_Entity)
			{
			
			}
			
			
			
			/*************************************************************************************/
			if(message instanceof GetNotification_Entity){
				((Controller) currController).GetNotification ((GetNotification_Entity)message);
			}
			if(message instanceof LoadGroup_Entity)
			{
				if(((LoadGroup_Entity) message).getChoice()==4)
					((RequestToChangeGroupePremission_Controller) currController).FillGroup(((LoadGroup_Entity) message));
				else if(((LoadGroup_Entity) message).getChoice()==3)
					((editGroup_Controller) currController).FillGroup(((LoadGroup_Entity) message));
				else if(((LoadGroup_Entity) message).getChoice()==2)
					((AskToJoinRemoveFromGroupController) currController).FillGroup(((LoadGroup_Entity) message));
				else if(((LoadGroup_Entity) message).getChoice()==1)
					((RequestToDeleteGroup_Controller) currController).FillGroup(((LoadGroup_Entity) message));
				else if(((LoadGroup_Entity) message).getChoice()==5)
					((LimitPeopleInGroup_Controller) currController).FillGroup(((LoadGroup_Entity) message));
				else if(((LoadGroup_Entity) message).getChoice()==6)
					((AddPeopleFMS_Controller) currController).FillGroup(((LoadGroup_Entity) message));
				else if(((LoadGroup_Entity) message).getChoice()==7)
					((DeletePeopleFMS_Controller) currController).FillGroup(((LoadGroup_Entity) message));
			}
			
			//**************************ALL USERS**********************
			if(message instanceof AdminAddPeopleFMS_Entity)
				((AddPeopleFMS_Controller) currController).Filluser(((AdminAddPeopleFMS_Entity) message));
			
			//**************************ALL USERS in roup**********************
			if(message instanceof AdminDeletePeopleFMS_Entity)
				((DeletePeopleFMS_Controller) currController).Filluser(((AdminDeletePeopleFMS_Entity) message));
			
			


			
		

		} catch (Exception e) {
			System.out.println(e + "mybox client");
		}
		
		notify();
	}


	public  User_Entity getCurrUser() {
		return currUser;
	}

	public  void setCurrUser(User_Entity currUser) {
		this.currUser = currUser;
	}
	public   Object getCurrController() {
		return currController;
	}


	public void setCurrController(Object currController) {
		this.currController = currController;
	}


	public void quit() {
		try {
			sendToServer("Logout "+ MainClient.clien.getCurrUser().getIDuser());
			closeConnection();
		} catch (IOException e) {
		}
		System.exit(0);
	}
}// End of myBoxClient
