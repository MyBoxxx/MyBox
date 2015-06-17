package server;

import javax.swing.JTable;

import Entity.User_Entity;

public class FileTable {
	JTable table;
	User_Entity user;
	public JTable getTable() {
		return table;
	}
	public void setTable(JTable table) {
		this.table = table;
	}
	public User_Entity getUser() {
		return user;
	}
	public void setUser(User_Entity user) {
		this.user = user;
	}
	
}
