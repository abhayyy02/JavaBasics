import java.util.Scanner;
class BankAp
{
	static String name;
	static String address;
	static long Adharno;
	static long Phoneno;
	static int pin;
	static int Npin ;
	static double bal;

	static 
	{
		System.out.println();
		System.out.println("[**]--- Welcome to TECH Bank ---[**]");
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		Outerloop:
		for(;;)
		{
			
			System.out.println();

			System.out.println("1. Create a New Account ");
			System.out.println("2. Log in Existing Account ");

			System.out.println();

			System.out.println("Please select an Option.");
			int option = sc.nextInt();
			

			switch(option)
			{
				case 1 :
					{
						System.out.println();
						System.out.println("Please enter the credentials asked below. -->");
						sc.nextLine();
						System.out.println();
						System.out.println("Enter your NAME. ");
						name = sc.nextLine();
						System.out.println();
						System.out.println("Enter your Address. ");
						address = sc.nextLine();
						System.out.println();
						System.out.println("Enter you Adhaar number.");
						Adharno = sc.nextLong();
						System.out.println();
						System.out.println("Enter your Phoneno. ");
						Phoneno = sc.nextLong();
						System.out.println();
						System.out.println("Enter the Deposit Amount. ");
						bal = sc.nextDouble();
						System.out.println();
						System.out.println("Set a New Pin. ***** ");
						pin = sc.nextInt();

						System.out.println();
						System.out.println("-- ^_^ -- Your Account Has Been Created successfully  -- ^_^ -- ");
						System.out.println();
						break;
					}						

				case 2 :
					{
						System.out.println("Enter the pin");
						Npin=sc.nextInt();
						if(Npin==pin)

						{	

							sc.nextLine();
							for(;;)
							{
								System.out.println();
								System.out.println("---> FEATURES <---");
								System.out.println("1.Check Bal  2.Deposit  3.Withdraw  4.Info  5.Logut");
								System.out.println();
								System.out.println("Select an Option");
								int opt2 = sc.nextInt();

								switch(opt2)
								{
										case 1 : 
											{
												System.out.println();
												System.out.println("---> CHECK BALANCE <---");
												System.out.println();												
												System.out.println("Your Balnce is = " +bal);												
												break;
											}

										case 2 : 
											{
												System.out.println();
												System.out.println("--> DEPOSIT AMOUNT <--");
												System.out.println("Enter the Amount");
												double DepositAmount = sc.nextInt();
												bal = bal + DepositAmount;
												System.out.println("You have successfully Deposited the amount ");
												break;
											}

										case 3:
											{
												System.out.println();
												System.out.println("--> WITHDRAW AMOUNT <--");
												System.out.println("Enter the Amount ");
												double WithdrawAmount = sc.nextInt();
												bal = bal - WithdrawAmount;
												System.out.println("You have successfully Withraw the Amount ");
												break;
											}

										case 4: 
											{
												System.out.println("NAME --> "+name);
												System.out.println();
												System.out.println("ADDRESS --> "+address);
												System.out.println();
												System.out.println("ADHAAR NUMBER --> "+Adharno);
												System.out.println();
												System.out.println("PHONE NUMBER --> "+Phoneno);
												System.out.println();
												
												break;
											}

										case 5:
											{
												System.exit(0);
											}

										default :
											{
												System.out.println();
												System.out.println("PLease Enter a Valid Option ");
											}


							}

						}


					}
				}
			}
		}	
	}
}
