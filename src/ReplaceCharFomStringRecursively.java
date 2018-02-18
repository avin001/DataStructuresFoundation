
public class ReplaceCharFomStringRecursively {
	
	public static String replaceChar(String prob, char c1, char c2, int index, String sol) {
		if (index > prob.length() - 1)
			return "";
		return sol + (index <= prob.length() - 1 && prob.charAt(index) == c1 ? c2 : prob.charAt(index)) +
				replaceChar(prob, c1, c2, index + 1, sol);
	}

	public static void main(String[] args) {
		/*
		 Given an input string S and two characters c1 and c2, you need to replace every occurrence of character c1 
		 with character c2 in the given string. 
		 
		 Do this recursively.
		 */
		String input = "abacd";
		char c1 = 'a';
		char c2 = 'x';
		System.out.println(replaceChar(input, c1, c2, 0, ""));
	}

}
