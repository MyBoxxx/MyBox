package Entity;

public class Settings_Entity extends Abstract_Entity {
	private String NewPassword;
	private String OldPassword;
	private int ID;
	public Settings_Entity() {
		super();
	}
	public String getNewPassword() {
		return NewPassword;
	}
	public void setNewPassword(String newPassword) {
		NewPassword = newPassword;
	}
	public String getOldPassword() {
		return OldPassword;
	}
	public void setOldPassword(String oldPassword) {
		OldPassword = oldPassword;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}	
}
