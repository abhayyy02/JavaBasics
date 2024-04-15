class Laptop
{
	String Brand;
	String ModelNum;
	int Ram;
	String Type;
	int Rom;
	double Price;

	public void displayLaptop() 
	{
		System.out.println("^_^ Laptop Details ^_^");
		System.out.println();	
		System.out.println("Brand --> "+Brand);
		System.out.println("ModelNum --> "+ModelNum);
		System.out.println("Ram --> "+Ram+" GB");
		System.out.println("Rom --> "+Rom+" GB");
		System.out.println("Type --> "+Type);
		System.out.println("Price --> "+Price);
		System.out.println();
	}
}

class LaptopDriver
{
	public static void main(String[] args) 
	{
		Laptop obj = new Laptop();

		obj.Brand = "ASUS";
		obj.ModelNum = "ASU001s";
		obj.Ram = 8;
		obj.Rom = 6;
		obj.Type = "GAMING";
		obj.Price = 85000;

		obj.displayLaptop();

		Laptop obj1 = new Laptop();

		obj1.Brand = "HP";
		obj1.ModelNum = "HP101s";
		obj1.Ram =6;
		obj1.Rom = 4;
		obj1.Type = "WORK";
		obj1.Price = 55000;

		obj1.displayLaptop();

	}
}