package poo1;

import poo1.models.User;
import poo1.models.Group;
import poo1.models.Organization;

public class test {

	public static void main(String[] args) {
		Organization o=new Organization("SupAvenir");
		Group g=new Group(o);
		User u=new User(g);
		u.setLogin("sam");
		System.out.println(u);
		try {
		u.setPassword("mdp","mdp");
		System.out.println(u);
		u.setPassword("sam","sam");
		System.out.println(u);
		u.setPassword("bve","sam");
		System.out.println(u);
		}catch(Exception e) {
			System.out.println("Mauvais mot de passe");
		}
		g.setName("Slam");
		u.setGroup(g);
		u.setOrga(o);
		System.out.println(g);
		
		
	}

}
