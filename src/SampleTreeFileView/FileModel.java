package SampleTreeFileView;

import java.io.File;
import java.io.Serializable;
import java.nio.file.Files;

import javax.swing.JTable;
import javax.swing.event.TableModelListener;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.TableModel;

import Entity.Abstract_Entity;
import Entity.MyFile;
import Entity.User_Entity;

public class FileModel extends Abstract_Entity implements Serializable {
	

	private TableModel fileTable;
	private User_Entity user;
	private String path;
	//private FileSystemView fileSystemView = FileSystemView.getFileSystemView();
	private String[] columns = {
	        "File",
	        "Last Modified",
	        "R",
	        "W",
	    };

	
	public FileModel(String path,User_Entity user) {
		super();
		this.path = path;
		this.user = user;
		
		fileTable = new TableModel() {
			
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
		
	}
	public TableModel getFileTable() {
		return fileTable;
	}


	public void setFileTable(TableModel fileTable) {
		this.fileTable = fileTable;
	}


	public User_Entity getUser() {
		return user;
	}


	public void setUser(User_Entity user) {
		this.user = user;
	}


	public String getPath() {
		return path;
	}


	public void setPath(String path) {
		this.path = path;
	}


	public String[] getColumns() {
		return columns;
	}


	public void setColumns(String[] columns) {
		this.columns = columns;
	}


}
