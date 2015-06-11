package Controlers;

import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Entity.*;
import GUI_final.*;

public class editGroup_Controller extends AbstractTransfer{

	private static  Group_Entity model ;
	private static  EditGroupNameDescription view;

	editGroup_Controller(Group_Entity model,EditGroupNameDescription view){
		this.model = model;
		this.view = view;
	}
	
	public void control(){
		view.getB5Cancel().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				view.setVisible(false);
			}
		});
		view.getB4Send().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
	}
	
	
}
