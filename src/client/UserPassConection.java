package client;

public class UserPassConection {

	private String User;
	public String getUser() {
		return User;
	}
	public String getPass() {
		return Pass;
	}
	private String Pass;
	public UserPassConection (String user,String pass){
		this.User = user;
		this.Pass = pass;
	}
	
}
