package Entity;

public class SettingsName_Entitiy extends Abstract_Entity {

	private  String Answer ;
	private User_Entity olduser;
	private User_Entity newuser;
	
	public SettingsName_Entitiy(){
		olduser = new User_Entity();
		newuser = new User_Entity();
	}
	public String getAnswer() {
		return Answer;
	}
	public void setAnswer(String answer) {
		Answer = answer;
	}
	public User_Entity getOlduser() {
		return olduser;
	}
	public void setOlduser(User_Entity olduser) {
		this.olduser = olduser;
	}
	public User_Entity getNewuser() {
		return newuser;
	}
	public void setNewuser(User_Entity newuser) {
		this.newuser = newuser;
	}
	
	
	
}
