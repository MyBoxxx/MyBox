package server;
// This file contains material supporting section 3.7 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.tree.DefaultMutableTreeNode;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;

import net.proteanit.sql.DbUtils;
import Entity.*;
import SampleTreeFileView.DirectoryTreeModel;
import SampleTreeFileView.FileModel;
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
	    }catch (Exception ex) {/* handle the error*/}
	    
	  System.out.println("Message received: " + msg + " from " + client);
	  try 
	    {
	        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mybox","root","");
	        //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mybox","root","");
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
	        /************************************************************************/  	
	        if(msg instanceof SystemAdminReequestScreen_Entity){ 
	        	((SystemAdminReequestScreen_Entity) msg).setTablemodel(buildTableModel(conn,"SELECT requestID,RequestType,status,AdminRequsts.UserId , UserName FROM AdminRequsts , Users Where Users.UserID = AdminRequsts.UserId; ")); 
	        	try{
	        		client.sendToClient(msg);
	        	}
	        	catch (IOException e){
	        		e.printStackTrace();
	        	}
	        }
	   /************************************************************************/
	        
	        if(msg instanceof DeleteFile){ 
	        	((DeleteFile)msg).setAnswer(deletemyDir(conn,(DeleteFile) msg));
	        	try{
	        		client.sendToClient(msg);
	        	}
	        	catch (IOException e){
	        		e.printStackTrace();
	        	}
	        }
	        /********************/
	      
	        if(msg instanceof UpLoadFile){
	        	//fileTransfer
	        	
	        		try{
	        			((UpLoadFile) msg).setAnser(createNewFile(conn,(UpLoadFile) msg));
	        			client.sendToClient(msg);
		        	}
		        	catch (IOException e){
		        		e.printStackTrace();
		        	}
	    	}
	        if(msg instanceof FileTreeUpdate){
	        	
	        	try{
        			client.sendToClient(createTreeFiles(conn,(FileTreeUpdate) msg));
	        	}
	        	catch (IOException e){
	        		e.printStackTrace();
	        	}
	        }
	        if(msg instanceof CreateDirectory){
	        	try{
	        		((CreateDirectory) msg).setAnser(createDirectory(conn, (CreateDirectory) msg));
	        		client.sendToClient(msg);
	        	}
	        	catch(IOException e){
	        		e.printStackTrace();
	        	}
	        }
	        if(msg instanceof Model){
	        	((Model) msg).getFileTableModel().setFiles(FileUtils.convertFileCollectionToFileArray(FileUtils.listFiles(new File("Users_Files/U_1/"), TrueFileFilter.INSTANCE, TrueFileFilter.INSTANCE)));
	        	try{
	        		client.sendToClient(msg);
	        	}
	        	catch(IOException e){
	        		e.printStackTrace();
	        	}
	        }
	        /*
	        if(msg instanceof FileTable){
	        	
	        	((SystemAdminReequestScreen_Entity) msg).setTablemodel(buildTableModel(conn,"SELECT * FROM  Files WHERE Owner = '" + ((FileTable)msg).getUser().getIDuser() +"'; ")); 
	        
	        	try {
					client.sendToClient(msg);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }*/
	        if(msg instanceof DirectoryTreeModel){
	        	CreateDefaultTreeModel(conn,(DirectoryTreeModel)msg);
	    		try{
	    			client.sendToClient(msg);
	    		}
	        	catch (IOException e){
	        		e.printStackTrace();
	        	}
	        }
	        
	        if(msg instanceof ForgotPassword_Entity){
	        	forgotPassword(conn, (ForgotPassword_Entity)msg);
	    		try{
	    			client.sendToClient(msg);
	    		}
	        	catch (IOException e){
	        		e.printStackTrace();
	        	}
	        }
	        
	        if(msg instanceof FileModel){
	         	((FileModel) msg).setFileTable(buildTableModel(conn,"SELECT FileId,FileName,FilePath,size,Modified,CreatedTime,Permission,isDirectory"+
	            		" FROM files "+
	            		" where FilePath = '"+((FileModel) msg).getPath()+"' AND Owner = '" + ((FileModel) msg).getUser().getIDuser() + "' AND isDeleted = '0' ;")); 
	        	try{
	        		client.sendToClient(msg);
	        	}
	        	catch (IOException e){
	        		e.printStackTrace();
	        	}
	        }
	        /******************Recycle!*************/
	        if(msg instanceof RecycleScreen_Entity){
	          	if(((RecycleScreen_Entity) msg).getIdFile() != 0) restorFile(conn,((RecycleScreen_Entity) msg));
	          	String str = "SELECT FileId,FileName,TimeDeleted,size,isDirectory ,CASE WHEN  deletedfile.TimeDeleted >= NOW() - INTERVAL 30 DAY THEN "
	        			+ "true  ELSE false END isReostorable  FROM    deletedfile, files where  deletedfile.IDUser = '"+ ((RecycleScreen_Entity) msg).getUser().getIDuser()
	        			+"' And deletedfile.IDFile = files.FileId AND files.IsDeleted = '1'";
	        	((RecycleScreen_Entity) msg).setFileTable(buildTableModel(conn,str)); 
	        	((RecycleScreen_Entity) msg).setIdFile(0);
	        	try{
	        		client.sendToClient(msg);
	        	}
	        	catch (IOException e){
	        		e.printStackTrace();
	        	}
	        		
	        }
	        /**********************move File*************/
	        if(msg instanceof Move_Entity){
	        	((Move_Entity)msg).setAnswer(moveFile(conn,(Move_Entity)msg));
	        	try{
	        		client.sendToClient(msg);
	        	}
	        	catch (IOException e){
	        		e.printStackTrace();
	        	}
	        }
	        /**************************Rename File ***************/
			if(msg instanceof Rename_Entity){
				((Rename_Entity)msg).setAnswer(RenameFile(conn,(Rename_Entity)msg));
				try{
	        		client.sendToClient(msg);
	        	}
	        	catch (IOException e){
	        		e.printStackTrace();
	        	}
			}
			 // ******CHANGE USER NAME******************///
	        if(msg instanceof SettingsName_Entitiy){
	        	
		    	changename(conn,((SettingsName_Entitiy)msg));
		  
		    }
	        //******************************//
	        
	        // ******CHANGE USER NAME******************///
	        if(msg instanceof Settings_Entity){
	        	
		    	changepaword(conn,((Settings_Entity)msg));
		  
		    }
	        //******************************//
	        
	        // ******Load GroupsE******************///
	        if(msg instanceof LoadGroup_Entity){
	        	
		    	LoadGroup(conn,((LoadGroup_Entity)msg));
		    	try {
					client.sendToClient(msg);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		  
		    }
	        //******************************//
	        
	        // ******request to admin******************///
	        if(msg instanceof Request_Entity){
	        	
		    	request(conn,((Request_Entity)msg));
		  
		    }
	        //******************************//
	        
	        // ******request to admin******************///
	        
	        if(msg instanceof Group_Entity){
	        	changegroup(conn,((Group_Entity)msg));
	        }
	      //******************************//
	        
	        if(msg instanceof EditFile_Entity){
	        	File afile = new File(((EditFile_Entity)msg).getFile().getPath()+"/"+((EditFile_Entity)msg).getFile().getFileName());
	        	try {
					((EditFile_Entity)msg).getFile().mybytearray = FileUtils.readFileToByteArray(afile);
					client.sendToClient(msg);
	        	} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        	
	        }
	        if(msg instanceof ReplaceFile_Entity){
	        	File old = new File(((ReplaceFile_Entity)msg).getFile().getPath() +"/"+((ReplaceFile_Entity)msg).getFile().getFileName());
	        	old.delete();
	        	File newFile = new File(((ReplaceFile_Entity)msg).getFile().getPath() +"/"+((ReplaceFile_Entity)msg).getFile().getFileName());
	        	 try {
					FileUtils.writeByteArrayToFile(newFile, ((ReplaceFile_Entity)msg).getFile().mybytearray);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
	        if(msg instanceof DownloadFile_Entity){
	          	File afile = new File(((DownloadFile_Entity)msg).getFile().getPath()+"/"+((DownloadFile_Entity)msg).getFile().getFileName());
	        	try {
					((DownloadFile_Entity)msg).getFile().mybytearray = FileUtils.readFileToByteArray(afile);
					client.sendToClient(msg);
	        	} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
	        /************************************/
	        if(msg instanceof GetNotification_Entity){
	         	((GetNotification_Entity) msg).setFileTable(buildTableModel(conn,"SELECT IDNotification,Message,Satus FROM MyBox.notification Where IDuser = '"+((GetNotification_Entity)msg).getUser().getIDuser()+"';")); 
	        	try{
	        		client.sendToClient(msg);
	        	}
	        	catch (IOException e){
	        		e.printStackTrace();
	        	}
	        }
	        if(msg instanceof SetNotification_Entity){
	        	String updateTableSQL = "UPDATE notification SET Satus = '1' WHERE  IDuser = '"+((SetNotification_Entity)msg).getUser().getIDuser()+"'; ";
				java.sql.PreparedStatement preparedStatement = conn.prepareStatement(updateTableSQL);
				preparedStatement .executeUpdate();	
	        }
	        
	        
	    
	        conn.close();

	    }catch (SQLException ex) 
	 	    {/* handle any errors*/
	        System.out.println("SQLException: " + ex.getMessage());
	        System.out.println("SQLState: " + ex.getSQLState());
	        System.out.println("VendorError: " + ex.getErrorCode());
	        }
	  	
	    
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
   * This method rename files
   * @param con - connection to sql DB
   * @param fileName - File that you want to rename 
   * @param path - path of the file (to locate) 
   * @param nfilename - the new file name
   * @return String OK with file name changed to new name OR File '\' path NOT Exists 
   */
private String RenameFile(Connection con, Rename_Entity msg) {

	  Statement stmt;
		try 
		{
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Files where FileId ='"+ msg.getFile().getId() + "' AND Owner = '"+msg.getUser().getIDuser() +"';");
			if(rs.next()){
				File afile = new File(rs.getString("FilePath")+"/"+rs.getString("FileName"));
				afile.renameTo(new File(rs.getString("FilePath")+"/"+msg.getFile().getFileName()));
				String updateTableSQL = "UPDATE Files SET FileName = ? WHERE FileId = ? ";
				java.sql.PreparedStatement preparedStatement = con.prepareStatement(updateTableSQL);
				preparedStatement.setString(1,msg.getFile().getFileName());
				preparedStatement.setInt(2,msg.getFile().getId());
				preparedStatement .executeUpdate();		    	
				
		    	return "OK" + rs.getString("FileName") + "changed to " + msg.getFile().getFileName() ;
				}
				else {
					return "File '\' path NOT Exists";
					}
	    }
		 catch (SQLException e) {e.printStackTrace();
		return "problem1";
		 }


}

private String restorFile(Connection conn, RecycleScreen_Entity msg) {
	
	 Statement stmt;
		try 
		{
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Files where FileId = '" +msg.getIdFile()+"' ;");
			if(rs.next()){
				String deleteSQL = "UPDATE Files SET IsDeleted=0 WHERE FileId = '" + msg.getIdFile()+ "' ;";
				java.sql.PreparedStatement preparedStatement = conn.prepareStatement(deleteSQL);
				java.util.Date utildate = new Date();
				java.sql.Date sqldate = new java.sql.Date(utildate.getTime());
				// execute delete SQL stetement
				preparedStatement.executeUpdate();
				String DeleteFromSQL = "DELETE FROM deletedfile WHERE IDFile = '" + msg.getIdFile()+ "';" ;
				java.sql.PreparedStatement preparedStatement2 = conn.prepareStatement(DeleteFromSQL);
				preparedStatement2.executeUpdate();
				
				
				File afile = new File(rs.getString("FilePath")+"/" + rs.getString("FileName"));
				File bfile = new File("deleted/"+msg.getIdFile());
				try {
					byte[] mybytearray = FileUtils.readFileToByteArray(bfile);
					FileUtils.writeByteArrayToFile(afile,mybytearray);
					bfile.delete();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
		    	return "OK " + msg.getIdFile() + "Restored";
			}
			else {
				return "File OR path NOT Exists";
			}
	    }
		 catch (SQLException e) {e.printStackTrace();
		return "problem execute Delete";
		 }
	
	
	
}


private void CreateDefaultTreeModel(Connection conn,DirectoryTreeModel msg) {
	Statement stmt;
	try 
	{
		stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM Files WHERE Files.Owner='" +msg.getUser().getIDuser() + "' AND Files.isDirectory='1' AND Files.isDeleted='0' ORDER BY FileName;");
		while (rs.next()) {
            msg.getDir().add(rs.getString("FilePath")+"/"+rs.getString("FileName"));       
		}
	}
			 catch (SQLException e) {
				 e.printStackTrace();
	}
}

private String createDirectory(Connection con, CreateDirectory msg) {
	MyFile file =   msg.getMyDir();
	Statement stmt;
		try 
		{
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Files where FilePath ='"+ file.getPath() +"' AND FileName = '"+file.getFileName()+"';");
			if(rs.next()){
					return "directory is Exist";
					}
					else {
						String sql ="INSERT INTO files (FileName,FilePath,CreatedTime,Modified,Permission,Owner,IsDeleted,Description,isDirectory)" 
											  +"VALUES (?,?,?,?,700,"+msg.getUser().getIDuser()+",0,"+file.getDescription()+",1)";
						java.sql.PreparedStatement preparedStatement = con.prepareStatement(sql);
						preparedStatement.setString(1,file.getFileName());
						preparedStatement.setString(2,file.getPath());
						java.util.Date utildate = new Date();
						java.sql.Date sqldate = new java.sql.Date(utildate.getTime());
						preparedStatement.setDate(3, sqldate);
						preparedStatement.setDate(4, sqldate);
						preparedStatement.executeUpdate();
			    		System.out.println("converting file");
			    		File bla = new File(file.getPath() +"/"+file.getFileName());
			    		bla.mkdirs();
						return "Upload Sucseeded";
					}
	    }
		 catch (SQLException e) {e.printStackTrace();
		 return "Error";
		 }
}

private FileTreeUpdate createTreeFiles(Connection conn, FileTreeUpdate msg) {
	String path = "UsersFiles/U_"+ msg.getUser().getIDuser() + "/";
	File temp = new File(path);
	List<File> files = (List<File>) FileUtils.listFilesAndDirs(temp, TrueFileFilter.INSTANCE, TrueFileFilter.INSTANCE);
	msg.setFiles(files);
	return msg;
}

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

private String moveFile(Connection con,Move_Entity file) {
	  Statement stmt;
		try 
		{
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Files where FileId ='"+ file.getFile().getId() + "' AND Owner = '"+file.getUser().getIDuser() +"' ;");
			if(rs.next()){
				
				try {
					FileUtils.moveFile(new File(rs.getString("FilePath")+"/"+rs.getString("FileName")), new File(file.getFile().getPath()+"/"+rs.getString("FileName")));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				String updateTableSQL = "UPDATE Files SET FilePath = ? WHERE  FileId = ? ";
				java.sql.PreparedStatement preparedStatement = con.prepareStatement(updateTableSQL);
				preparedStatement.setString(1,file.getFile().getPath());
				preparedStatement.setInt(2, file.getFile().getId());
				// execute insert SQL stetement
				preparedStatement .executeUpdate();	
				
				
		    	return "OK"+ "file "+ file.getFile().getFileName() + "moved to" + file.getFile().getPath();
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
 * This method delete file
 * @param con - connection to sql DB
 * @param fileName - File that you want to rename 
 * @param path - path of the file (to locate) 
 * @return String OK <file name> deleted OR File OR path NOT Exists
 */


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

private Boolean forgotPassword(Connection con, ForgotPassword_Entity log){
	
	Statement stmt;
	try 
	{
		stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM Users where UserName ='"+ log.getEmail()+"';");
		if(rs.next()) { //if user exist
			log.setPwd(rs.getString("Password"));
			return true;
		}
		return false;
	} catch (SQLException e) {e.printStackTrace();
	return null;
	}
}
//==================================================================
public String deletemyDir(Connection con, DeleteFile msg) {
	 Statement stmt;
	 String file,path;
		try 
		{
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Files where FileId=" +msg.getFile().getId()+ " AND Owner = '"+ msg.getUser().getIDuser() + "';");
			if(rs.next()){
				file = rs.getString("FileName");
				path = rs.getString("FilePath");
				if(rs.getInt("isDirectory")==1)
				{
					ResultSet rsFile = stmt.executeQuery("SELECT * FROM Files where FilePath = '" + rs.getString("FilePath") +"/" + rs.getString("FileName") + "' AND Owner = '"+ msg.getUser().getIDuser() + "';");
					while(rsFile.next())
					{
						DeleteFile filemsg = new DeleteFile();
						filemsg.setUser(msg.getUser());
						filemsg.getFile().setId(rsFile.getInt("FileId"));
						deletemyfiles(con, filemsg);
					}
				String deleteSQL = "UPDATE Files SET IsDeleted=1 WHERE FileId=" + msg.getFile().getId();
				java.sql.PreparedStatement preparedStatement = con.prepareStatement(deleteSQL);
				java.util.Date utildate = new Date();
				java.sql.Date sqldate = new java.sql.Date(utildate.getTime());
				// execute delete SQL stetement
				preparedStatement.executeUpdate();
				String UpdateSQL = "INSERT INTO deletedfile(IDFile,TimeDeleted,IDUser) VALUES ('"+msg.getFile().getId()+"','"+sqldate+"','"+msg.getUser().getIDuser()+"');"  ;
				java.sql.PreparedStatement preparedStatement2 = con.prepareStatement(UpdateSQL);
				preparedStatement2.executeUpdate();
				
				File afile = new File(path+"/" + file);
				try {
					System.out.println("blac");
					FileUtils.deleteDirectory(afile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("cant Delete Dir");
				}
				return "OK " + msg.getFile().getFileName() + "deleted";
				}
				else return deletemyfiles(con,msg);
			}
				
	    }
		 catch (SQLException e) {e.printStackTrace();
		return "problem execute Delete";
		 }
		return "";
}	
public String deletemyfiles(Connection con, DeleteFile msg) {
	 Statement stmt;
		try 
		{
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Files where FileId=" +msg.getFile().getId()+ " AND Owner = '"+ msg.getUser().getIDuser() + "' AND IsDeleted = 0;");
			if(rs.next()){
				String deleteSQL = "UPDATE Files SET IsDeleted=1 WHERE FileId=" + msg.getFile().getId();
				java.sql.PreparedStatement preparedStatement = con.prepareStatement(deleteSQL);
				java.util.Date utildate = new Date();
				java.sql.Date sqldate = new java.sql.Date(utildate.getTime());
				// execute delete SQL stetement
				preparedStatement.executeUpdate();
				String UpdateSQL = "INSERT INTO deletedfile(IDFile,TimeDeleted,IDUser) VALUES ('"+msg.getFile().getId()+"','"+sqldate+"','"+msg.getUser().getIDuser()+"');"  ;
				java.sql.PreparedStatement preparedStatement2 = con.prepareStatement(UpdateSQL);
				preparedStatement2.executeUpdate();
				
				File afile = new File(rs.getString("FilePath")+"/" + rs.getString("FileName"));
				try {
					byte[] mybytearray = FileUtils.readFileToByteArray(afile);
					FileUtils.writeByteArrayToFile(new File("deleted/"+rs.getString("FileId")),mybytearray);
					afile.delete();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
		    	return "OK " + msg.getFile().getFileName() + "deleted";
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
private String createNewFile(Connection con, UpLoadFile msg) {
	MyFile file =   msg.getMyfile();
	String path =  file.getPath() ;
	Statement stmt;
		try 
		{
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Files where FileName ='"+ file.getFileName()+ "' AND FilePath ='"+path+"';");// AND FilePath = '"+ file.getTheFile().getAbsolutePath() +"' ;");
			if(rs.next()){
					return "file is in the User Dir";
					}
					else {
						System.out.println("insert to sql");
						String insertTableSQL = "INSERT INTO Files"
								+ "(FileName,FilePath,CreatedTime,Modified,Permission,Owner,IsDeleted,Description,isDirectory,size) VALUES"
								+ "(?,?,?,?,700,?,0,'',0,?)";
						java.sql.PreparedStatement preparedStatement = con.prepareStatement(insertTableSQL);
						preparedStatement.setString(1,file.getFileName());
						preparedStatement.setString(2,file.getPath());
						java.util.Date utildate = new Date();
						java.sql.Date sqldate = new java.sql.Date(utildate.getTime());
						preparedStatement.setDate(3, sqldate);
						preparedStatement.setDate(4, sqldate);
						preparedStatement.setInt(5, msg.getUser().getIDuser());
						preparedStatement.setLong(6, file.getFsize());
						preparedStatement.executeUpdate();
			    		System.out.println("converting file");
			    		FileUtils.writeByteArrayToFile(new File (file.getPath() +"/"+ file.getFileName()), file.getMybytearray());		    			    		    		  
			    		
						// execute insert SQL stetement
						return "Upload Sucseeded";
					}
	    }
		 catch (SQLException e) {e.printStackTrace();
		 return "Error";
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Errror";
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
public DefaultMutableTreeNode addNodes(DefaultMutableTreeNode curTop, File dir) {
    String curPath = dir.getPath();
    DefaultMutableTreeNode curDir = new DefaultMutableTreeNode(curPath);
    if (curTop != null) { // should only be null at root
      curTop.add(curDir);
    }
    Vector ol = new Vector();
    String[] tmp = dir.list();
    for (int i = 0; i < tmp.length; i++)
      ol.addElement(tmp[i]);
    Collections.sort(ol, String.CASE_INSENSITIVE_ORDER);
    File f;
    Vector files = new Vector();
    // Make two passes, one for Dirs and one for Files. This is #1.
    for (int i = 0; i < ol.size(); i++) {
      String thisObject = (String) ol.elementAt(i);
      String newPath;
      if (curPath.equals("."))
        newPath = thisObject;
      else
        newPath = curPath + File.separator + thisObject;
      if ((f = new File(newPath)).isDirectory()) // add Directory
        addNodes(curDir, f);
      //else //addfiles 
        //files.addElement(thisObject);
    }
    // Pass two: for files.
    for (int fnum = 0; fnum < files.size(); fnum++)
      curDir.add(new DefaultMutableTreeNode(files.elementAt(fnum)));
    return curDir;
  }
//===================== CHANGE USER GROUP==================
private void changename(Connection con,SettingsName_Entitiy log) {
	// TODO Auto-generated method stub
	Statement stmt;
	int id =1  ;
	try 
	{
	
		stmt = con.createStatement();
		String s="SELECT UserID FROM mybox.Users where UserName = '"+log.getOlduser().getUsername()+"' ;";
		ResultSet rs= stmt.executeQuery(s);
		while(rs.next()){
		id = rs.getInt("UserID");
		}
		String sql= "UPDATE mybox.users SET UserName = '"+log.getNewuser().getUsername()+"' WHERE UserID = '"+ id +"';";
		java.sql.PreparedStatement ps1 = con.prepareStatement(sql);
		stmt.executeUpdate(sql);
		
		}
	 catch (SQLException e) {e.printStackTrace();
	
	}
}
//********************************//

//=========================CHANGE PASSSWORD=======================
private void changepaword(Connection con, Settings_Entity log) {
	// TODO Auto-generated method stub
	Statement stmt;
	int id =0;
	try 
	{
	
		stmt = con.createStatement();
		String s="SELECT UserID FROM mybox.Users where UserName = '"+log.getOlduser().getUsername()+"' ;";
		ResultSet rs= stmt.executeQuery(s);
		while(rs.next()){
		id = rs.getInt("UserID");
		}
		String sql= "UPDATE mybox.users SET Password = '"+log.getNewuser().getPassword()+"' WHERE UserID = '"+ id +"';";
		java.sql.PreparedStatement ps1 = con.prepareStatement(sql);
		stmt.executeUpdate(sql);
		
		}
	 catch (SQLException e) {e.printStackTrace();
	
	}
	
}
//===============================================//

//==================LOAD GROUP========================//
private void LoadGroup(Connection con, LoadGroup_Entity log) {
	// TODO Auto-generated method stub
	   Statement stmt;
	   String[] grop;
	   try 
		{
		
			stmt = con.createStatement();
			if (log.getChoice()==2){
			String s="SELECT * FROM myBox.Groups";
			ResultSet rs= stmt.executeQuery(s);
			while(rs.next()){
					log.getGroups().add(rs.getString("GroupName"));
			}
		
			//grop=log.getGroups().toArray(new String[log.getGroups().size()]);
			}
			if (log.getChoice()==1 || log.getChoice()==3){
				String s="select  distinct GroupName "+
						"from mybox.users ,mybox.useringroup, mybox.groups "+
						"where  useringroup.IdUser =" + log.getUser().getIDuser() + " and groups.IDGroup = useringroup.IDGroup";
				ResultSet rs= stmt.executeQuery(s);
				while(rs.next()){
						log.getGroups().add(rs.getString("GroupName"));
				}
			
				//grop=log.getGroups().toArray(new String[log.getGroups().size()]);
			}
			
	}
   
	
	 catch (SQLException e) {e.printStackTrace();
	
	}
}
//===============REQUEST===============================//
private void request(Connection con, Request_Entity log) {
	// TODO Auto-generated method stub
	 Statement stmt;
	 String s = null;
	 try 
		{
			stmt = con.createStatement();
			if (log.getRadio()==2)
			{
				s="INSERT INTO adminrequsts(RequestType,status,UserId)"
						+" VALUES('RemovePeopleToGroup "+log.getChooise()+"','0','"+log.getUser().getIDuser()+"');"; 
					 stmt.executeUpdate(s);
			}
			else if (log.getRadio()==1)
			{
				s="INSERT INTO adminrequsts(RequestType,status,UserId)"
						+" VALUES('AddPeopleToGroup "+log.getChooise()+"','0','"+log.getUser().getIDuser()+"');"; // add row to all admin request";
					 stmt.executeUpdate(s);
			}
	 		else if (log.getRadio()==3)
	 		{
			s="INSERT INTO adminrequsts(RequestType,status,UserId)"
					+" VALUES('Delete "+log.getChooise()+"','0','"+log.getUser().getIDuser()+"');"; // add row to all admin request";
				 stmt.executeUpdate(s);
	 		}
	 		else if (log.getRadio()==4)
	 		{
			s="INSERT INTO adminrequsts(RequestType,status,UserId)"
					+" VALUES('change permission to read group "+log.getChooise()+"','0','"+log.getUser().getIDuser()+"');"; // add row to all admin request";
				 stmt.executeUpdate(s);
	 		}
	 		else if (log.getRadio()==5)
	 		{
			s="INSERT INTO adminrequsts(RequestType,status,UserId)"
					+" VALUES('change permission to write group "+log.getChooise()+"','0','"+log.getUser().getIDuser()+"');"; // add row to all admin request";
				 stmt.executeUpdate(s);
	 		}
	 		else if (log.getRadio()==6)
	 		{
			s="INSERT INTO adminrequsts(RequestType,status,UserId)"
					+" VALUES('change permission to write and read group "+log.getChooise()+"','0','"+log.getUser().getIDuser()+"');"; // add row to all admin request";
				 stmt.executeUpdate(s);
	 		}
		}
	 
	   
		 catch (SQLException e) {e.printStackTrace();
		
		}
	
}


private void changegroup(Connection con, Group_Entity log) {
	// TODO Auto-generated method stub
	 Statement stmt;
	 int id = 0;
	 String name;
	 String Des;
	   try 
		{
		
			stmt = con.createStatement();
			if (log.getGroupname().equals(null)==false && log.getGroupdescript().equals(null)==false)
			{
			String s="SELECT IDGroup FROM myBox.Groups";
			ResultSet rs= stmt.executeQuery(s);
			while(rs.next()){
					id = rs.getInt("IDGroup");
			}
			String sql= "UPDATE mybox.groups SET GroupName = "+log.getGroupname()+" GroupDescription = "
			+log.getGroupdescript()+" WHERE IDGroup = "+ id +";";
			java.sql.PreparedStatement ps1 = con.prepareStatement(sql);
			stmt.executeUpdate(sql);
			}
			else if (log.getGroupname().equals(null)==true && log.getGroupdescript().equals(null)==true)
			{
				return;
			}
			else if (log.getGroupname().equals(null)==false && log.getGroupdescript().equals(null)==true)
			{
				String s="SELECT IDGroup FROM myBox.Groups";
				ResultSet rs= stmt.executeQuery(s);
				while(rs.next()){
						id = rs.getInt("IDGroup");
				}
				String sql= "UPDATE mybox.groups SET GroupName = '"+log.getGroupname()+"' WHERE IDGroup = "+ id +";";
				java.sql.PreparedStatement ps1 = con.prepareStatement(sql);
				stmt.executeUpdate(sql);
			}
			else if (log.getGroupname().equals(null)==true && log.getGroupdescript().equals(null)==false)
			{
				String s="SELECT IDGroup FROM myBox.Groups";
				ResultSet rs= stmt.executeQuery(s);
				while(rs.next()){
						id = rs.getInt("IDGroup");
				}
				String sql= "UPDATE mybox.groups SET GroupDescription = '"
				+log.getGroupdescript()+"' WHERE IDGroup = "+ id +";";
				java.sql.PreparedStatement ps1 = con.prepareStatement(sql);
				stmt.executeUpdate(sql);
			}
			
		}
	   
		
		 catch (SQLException e) {e.printStackTrace();
		
		}
}



}
/*
public TreeNode buildTree(){
    String[] names = new String[]; // fill this with the names of your plugins

    TreeNode tree;

    // for each plugin name...
    for (int i=0;i<names.length;i++){
        String currentName = names[i];
        String[] splitName = currentName.split(".");

        // loop over the split name and see if the nodes exist in the tree. If not, create them
        TreeNode parent = tree;
        for (int n=0;n<splitName.length;n++){
            if (parent.hasChild(splitName[n])){
                // the parent node exists, so it doesn't need to be created. Store the node as 'parent' to use in the next loop run
                parent = parent.getChild(splitName[n]);
            }
            else {
                // the node doesn't exist, so create it. Then set it as 'parent' for use by the next loop run
                TreeNode child = new TreeNode(splitName[n]);
                parent.addChild(child);
                parent = child;
            }
        }

return tree;
}

*/

/* OLD
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

} */

/*private String deleteFile(Connection con, String fileName, String path) {
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
}*/
