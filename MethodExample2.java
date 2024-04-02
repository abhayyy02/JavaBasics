import java.util.*;
class Example
{

	//1. PALANDROME : -->
	/*public static void main(String[] args) 
	{
		Scanner dup = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER -> ");
		int num = dup.nextInt();
		int rev = RevNum(num);
		checkP(num,rev);
	}


	public static int RevNum(int num)
	{
		int rev = 0;
		while(num!=0)
		{
			int rem = num%10;
			rev = rev*10+rem;
			num=num/10;
		}
		return rev;
	}

	public static void checkP(int num,int rev)
	{
		System.out.println((num==rev)?"YES":"NO");
	}*/

	//2. EVEN ODD -->

		public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER ");
		int num = input.nextInt();
		checkEvenOdd(num);

	}

	public static void checkEvenOdd(int num)
	{
		System.out.println((num%2==0)?"EVEN":"ODD");
	}

}