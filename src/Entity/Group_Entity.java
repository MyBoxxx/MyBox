package Entity;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class Group_Entity extends Abstract_Entity {
	
	private String groupname;
	private String groupdescript;
	private String Ngroupname;
	private String Ngroupdescript;
	private	ArrayList<String>	MembersInGroup;
	private	int	HowManyInGroup;
	private	ArrayList<String>	 SharedHistory;
	public ArrayList<String> getMembersInGroup() {
		return MembersInGroup;
	}
	
	public Group_Entity(String name,String description)
	{
		super();
		this.Ngroupname=name;
		this.Ngroupdescript=description;
		
	}
	
	public String getNgroupname() {
		return Ngroupname;
	}

	public void setNgroupname(String ngroupname) {
		Ngroupname = ngroupname;
	}

	public String getNgroupdescript() {
		return Ngroupdescript;
	}

	public void setNgroupdescript(String ngroupdescript) {
		Ngroupdescript = ngroupdescript;
	}

	public String getGroupname() {
		return groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

	public String getGroupdescript() {
		return groupdescript;
	}

	public void setGroupdescript(String groupdescript) {
		this.groupdescript = groupdescript;
	}

	public void setMembersInGroup(ArrayList<String> membersInGroup) {
		MembersInGroup = membersInGroup;
	}
	public int getHowManyInGroup() {
		return HowManyInGroup;
	}
	public void setHowManyInGroup(int howManyInGroup) {
		HowManyInGroup = howManyInGroup;
	}
	public ArrayList<String> getSharedHistory() {
		return SharedHistory;
	}
	public void setSharedHistory(ArrayList<String> sharedHistory) {
		SharedHistory = sharedHistory;
	}


}
