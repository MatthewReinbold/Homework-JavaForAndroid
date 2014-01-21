/*
 for listing 5-6, demonstrating how EnclosedClass must
 first be instantiated because accessEnclosingClass is non-static
*/

class EnclosingClass {
	private int i;

	private void m() {
		System.out.println(i);
	}

	class EnclosedClass {
		void accessEnclosingClass() {
			i = 1;
			m();
		}
	}
}

public class nonstaticMemberClass {
	public static void main( String[] args) {
		EnclosingClass ec = new EnclosingClass();
		ec.new EnclosedClass().accessEnclosingClass(); //should output 1
	}

}