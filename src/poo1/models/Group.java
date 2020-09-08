package poo1.models;

import java.util.ArrayList;
import java.util.List;

public class Group {
	private String name;
	private List<User> users;
	private Organization organization;


	public void setName(String nom) {
		this.name=nom;
	}
	
	public String getNam() {
		return this.name;
	}
	
	public Group(Organization orga) {
		this("",orga);
	}
	
	public Group(String nom,Organization orga) {
		this.name=nom;
		users=new ArrayList<User>();
		this.organization=orga;
	}
	
	public void addUser(User user) {
		user.setGroup(this);
		users.add(user);
	}
	
	public List<User> getUsers() {
		return users;
	}

	@Override
	public String toString() {
		return "Group [name=" + name +",users"+ "]";
	}
}