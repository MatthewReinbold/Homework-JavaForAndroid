/* 
	The Car2 java file demonstrates object inheritance
	Because Car2 is the public class, even though it is
	inheriting vehicle info, it needs to be compiled as Car2
*/

class Vehicle {
	private String make;
	private String model;
	private int year;

	Vehicle(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	String getMake() {
		return make;
	}

	String getModel() {
		return model;
	}

	int getYear() {
		return year;
	}
}

public class Car2 extends Vehicle {
	private int numWheels;

	Car2(String make, String model, int year, int numWheels) {
		super(make, model, year);
		this.numWheels = numWheels;
	}

	public static void main(String[] args) {
		Car2 car = new Car2("Mazda","CX-9",2007,4);
		System.out.println("Make=" + car.getMake());
		System.out.println("Model=" + car.getModel());
		System.out.println("Year=" + car.getYear());
		/* Not completely kosher - normally you can't access a private
		field via an object ref. however, because numWheels is access from 
		within a function that is part of the class, it works
		*/
		System.out.println("Number of wheels=" + car.numWheels);
	}
}