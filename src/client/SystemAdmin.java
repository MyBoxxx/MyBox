package Client;

public class SystemAdmin extends Person {
public SystemAdmin(int id, String name, String password, String email,
			String phone, String position, int status, int premissions) {
		super(id, name, password, email, phone, position, status, premissions);
		// TODO Auto-generated constructor stub
	}

private int adminNum;
//TODO add all !
public int getAdminNum() {
	return adminNum;
}

public void setAdminNum(int adminNum) {
	this.adminNum = adminNum;
}

}
