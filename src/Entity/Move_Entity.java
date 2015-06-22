package Entity;

import java.io.File;

public class Move_Entity extends Abstract_Entity {

	private User_Entity user;
	private MyFile file;
	private String Answer;
	
	
	
	public Move_Entity(){
		this.user = new User_Entity();
		this.file = new MyFile();
	}
	public User_Entity getUser() {
		return user;
	}
	public void setUser(User_Entity user) {
		this.user = user;
	}
	public MyFile getFile() {
		return file;
	}
	public void setFile(MyFile file) {
		this.file = file;
	}
	public String getAnswer() {
		return Answer;
	}
	public void setAnswer(String answer) {
		Answer = answer;
	}
}
