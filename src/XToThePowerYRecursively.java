
public class XToThePowerYRecursively {
	
	public static void findXToThePowerY(int x, int y, double sol) {
		/*
		 Top down approach with space and time complexity as O(y)
		 */
		if (y == 0) {
			System.out.println(sol);
			return;
		}
		findXToThePowerY(x, y - 1, sol * x);
	}
	
	public static double findXToThePowerY(int x, int y) {
		// Using dynamic programming with complexity O(log y with base 2)
		if (1 == y)
			return x;
		if (0 == y)
			return 1;
		double temp = findXToThePowerY(x, y / 2);
		return 0 == y % 2 ? temp * temp : temp * temp * x;
	}

	public static void main(String[] args) {
		findXToThePowerY(2, 4, 1);
		System.out.println(findXToThePowerY(2, 4));
		System.out.println(findXToThePowerY(2, 5));
	}

}
