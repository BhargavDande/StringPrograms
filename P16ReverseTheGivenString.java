package string_programs;

public class P16ReverseTheGivenString {
	public static void main(String[] args) {
		String s = "java";
		String res = "";

		// 1st Approach
		for (int i = 0; i < s.length(); i++) {
			res = s.charAt(i) + res;
		}

		// 2nd Approach
//		for (int i = s.length() - 1; i >= 0; i--) {
//			res = res + s.charAt(i);
//		}

		// 3rd Approach
//		for (int i = 0; i < s.length(); i++) {
//			res = res + s.charAt(s.length() - 1 - i);
//		}

		System.out.println(res);
	}
}
