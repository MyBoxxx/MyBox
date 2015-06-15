package Entity;

<<<<<<< HEAD
<<<<<<< HEAD
import java.util.ArrayList;

import javax.swing.JTable;

public class SystemAdminRequestScree_List extends SystemAdminReequestScreen_Entity {
	
	private JTable table ;
	
	public  SystemAdminRequestScree_List(){
		
	}
	
	public JTable getListFromServer() {
		return table;
	}
	
	
	public void setListFromServer(JTable table) {
		this.table = table;
	}

=======
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

@SuppressWarnings("serial")
public class SystemAdminRequestScree_List extends Abstract_Entity {

	private TableModel tablemodel ;
	
	public TableModel getTablemodel() {
		return tablemodel;
	}

	public void setTablemodel(TableModel tablemodel) {
		this.tablemodel = tablemodel;
	}

	public  SystemAdminRequestScree_List(){
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
	}
	
>>>>>>> refs/heads/master
=======
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

@SuppressWarnings("serial")
public class SystemAdminRequestScree_List extends Abstract_Entity {

	private TableModel tablemodel ;
	
	public TableModel getTablemodel() {
		return tablemodel;
	}

	public void setTablemodel(TableModel tablemodel) {
		this.tablemodel = tablemodel;
	}

	public  SystemAdminRequestScree_List(){
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
	}
	
>>>>>>> refs/heads/master
	
	
}
