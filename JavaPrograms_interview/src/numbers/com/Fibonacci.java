package numbers.com;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		//approach 1
		System.out.print("Enter the limit = ");
		Scanner in = new Scanner(System.in);
		int lim = in.nextInt();
		
		int a , b, c ;
		if ( lim == 0 || lim == 1){
			System.out.println(lim);
		}else{
			a=1;
			b=1;
			
			System.out.print (a + " " + b);
			
			for ( int i = 3; i <= lim; i ++){
				
				//a=i;
				//b=i;
				c=  a + b;
				System.out.print(" " + c);
				a=b;
				b=c;
			}
		}
			
	
	}
	
	

}
