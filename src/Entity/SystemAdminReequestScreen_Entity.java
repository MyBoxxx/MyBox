package Entity;

import java.util.ArrayList;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class SystemAdminReequestScreen_Entity extends Abstract_Entity {
	
	private int RequestID;
	private String TheRequest;
	private int Status;
	private String Name;
	
	public SystemAdminReequestScreen_Entity() {
		super();
		RequestID = -1;
		Status = -1;
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
}