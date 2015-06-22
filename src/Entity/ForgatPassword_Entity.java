package Entity;

public class ForgatPassword_Entity extends Abstract_Entity  {

	private User_Entity user;
	
	public ForgatPassword_Entity(User_Entity user){
		// TODO Auto-generated constructor stub
		super();
		this.user=user;
	}
	
	public void getusername()
	{
		user.getUsername();
	}
	

}
