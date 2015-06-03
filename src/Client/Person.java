package Client;

public class Person {
	private int id;
	private String name;
	private String password;
	private String email;
	private String phone;
	private String position;
	private int status;
	private int premissions;
	
	public Person(int id, String name, String password, String email,
			String phone, String position, int status, int premissions) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.position = position;
		this.status = status;
		this.premissions = premissions;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getPremissions() {
		return premissions;
	}
	public void setPremissions(int premissions) {
		this.premissions = premissions;
	}
	
	
	
}
