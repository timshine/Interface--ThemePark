public class Car {
	// Attributes of car
	private String brand;
	private int numOfWheels;
	private String color;

	// Takes in brand, number of wheels and the color of the car/motorcycle
	public Car(String brand, int numOfWheels, String color) {
		this.brand = brand;
		this.numOfWheels = numOfWheels;
		this.color = color;
	}
	
	// To string method for car
	public String toString() {
		return "[Brand: " + brand + ", Number of Wheels: " + numOfWheels + ", Color of Car: " + color + "]";
	}
}