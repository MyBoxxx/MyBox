package Entity;

import java.io.Serializable;
import java.sql.Connection;

public class DeleteFile implements Serializable {
	MyFile file;
	User_Entity user;
	String answer;

	public DeleteFile() {
		this.file = new MyFile();
	}

	public MyFile getFile() {
		return file;
	}

	public void setFile(MyFile file) {
		this.file = file;
	}

	public User_Entity getUser() {
		return user;
	}

	public void setUser(User_Entity user) {
		this.user = user;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}	
}
