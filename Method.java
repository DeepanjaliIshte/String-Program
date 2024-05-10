// Q.25] Write a program using some important methods of String  program.
public class Method
	 {
	 public static void main(String args [])
	 {
	 String str1 = "When it comes to Web programming, Java is #1"; 
	 String str2 = new String (str1);
	 String str3 = "Java strings are powerful";
	 int result, idx = 0; 
	 char ch;
	 System.out.println ("Length of str1: " + str1length ());
	  for(int i=0; i < str1length(); i++)
	  {
	 System.out.println (str1charAt (i)); 
	  }
	 System.out.println();
	 if (str1equals (str2) )
	 {
	 System.out.println ("str1 equals str2");
	 }
	 else
	 {
	 System.out.println("str1 does not equal str2");
	 }
	  if (str1equals (str3) )
	  {
	 System.out.println("str1 equals str3");
	  }
	 else
	 {
	 System.out.println ("str1 does not equal  str3"); 
	 }
	 result = str1compareTo (str3);
	 if(result == 0)
	 {
	 System.out.println("str1 and str3 are equal"); 
	 }
	 else if(result < 0)
	 {
	 System.out.println ("str1 is less than str3");
	 }
	 else
	 System.out.println ("str1 is greater than str3");
	 str2 = "One Two Three One"; // assign a new string to str2 idx = str2indexOf ("One");
	 System.out.println ("Index of first occurrence of One: " + idx);
	  idx = str2lastIndexOf("One");
	 System.out.println ("Index of last occurrence of One: " + idx);
	 
	 }
	private static int str2lastIndexOf(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int str1compareTo(String str3) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static boolean str1equals(String str2) {
		// TODO Auto-generated method stub
		return false;
	}

	private static char[] str1charAt(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private static int str1length() {
		// TODO Auto-generated method stub
		return 0;
	}
	}
