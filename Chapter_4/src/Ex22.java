import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// start Scanner
		Scanner input = new Scanner(System.in);
		
	// get inputs
		System.out.println("Enter string s1: ");
		String s1 = input.next();

		System.out.println("Enter string s2: ");		
		String s2 = input.next();
	
	// define variables
		boolean substring = s1.contains(s2);

		
// Display		
		
		if (substring == true)
			System.out.println(s2 + " is a substring of " + s1);
		else
			System.out.println(s2 + " is not a substring of " + s1);
	

	}

}
