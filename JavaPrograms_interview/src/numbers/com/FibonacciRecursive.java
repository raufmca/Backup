package numbers.com;

import java.util.Scanner;

public class FibonacciRecursive {

	public static void main(String[] args) {
		
		System.out.print("Enter the limit = ");
		Scanner in = new Scanner(System.in);
		int lim = in.nextInt();
		
		System.out.println(fib(lim));

	}
	
	public static int fib(int n){
		
		if ( n == 1 || n == 2){
			return 1;
		} 
		
		return(fib(n-1) + fib (n-2));
		
		
	}

}
