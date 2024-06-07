class Demo46
{
	public static void main(String[] args) 
	{
		System.out.println("EXE STARTS");	
	

		try 
		{
			System.out.println("TRY");
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("InterruptedException Handelled");
			System.exit(0);
		}

		finally
		{
			System.out.println("HEllo Fom Finally");
		}
		System.out.println("Exe Ends");
	}
}