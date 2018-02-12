
public class ReserseAStringRecursively {
	
	public static void reverse1(String prob, String sol) {
		// Recursion - Top Down
		if (prob.isEmpty()) {
			System.out.println(sol);
			return;
		}
		reverse1(prob.substring(0, prob.length() - 1), sol + prob.charAt(prob.length() - 1));
	}
	
	public static String reverse2(String probStr) {
		// Recursion - Bottom up
		if (probStr.isEmpty())
			return "";
		if (probStr.length() == 1)
			return probStr;
		return reverse2(probStr.substring(1)) + probStr.charAt(0);
	}

	public static void main(String[] args) {
		//	Reverse a given string "abcd" recursively.
		String prob = "abcd";
		reverse1(prob, "");
		System.out.println(reverse2(prob));
	}
}
