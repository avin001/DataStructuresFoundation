
public class StaircaseProblem {
	
	public static int findNumberOfWays(int steps) {
		if (steps == 0)
			return 1;
		if (steps < 0)
			return 0;
		return findNumberOfWays(steps - 1) + findNumberOfWays(steps - 2) +
				findNumberOfWays(steps - 3);
	}

	public static void main(String[] args) {
		/*
		 A child is running up a staircase with N steps, and can hop either 1 step, 2 steps or 3 steps at a time. 
		 Implement a method to count how many possible ways the child can run up to the stairs. You need to return 
		 number of possible ways W.
		 */
		int n = 3;
		System.out.println(findNumberOfWays(n));
	}

}
