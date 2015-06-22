package Entity;

public class Settings_Entity extends Abstract_Entity {

	private  String Answer ;
	private User_Entity oplduser;
	private User_Entity npewuser;
		
		public Settings_Entity(){
			oplduser = new User_Entity();
			npewuser = new User_Entity();
		}
		public String getAnswer() {
			return Answer;
		}
		public void setAnswer(String answer) {
			Answer = answer;
		}
		public User_Entity getOlduser() {
			return oplduser;
		}
		public void setOlduser(User_Entity olduser) {
			this.oplduser = olduser;
		}
		public User_Entity getNewuser() {
			return npewuser;
		}
		public void setNewuser(User_Entity newuser) {
			this.npewuser = newuser;
		}
		
		
		
	}

