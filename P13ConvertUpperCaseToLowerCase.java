package string_programs;

public class P13ConvertUpperCaseToLowerCase {
	public static void main(String[] args) {
		String s = "aBCDef@12IO#$AA";
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				res = res + (char) (ch + 32);
			} else {
				res = res + ch;
			}
		}
		System.out.println(res);
	}
}
