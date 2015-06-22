package Entity;

public class SetNotification_Entity extends Abstract_Entity {
User_Entity user;

public SetNotification_Entity(User_Entity user) {
	super();
	this.user = user;
}

public User_Entity getUser() {
	return user;
}

public void setUser(User_Entity user) {
	this.user = user;
}

}
