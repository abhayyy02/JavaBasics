abstract class AbstractExample
{
	abstract int Addition(int num1, int num2);

	abstract int Substraction (int num1, int num2);

	abstract int Multiplication(int num1, int num2);

	abstract int Division(int num1, int num2);

	
}

class AbstractionImple extends AbstractExample
{
	int Addition(int num1, int num2)
	{
		return (num1+num2);
	}

	int Substraction(int num1, int num2)
	{
		return (num1-num2);
	}

	int Multiplication(int num1, int num2)
	{
		return (num1*num2);
	}

	int Division(int num1, int num2)
	{
		return (num1/num2);
	}
}

class AbstractDriver
{
	public static void main(String[] args) 
	{
		AbstractionImple obj = new AbstractionImple();
		System.out.println("Addition "+obj.Addition(10,20));
		System.out.println("Substraaction "+obj.Substraction(20,10));
		System.out.println("Multiplication "+obj.Multiplication(5,2));
		System.out.println("Division "+obj.Division(100,5));	
	}
}