
public class PrintWellFormedCombinationsOfCurlyBraces {
	
	public static void printPermutationsOfCurlyBraces(int no, int nc, String sol) {
		if (no == 0 && nc == 0) {
			System.out.println(sol);
			return;
		}
		if (no > 0)
			printPermutationsOfCurlyBraces(no - 1, nc, sol + "{");
		if (nc > no)
			printPermutationsOfCurlyBraces(no, nc - 1, sol + "}");
	}

	public static void main(String[] args) {
		/*
		 Print all well formed combinations of N {}
		 */
		printPermutationsOfCurlyBraces(3, 3, "");
	}

}
