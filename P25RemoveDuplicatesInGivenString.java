package string_programs;

public class P25RemoveDuplicatesInGivenString {
	public static void main(String[] args) {
		String s = "helloworld"; // output : helowrd
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != '@') {
				for (int j = i + 1; j < ch.length; j++) {
					if (ch[i] == ch[j]) {
						ch[j] = '@';
					}
				}
			}
		}
		String res = "";
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != '@') {
				res = res + ch[i];
			}
		}
		System.out.println(res);
	}
}
