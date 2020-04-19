package numbers.com;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.println("Enter the number to get factorial = ");
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		System.out.println(" Factorial of " + num + " = " + fact(num));

	}
	
	public static int fact(int n){
		
		if ( n == 0){
			return 1;
		}
		
		return fact (n-1) * n;
			
			
		
	}

}
