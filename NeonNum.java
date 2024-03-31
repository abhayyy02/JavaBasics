import java.util.Scanner;
class NeonNum
{
	public static void main(String[] args) 
	{
		

		Scanner sc = new Scanner(System.in);

		System.out.println("ENTER THE NUMBER :");
		int num = sc.nextInt();
		int dup = num;
		int sqr = num*num;
		int lastdigit;
		int sum = 0;

		while(sqr>0)
		{
			lastdigit = sqr%10;
			sum = sum+ lastdigit;
			sqr = sqr/10;
		}		
		System.out.println((dup==sum)? dup +" is a NEON number. ": dup +" Not a Neon number.");
			
		

	}
}