package strings.com;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		
		String ustr,rstr="";
		
		System.out.println(" Enter = ");
		Scanner in = new Scanner(System.in);
		
		ustr = in.nextLine();
		
		ustr = ustr.toLowerCase();
		
		for ( int i=ustr.length()-1; i >=0 ; i--){
			rstr = rstr + ustr.charAt(i);
		}
		
		if ( ustr.equals(rstr)){
			System.out.println(ustr + " is  Palindrom " + rstr);
		} else {
			System.out.println(ustr + "is  Not palindrom " + rstr);
		}
		

	}
	

}
