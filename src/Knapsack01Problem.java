
public class Knapsack01Problem {
	
	public static int solveKnapsackRec(int maxw, int[] wt, int[] val, int n) {
		if (n == 0 || maxw == 0)
			return 0;
		if (wt[n - 1] > maxw)
			return solveKnapsackRec(maxw, wt, val, n - 1);
		else
			return Math.max(val[n - 1] + solveKnapsackRec(maxw - wt[n -1], wt, val, n -1), solveKnapsackRec(maxw, wt, val, n - 1));
	}
	
	public static int solveKnapsackDPWay(int maxw, int[] wt, int[] val, int n) {
		int i, j;
		int[][] k = new int[n + 1][maxw + 1];
		for (i = 0; i <= n ; i++)
			for (j = 0; j <= maxw; j++) {
				if (i == 0 || j == 0)
					k[i][j] = 0;
				else if (wt[i - 1] <= j)
					k[i][j] = Math.max(val[i - 1] + k[i - 1][j - wt[i - 1]], k[i - 1][j]);
				else {
					k[i][j] = k[i - 1][j];
				}
			}
		return k[n][maxw];
	}

	public static void main(String[] args) {
		/*
		 Given integer weights and values of N items, choose items with overall 
		 weight <= W to get maximum value in the knapsack.
		 val[]= {2, 3, 8, 10, 12, 13}; 
		 wt[] = {1, 2, 3, 4, 5, 6};
		 W = 10
		 */
		
		int[] val = {2, 3, 8, 10, 12, 13};
		int[] wt = {1, 2, 3, 4, 5, 6};
		int maxw = 50;
		int n = val.length;
		System.out.println(solveKnapsackRec(maxw, wt, val, n));
		System.out.println(solveKnapsackDPWay(maxw, wt, val, n));
	} 

}
