
public class CheckElementInArrayRecursively {
	
	public static boolean checkElementInArray(int[] prob, int x) {
		if (prob.length == 1) 
			return x == prob[0];
		int[] newProb = new int[prob.length - 1];
		for (int i = 0; i < newProb.length; i++)
			newProb[i] = prob[i + 1];
		return x == prob[0] || checkElementInArray(newProb, x);
	}

	public static void main(String[] args) {
		int[] input = {23, 43, 45, 67, 78, 89};
		int element1 = 89;
		int element2 = 101;
		System.out.println(checkElementInArray(input, element1));
		System.out.println(checkElementInArray(input, element2));
	}

}
