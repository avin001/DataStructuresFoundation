
public class FindFirstIndexOfNumInArray {
	
	public static void findFirstIndex(int[] prob, int x, int index) {
		if (index > prob.length - 1) 
			return;
		if (x == prob[index]) {
			System.out.println(index);
			return;
		}
		findFirstIndex(prob, x, index + 1);
	}

	public static void main(String[] args) {
		int[] input = {9, 8, 10, 8};
		int num = 8;
		findFirstIndex(input, num, 0);
	}

}
