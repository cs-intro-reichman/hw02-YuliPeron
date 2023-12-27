
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		//// Put your code here

		boolean boy = false;
		boolean girl = false;
		int numOfChildren = 0;
		while ((boy != true) || (girl != true))
		{
			double boyOrGirl = (double)(Math.random());
			if (boyOrGirl < 0.5 )
			{
				girl = true;
				System.out.print("g ");
			}
			else
			{
				boy = true;
				System.out.print("b ");
			}
			numOfChildren++;
		}
		System.out.println();
		System.out.println("You made it... and you now have " + numOfChildren + " children.");
	}
}
