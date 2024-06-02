// 1.  class Demo9
// {
// 	public static void main(String[] args) 
// 	{
// 		System.out.println(Thread.currentThread().getName());

// 		for(int i=1; i<=10; i++)
// 		{
// 			System.out.println(i +" ");
// 		}	

// 		Thread.sleep(2000);
// 	}

// }

// op : Interrupted Exception 




// 2.  class Demo9
// {
// 	public static void main(String[] args) {
		 
// 		 System.out.println("HIII");
// 		 System.out.println(10/0);
// 	}

// }

// op : HIII
//     Arithmetic Exception



// 3.  import java.io.*;
// class Demo9
// {
// 	public static void main(String[] args) 
// 	{
// 		FileWriter fw = new FileWriter ("abc.txt");	
// 	}

// }

// op : File Not Found 



// 4.  class Demo9
// {
// 	public static void main(String[] args) 
// 	{
// 		String a = null;
// 		if(a.isEmpty())
// 		{
// 			System.out.println("HII");
// 		}	
// 	}
// }
// op : Null-Pointer-Exception



// 5.  class Demo9
// {
// 	public static void main(String[] args) 
// 	{
// 		int [] arr = {1,2,3,4};
// 		for (int i=0 ;i<=arr.length ; i++ ) 
// 		{
// 			System.out.println(arr[i]);
// 		}	

// 	}


// }
// op : ArrayOutOfBoundException

import java.util.Scanner;
class Demo9
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	}
}