import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the subtotal and a gratuity rate: ");
		
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();
		double gratuity = subtotal * (gratuityRate/100);
		double total = gratuity + subtotal;
		
		System.out.println("The gratuity is " + gratuity + " and total is " + total);
	}

}
