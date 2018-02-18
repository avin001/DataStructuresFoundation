
public class MergeSort {
	
	public static void mergeSort(int[] prob, int start, int end) {
		if (start >= end)
			return;
		int mid = start + (end - start) / 2;
		mergeSort(prob, start, mid);
		mergeSort(prob, mid + 1, end);
		mergeSortedHalves(prob, new int[prob.length], start, end);
	}
	
	public static void mergeSortedHalves(int[] prob, int[] temp, int start, int end) {
		for (int i = start; i <= end; i++) 
			temp[i] = prob[i];
		int mid = start + (end - start) / 2;
		int i = start, j = mid + 1, k = start;
		while (i <= mid && j <= end) {
			if (temp[i] <= temp[j]) {
				prob[k] = temp[i];
				i++;
			} else {
				prob[k] = temp[j];
				j++;
			}
			k++;
		}
		while (i <= mid) {
			prob[k] = temp[i];
			i++;
			k++;
		}
		while (j <= end) {
			prob[k] = temp[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args) {
		int[] input = {2, 6, 8, 5, 4, 3};
		System.out.println("Array before sorting: ");
		for (int i : input)
			System.out.print(i + " ");
		System.out.println();
		mergeSort(input, 0, input.length - 1);
		System.out.println("Array after sorting: ");
		for (int i : input) {
			System.out.print(i + " ");
		}
	}
}
