class TechNum
{
	public static void main(String[] args) 
	{
		int num = 2025;
		int dup = num;
		int length = 0;


		while(num!=0)
		{
			length++;
			num=num/10;
		} 
		if(length%2==0)
		{
			int div = 1;
			for (int i=1;i<=length/2;i++)
			{
				div = div * 10;
			}

			int FirstHalf = dup/div;
			int LastHalf = dup%div;
			int sum = FirstHalf + LastHalf;
			int sqr = sum*sum;

			System.out.println(dup==sqr ? dup+ " IT IS A TECH NUMBER" : " IT IS NOT A TECH NUMBER ");
			
		}	
		else
		{
			System.out.println("NOT A TECH NUMBER :");
		}
	} 

}