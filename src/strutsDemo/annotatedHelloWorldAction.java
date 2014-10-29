package strutsDemo;

import org.apache.struts2.config.Result;
import com.opensymphony.xwork2.ActionSupport;

@Result(name="SUCCESS", value="HelloWorld.jsp")
public class annotatedHelloWorldAction extends ActionSupport
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String execute() throws Exception 
    {
    	System.out.println("Annotated Success");
    	return "SUCCESS";
    }

}
