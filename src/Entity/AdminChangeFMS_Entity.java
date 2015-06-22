package Entity;

public class AdminChangeFMS_Entity extends Abstract_Entity{
	
	public AdminChangeFMS_Entity(){
		
		super();
		
	}
	
	private String currentQuantity = new String();
	int value ;
	 
	public String getCurrentQuantity() {
		return currentQuantity;
	}
	public void setCurrentQuantity(String currentQuantity) {
		this.currentQuantity = currentQuantity;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

}
