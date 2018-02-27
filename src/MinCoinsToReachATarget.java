
public class MinCoinsToReachATarget {
	
	public static int findMinCoinsForTargetRec(int[] coins, int target) {
		if (target == 0)
			return 0;
		int res = Integer.MAX_VALUE;
		for (int i = 0; i < coins.length; i++) {
			if (coins[i] <= target) {
				int sub_res = findMinCoinsForTargetRec(coins, target - coins[i]);
				if (sub_res != res && sub_res + 1 < res)
					res = sub_res + 1;
			}
		}
		return res;
	}
	
	public static int findMinCoinsForTargetDPWay(int[] coins, int target) {
		int[] table = new int[target +1];
		table[0] = 0;
		for (int i = 1; i <= target; i++)
			table[i] = Integer.MAX_VALUE;
		for (int i = 1; i <= target; i++) {
			for (int j = 0; j < coins.length; j++)
				if (coins[j] <= i) {
					int sub_res = table[i - coins[j]];
					if (sub_res != table[target] && sub_res + 1 < table[i])
						table[i] = sub_res + 1;
				}
		}
		return table[target];
	}

	public static void main(String[] args) {
		/*
		 Find least number of coins required to achieve a given target. 
		 A[] = {1, 5, 6, 8}
		 Target = 28
		 */
		
		int[] coins = {1, 5, 6, 8};
		int target = 28;
		System.out.println(findMinCoinsForTargetRec(coins, target));
		System.out.println(findMinCoinsForTargetDPWay(coins, target));
	}
}
