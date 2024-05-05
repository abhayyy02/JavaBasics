class Car
{
	String Brand;
	String Model;
	String Type;
	double Price;
	int seatingCapacity;
	//1st Way. Engine engine = new Engine (120,10.2,"PETROL",16,4);
	Engine engine;

	//2nd Way
	Car(String Brand, String Model, String Type, double Price, int seatingCapacity, double HorsePower, double Capacity, String EngineType, double Mileage, int NumOfPistons)
	{
		this.Brand = Brand;
		this.Model = Model;
		this.Type = Type;
		this.Price = Price;
		this.seatingCapacity = seatingCapacity;
		// 2nd Ways
		this.engine = new Engine(HorsePower, Capacity, EngineType, Mileage, NumOfPistons);

	}

	public void displayCar()
	{
		System.out.println();
		System.out.println("CAR DETAILS");
		System.out.println();
		System.out.println("Brand : "+Brand);
		System.out.println("Model : "+Model);
		System.out.println("Type : "+Type);
		System.out.println("Price :"+Price);
		System.out.println("SeatingCapacity : "+seatingCapacity);
	}
}

class Engine
{
	double HorsePower;
	double Capacity;
	String EngineType;
	double Mileage;
	int NumOfPistons;

	Engine(double HorsePower, double Capacity, String EngineType, double Mileage, int NumOfPistons)
	{
		this.HorsePower = HorsePower;
		this.Capacity = Capacity;
		this.EngineType = EngineType;
		this.Mileage = Mileage;
		this.NumOfPistons = NumOfPistons;
	}

	public void displayEngine()
	{
		System.out.println();
		System.out.println("ENGINE DETAILS");
		System.out.println();
		System.out.println("HorsePower : "+HorsePower);
		System.out.println("Capacity : "+Capacity);
		System.out.println("EngineType : "+EngineType);
		System.out.println("Mileage : "+ Mileage);
		System.out.println("Number of Pistons : "+NumOfPistons);
	}

}


class CarDriver
{
	public static void main(String[] args) 
	{
		Car obj = new Car("TATA","NEXON","SUV",800000,4,120,20,"PETROL",24,20);
		obj.displayCar();
		obj.engine.displayEngine();

	}
}