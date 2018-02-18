
public class CheckIsArraySortedRecursively {
	
	public static boolean isSorted(int[] prob, int index) {
		if (index >= prob.length - 1) 
			return true;
		if (prob[index] > prob[index + 1]) 
			return false;
		return isSorted(prob, index + 1);
	}

	public static void main(String[] args) {
		int[] input1 = {2, 5, 7, 9, 11, 15};
		int[] input2 = {5, 2, 3, 7, 1, 9};
		System.out.println(isSorted(input1, 0));
		System.out.println(isSorted(input2, 0));
	}

}
