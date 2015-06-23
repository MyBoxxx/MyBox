package Controlers;

import javax.swing.JFrame;

import Entity.Group_Entity;
import Entity.User_Entity;
import GUI_final.GroupActions;

public class GroupActionMain {
    //Group
    static GroupActions groupGui;
    static GroupAction_controller groupCon;
    static Group_Entity groupEnt;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		groupGui = new GroupActions();
		groupGui.setVisible(true);
		groupGui.setAlwaysOnTop(true);
		groupGui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		groupCon = new GroupAction_controller(new User_Entity(), groupGui);
		groupCon.contol();
	}

}
