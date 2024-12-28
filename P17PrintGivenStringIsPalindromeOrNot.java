package string_programs;

public class P17PrintGivenStringIsPalindromeOrNot {
	public static boolean isPalindrome(String s) {
		return new StringBuffer(s).reverse().toString().equals(s);
	}

	public static void main(String[] args) {
		String s = "madam";
		System.out.println(isPalindrome(s) ? "Palindrome.." : "Not a Palindrome..");
	}
}
