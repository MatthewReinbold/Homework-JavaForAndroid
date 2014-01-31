// picking numbers for the Canadian lotto; whee!
public class Lotto649 {
	public static void main(String[] args) {
		// Lotto 649 requires that six unique numbers be chosen
		int[] selectedNumbers = new int[6];

		//assign a unique random number from 1 to 49 (inclusive) to each slot
		for( int slot = 0; slot < selectedNumbers.length; slot++) {
			int num;
			// obtain a random number; it stays if not previously chosen
			try_again:
			do {
				num = rnd(49) + 1;
				for( int i=0; i < slot; i++) {
					if(selectedNumbers[i] == num)
						continue try_again;
				}
				break;
			} while (true);
			//assign the number to appropriate spot
			selectedNumbers[slot] = num;
		} // end of the for loop

		//sort all of the numbers into ascending order and print
		sort(selectedNumbers);
		for(int i = 0; i < selectedNumbers.length; i++) {
			System.out.print(selectedNumbers[i] + " ");
		}
	} // end of the public static void main

	static int rnd(int limit){
		// generate a psuedo random number
		assert limit > 1: "limit = " + limit;
		return (int) (Math.random() * limit);
	}

	//bubble sort!
	static void sort(int[] x) {
		// sorts in ascending order
		for(int pass = 0; pass < x.length -1; pass++) {
			for(int i = x.length - 1; i > pass; i--) {
				if( x[i] < x[pass]) {
					int temp = x[i];
					x[i] = x[pass];
					x[pass] = temp;
				} // end of the if
			} // end of the inner for
		} // end of the outer for
	} // end of the sort method
} // end of the class