package numbers.com;

import java.util.Scanner;

public class PalindromInt {

	public static void main(String[] args) {
	
		int num;
		
		System.out.println(" Enter the number to check == ");
		
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		
		int tmp=num, rev=0, rem=0;
		
		while(num != 0){
			
			rem = num % 10;
			rev = rev *10 + rem; 
			num = num / 10;
		}
		
		if ( tmp == rev){
			System.out.println(" Number " + tmp + " reverse is " + rev + " is palindrom ");
		}else{
			System.out.println(" Number " + tmp + " reverse is " + rev + " is not palindrom ");
		}
		
		

	}

}
