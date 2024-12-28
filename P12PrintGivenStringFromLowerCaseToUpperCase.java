package string_programs;

public class P12PrintGivenStringFromLowerCaseToUpperCase {
	public static void main(String[] args) {
		String s = "AbcD12e@12#$oi";
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'a' && c <= 'z') {
				res = res + (char) (c - 32);
			} else {
				res = res + c;
			}
		}
		System.out.println(res);
	}
}
