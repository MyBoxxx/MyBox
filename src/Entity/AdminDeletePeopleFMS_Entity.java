package Entity;

import java.util.ArrayList;

public class AdminDeletePeopleFMS_Entity extends Abstract_Entity {
	private String Name;
	private String Group;
	ArrayList <String> names=new ArrayList<String>();
	private int Id=-1;
	private int Choice;
	
	
	public AdminDeletePeopleFMS_Entity() {
		super();
		
		
	}


	public int getChoice() {
		return Choice;
	}


	public void setChoice(int choice) {
		Choice = choice;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getName() {
		return Name;
	}


	public ArrayList<String> getNames() {
		return names;
	}


	public void setNames(ArrayList<String> names) {
		this.names = names;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getGroup() {
		return Group;
	}


	public void setGroup(String group) {
		Group = group;
	}

	
	
	
}
