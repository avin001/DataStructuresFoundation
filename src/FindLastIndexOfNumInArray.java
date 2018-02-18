
public class FindLastIndexOfNumInArray {
	
	public static void findLastIndex(int[] prob, int x, int index) {
		if (index < 0)
			return;
		if (x == prob[index]) {
			System.out.println(index);
			return;
		}
		findLastIndex(prob, x, index - 1);
	}

	public static void main(String[] args) {
		int[] input = {9, 8, 10, 8};
		int num = 8;
		findLastIndex(input, num, input.length - 1);
	}

}
