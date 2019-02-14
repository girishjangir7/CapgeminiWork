import java.util.Scanner;


public class MainClass {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the username:");
	String usernameGiven = sc.next();
	System.out.println("Enter the password:");
	String passwordGiven = sc.next();
	Validate validate = (String username,String password,String givenUserName,String givenPassword)->{
		if(username.equalsIgnoreCase(givenUserName) && password.equalsIgnoreCase(givenPassword))
			return true;
		return false;
	};
	
	System.out.println("Result after performing validation is: "+validate.getUserName("girish", "gjangir", usernameGiven, passwordGiven));
	}
}
