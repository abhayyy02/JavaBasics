import java.util.Scanner;
class EmirpNum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		if(isPrime(num))
		{
			int rev = revNum(num);
			System.out.println(isPrime(rev)?"It is an EMIRP Nummber ":" it is not an NOT EMIRP");
		}
		else
		{
			System.out.println("it is not an Not EMIRP");
		}
		
	}

	public static boolean isPrime(int num)
	{
		if(num<=1)
		{
			return false;
		}
		boolean flag = true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag = false;
				break;
			}
		}
		return flag;
	}
	public static int revNum(int num)
	{
		int rev = 0;
		while(num!=0)
		{

	
		int rem = num%10;
		rev = rev*10+rem;
		num = num/10;
	}	
	return rev;
}

}