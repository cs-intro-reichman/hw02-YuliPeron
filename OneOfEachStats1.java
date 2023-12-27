/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		//// Put your code here
		int t = Integer.parseInt(args[0]);
		double avg = 0;
		int twoKids = 0;
		int threeKids = 0;
		int fourOrMoreKids = 0;
		String common;
		for (int i = 0; i<t; i++)
		{
			boolean boy = false;
			boolean girl = false;
			int numOfChildren = 0;
			while ((boy != true) || (girl != true)) {
				double boyOrGirl = (double) (Math.random());
				if (boyOrGirl < 0.5) {
					girl = true;
				} else {
					boy = true;
				}
				numOfChildren++;
			}
				avg += numOfChildren;
				if(numOfChildren == 2){
					twoKids++;
				}
				else if(numOfChildren == 3) {
					threeKids++;
				}
				else {
					fourOrMoreKids++;
				}
		}
		avg = avg/t;
		if(twoKids >=threeKids && twoKids>=fourOrMoreKids) {
			common = "2.";
		}
		else if (threeKids>=twoKids && threeKids>=fourOrMoreKids) {
			common = "3.";
		}
		else {
			common = "4 or more.";
		}
		System.out.println("Average: " + avg + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + twoKids);
		System.out.println("Number of families with 3 children: " + threeKids);
		System.out.println("Number of families with 4 or more children: " + fourOrMoreKids);
		System.out.println("The most common number of children is " + common);

	}
}
