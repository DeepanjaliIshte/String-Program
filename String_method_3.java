
public class String_method_3
{
	static String name[] = {"Deepak","Deepanjali","Sandeep","Krutika","Atharva","Vedantika","Rutuja"};
	public static void main(String[] args) 
	{
	int size = name.length;
	String temp=null;
	for (int i=0;i<size;i++)
	{
		for(int j=i+1;j<size;i++)
		{
			if(name[j].compareTo(name[i])<0)
			{
				//swap the strings
				temp = name[i];
				name[i]=name[j];
				name[j]=temp;
			}
		}
	}
	for (int i=0;i<size;i++);
	{
	System.out.println();
	}
	}
}
