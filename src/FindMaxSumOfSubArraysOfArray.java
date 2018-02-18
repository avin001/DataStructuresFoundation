
public class FindMaxSumOfSubArraysOfArray {
	
	
	
	public static void findMaxSumOfSubArray(int[] a) {
		int seh = 0, msf = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			seh = seh + a[i];
			if (msf < seh)
				msf = seh;
			if (seh < 0)
				seh = 0;
		}
		System.out.printf("Max sum of sub arrays is %d.%n", msf);
	}

	public static void main(String[] args) {
		int[] a = {-2, -3, 4, -1, -2, 1, 5, -3};
		findMaxSumOfSubArray(a);
	}
	
}
