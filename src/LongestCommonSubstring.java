
public class LongestCommonSubstring {
	
	public static int lcs(char[] c1, char[] c2, int m, int n) {
		int[][] lookup = new int[m + 1][n + 1];
		int result = 0;
		for (int i = 0; i <= m; i++)
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0)
					lookup[i][j] = 0;
				else if (c1[i - 1] == c2[j - 1]) {
					lookup[i][j] = lookup[i - 1][j - 1] + 1;
					result = Math.max(result, lookup[i][j]);
				}
				else
					lookup[i][j] = 0;
			}
		return result;
	}

	public static void main(String[] args) {
		String s1 = "ABCED";
		String s2 = "ACEB";
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		System.out.println(lcs(c1, c2, c1.length, c2.length));
	}
}
