package numbers.com;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num ;
		
		System.out.print(" Enter the number to check prime ==  ");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		
		if (prime(num)){
		
			System.out.println(" Number " + num + " is prime ");
		}else{
			System.out.println("Number " + num + " is not prime ");
		}
		
		

	}
	
	// Check prime in the function
	
	public static boolean prime(int num){
		
		if ( num == 0 || num < 0){
			return false;
		}
		
		for ( int i = 2; i <= num/2 ; i++){
			if( num % i == 0){
				return false;
			}
			
		}
		return true;
	}
	

}
