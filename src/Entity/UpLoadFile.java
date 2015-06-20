package Entity;

import java.io.File;
import java.io.Serializable;

public class UpLoadFile implements Serializable{
	MyFile myfile;
	User_Entity user;
	
	public UpLoadFile() {
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
	
}
