
public class DynamicProgLongestCommonSubsequence {
	
	public static int lcs(char[] c1, char[] c2, int m, int n) {
		int[][] lookup = new int[m + 1][n + 1];
		for (int i = 0; i <= m; i++)
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0)
					lookup[i][j] = 0;
				else if (c1[i - 1] == c2[j - 1])
					lookup[i][j] = lookup[i - 1][j - 1] + 1;
				else
					lookup[i][j] = Math.max(lookup[i - 1][j], lookup[i][j - 1]);
			}
		return lookup[m][n];
	}

	public static void main(String[] args) {
		String s1 = "ABCD";
		String s2 = "ACEB";
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		System.out.println(lcs(c1, c2, c1.length, c2.length));
	}

}
