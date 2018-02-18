
public class PrintAllPermutationsOfNTimesABC {
	
	public static int count = 0;
	
	public static void printPermutations(int na, int nb, int nc, String sol) {
		if (na == 0 && nb == 0 && nc == 0) {
			count++;
			System.out.println(sol);
			return;
		}
		if (na > 0)
			printPermutations(na - 1, nb, nc, sol + "a");
		if (nb > 0)
			printPermutations(na, nb - 1, nc, sol + "b");
		if (nc > 0)
			printPermutations(na, nb, nc - 1, sol + "c");
	}

	public static void main(String[] args) {
		printPermutations(2, 2, 2, "");
		System.out.println(count);
	}

}
