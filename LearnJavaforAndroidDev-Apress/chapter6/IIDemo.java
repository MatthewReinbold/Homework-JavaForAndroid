public class IIDemo {
	public static void main(String[] args) {
		double temperature = 50.0; //Celcius
		if(temperature < 0.0) {
			System.out.println("water has solidified");
		}
		else {
			if(temperature >= 100.0) {
				System.out.println("water is boiling into a gas");
			}
			else {
				//temp > 0 and < 100
				assert(temperature > 0.0 && temperature < 100):temperature;
				System.out.println("water is remaining in its liquid state");
			}
		}
	}
}