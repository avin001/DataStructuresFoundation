
public class CheckPalindromeRecursively {
	
	public static boolean isPalindrome(String prob, int index) {
		if (prob.length() == 1)
			return true;
		String newProb = prob.substring(1, index);
		return prob.charAt(0) == prob.charAt(index) && isPalindrome(newProb, index - 2);
	}
	
	public static void main(String[] args) {
		String input1 = "racecar";
		String input2 = "Amsterdam";
		System.out.println(isPalindrome(input1, input1.length() - 1));
		System.out.println(isPalindrome(input2, input2.length() - 1));
	}

}
