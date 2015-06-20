package Entity;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class Group_Entity extends Abstract_Entity {
	private int IDgroup;
	private String groupName;
	private int GroupAdmin;	
	private String Description;
	private int GroupLimit;
	public int getIDgroup() {
		return IDgroup;
	}
	public void setIDgroup(int iDgroup) {
		IDgroup = iDgroup;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public int getGroupAdmin() {
		return GroupAdmin;
	}
	public void setGroupAdmin(int groupAdmin) {
		GroupAdmin = groupAdmin;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getGroupLimit() {
		return GroupLimit;
	}
	public void setGroupLimit(int groupLimit) {
		GroupLimit = groupLimit;
	}


}
