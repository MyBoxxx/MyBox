package Entity;

import java.io.Serializable;

public class DeleteFile implements Serializable {
	
	String FileName;
	String FilePath;
	User_Entity user;
	
	public String getFileName() {
		return FileName;
	}
	public void setFileName(String fileName) {
		FileName = fileName;
	}
	public String getFilePath() {
		return FilePath;
	}
	public void setFilePath(String filePath) {
		FilePath = filePath;
	}
	public User_Entity getUser() {
		return user;
	}
	public void setUser(User_Entity user) {
		this.user = user;
	}
	
}
