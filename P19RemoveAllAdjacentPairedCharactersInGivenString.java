package string_programs;

public class P19RemoveAllAdjacentPairedCharactersInGivenString {
	public static void main(String[] args) {
		String s = "ABBAACCABA";
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				s = s.substring(0, i) + s.substring(i + 2);
				i = -1;
			}
		}
		System.out.println(s);
	}
}
