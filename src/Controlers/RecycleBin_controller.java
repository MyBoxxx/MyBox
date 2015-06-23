package Controlers;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Client.MainClient;
import Entity.ForgotPassword_Entity;
import Entity.Login_Entity;
import Entity.RecycleScreen_Entity;
import GUI_final.ForgotPassword_GUI;
import GUI_final.Login_GUI;
import GUI_final.RecycleBinScreen;
import GUI_final.TableMouseListener;

public class RecycleBin_controller extends AbstractTransfer {


	  RecycleScreen_Entity model ;
	  RecycleBinScreen view;
	public RecycleBin_controller(RecycleScreen_Entity model,RecycleBinScreen view){
		this.model = model;
		this.view = view;
		view.setBounds(100, 100, 800, 600);
	
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			view.setLocation(dim.width/2-view.getSize().width/2, dim.height/2-view.getSize().height/2);
			view.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
	

	public void control(){
		model.setUser(MainClient.clien.currUser);
		view.getTable().getSelectionModel().addListSelectionListener(new ListSelectionListener(){
	        public void valueChanged(ListSelectionEvent event) {
	        model.setIdFile(Integer.parseInt(view.getTable().getModel().getValueAt(view.getTable().getSelectedRow(), 0).toString()));
	        }
		});
	    view.getBtnRestore().addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		sendToServer(model);
        	}
        });
	}
	public void Repaint(RecycleScreen_Entity message){
		view.getTable().removeAll();
		view.getTable().setModel(message.getFileTable());
		model.setIdFile(0);
		view.getTable().validate();
	}
}
	/*
	public void actionPerformed(ActionEvent event) {
	        JMenuItem menu = (JMenuItem) event.getSource();
	        if (menu == RestoreAdd) {
	            addNewRow();
	        } else if (menu == DeleteAdd) {
	            removeCurrentRow();
	        }
	    }
	     
	    private void addNewRow() { 
	    	int selectedRow = table.getSelectedRow();
	    	Object file = table.getValueAt(selectedRow, 0);
	    	Object Restore = table.getValueAt(selectedRow, 2);
	    	
	    	int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to Restore this file?", "Warning",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
	  
	    	if (p == JOptionPane.YES_OPTION) {
	    		if (Restore.toString() == "No")
		    	{
		    		JOptionPane.showMessageDialog(null, "The file "+file.toString()+ " is not restorable", "Access Denide", JOptionPane.INFORMATION_MESSAGE);
		    	} else{
		    		tableModel.removeRow(selectedRow);
		    		JOptionPane.showMessageDialog(null, "The file "+file.toString()+ " restored", "File restored", JOptionPane.INFORMATION_MESSAGE);
		    	}
	    	} else if (p == JOptionPane.NO_OPTION) {
	    		JOptionPane.showMessageDialog(null, "Nothing restored", "Message", JOptionPane.INFORMATION_MESSAGE);
	    	}

	    }
	     
	    private void removeCurrentRow() {
	        int selectedRow = table.getSelectedRow();
	        Object file = table.getValueAt(selectedRow, 0);
	        int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to Delete this file?", "Warning",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
	      
	        if (p == JOptionPane.YES_OPTION) {
	        	tableModel.removeRow(selectedRow);
	        	 JOptionPane.showMessageDialog(null, "The file "+file.toString()+ " deleted", "File deleted", JOptionPane.INFORMATION_MESSAGE);
	        } else if (p == JOptionPane.NO_OPTION) {
	        	 JOptionPane.showMessageDialog(null, "Nothing deleted", "Message", JOptionPane.INFORMATION_MESSAGE);
	        }
	    }
	
	}
	*/
