import java.util.Scanner;
import java.io.*;
public class safe_input_advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner (System.in);
		System.out.println("Enter Email id: ");
		String email= in.nextLine();
		System.out.println("Enter Password: ");
		//get console class......
		Console con= System.console();
		char[] chars=con.readPassword();
		String pass= new String(chars);
		
		if(email.equals("adityasharmajng@gmail.com") && pass.equals("Sharma1234")) {
			System.out.println("Login Successful");
			System.out.println("***************WELCOME***************");
			
		}
		else {
			System.out.println("Invalid UserId or Password");
			return;
		}
	}

}
