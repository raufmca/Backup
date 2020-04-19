package strings.com;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		String str = "Automation Testing";
		
		//Solution 1 
		
		for(int i = str.length()-1;i>=0; i--){
			System.out.print(str.charAt(i));
		}
		
		//Solution 2
		
		String rev = null;
		
		for(int j = str.length()-1; j >=0; j--){
			rev = rev + str.charAt(j);
		}
		
		System.out.println(rev);
		
		//solotuion 3

		//reading string from the user and reversing it 
		
		String ustr, revstr="" ;
		
		System.out.println("Enter you string");
		Scanner in = new Scanner(System.in);
		
		ustr = in.nextLine();
		int len = ustr.length();
		
		for ( int k = len-1; k >=0; k--){
			revstr = revstr + ustr.charAt(k);
		}
		
		System.out.println(ustr + " reverse is ==> " +revstr);
	}

}
