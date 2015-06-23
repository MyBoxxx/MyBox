package Controlers;

import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

import Client.MainClient;
import Entity.*;
import GUI_final.*;

public class editGroup_Controller extends AbstractTransfer{

	private static  User_Entity model ;
	private static  EditGroup view;
	GroupActions groupw;
	private String s,s1;
	
	
	//Controllers
	GroupAction_controller groupA;

	public editGroup_Controller(User_Entity model,EditGroup view){
		this.model = model;
		this.view = view;
	}
	
	public void control(){
		
		//MainClient.clien.setCurrController(this); // Set The Current Controller to this	
		 
		sendToServer(new LoadGroup_Entity(3,MainClient.clien.currUser));
		
		view.getB5Cancel().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				view.setVisible(false);
			}
		});
		
		view.getEditName().addHyperlinkListener(new HyperlinkListener() {
			
			@Override
			public void hyperlinkUpdate(HyperlinkEvent e) {
				// TODO Auto-generated method stub
				if (view.getEditName().getText()!=null){
					view.getB1X().setEnabled(true);
				}
			}
		});
		
		view.getB1X().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				view.getEditName().setText("");
			}
		});
	
		
		view.getEditDescription().addHyperlinkListener(new HyperlinkListener() {
			
			@Override
			public void hyperlinkUpdate(HyperlinkEvent e) {
				// TODO Auto-generated method stub
				if (view.getEditDescription().getText()!=null){
					view.getB2X().setEnabled(true);
			}
		}
		
		});
		
		view.getB2X().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				view.getEditName().setText("");
			}
		});
		
		view.getB3Place().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				s=view.getEditName().getText();
				System.out.println(s);
				s1=view.getEditDescription().getText();
				System.out.println(s1);
			}
		});
		
		view.getB4Send().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				sendToServer(new Group_Entity(s,s1));
				
			}
		});
		
		
		
		
		
	}
	public void FillGroup(LoadGroup_Entity ent) {
		// TODO Auto-generated method stub
		List<String> ls = ent.getGroups();
		view.getComboBox().setModel(new DefaultComboBoxModel<Object>(ls.toArray()));
	}
}
