
public class AutotJaOliot {

	public static void main(String[] args) {
		// Coderunner ja Git-teht�v�

	}//main

}//class

class Car
{
	public String brand;
	public String model;
	public int amountOfFuel;
	
	
	public void brake()
	{
		System.out.println("Car is breaking");
	}
	
	public void accelerate()
	{
		amountOfFuel = amountOfFuel -1;
		
		if (amountOfFuel > 0 )
		{
		System.out.println("Car is accelerating");
		}
	}
	
	public void printData()
	{
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		System.out.println("Fuel: "+amountOfFuel);
	}
		
		
}//car