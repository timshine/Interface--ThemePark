
public class Animal {
	//Attributes
	private String type;
	private String color;
	private int age;
	
	//Overloaded Constructor
	public Animal(String type, String color, int age){
		this.type = type;
		this.color = color;
		this.age = age;
	}
	
	// To string method for animal
		public String toString() {
			return "[Type: " + type + ", Color: " + color + ", Age: " + age + "]";
		}
}
