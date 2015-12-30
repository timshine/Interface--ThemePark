import java.util.ArrayList;

public class SussexFair extends SummerTheme{
	//Attributes
	ArrayList<Car> parkingLot;
	ArrayList<Animal> zoo;
	
	public void parking(String brand, int wheels, String color) {
		// Adds anyone who comes to the park (either motorcycle or car) to an arraylist of parkingLot
		parkingLot = new ArrayList<Car>();
		final int MAX = 500;  //Small Capacity
		int size = 0;
		if (size < MAX) {
			parkingLot.add(new Car(brand, wheels, color));
			size++;
		} else {
			System.out.println("Sorry our parking lots are full.");
		}
	}
	//Adds the animal to the fair and hold them in an arraylist
		public void addAnimal(String type, String color, int age) {
			zoo = new ArrayList<Animal>();
			zoo.add(new Animal(type, color,age));
		}
	
}
