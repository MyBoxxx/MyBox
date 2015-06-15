package server;
// This file contains material supporting section 3.7 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import net.proteanit.sql.DbUtils;
import Entity.Login_Entity;
import Entity.SystemAdminReequestScreen_Entity;
import SampleTreeFileView.Model;
import ocsf.server.AbstractServer;
import ocsf.server.ConnectionToClient;

/**
 * This class overrides some of the methods in the abstract 
 * superclass in order to give more functionality to the server.
 *
 * @author Dr Timothy C. Lethbridge
 * @author Dr Robert Lagani&egrave;re
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Paul Holden
 * @version July 2000
 */
public class MyBoxServer extends AbstractServer 
{
  //Class variables *************************************************
  
  /**
   * The default port to listen on.
   */
  final public static int DEFAULT_PORT = 5555;
  
  //Constructors ****************************************************
  
  /**
   * Constructs an instance of the echo server.
   *
   * @param port The port number to connect on.
   */
  public MyBoxServer(int port) 
  {
    super(port);
  }



/**
   * This method overrides the one in the superclass.  Called
   * when the server starts listening for connections.
   */
  protected void serverStarted()
  {
    System.out.println
      ("Server listening for connections on port " + getPort());
  }
  
  /**
   * This method overrides the one in the superclass.  Called
   * when the server stops listening for connections.
   */
  protected void serverStopped()
  {
    System.out.println
      ("Server has stopped listening for connections.");
  }
  
  //Class methods ***************************************************
  
  /**
   * This method is responsible for the creation of 
   * the server instance (there is no UI in this phase).
   *
   * @param args[0] The port number to listen on.  Defaults to 5555 
   *          if no argument is entered.
   */
  public static void main(String[] args) 
  {
    int port = 0; //Port to listen on
    try
    {
      port = Integer.parseInt(args[0]); //Get port from command line
    }
    catch(Throwable t)
    {
      port = DEFAULT_PORT; //Set port to 5555
    }
	
    MyBoxServer sv = new MyBoxServer(port);
    
    try 
    {
      sv.listen(); //Start listening for connections
    } 
    catch (Exception ex) 
    {
      System.out.println("ERROR - Could not listen for clients!");
    }
    
   
  }
 
  //Instance methods ************************************************
  
