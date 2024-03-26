import java.util.Scanner;
class KrishnaMurtiNumber
{
	public static void main(String[] args) 
	{

		for(int j=1;j<=500000;j++)            //Finds the Kirshna Murti Number between 1 to 500000;

		{
			//Scanner sc = new Scanner (System.in);
			//System.out.println("ENTER THE NUMBER :");
			//int num = sc.nextInt();
			int num =j;
			int sum=0;
			int dup = num;
			while(dup!=0)
			{
				int rem = dup%10;
				int fact = 1;

			for(int i=1;i<=rem;i++)
				{
					fact = fact*i;
				}
				sum = sum + fact;
				dup=dup/10;
			}
			if(sum==num)
				{
					System.out.println(num);
				}

		}	
	}
}