package Entity;

public class SystemadminReequestScreen_Entity extends Abstract_Entity {
	
	private int RequestID;
	private int Status;
	private String Name;
	
	public SystemadminReequestScreen_Entity(int requestID, int status, String name) {
		super();
		RequestID = requestID;
		Status = status;
		Name = name; 
	}
	
	public SystemadminReequestScreen_Entity() {
		super();
		RequestID = -1;
		Status = -1;
	}
	
	/*///status ::: -1 - initialize
					0 - not selected yet
					1 - accept
					2 - reject
					*/

	public int getRequestID() {
		return RequestID;
	}

	public void setRequestID(int requestID) {
		RequestID = requestID;
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