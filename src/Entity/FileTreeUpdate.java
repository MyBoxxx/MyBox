package Entity;

import java.io.File;
import java.io.Serializable;
import java.util.Collection;

public class FileTreeUpdate implements Serializable{
	private User_Entity user;
	
	private Collection<File> files;

	public User_Entity getUser() {
		return user;
	}

	public void setUser(User_Entity user) {
		this.user = user;
	}

	public Collection<File> getFiles() {
		return files;
	}

	public void setFiles(Collection<File> files) {
		this.files = files;
	}
	
	
	
}
