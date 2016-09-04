import java.util.*; 


 
 public class Ex4 {

	public static void main(String[] args) {

		final int NUMBER_OF_PRIMES = 50; // Number of primes to display
		int count = 0; // Count the number of prime numbers
		int number = 2; // A number to be tested for primeness
		 
		Stack primeStack = new Stack();
		 
		System.out.println("The first 50 prime numbers are \n");
		
		// Repeatedly find prime numbers
		while (count < NUMBER_OF_PRIMES) {
			// Assume the number is prime
			boolean isPrime = true; // Is the current number prime?
		
			// Test whether number is prime
			for (int divisor = 2; divisor <= number / 2; divisor++) {
				if (number % divisor == 0) { // If true, number is not prime
					isPrime = false; // Set isPrime to false		
			}
		}     //end while statement
		
		// Add the prime number to the stack and increase the count
		if (isPrime) {
			count++; // Increase the count
			primeList.push(number); // add to stack
			// Check if the next number is prime
			number++;
		}
		
	
	 }
		
		// outside of main
		//stack creation	
		 abstract class Stack {
			    ArrayList primeList = new ArrayList();

			    public void push(E o) {
			    	primeList.add(o);
			    }

			    public  pop() {
			      E o = list.get(getSize() - 1);
			      primeList.remove(getSize() - 1);
			      return o;
			    }
			    
		 }
	}
}
	
	
 
	
	