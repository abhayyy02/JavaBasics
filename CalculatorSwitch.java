import java.util.Scanner;
class CalculatorSwitch

{



public static void main(String[] args) 
{
	Scanner sc = new Scanner (System.in);
	System.out.println("--WELCOME--");
	System.out.println(" + will do Addition");
	System.out.println(" - will do Substraction");
	System.out.println(" / will do Division");
	System.out.println(" * will do Multiplication");
	System.out.println(" % will find the Modulus.");
	System.out.println(" S will give Whole Square. (num1 + num2)^2 ");


	System.out.println("Enter NUM1 :");
	double num1 = sc.nextDouble();


	System.out.println("Enter the operation :");
	char op = sc.next().charAt(0);

	System.out.println("Enter NUM2 :");
	double num2 = sc.nextDouble();


	boolean flag = true;
	double output = 0;
	switch(op)
	{
	case '+' : output = num1+num2;break;
	case '-' : output = num1-num2;break;
	case '*' : output = num1*num2;break;
	case '/' : output = num1/num2;break;
	case '%' : output = num1%num2;break;
	case 'S' : output = ((num1*num1) + (2*num1*num2) + (num2*num2)); break;

	default : System.out.println("INVALID INPUT "); flag = false;
	}	
	if(flag)
	{
		System.out.println(num1 + " " + op + " " + num2 + " = " + output);
	}
}

}