package strings.com;

public class InBuiltReverse {

	public static void main(String[] args) {
		
		String str = "Automation Testing";
		
		StringBuilder rev = new StringBuilder();
		
		rev.append(str); // copying the string to string builder variable
		
		System.out.println(str);
		System.out.println(rev.reverse());
		

	}

}
