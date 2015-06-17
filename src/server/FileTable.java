package server;

import java.io.Serializable;

import javax.swing.JTable;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import Entity.User_Entity;

public class FileTable implements Serializable{
	
	User_Entity user;
	
	public User_Entity getUser() {
		return user;
	}
	public void setUser(User_Entity user) {
		this.user = user;
	}
	
	
	
	
	

	private TableModel tablemodel ;
	
	public TableModel getTablemodel() {
		if(tablemodel == null) 
			tablemodel = new TableModel() {
				
				@Override
				public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void removeTableModelListener(TableModelListener l) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public boolean isCellEditable(int rowIndex, int columnIndex) {
					// TODO Auto-generated method stub
					return false;
				}
				
				@Override
				public Object getValueAt(int rowIndex, int columnIndex) {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public int getRowCount() {
					// TODO Auto-generated method stub
					return 0;
				}
				
				@Override
				public String getColumnName(int columnIndex) {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public int getColumnCount() {
					// TODO Auto-generated method stub
					return 0;
				}
				
				@Override
				public Class<?> getColumnClass(int columnIndex) {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public void addTableModelListener(TableModelListener l) {
					// TODO Auto-generated method stub
					
				}
			};
		return tablemodel;
	}

	public void setTablemodel(TableModel tablemodel) {
		this.tablemodel = tablemodel;
	}

	
}
