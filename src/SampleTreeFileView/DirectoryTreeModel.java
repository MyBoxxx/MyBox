package SampleTreeFileView;

import java.util.ArrayList;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import Entity.Abstract_Entity;
import Entity.User_Entity;

public class DirectoryTreeModel extends Abstract_Entity {
	private ArrayList<String> dir;
	private ArrayList<String> shared;
	private TableModel fileTable;
	private User_Entity user;
	private String path;
	//private FileSystemView fileSystemView = FileSystemView.getFileSystemView();
	
	public DirectoryTreeModel(User_Entity user,String path) {
		super();
		this.user=user;
		this.dir = new ArrayList<String>();
		this.shared = new ArrayList<String>();
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

	public ArrayList<String> getDir() {
		return dir;
	}

	public void setDir(ArrayList<String> dir) {
		this.dir = dir;
	}

	public ArrayList<String> getShared() {
		return shared;
	}

	public void setShared(ArrayList<String> shared) {
		this.shared = shared;
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


}
