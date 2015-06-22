package Entity;

import java.io.File;
import java.io.Serializable;

import org.w3c.dom.views.AbstractView;

public class CreateDirectory  implements Serializable {
	User_Entity user;
	MyFile myDir;
	String Anser;
	
	public CreateDirectory() {
		this.user = new User_Entity();
		this.myDir = new MyFile();
		
	}
	public MyFile getMyDir() {
		return myDir;
	}
	public void setMyDir(MyFile myDir) {
		this.myDir = myDir;
	}
	public String getAnser() {
		return Anser;
	}
	public void setAnser(String anser) {
		Anser = anser;
	}
	public User_Entity getUser() {
		return user;
	}
	public void setUser(User_Entity user) {
		this.user = user;
	}
}
