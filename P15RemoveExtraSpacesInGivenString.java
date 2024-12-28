package string_programs;

public class P15RemoveExtraSpacesInGivenString {
	public static void main(String[] args) {
		String s = "   java     program    language   ";
		String res = "";

		// Approach 1
//		for (int i = 0; i < s.length(); i++) {
//			char c = s.charAt(i);
//			if (c != ' ') {
//				String word = "";
//				for (; i < s.length(); i++) {
//					char ch = s.charAt(i);
//					if (ch == ' ') {
//						break;
//					} else if (ch != ' ') {
//						word += ch;
//					}
//				}
//				res = res + word + ' ';
//			}
//		}
//		res = res.trim();
//		System.out.println(res);

		// Approach 2
		for (int i = 0; i < s.length() - 1; i++) {
			if (!(s.charAt(i) == ' ' && s.charAt(i + 1) == ' ')) {
				res += s.charAt(i);
			}
		}
		res = res.trim();
		System.out.println(res);

		// Approch 3
//		s = s.trim();
//		String[] str = s.split("\\s+"); // (" +")
//		for (int i = 0; i < str.length; i++) {
//			if (i == 0) {
//				res = res + str[i];
//			} else {
//				res = res + ' ' + str[i];
//			}
//		}
//		System.out.println(res);
	}
}
