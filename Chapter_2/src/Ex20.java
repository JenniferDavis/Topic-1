import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter balance and interest rate (i.e., 3 for 3%): ");
		
		float balance = input.nextFloat();
		float interestRate = input.nextFloat();
		float interest = balance * (interestRate/1200);
		

		System.out.println("The interest is " + interest);
		
	}

}
