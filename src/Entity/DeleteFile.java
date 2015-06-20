package Entity;

import java.io.Serializable;

public class DeleteFile implements Serializable {
	
	MyFile file;
	
	User_Entity user;
	
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
	
}
