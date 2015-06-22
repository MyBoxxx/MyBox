package Entity;

import java.io.File;
import java.io.Serializable;

public class UpLoadFile implements Serializable{
	MyFile myfile;
	User_Entity user;
	String Anser;
	
	public UpLoadFile() {
		myfile = new MyFile();
		user = new User_Entity();
		// TODO Auto-generated constructor stub
	}
	public MyFile getMyfile() {
		return myfile;
	}

	public void setMyfile(MyFile myfile) {
		this.myfile = myfile;
	}
	public User_Entity getUser() {
		return user;
	}
	public void setUser(User_Entity user) {
		this.user = user;
	}
	public String getAnser() {
		return Anser;
	}
	public void setAnser(String anser) {
		Anser = anser;
	}
}
