package Entity;

import java.util.ArrayList;

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
	
}