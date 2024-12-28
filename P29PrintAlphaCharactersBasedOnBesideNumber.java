package string_programs;

public class P29PrintAlphaCharactersBasedOnBesideNumber {
	public static void main(String[] args) {
		String s = "a2b11c6"; // output : aabbbbbbbbbbbcccccc
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				char ch = s.charAt(i - 1);
				String num = "";
				while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
					num = num + s.charAt(i);
					i++;
				}
				res = res + addChar(ch, Integer.parseInt(num));
			}
		}
		System.out.println(res);
	}

	public static String addChar(char ch, int num) {
		String res = "";
		while (num > 0) {
			res = res + ch;
			num--;
		}
		return res;
	}
}
