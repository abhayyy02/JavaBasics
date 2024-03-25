import java.util.Scanner;
class Reverse_and_NumofDigits
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		
		//1. Number Of Digits.

		int length=0;
		
		for(int i=num;i!=0;i/=10)
		{
			length++;
		}
		System.out.println("The num of digits in the number is : "+ length);

		//2. Reverse of Number.s
		
		int rev = 0;
		int rem = 0;
		while(num!=0)
		{
			rem = num%10;
			rev = rev*10 + rem;
			num=num/10;
		}
		System.out.println();
		System.out.println("The reverse of the number is : "+rev);
	}

}