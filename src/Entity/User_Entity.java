package Entity;
import java.util.List;


@SuppressWarnings("serial")
public class User_Entity extends Abstract_Entity{
	
	private String IDuser; //Not NUll Auto Increment
	private String Username; 
	private String Password;
	private int Status ; //-1 Not In system 0 ok 1 ban
	private boolean isLogedin ; // status of login - > true = in the system
	private boolean isAdmin ;	// status of user -> true = is admin
	
	
public User_Entity(String IDuser, String Username,String Password, int Status, boolean isLogedin, boolean isadmin){
	
		this.IDuser = IDuser;
		this.Username = Username;
		this.Password = Password;
		this.Status = Status;
		this.isLogedin = isLogedin;
		this.isAdmin = isadmin;
		
	}

public User_Entity() {

}

	public User_Entity(String Username) {
		this.Username = Username;
	// TODO search in sql and complte
}



	public String getIDuser() {
		return IDuser;
	}

	public void setIDuser(String iDuser) {
		IDuser = iDuser;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public int getStatus() {
		return Status;
	}

	public void setStatus(int status) {
		Status = status;
	}

	public boolean isLogedin() {
		return isLogedin;
	}

	public void setLogedin(boolean isLogedin) {
		this.isLogedin = isLogedin;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
}
