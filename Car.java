/*
public class Car {
	String make;
	String model;
	int numDoors;
	static int counter; //static means only one ref generated for all objects

	Car(String make, String model) {
		this(make, model, 4);
	}

	Car(String make, String model, int numDoors) {
		this.make = make;
		this.model = model;
		this.numDoors = numDoors;
		counter++; //accessing counter on class, not object
	}

	void printDetails(){
		//don't need to use the 'this' keyword, because Java passes a hidden argument for which object to operate on
		System.out.println("Make = " + make);
		System.out.println("Model = " + model);
		System.out.println("Number of doors = " + numDoors);
		System.out.println();
	}


	public static void main(String[] args) {
		Car myCar = new Car("Toyota","Camry");
		Car yourCar = new Car("Mazda","RX-8",2);
		System.out.println(Car.counter);
		yourCar.printDetails();
	}
}
*/

public class Car extends Vehicle {
	private int numWheels;

	Car(String make, String model, int year, int numWheels) {
		super(make, model, year);
		this.numWheels = numWheels;
	}

	public static void main(String[] args) {
		Car car = new Car("Ford","Fiesta",2009,4);
		car.describe();
	}

	@Override
	void describe() {
		System.out.print("This car is a ");
		super.describe();
	}
}