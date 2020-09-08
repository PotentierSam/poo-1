package poo1.models;

public class User {
	private String login;
	private String password;
	private Group group;
	
	public User(String login, Group group) {
		this.login=login;
		this.group=group;
	}
	
	public User(Group group) {
		this("no login",group);
	}
	
	public void setGroup(Group group) {
		this.group=group;
	}
	
	public String getLogin() {
		return this.login;
	}
	public String getPassword( ) {
		return this.password;
	}
	public void setLogin(String login) {
		this.login=login;
	}
	public void setPassword(String password, String conf) throws Exception {
		if (password==null || password.equals(this.password) || !password.equals(conf)) {
			throw new Exception("bad new password");
		} else {
			this.password=password;
		}
	}
	@Override
	public String toString() {
		if(group!=null) {
			return login+"("+group+")";
		}
		else
		{
			return login;
		}
	}
}
