
public class BinarySearchRecursive {
	
	public static void binarySearchRecursively(int[] prob, int element, int start, int end) {
		int mid = start + (end - start) / 2;
		if (start >= end && element != prob[mid])
			System.out.println("Element not found.");
		if (element == prob[mid]) {
			System.out.printf("%d found at index %d.", element, mid);
		}
		if (start < end && element < prob[mid])
			binarySearchRecursively(prob, element, start, mid - 1);
		if (start < end && element > prob[mid])
			binarySearchRecursively(prob, element, mid + 1, end);
	}

	public static void main(String[] args) {
		int[] input = {2, 4, 6, 8, 10, 12};
		int element = 8;
		binarySearchRecursively(input, element, 0, input.length - 1);
	}

}
