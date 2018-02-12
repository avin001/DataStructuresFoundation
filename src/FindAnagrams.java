
public class FindAnagrams {
	
	public static void findAnagrams(String probStr, String solStr) {
		if (probStr.isEmpty()) {
			System.out.println(solStr);
			return;
		}
		for (int i = 0; i < probStr.length(); i++)
			findAnagrams(probStr.substring(0, i) + probStr.substring(i + 1), solStr + probStr.charAt(i));
	}

	public static void main(String[] args) {
		/*
		 Find all anagrams of the word "abcd".
		 */
		findAnagrams("abcd", "");
	}

}
