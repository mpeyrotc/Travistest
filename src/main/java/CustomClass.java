
public class CustomClass {
	// returns true if the argument is even and false otherwise
	public static boolean isEven(int someNumber) {
		return (someNumber % 2) == 0;
	}
	
	// returns true if the argument is a number between 0 and 9 inclusive
	public static boolean inRange(String someNumber) {
		int aNumber = Integer.parseInt(someNumber);		
		return aNumber >= 0 && aNumber <= 9;
	}
}
