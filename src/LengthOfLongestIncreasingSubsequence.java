
public class LengthOfLongestIncreasingSubsequence {
	
	public static int findLength(int[] a, int n) {
		int[] lis = new int[n];
		int max = 0;
		for (int i = 0; i < n; i++)
			lis[i] = 1;
		for(int i = 1; i < n; i++)
			for (int j = 0; j < i; j++) {
				if (a[i] > a[j] && lis[i] < lis[j] + 1)
					lis[i] = lis[j] + 1;
			}
		for (int i = 0; i < n; i++)
			if (max < lis[i])
				max = lis[i];
		return max;
	}
	
	public static void main(String[] args) {
		int[] a = {-2, -3, 4, -1, -2, 1, 5, -3};
		int length1 = a.length;
		int[] b = {10, 22, 9, 33, 21, 50, 41, 60};
		int length2 = b.length;
		
		System.out.println(findLength(a, length1));
		System.out.println(findLength(b, length2));
	}
}
