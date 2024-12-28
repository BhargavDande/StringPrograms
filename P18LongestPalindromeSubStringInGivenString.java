package string_programs;

public class P18LongestPalindromeSubStringInGivenString {
	public static void main(String[] args) {
		String s = "ababcbcddefghii";
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				String temp = s.substring(i, j + 1);
				if (isPalindrome(temp)) {
					if (res.length() < temp.length()) {
						res = temp;
					}
				}
			}
		}
		System.out.println(res);
	}

	public static boolean isPalindrome(String s) {
		return new StringBuilder(s).reverse().toString().equals(s);
	}
}
