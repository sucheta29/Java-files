package basicPrograms;

public class DataTypes {

	public static void main (String args[])
	{
		int x = 100;
		System.out.println(x);
		long var = 3000;
		System.out.println(var);
		char c = 'S';
		System.out.println(c);
		boolean b = true;
		System.out.println(b);
		int i = 200;		

		int a =10;
		int e = 100;
		boolean x1 = a>e;
		System.out.println(x1);
		
		String str = "Hello Suchi";
		int len  = str.length();
		System.out.println("Length of string =" +len);
		
		//Operators
		
		int i = 100;
		int o = 150;
		int u = 20;
		
		String str1 = "Hello Suchi";
		
		if (i>o || i>u)
		{
			System.out.println("Or condition passed");
		}
	  if (i<o && i>u)
			System.out.println("And condition passed");
		if(o!=u)
			System.out.println("not equal condition passed");
		if (str.equalsIgnoreCase(str1))
			System.out.println("Strings are equal");
		else
			System.out.println("String mismatch");
	}
}
