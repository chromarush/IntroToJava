public class beersong {
	
	public static void main (String[] args) {
		
		int beernum = 99;
		String word = "bottles";
		
		while (beernum > 0) {
			
		System.out.println(beernum + " " + word + " of beer on the wall,");
		System.out.println(beernum + " " + word + " of beer.");
		System.out.println("Take one down.");
		System.out.println("Pass it around.");
		beernum = beernum - 1;
		
		if (beernum > 0) {
			if (beernum == 1) {
				word = "bottle";
			}//end of if loop
			
		} else {
			System.out.println("No more bottles of beer on the wall");
		}//end else
		}//end of while loop
	}//end of main method
}//end of class