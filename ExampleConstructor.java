class Mobile
{
	String Brand;
	String Model;
	int Ram;
	double Price;


	Mobile(String Brand, String Model, int Ram, double Price)
	{
		this.Brand = Brand;
		this.Model = Model;
		this.Ram = Ram;
		this.Price = Price;
	}

	
	void displayMobile()
	{
		System.out.println("PHONE DETAILS ");
		System.out.println("BRAND : "+Brand);
		System.out.println("MODEL : "+Model);
		System.out.println("RAM : "+Ram +" GB");
		System.out.println("PRICE : "+Price );
	}
}

class MobileDriver
{
	public static void main(String[] args) 
	{
		Mobile obj = new Mobile("IPhone","14 Pro",8,115000);
		obj.displayMobile();

		System.out.println();

		Mobile obj2 = new Mobile("OnePLus","Note 6+",6,65000);
		obj2.displayMobile(); 

		System.out.println();

		Mobile obj1 = new Mobile("Samsung","Galaxy A23",6,45000);
		obj1.displayMobile();

	}
}