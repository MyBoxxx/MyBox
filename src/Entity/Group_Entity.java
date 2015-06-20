package Entity;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class Group_Entity extends Object_Entity {
	
	private	ArrayList<String>	MembersInGroup;
	private	int	HowManyInGroup;
	private	ArrayList<String>	 SharedHistory;
	public ArrayList<String> getMembersInGroup() {
		return MembersInGroup;
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
	public Group_Entity(String fileName, String fileType, String modified,
			int permission, String ownerId, String path, String description,
			Boolean isDeleted, float size, String createDate,
			ArrayList<String> membersInGroup, int howManyInGroup,
			ArrayList<String> sharedHistory) {
		super(fileName, fileType, modified, permission, ownerId, path,
				description, isDeleted, size, createDate);
		MembersInGroup = membersInGroup;
		HowManyInGroup = howManyInGroup;
		SharedHistory = sharedHistory;
	}

}
