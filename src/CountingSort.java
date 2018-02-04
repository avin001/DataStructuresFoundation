
public class CountingSort {
	
	public static void sort(int[] x) {
		int max = x[0];
		for(int i = 1; i < x.length; i++) 
			if (x[i] > max) 
				max = x[i];

		int[] y = new int[max + 1];
		for (int i : x) 
			y[i] = y[i] + 1;
		
		for (int i = 0; i < y.length; i++) 
			while (y[i] > 0) {
				System.out.print(i + " ");
				y[i]--;
			}
	}
	
	public static void main(String[] args) {
		int[] arr = {23, 34, 65, 78, 34, 78, 34, 34, 78, 29, 34, 56, 34};
		sort(arr);
	}

}
