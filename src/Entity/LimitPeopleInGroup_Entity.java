package Entity;

import java.util.ArrayList;

public class LimitPeopleInGroup_Entity extends Abstract_Entity {

	ArrayList <String> groups=new ArrayList<String>();
	private int oldAmount;
	private int newAmount=-1;
	private String reason;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<String> getGroups() {
		return groups;
	}
	public void setGroups(ArrayList<String> groups) {
		this.groups = groups;
	}
	public int getOldAmount() {
		return oldAmount;
	}
	public void setOldAmount(int oldAmount) {
		this.oldAmount = oldAmount;
	}
	public int getNewAmount() {
		return newAmount;
	}
	public void setNewAmount(int i) {
		this.newAmount = i;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

		
	
}
