package Entity;

public class Login_Entity extends User_Entity {
	
	
	boolean isUser;
	
	public boolean isUser() {
		return isUser;
	}
	public void setUser(boolean isUser) {
		this.isUser = isUser;
	}
	public Login_Entity(){
		this.isUser = false;
	}
	

}
