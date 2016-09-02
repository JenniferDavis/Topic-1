import java.util.Scanner; 

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number in pounds: ");
		
		double pounds = input.nextDouble();
		double kg = pounds * .454;
		
		System.out.println(pounds + "pounds is " + kg + " kilograms");
		
		
		
	}

}
