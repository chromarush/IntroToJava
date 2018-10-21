public class Ternary{
	public static void main (String[] args) {
		int wolves = 30;
		int cougars = 20;
		char gameresult = (wolves > cougars) ? 'W' : 'L';
		
		System.out.println(gameresult);
	}
}