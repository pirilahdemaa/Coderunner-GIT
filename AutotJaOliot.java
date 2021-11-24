
public class AutotJaOliot {

	public static void main(String[] args) {
		// Coderunner ja Git-tehtävä

	}//main

}//class

class Car
{
	public String brand;
	public String model;
	public int amountOfFuel;
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public Car ()
	{
		brand ="";
		model="";
		amountOfFuel=0;
	}
	
	public Car(String brandName, String modelName, int fuelAmount)
	{
		brand = brandName;
		model = modelName;
		amountOfFuel = fuelAmount;
	}
	
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
	
	private void printData()
	{
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		System.out.println("Fuel: "+amountOfFuel);
	}
		
		
}//car
