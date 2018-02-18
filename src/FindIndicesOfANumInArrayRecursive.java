
public class FindIndicesOfANumInArrayRecursive {
	
	public static void findIndices(int[] prob, int x, int index) {
		if (index > prob.length - 1) 
			return;
		if (x == prob[index]) 
			System.out.println(index);
		findIndices(prob, x, index + 1);
	}

	public static void main(String[] args) {
		/*
		 Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array. 
		 Save all the indexes in an array (in increasing order).
		 */
		
		int[] input = {9, 8, 10, 8, 8};
		int element = 8;
		findIndices(input, element, 0);
	}

}
