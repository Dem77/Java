public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(recursiveFactorial(4));
	}

	public static int recursiveFactorial(int n)
	{
		if (n == 1)
		{
			System.out.println(1);
			return 1; // Termination condition
		}
		else
		{
			
			return n * recursiveFactorial(n-1);
		}
	}
}
