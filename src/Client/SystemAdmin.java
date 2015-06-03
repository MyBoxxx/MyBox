package client;

public class SystemAdmin extends Person {
public SystemAdmin(int id2, String name2, String password2, String email2,
			String phone2, String position2, int status2, int premissions2) {
		super(id2, name2, password2, email2, phone2, position2, status2, premissions2);
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
