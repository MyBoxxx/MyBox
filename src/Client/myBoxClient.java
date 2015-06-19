// This file contains material supporting section 3.7 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 

package Client;

import ocsf.client.*;
import Controlers.LogIn_Controller;
import Controlers.SystemAdminRequestsScreen_Controller;
import Entity.*;

import java.io.*;

import Entity.*;

import java.lang.reflect.Array;
import java.util.Enumeration;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;

import server.FileTable;
import Entity.*;
import SampleTreeFileView.Controller;
<<<<<<< HEAD
=======
import SampleTreeFileView.DirectoryTreeModel;
import SampleTreeFileView.FileModel;
>>>>>>> refs/heads/master
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
		System.out.println("Message received: " + message + " from Server");
		try {

			if (message instanceof Login_Entity){ // user name and password is found ( 1.setCurrUser that is using application, 2.set status to 1)
				if(((Login_Entity) message).isUser() == true){
					this.currUser = (User_Entity) message;
					((LogIn_Controller) currController).MakeLogin();
				}
				else {
					((LogIn_Controller) currController).ErrorLogin();	
				}
			}
			
			if(message instanceof SystemAdminReequestScreen_Entity)
			{
				( (SystemAdminRequestsScreen_Controller) currController).setModel((SystemAdminReequestScreen_Entity) message);
				( (SystemAdminRequestsScreen_Controller) currController).refreshList();
			}
			
			if(message instanceof FileTreeUpdate){
				
				DefaultMutableTreeNode bla1 = new DefaultMutableTreeNode();
				for (File file : ((FileTreeUpdate)message).getFiles() ) {
					if(file.isDirectory()) 
						System.out.println("file: " + file.getCanonicalPath());
				}	
				JTree bla = new JTree(bla1);
			}
			if(message instanceof Model){
				
				( (Controller) currController).setModel((Model)message);
<<<<<<< HEAD
				( (Controller) currController).setTableData();
			}
			if(message instanceof FileTable){
				((Controller) currController).getModel().setTablemodel(((FileTable) message).getTablemodel());
				((Controller) currController).refreseList();
=======

			}
			if(message instanceof FileTable){
				((Controller) currController).getModel().setTablemodel(((FileTable) message).getTablemodel());
				((Controller) currController).refreseList();
			}
			
			if(message instanceof DirectoryTreeModel){	
				((Controller) currController).setTree(((DirectoryTreeModel)message).getDir(),((DirectoryTreeModel)message).getShared());
				((Controller) currController).updateFileTable(((DirectoryTreeModel) message));
>>>>>>> refs/heads/master
			}
			
			
		

		} catch (Exception e) {
			System.out.println(e + "mybox client");
		}
		
		notify();
	}


	public  User_Entity getCurrUser() {
		return currUser;
	}

	public  void setCurrUser(User_Entity currUser) {
		currUser = currUser;
	}
	public   Object getCurrController() {
		return currController;
	}


	public void setCurrController(Object currController) {
		this.currController = currController;
	}


	public void quit() {
		try {
			closeConnection();
		} catch (IOException e) {
		}
		System.exit(0);
	}
}// End of myBoxClient
