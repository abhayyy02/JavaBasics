// class MultipleTryCatch
// {
// 	public static void main(String[] args) 
// 	{
	

// 		try 
// 		{
// 			System.out.println("Hello Starts");
// 			String str = null;
// 			System.out.println(str.isEmpty());
// 		}	


// 		catch(ArithmeticException ae)
// 		{
// 			System.out.println("D");
// 		}
		

// 		catch (NullPointerException re)
// 		{
// 			System.out.println("RuntimeException ");
// 		}
// 		catch(RuntimeException npe)
// 		{
// 			System.out.println("NullPointerException Handelled");
// 		}

// 		System.out.println("ENds");


// 	}
// }




// class Demo92
// {
// 	public static void main(String[] args) 
// 	{
// 		System.out.println("Hello");	
	
		
// 			try 
// 			{
// 				Thread.sleep(1000);
// 			}

// catch(InterruptedException ae)
// 			{
// 				System.out.println("D");
// 			}

// 			catch (RuntimeException ffff)
// 			{
// 				System.out.println("DDD");
// 			}
				
// 	}

// }






class Demo93
{
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println("HI");
			Thread.sleep(1000);
		}	

catch(InterruptedException ie)
		{
			System.out.println("IE");
		}

		catch(RuntimeException e)
		{
			System.out.println("E");
		}

		
		catch(Exception re)
		{
			System.out.println("RE");
		}
	}
}