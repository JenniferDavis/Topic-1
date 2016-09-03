import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the driving distance: ");
		double distance = input.nextDouble();
		
		System.out.print("Enter miles per gallon: ");
		double miles = input.nextDouble();
		
		System.out.print("Enter price per gallon: ");
		double price  = input.nextDouble();
		
		double cost = (distance / miles) * price;
		
		double decimalFix = (int)(100 * cost);
		double costTruncated = decimalFix / 100;
		
		System.out.println("The cost of driving is $" + costTruncated);
		
	}

}
