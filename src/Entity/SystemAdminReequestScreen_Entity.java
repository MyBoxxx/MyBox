package Entity;

import java.util.ArrayList;

<<<<<<< HEAD
public class SystemAdminReequestScreen_Entity extends Abstract_Entity {
	
	private int RequestID;
	private int TheRequest;
	private int Status;


	private String Name;
	
	public SystemAdminReequestScreen_Entity(int requestID, int theRequest,
			int status, String name) {
		super();
		RequestID = requestID;
		TheRequest = theRequest;
		Status = status;
		Name = name;
	}
	
	public SystemAdminReequestScreen_Entity(int requestID, int status, String name) {
		super();
		RequestID = requestID;
		Status = status;
		Name = name; 
	}
	
	public SystemAdminReequestScreen_Entity() {
		super();
		RequestID = -1;
		Status = -1;
		TheRequest = -1;
	}
	
	/* status ::: -1 - initialize
	 * 0 - not selected yet
	 * 1 - accept
	 * 2 - reject
	 * 
	 *
	*/

	public int getRequestID() {
		return RequestID;
	}

	public void setRequestID(int requestID) {
		RequestID = requestID;
	}
	/* TheRequest :::
	 * -1 initialize
	 * 0 - ask to join group
	 * 1 - ask to remove from group
	 * 
	 */
	public int getTheRequest() {
		return TheRequest;
	}

	public void setTheRequest(int theRequest) {
		TheRequest = theRequest;
	}
	public int getStatus() {
		return Status;
	}

	public void setStatus(int status) {
		Status = status;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
=======
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class SystemAdminReequestScreen_Entity extends Abstract_Entity {
	
	private int RequestID;
	private int TheRequest;
	private int Status;


	private String Name;
	
	public SystemAdminReequestScreen_Entity(int requestID, int theRequest,
			int status, String name) {
		super();
		RequestID = requestID;
		TheRequest = theRequest;
		Status = status;
		Name = name;
	}
	
	public SystemAdminReequestScreen_Entity(int requestID, int status, String name) {
		super();
		RequestID = requestID;
		Status = status;
		Name = name; 
	}
	
	public SystemAdminReequestScreen_Entity() {
		super();
		RequestID = -1;
		Status = -1;
		TheRequest = -1;
	}
	
	/* status ::: -1 - initialize
	 * 0 - not selected yet
	 * 1 - accept
	 * 2 - reject
	 * 
	 *
	*/

	public int getRequestID() {
		return RequestID;
	}

	public void setRequestID(int requestID) {
		RequestID = requestID;
	}
	/* TheRequest :::
	 * -1 initialize
	 * 0 - ask to join group
	 * 1 - ask to remove from group
	 * 
	 */
	public int getTheRequest() {
		return TheRequest;
	}

	public void setTheRequest(int theRequest) {
		TheRequest = theRequest;
	}
	public int getStatus() {
		return Status;
	}

	public void setStatus(int status) {
		Status = status;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	
	
	//list 
	
	

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

		
	
>>>>>>> refs/heads/master
	
}
