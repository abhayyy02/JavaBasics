/*1. Even Odd Using Recursion

class RecursionExamples
{
	static int num = 12;
	public static void main(String[] args) 
	{
		checkEvenOdd();
	}

	public static void checkEvenOdd()
	{
		if(num%2==0)
		{
			System.out.println(num + " is an Even Number");
		}

		num++;
		if(num>10)
		return;

		checkEvenOdd();
	}
}
*/

/*
2. Factorial using Recursion -->

class RecursionExamples

{
	static int num = 5;
	static int fact = 1;

	public static void main(String[] args) 
	{
		factorial();	
	}
	public static void factorial()
	{

		fact = fact * num;
		num--;
				
		if(num<0)
			return;
		System.out.println(fact);
		factorial();

	}
}

*/


//3. Prime number using Recursion

import java.util.Scanner;
class RecursionPrime
{
	static int num;
	static int i = 2;
	static boolean flag = true;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER ");
		num = sc.nextInt();
		prime();
		System.out.println(flag?"PRIME":"NOT PRIME");
		
	}

	public static void prime() 
	{
		if(i==num)
			return;

		if(num%i==0)
		{
			flag = false;
			return;
		}
		i++;
		prime();
	}
}