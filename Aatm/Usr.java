package Aatm;
import java.util.List;
import java.util.Scanner;
public class Usr {
	Scanner Scanner = new Scanner(System.in);
	private String name;
	String password=Scanner.nextLine();

	List<Acc> account;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
         this.password=password;

	}

	public List<Acc> getAccount() {
		return account;
	}

	public void setAccount(List<Acc> account) {
		this.account = account;
	}

	
	}

