
public class FindFibMemoizedProgram {
	
	public static final int MAX = 100;
	public static final int NIL = -1;
	public static int[] lookup = new int[MAX];
	
	public static void initialize() {
		for (int i = 0; i < lookup.length; i++)
			lookup[i] = NIL;
	}
	
	public static int fib(int n) {
		if (lookup[n] == NIL) {
			if (n <= 1)
				lookup[n] = n;
			if (n >= 2)
				lookup[n] = fib(n - 1) + fib(n - 2);
		}
		return lookup[n];
	}

	public static void main(String[] args) {
		initialize();
		System.out.println(fib(40));
	}

}
