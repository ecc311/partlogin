package Beans;
import org.apache.struts.action.*;

public class LoginForm extends ActionForm{


	private String username;
	private String name;
	private int age;
	private String password;
	private String email;

	public LoginForm() {
		super();
	}
	private static final long serialVersionUID = 104092268304152302L;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;   
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;   
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}