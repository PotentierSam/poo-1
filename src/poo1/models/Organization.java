package poo1.models;

import java.util.List;
import java.util.ArrayList;

public class Organization {
		private String name;
		private List<User> users;
		private List<Group> groups;
		
		public void setName(String name) {
			this.name=name;
			groups=new ArrayList<Group>();
			users=new ArrayList<User>();
		}
		
		public String getName() {
			return this.name;
		}
		
		public Organization(String name) {
			this.name=name;
		}
		
		public String toString() {
			return "Organization [name=" + name + "]";
		}
}
