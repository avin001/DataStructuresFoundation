
public class LengthOfLongestIncreasingSubArray {
	
	public static void findLengthOfLongestIncreasingSubArray(int[] a) {
		int leh = 1, mlsf = 1;
		for (int i = 1; i < a.length; i++) {
			if (a[i] > a[i - 1])
				leh++;
			else
				leh = 1;
			if (mlsf < leh)
				mlsf = leh;
		}
		System.out.printf("Length of longest increasing sub array is %d.%n", mlsf);
	}
	
	public static void main(String[] args) {
		int[] a = {-2, -3, 4, -1, -2, 1, 5, -3};
		findLengthOfLongestIncreasingSubArray(a);
	}

}
