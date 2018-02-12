
public class FindSubsetsOfASetWithConditions {
	
	public static void findSubsetsOfASetwithConditions(int[] prob, int length, int sum1, int sum2) {
		if (length <= 0) {
			if ((sum1 % 5 == 0 && sum2 % 2 == 1) || (sum1 % 2 == 1 && sum2 % 5 == 0)) {
				System.out.printf("Sum of group1 is %d\nSum of group2 is %d\n", sum1, sum2);
				System.exit(0);
			}
		}
		if (length >= 1) {
			findSubsetsOfASetwithConditions(prob, length - 1, sum1 + prob[length - 1], sum2);
			findSubsetsOfASetwithConditions(prob, length - 1, sum1, sum2 + prob[length - 1]);
		}
	}

	public static void main(String[] args) {
		/*
		 Given a set of integers, find if it is possible to divide it into two groups 
		 such that sum of one group is a multiple of 5 and sum of the other is odd.
		 */
		int[] probSet = {1, 10, 4, 5, 2};
		int n = probSet.length;
		findSubsetsOfASetwithConditions(probSet, n, 0, 0);
	}

}
