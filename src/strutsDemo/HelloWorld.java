package strutsDemo;
import com.opensymphony.xwork2.Action;

import Field.User;

public class HelloWorld implements Action
{
	public String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String execute() throws Exception 
    {
    	System.out.println("UnAnnotated Success");
    	//System.out.println("name: " + name);
    	System.out.print("User:" + user.firstname + "." + user.lastname + "\n");
    	return SUCCESS;
    }
}