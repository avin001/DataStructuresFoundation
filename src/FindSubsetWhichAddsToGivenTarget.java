import java.util.ArrayList;

public class FindSubsetWhichAddsToGivenTarget {
	
	public static void findSubset(int[] prob, int index, int target, ArrayList<Integer> sol) {
		if (index < 0 || target == 0) {
			System.out.println(sol);
			return;
		}
		if (target < 0)
			sol.clear();
		findSubset(prob, index - 1, target, sol);
		sol.add(prob[index]);
		findSubset(prob, index - 1, target - prob[index], sol);
		
	}
	

	public static void main(String[] args) {
		/*
		 Given a set of integers S, find any subset which adds to given target T.
		 Example:
		 S = {1, -10, 9, 4, 3, 2, 50, 12, 13, -5}
		 T = 20
		 */
		int[] probSet = {1, -10, 9, 4, 3, 2, 50, 12, 13, -5};
		int target = 20;
		findSubset(probSet, probSet.length - 1, target, new ArrayList<Integer>());
	}
}