  /**
   * This method handles any messages received from the client.
   *
   * @param msg The message received from the client.
   * @param client The connection from which the message originated.
   */
  public void handleMessageFromClient (Object msg, ConnectionToClient client)
  {
	  try 
		{
	        Class.forName("com.mysql.jdbc.Driver").newInstance();
	    } catch (Exception ex) {/* handle the error*/}
	    
	  try 
	    {
	        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mybox","root","");
	        //Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.3.68/test","root","Root");
	        System.out.println("SQL connection succeed");
	        if(msg instanceof Login_Entity){
	        	System.out.println("Try To Coneect as "+ ((Login_Entity)msg).getUsername());
	        	if(checkUserPassword(conn,(Login_Entity)msg)) System.out.println("Login Succsed");
	        	else System.out.println("Login Failed");
	        	try {
						client.sendToClient(msg);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	        	 
	        }
	        		
	        	
	        if(msg instanceof SystemAdminReequestScreen_Entity){
	        	((SystemAdminReequestScreen_Entity) msg).setTablemodel(buildTableModel(conn,"SELECT requestID,RequestType,status,AdminRequsts.UserId , UserName FROM AdminRequsts , Users Where Users.UserID = AdminRequsts.UserId; ")); 
	        	try{
	        		client.sendToClient(msg);
	        	}
	        	catch (IOException e){
	        		e.printStackTrace();
	        	}
	        }
	        if(msg instanceof Model){
	    		File temp =  new File("U_"+((Model)msg).getUserID());
	    		//if(!temp.exists()) temp.mkdir();
	    		//((Model) msg).getNewFile()
	    		try{
	    			org.apache.commons.io.FileUtils.copyFileToDirectory(((Model)msg).getNewFile() , temp );
		    		System.out.println("path : "+ temp.getPath()  + "isDir = " + temp.isDirectory());

	    		}
	    		catch (IOException e){
	    			e.printStackTrace();
	    			}
	    	}
	        
	        
	        if(msg instanceof String){
	        	try {
		        if(msg.toString().startsWith("login")){
			    	String temp = msg.toString();
			    	String delims = " ";
			    	String[] tokens = temp.split(delims);
			    	if(tokens.length == 3){
			    	if(checkUserPassword(conn,(Login_Entity)msg))
							client.sendToClient("Login Ok");
						
					else client.sendToClient("Login failed");
			    	}
			    	else client.sendToClient("Not enough parametes");
			    }
		        else if(msg.toString().startsWith("search")){
			    	String temp = msg.toString();
			    	String delims = " ";
			    	String[] tokens = temp.split(delims);
			    	if(tokens.length == 2){
			    	client.sendToClient(searchFile(conn,tokens[1]));
			     	}
			    	else client.sendToClient("Not enough parametes");
			    	
			    }
		        else if(msg.toString().startsWith("pathsearch")){
			    	String temp = msg.toString();
			    	String delims = " ";
			    	String[] tokens = temp.split(delims);
			    	if(tokens.length == 2){
			    	client.sendToClient(searchPath(conn,tokens[1]));
			     	}
			    	else client.sendToClient("Not enough parametes");
			    	
			    }
		        else if(msg.toString().startsWith("create")){
		          	String temp = msg.toString();
			    	String delims = " ";
			    	String[] tokens = temp.split(delims);
			    	if(tokens.length == 3){
				   
			    		client.sendToClient(createNewFile(conn,tokens[1],tokens[2]));
				     	}
				    	else client.sendToClient("Not enough parametes");
		        }
		        else if(msg.toString().startsWith("delete")){
		          	String temp = msg.toString();
			    	String delims = " ";
			    	String[] tokens = temp.split(delims);
			    	if(tokens.length == 3){
				    	client.sendToClient(deleteFile(conn,tokens[1],tokens[2]));
				     	}
				    	else client.sendToClient("Not enough parametes");
		        }
		        else if(msg.toString().startsWith("rename")){
		          	String temp = msg.toString();
			    	String delims = " ";
			    	String[] tokens = temp.split(delims);
			    	if(tokens.length == 4){
				    	
			    		client.sendToClient(renameFile(conn,tokens[1],tokens[2],tokens[3]));
				     	}
				    	else client.sendToClient("Not enough parametes");
		        }	
		        else if(msg.toString().startsWith("move")){
		          	String temp = msg.toString();
			    	String delims = " ";
			    	String[] tokens = temp.split(delims);
			    	if(tokens.length == 4){
				    	
			    		client.sendToClient(moveFile(conn,tokens[1],tokens[2],tokens[3]));
				     }
				    else client.sendToClient("Not enough parametes");
		        }	
		        else if(msg.toString().startsWith("getallfiles")){
		        	client.sendToClient(getallfiles(conn));
		        }
		        else if(msg.toString().startsWith("help"))
		        {
		        	client.sendToClient(helpPrint());
		        }
		        else client.sendToClient("Command not Found");
	        	
	        	} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	     } else
				try {
					client.sendToClient("This is not a String");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        
	 	}
	    catch (SQLException ex) 
	 	    {/* handle any errors*/
	        System.out.println("SQLException: " + ex.getMessage());
	        System.out.println("SQLState: " + ex.getSQLState());
	        System.out.println("VendorError: " + ex.getErrorCode());
	        }
	  	System.out.println("Message received: " + msg + " from " + client);
	    
	  	//client.sendToClient(msg);
	  }

    /*
 private void SystemAdminRequestScree_List_getList(Connection conn,
		SystemAdminRequestScree_List msg) {
	 Statement stmt;
		try 
		{
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM AdminRequsts ORDER BY status;");
			ArrayList<SystemAdminReequestScreen_Entity> ListFromServer = new ArrayList<SystemAdminReequestScreen_Entity>();
			while (rs.next()) {
				ListFromServer.add(new SystemAdminReequestScreen_Entity(rs.getInt("requestID"), rs.getInt("theRequest"), rs.getInt("status") , rs.getString("name")));
			}
			msg.setListFromServer(ListFromServer);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	 
	
}
*/


/**
  *   This method return all option commands
 * @return String of all option list with commands 
 */
private String helpPrint() {
	String tempString = "";
	tempString += "login user --> login <user name> <passwor> \n";
	tempString += "create file --> create <file name> <file path> \n";  
	tempString += "delete file --> delete <file name> <file path> \n";  
	tempString += "rename file --> rename <file name> <file path> <new file name> \n"; 
	tempString += "move file --> move <file name> <file path> <new path> \n"; 
	tempString += "get all files file --> getallfiles \n";
	tempString += "search file --> search <file name> \n";
	tempString += "search path file --> pathsearch <path> \n";
	
	return tempString;
}

 /**
  *   This method search for path in db and print all files 
 * @param con - connection with sql DB
 * @param path - string of path (of file)
 * @return String of "File : <file name>  Path: <file path>" for all files that have path in SQL.files.path 
 */
private String searchPath(Connection con, String path) {
		Statement stmt;
		try 
		{
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Files where FilePath LIKE '%" + path + "%' ORDER BY FilePath;");
			String[] arr = null;
			String[] arr1 = null;
	        String temp = "";
			while (rs.next()) {
	            String FileName = rs.getString("FileName");
	            String FilePath = rs.getString("FilePath");
	           arr = FileName.split("\n");
	           arr1 = FilePath.split("\n");
	           for (int i =0; i < arr.length; i++){
	               temp += "File : " + arr[i] +" Path: "+ arr1[i] + " \n";
	           }
	        }
			return temp ;
			//stmt.executeUpdate("UPDATE course SET semestr=\"W08\" WHERE num=61309");
		} catch (SQLException e) {e.printStackTrace();
		return path;
		}

}

 /**
  * This method move file from path to new path
 * @param con - connection to SQL DB
 * @param fileName - File that you want to move
 * @param path - path of file that the file in now
 * @param npath - new place (path) to the file
 * @return - OK with file name and new path OR File '\' path NOT Exists 
 */
private String moveFile(Connection con,String fileName, String path, String npath) {
	  Statement stmt;
		try 
		{
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Files where FileName ='"+ fileName+ "' AND FilePath = '"+path +"' ;");
			if(rs.next()){
				String updateTableSQL = "UPDATE Files SET FilePath = ? WHERE FileName = ? AND FilePath = ? ";
				java.sql.PreparedStatement preparedStatement = con.prepareStatement(updateTableSQL);
				preparedStatement.setString(1,npath);
				preparedStatement.setString(2,fileName);
				preparedStatement.setString(3,path);
				// execute insert SQL stetement
				preparedStatement .executeUpdate();		    	
				
		    	return "OK"+ "file "+ fileName + "moved to" + npath;
					}
					else {
						return "File '\' path NOT Exists";
					}
	    }
		//stmt.executeUpdate("UPDATE course SET semestr=\"W08\" WHERE num=61309");
		 catch (SQLException e) {e.printStackTrace();
		return "problem1";
		 }
}

/**
 * This method get all files in the system
 * @param conn connection to SQL DB
 * @return String of all the files are in the system --> File : <file name> Path: <path> ;
 */
private String getallfiles(Connection conn) {
	  Statement stmt;
		try 
		{
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Files ORDER BY FileName;");
			String[] arr = null;
			String[] arr1 = null;
	        String temp = "";
			while (rs.next()) {
	            String FileName = rs.getString("FileName");
	            String FilePath = rs.getString("FilePath");
	           arr = FileName.split("\n");
	           arr1 = FilePath.split("\n");
	           for (int i =0; i < arr.length; i++){
	               temp += "File : " + arr[i] +" Path: "+ arr1[i] + " \n";
	           }
	        }
			return temp ;
		}
				 catch (SQLException e) {e.printStackTrace();
					return "problem in SQL";
		}
}

/**
 * This method rename files
 * @param con - connection to sql DB
 * @param fileName - File that you want to rename 
 * @param path - path of the file (to locate) 
 * @param nfilename - the new file name
 * @return String OK with file name changed to new name OR File '\' path NOT Exists 
 */
private String renameFile(Connection con, String fileName, String path, String nfilename) {
	  Statement stmt;
		try 
		{
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Files where FileName ='"+ fileName+ "' AND FilePath = '"+path +"';");
			if(rs.next()){
				String updateTableSQL = "UPDATE Files SET FileName = ? WHERE FileName = ? AND FilePath = ? ";
				java.sql.PreparedStatement preparedStatement = con.prepareStatement(updateTableSQL);
				preparedStatement.setString(1,nfilename);
				preparedStatement.setString(2,fileName);
				preparedStatement.setString(3,path);
				preparedStatement .executeUpdate();		    	
				
		    	return "OK" + fileName + "changed to " + nfilename ;
					}
					else {
						return "File '\' path NOT Exists";
					}
	    }
		 catch (SQLException e) {e.printStackTrace();
		return "problem1";
		 }
}

/**
 * This method delete file
 * @param con - connection to sql DB
 * @param fileName - File that you want to rename 
 * @param path - path of the file (to locate) 
 * @return String OK <file name> deleted OR File OR path NOT Exists
 */
private String deleteFile(Connection con, String fileName, String path) {
	  Statement stmt;
		try 
		{
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Files where FileName ='"+ fileName+ "' AND FilePath = '"+path +"' ;");
			if(rs.next()){
				String deleteSQL = "DELETE from Files WHERE FileName = ? AND FilePath = ?";
				java.sql.PreparedStatement preparedStatement = con.prepareStatement(deleteSQL);
				preparedStatement.setString(1,fileName);
				preparedStatement.setString(2,path);
				// execute delete SQL stetement
				System.out.println("check123" + rs.next());
				preparedStatement.executeUpdate();
				
		    	return "OK " + fileName + "deleted";
					}
					else {
						return "File OR path NOT Exists";
					}
	    }
		 catch (SQLException e) {e.printStackTrace();
		return "problem execute Delete";
		 }
}

/**
 * This method check username and password
 * @param con - connection to sql DB
 * @param user - Username to check
 * @param pass - Password to check
 * @return Boolean - True if user + pass in DB or False 
 */
private Boolean checkUserPassword(Connection con, Login_Entity log){
	
	Statement stmt;
	try 
	{
		stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM Users where UserName ='"+ log.getUsername() + "' AND Password = '"+log.getPassword() +"' ;");
		if(rs.next()) { //if user exist
			log.setIDuser(rs.getInt("UserID"));
			if(rs.getString("isAdmin").equals("1")) log.setAdmin(true);
			if(rs.getInt("isLogin")==1) log.setAdmin(true);
			log.setUser(true);
			return true;
		}
		log.setUser(false);
		return false;
	} catch (SQLException e) {e.printStackTrace();
	return null;
	}
	
	
}

/**
 * This method search file in DB
 * @param con - connection 
 * @param file  - file (part of name) 
 * @return String of files --> File : <file name>  Path: <path> ;
 */
private String searchFile(Connection con, String file)
{
	Statement stmt;
	try 
	{
		stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM Files where FileName LIKE '%" + file + "%' ORDER BY FileName;");
		String[] arr = null;
		String[] arr1 = null;
      String temp = "";
		while (rs.next()) {
          String FileName = rs.getString("FileName");
          String FilePath = rs.getString("FilePath");
         arr = FileName.split("\n");
         arr1 = FilePath.split("\n");
         for (int i =0; i < arr.length; i++){
             temp += "File : " + arr[i] +" Path: "+ arr1[i] + " \n";
         }
      }
		return temp ;
	} catch (SQLException e) {e.printStackTrace();
	}
	return file;

}

/**
 * This method create new file in DB
 * @param con connection to SQL DB
 * @param fileName - File name 
 * @param path - Path 
 * @return String "OK File:  < file Name >  <path> Add" OR "File Already Exists"
 */
private String createNewFile(Connection con, String fileName, String path) {
	  Statement stmt;
		try 
		{
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Files where FileName ='"+ fileName+ "' AND FilePath = '"+path +"' ;");
			if(rs.next()){
					return "File Already Exists";
					}
					else {
						String insertTableSQL = "INSERT INTO Files"
								+ "(FileName,FilePath) VALUES"
								+ "(?,?)";
						java.sql.PreparedStatement preparedStatement = con.prepareStatement(insertTableSQL);
						preparedStatement.setString(1, fileName);
						preparedStatement.setString(2, path);
						// execute insert SQL stetement
						preparedStatement .executeUpdate();

						return "OK File: " + fileName + path + "Add";
					}
	    }
		 catch (SQLException e) {e.printStackTrace();
		 return "problem execute Create";
		 }
}


public void TableFromDatabase(JTable table, String Query,Connection conn)
	{
	    try
	    {
	        Statement stat = conn.createStatement();
	        ResultSet rs = stat.executeQuery(Query);
	        //To remove previously added rows
	        while(table.getRowCount() > 0) 
	        {
	            ((DefaultTableModel) table.getModel()).removeRow(0);
	        }
	        int columns = rs.getMetaData().getColumnCount();
	        while(rs.next())
	        {  
	            Object[] row = new Object[columns];
	            for (int i = 1; i <= columns; i++)
	            {  
	                row[i - 1] = rs.getObject(i);
	            }
	            ((DefaultTableModel) table.getModel()).insertRow(rs.getRow()-1,row);
	        }

	        rs.close();
	        stat.close();
	    }
	    catch(SQLException e)
	    {
	    }
	}

public  TableModel buildTableModel(Connection con,String stat)
	{
	
		  	Statement stmt;
			try 
			{
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(stat);
			return DbUtils.resultSetToTableModel(rs);
			
			
			}
			catch (Exception e){
				
			}
			return null;
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> refs/heads/master
