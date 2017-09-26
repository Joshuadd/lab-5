import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Palindrome Checker!");
		System.out.println("-------------------------------------------");
		System.out.println("");
		System.out.print("Enter the word you would like to check: ");
		String word = input.next();
		System.out.println("");
		if(isaPalindrome(word))
			System.out.println(word + " is a palindrome!");
		else
			System.out.println(word + " is not a palindrome!");
		input.close();
	}
	
	public static boolean isaPalindrome(String word) { //Returns true if the word is a palindrome
		return (word.equalsIgnoreCase(reverseString(word)));
	}
	private static String reverseString(String str) { // Returns the revered version of a string
		if(str.length() == 1)
			return str;
		else
			return reverseString(str.substring(1, str.length())) + str.substring(0,1);
	}
}
