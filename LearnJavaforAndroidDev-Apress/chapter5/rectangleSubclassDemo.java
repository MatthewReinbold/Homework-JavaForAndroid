abstract class Rectangle {
	abstract double getX();
	abstract double getY();
	abstract double getWidth();
	abstract double getHeight();

	static class Double extends Rectangle {
		private double x, y, width, height;

		Double( double x, double y, double width, double height) {
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
		}

		double getX() { return x; }
		double getY() { return y; }
		double getWidth() { return width; }
		double getHeight() { return height; }
	}

	static class Float extends Rectangle {
		private float x, y, width, height;

		Float( float x, float y, float width, float height) {
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
		}

		double getX() { return x; }
		double getY() { return y; }
		double getWidth() { return width; }
		double getHeight() { return height; }
	}

	//Prevent subclassing. Use type-specific Double & Float to instantiate
	private Rectangle() {}

	boolean contains(double x, double y) {
		return (x >= getX() && x < getX() + getWidth()) &&
			(y >= getY() && y < getY() + getHeight());
	}

}


public class rectangleSubclassDemo {
	public static void main(String[] args) {
		Rectangle r = new Rectangle.Double(10.0, 10.0, 20.0, 30.0);
		System.out.println("x = " + r.getX());
		System.out.println("y = " + r.getY());
		System.out.println("width = " + r.getWidth());
		System.out.println("height = " + r.getHeight());
		System.out.println("contains(15.0,15.0) =  " + r.contains(15.0, 15.0));
		System.out.println("contains(0.0,0.0) =  " + r.contains(0.0, 0.0));
		System.out.println();

		r = new Rectangle.Float(10.0f, 10.0f, 20.0f, 30.f);
		System.out.println("x = " + r.getX());
		System.out.println("y = " + r.getY());
		System.out.println("width = " + r.getWidth());
		System.out.println("height = " + r.getHeight());
		System.out.println("contains(15.0,15.0) =  " + r.contains(15.0, 15.0));
		System.out.println("contains(0.0,0.0) =  " + r.contains(0.0, 0.0));
	}
}