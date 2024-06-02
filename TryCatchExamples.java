// import java.util.Scanner;
// class ArithmeticException1
// {
// 	public static void main(String[] args) 
// 	{
// 		System.out.println("Main Starts");

// 		Scanner sc = new Scanner (System.in);
// 		System.out.println("Enter the number ");
// 		int num = sc.nextInt();

// 		try 
// 		{

// 		System.out.println(num/0);
// 		}

// 		catch(Exception ae)
// 		{
// 			System.out.println("Exception Handelled");
// 		}
// 	}
// }


// class Demo91
// {
// 	public static void main(String[] args) 
// 	{
// 		try 
// 		{
// 			System.out.println(10/0);
// 		}	

// 		catch(Exception e)
// 		{
// 			System.out.println("Handelled");
// 		}
// 	}
// }


class Program1
{
	
	static Program2 p;
	public static void main(String[] args) 
	{
		System.out.println("Start");

		try 
		{
			System.out.println(p.a);
		}	

		catch(Exception e)
		{
			System.out.println("Handelled");
		}

		System.out.println("Ends");
	}

	
}

class Program2
{
	int a = 420;
}