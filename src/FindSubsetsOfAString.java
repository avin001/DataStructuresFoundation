
public class FindSubsetsOfAString {
	
	public static void findSubsets(String probStr, String solStr) {
		if (probStr.length() == 0) {
			System.out.println(solStr);
			return;
		}
		findSubsets(probStr.substring(1), solStr + probStr.charAt(0));
		findSubsets(probStr.substring(1), solStr);
	}

	public static void main(String[] args) {
		/*
		 Find all subsets of the word “abcd”.
		 */
		findSubsets("abcd", "");
	}
}
