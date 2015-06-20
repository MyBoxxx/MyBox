package SampleTreeFileView;

import java.util.ArrayList;

import Entity.Abstract_Entity;
import Entity.User_Entity;

public class DirectoryTreeModel extends Abstract_Entity {
	private ArrayList<String> dir;
	private ArrayList<String> shared;
	User_Entity user;
	
	public DirectoryTreeModel(User_Entity user) {
		super();
		this.user=user;
		this.dir = new ArrayList<String>();
		this.shared = new ArrayList<String>();
	}

	public ArrayList<String> getDir() {
		return dir;
	}

	public void setDir(ArrayList<String> dir) {
		this.dir = dir;
	}

	public ArrayList<String> getShared() {
		return shared;
	}

	public void setShared(ArrayList<String> shared) {
		this.shared = shared;
	}

	public User_Entity getUser() {
		return user;
	}

	public void setUser(User_Entity user) {
		this.user = user;
	}

	
}
