/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		//// Put your code here
		int n = Integer.parseInt(args[0]);
		int sumOfDivisors = 1;
		String s = n + " is a perfect number since " + n + " = 1";
		for(int i = 2; i<n; i++)
		{
			if(n%i == 0)
			{
				sumOfDivisors += i;
				s = s + " + " + i;
			}
		}

		if (sumOfDivisors == n){
			System.out.println(s);
		}
		else
		{
			System.out.println(n+ " is not perfect number");
		}
	}
}
