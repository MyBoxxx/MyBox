package Entity;


public class CreateGroupEntity extends Abstract_Entity {
String Name;
User_Entity currUser;

public CreateGroupEntity(String name) {
	super();
	Name = name;
	currUser = new User_Entity();
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public User_Entity getCurrUser() {
	return currUser;
}

public void setCurrUser(User_Entity currUser) {
	this.currUser = currUser;
}


}
