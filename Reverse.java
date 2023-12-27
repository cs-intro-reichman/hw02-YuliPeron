/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		//// Put your code here
		String s = args[0];
		for (int i = s.length() ; i>0; i--)
		{
			System.out.print(s.charAt(i-1));
		}
		char middle;
		if((s.length()%2) == 0) {
			 middle = s.charAt((s.length()/2) - 1);
		}
		else {
			 middle = s.charAt(s.length()/2);
		}
		System.out.println("");
		System.out.println("The middle character is " + middle);

	}
}
