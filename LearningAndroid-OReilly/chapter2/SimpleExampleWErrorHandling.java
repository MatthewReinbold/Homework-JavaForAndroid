package com.marakana.examples;

/*
*/

public class SimpleExampleWErrorHandling {
	private int number;

	public SimpleExampleWErrorHandling() {}

	// --- error handling part 1
	public void setValueWithException(int val) throws Exception {
		if(val <0) throw new Exception(
			"setValue Exception- Value that is set is Negative!"
		);
		number = val;
	}

	public int getNumber() {
		return number;
	}

	// here we override toString so that set value 
	// is returned rather than the object's textual representation

	// error: compiler throws error "cannot find symbol" referring to 'value'
	/*
	@Override
	public String toString() {
		return value;
	}
	*/

	public static void main(String[] args) {
			try{ example.setValue(i); }
				catch(Exception e) { e.printStackTrace();}
			} else {
				// --- error handling part 4
				try { example.setValue(i*10); }
				catch(Exception e) { e.printStackTrace();}
			}

			System.out.println("SimpleExample #" + i + "'s value is "+example.getNumber());
		}

		showErrorHandling(); // --- error handling part 2
	}

	// --- error handling part 3
	public static void showErrorHandling() {
		// here we show error handling
		try {
			System.out.println();
			System.out.println("SimpleExample BadValue Insert Case Start");
			// error: ? SimpleExample doesn't hav ea setValueWithException??
			//SimpleExample example = new SimpleExample();
			SimpleExampleWErrorHandling example = new SimpleExampleWErrorHandling();
			example.setValueWithException(-10);
			System.out.println("SimpleExample BadValue Insert Case End" );

		}
		catch( Exception e) {
			System.err.println("SimpleExample BadValue Insert Case threw an exception");
			e.printStackTrace();
		}
		finally {
			System.out.println("SimpleExample BadValue Insert Case Finally Called");
		}
	}
}