package client;

import java.util.ArrayList;

public class Owner extends Person {

	private int ownerNumber;
	private ArrayList<String> ownerFiles;
	public int getOwnerNumFilles()
	{
		return ownerFiles.size();
	}
	public ArrayList<String> getOwnerFiles() {
		return ownerFiles;
	}
	
	private int changePremmisions()
	{
		return ownerNumber;
		// TODO
	}
	public Owner(int id, String name, String password, String email,
			String phone, String position, int status, int premissions) {
		super(id, name, password, email, phone, position, status, premissions);
		// TODO Auto-generated constructor stub
	}

	public int getOwnerNumber() {
		return ownerNumber;
	}

	public void setOwnerNumber(int ownerNumber) {
		this.ownerNumber = ownerNumber;
	}
	
}
