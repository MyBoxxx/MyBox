package Entity;

<<<<<<< HEAD
public class Login_Entity extends Abstract_Entity {
	
	
	private String User;
	private String Password;
	int status; 
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	// 0 - new 
	// 1 - logged in 
	// 2 - not logged in
	// 3 - not exists 
	// 4 - System Admin
	public Login_Entity(){}
	
	public Login_Entity(String User,String Password)
	{
		this.User = User;
		this.Password = Password;
		this.status = 0;
	}
	
	public String getUser() {
		return User;
	}
	
	public void setUser(String user) {
		User = user;
	}
	
	public String getPassword() {
		return Password;
	}
	
	public void setPassword(String password) {
		Password = password;
	}
=======
public class Login_Entity extends User_Entity {
	
	

	public Login_Entity(){
		
	}
	
>>>>>>> refs/heads/master

}
