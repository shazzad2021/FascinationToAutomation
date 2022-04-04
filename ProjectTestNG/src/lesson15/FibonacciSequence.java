package lesson15;

import org.testng.annotations.Test;

public class FibonacciSequence {

	@Test
	public static void runFibonacciSerie() {
		fibonacciSeries(9);
	}
	
	public static void fibonacciSeries(int n) {
		int num1 = 0, num2 = 1, sum = 0;
		System.out.println("Fibonacci seriesd of " + n + " number is: ");
		for (int i = 1; i<=n; i++) {
			sum = num1 + num2;
			System.out.print(num1 +" ");
			
			num1 = num2;
			num2 = sum;
		}
		
		System.out.println();
	}
	
	
}
