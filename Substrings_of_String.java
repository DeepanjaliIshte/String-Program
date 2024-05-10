

// Find all Substring of string in java program

import java.util.Scanner;
public class Substrings_of_String
{
	public static void main(String[] args) 
	{
		String string,sub;
		int i,c, length;
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter a string to print it's all substring ");
		string=sn.nextLine();
		length=string.length();
		System.out.println("Substringd of  \" "+string+ "\" are :-");
		for(c=0;c<length;c++)
		{
			for(i=0;i<=length-c;i++)
			{
				sub=string.substring(c,c+i);
				System.out.println(sub);
			}
		}
	}

}
