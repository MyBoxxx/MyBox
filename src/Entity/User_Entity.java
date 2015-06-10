package Entity;
import java.util.List;


@SuppressWarnings("serial")
public class User_Entity extends AbstractEntity_Entity{
	
	private String IDuser;
	private String Username;
	private String Password;
	private int Status ;
	private boolean isLogedin ;
	private boolean isAdmin ;	
	
	
public User_Entity(String IDuser, String Username,String Password, int Status, boolean isLogedin, boolean isadmin){
	
		this.IDuser = IDuser;
		this.Username = Username;
		this.Password = Password;
		this.Status = Status;
		this.isLogedin = isLogedin;
		this.isAdmin = isadmin;
		
	}



	public User_Entity() {
	// TODO Auto-generated constructor stub
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
