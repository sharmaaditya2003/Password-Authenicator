import java.util.*;
public class validate_password {

	public static void main(String[] args) {
	final int NUM_UPPER_CASE = 1;
	final int NUM_LOWER_CASE = 5;
	final int NUM_DIGITS = 2;
	int uppercount=0;
	int lowercount=0;
	int digitcount=0;
	int lettercount=0;
	
	Scanner in= new Scanner(System.in);
	System.out.println("Enter Your Password: " +" "+ "{Requrement : 'Minimum 8 Characters' 1 Upeercase, 5 lowercase, 2 Digits }");
	String input= in.nextLine();
	
	int inputlen= input.length();
	
	//Character class:
	for (int i=0; i<inputlen; i++) {
		char ch= input.charAt(i);
		if (Character.isUpperCase(ch))
			uppercount++;
		else if (Character.isLowerCase(ch))
			lowercount++;
		else if (Character.isDigit(ch))
			digitcount++;
	}
		if (uppercount >= NUM_UPPER_CASE && lowercount >= NUM_LOWER_CASE && digitcount >= NUM_DIGITS) 
			System.out.println("Password Accepted"); 
			
		
			
		else {
			System.out.println("Your password must contain atleast:");
			if (uppercount < NUM_UPPER_CASE)
				System.out.println("1 uppercase");
			if (lowercount < NUM_LOWER_CASE)
				System.out.println("5 lowercase");
			if (digitcount < NUM_DIGITS)
				System.out.println("2 digits");
		
	}
	}

}
