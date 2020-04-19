package numbers.com;

import java.util.Scanner;

public class Armstromng {

	public static void main(String[] args) {
		
		int num;
		
		System.out.print("Enter the number ");
		
		Scanner in = new Scanner(System.in);
		
		num = in.nextInt();
		
		int tmp=num, rev=0;
		
		// reverse the string 
		
		rev = reverse(num);
		
		if ( tmp == rev){
			System.out.println("Armstrong " + tmp);
		}else{
			System.out.println(" Not Armstrong" );
		}
		
		//System.out.println(" Reverse of a number " + rev);
				
		

	}
	
	public static int reverse(int num){
		
		int rem=0, rev=0;
		
		if ( num <= 0){
			return 0;
		}
		
		while(num != 0){
			rem = num  % 10;
			rev = rev + armstr(rem);
			num = num /10;
		}
		
		return rev;
	}
	
	public static int armstr(int r){
		
		return r*r*r ;
	}

}
