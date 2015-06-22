package Entity;

import java.util.ArrayList;

public class LoadGroup_Entity extends Abstract_Entity {
	
	ArrayList <String> groups=new ArrayList<String>();
	private int choice;
	private User_Entity user;
	
	public LoadGroup_Entity(int choice,User_Entity user) {
		super();
		this.user=user;
		this.choice = choice;
	}


	public User_Entity getUser() {
		return user;
	}


	public void setUser(User_Entity user) {
		this.user = user;
	}


	public int getChoice() {
		return choice;
	}


	public void setChoice(int choice) {
		this.choice = choice;
	}


	public LoadGroup_Entity(){
		
	}


	public ArrayList<String> getGroups() {
		return groups;
	}


	public void setGroups(ArrayList<String> groups) {
		this.groups = groups;
	}
	

}
