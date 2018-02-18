
public class RemDuplicatesFromStringRecursively {
	
	public static String removeDuplicates(String prob, int index, String sol) {
		if (index > prob.length() - 1)
			return "";
		while (index < prob.length() - 1 && prob.charAt(index) == prob.charAt(index + 1))
			index++;
		return sol + prob.charAt(index) + removeDuplicates(prob, index + 1, sol);
		
	}

	public static void main(String[] args) {
		String input = "aabccbaa";
		System.out.println(removeDuplicates(input, 0, ""));
	}

}
