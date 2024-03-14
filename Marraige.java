import java.util.*;
class Marraige
{
	public static void main (String[]args)
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter the age :");
		byte age = sc.nextByte();

		System.out.println("Enter the Property :");
		double Prop = sc.nextDouble();

		System.out.println("Enter your Surname");
		String Surname = sc.next();

		if((age>21) && (Prop>1000000) || (Surname.equals("Ambani")))
	{	
		System.out.println("You are Eligible");
	}
		else
		
		System.out.println("Not Eligible !");	
}
}