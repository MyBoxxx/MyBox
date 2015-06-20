package Entity;
import java.sql.Date;
import java.util.List;


@SuppressWarnings("serial")
public class User_Entity extends Abstract_Entity{
	
	private int IDuser; //Not NUll Auto Increment
	private String Username; 
	private String Password;
	private boolean isLogedin ; // status of login - > true = in the system
	private boolean isAdmin ;	// status of user -> true = is admin
	private Date memberSiense;
	
	
public User_Entity(int IDuser, String Username,String Password, int Status, boolean isLogedin, boolean isadmin){
	
		this.IDuser = IDuser;
		this.Username = Username;
		this.Password = Password;
		this.isLogedin = isLogedin;
		this.isAdmin = isadmin;
	}

public User_Entity() {

}

public int getIDuser() {
	return IDuser;
}

public void setIDuser(int iDuser) {
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

public Date getMemberSiense() {
	return memberSiense;
}

public void setMemberSiense(Date memberSiense) {
	this.memberSiense = memberSiense;
}

	
}
