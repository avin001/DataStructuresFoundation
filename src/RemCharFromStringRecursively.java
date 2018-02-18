
public class RemCharFromStringRecursively {
	
	public static String removeChar(String prob, char toBeRemoved, int index, String sol) {
		if (index > prob.length() - 1)
			return "";
		while (index < prob.length() - 1 && prob.charAt(index) == toBeRemoved)
			index++;
		return sol + ((index == prob.length() - 1 && prob.charAt(index) == toBeRemoved ? "" : prob.charAt(index))) + 
				removeChar(prob, toBeRemoved, index + 1, sol);
	}

	public static void main(String[] args) {
		String input = "xaxbxcxdx";
		char toBeRem = 'x';
		System.out.println(removeChar(input, toBeRem, 0, ""));
	}

}
