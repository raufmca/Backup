package numbers.com;

import java.util.Scanner;

public class PrimeNumList {

	public static void main(String[] args) {
		int num;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println(" Enter the limit = ");
		
		num = in.nextInt();
		
		System.out.println("Prime Number list");
		
		for ( int i = 1; i <= num ; i++){
			if(check(i)){
				System.out.print(i + " ");
			}
		}
		

	}
	
	public static boolean check(int n){
		if ( n == 1 || n == 0 ){
			return false;
		}
		for ( int i =2; i <= n/2; i++){
			if ( n % i == 0){
				return false;
			}
		}
			return true;
	}

}
