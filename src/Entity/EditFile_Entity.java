package Entity;

public class EditFile_Entity extends Abstract_Entity {
	MyFile file;
	User_Entity user;
	
	public EditFile_Entity() {
		super();
		this.file = new MyFile();
		this.user = new User_Entity();
	}
	public EditFile_Entity(MyFile myfile) {
		super();
		this.file = myfile;
		this.user = new User_Entity();
	}
	public MyFile getFile() {
		return file;
	}
	public void setFile(MyFile file) {
		this.file = file;
	}
	public User_Entity getUser() {
		return user;
	}
	public void setUser(User_Entity user) {
		this.user = user;
	}
	
}
