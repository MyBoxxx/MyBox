package Entity;

import java.io.File;
import java.io.Serializable;

public class CreateDirectory extends MyFile implements Serializable {
	User_Entity user;
	public CreateDirectory(File file) {
		super(file);
		// TODO Auto-generated constructor stub
	}
	public User_Entity getUser() {
		return user;
	}
	public void setUser(User_Entity user) {
		this.user = user;
	}
}
