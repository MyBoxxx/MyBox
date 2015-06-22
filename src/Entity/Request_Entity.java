package Entity;

public class Request_Entity extends Abstract_Entity{
	
	private User_Entity user;
	private String chooise;
	private int radio;
	
	
	public Request_Entity(User_Entity user, int radio) {
		super();
		this.user = user;
		this.radio = radio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public Request_Entity(){
		user = new User_Entity();
}

	public User_Entity getUser() {
		return user;
	}

	public void setUser(User_Entity user) {
		this.user = user;
	}

	public String getChooise() {
		return chooise;
	}

	public void setChooise(String chooise) {
		this.chooise = chooise;
	}
	
}