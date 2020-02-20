
public class Palindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("RACECAR"));

	}

	public static boolean isPalindrome(String string) {
		if (string.length() == 0 || string.length() == 1)
			return true;
		if (string.toCharArray()[0] != string.toCharArray()[string.length() - 1])
			return false;

		return isPalindrome(string.substring(1, string.length() - 1));
	}
}
