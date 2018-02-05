public class BinarySearch {
	
	public static void search(int[] x, int num) {
		int start = 0, end = x.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (num == x[mid]) {
				System.out.println(mid);
				return;
			} 
			if (num < x[mid])
				end = mid - 1;
			else
				start = mid + 1;
		}
		System.out.println("Element not found.");
	}
	
	public static void main(String[] args) {
		int[] arr = {12, 34, 56, 67, 78, 89};
		search(arr, 67);
	}

}
