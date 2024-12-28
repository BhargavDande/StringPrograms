package string_programs;

public class P22ReverseTheGivenStringWithoutReversingTheSpecialCharacters {
	public static void main(String[] args) {
		String s = "hello__wo_rl__d"; // output : dlrow__ol_le__h
		System.out.println(s);
		char[] ch = s.toCharArray();
		int i = 0;
		int j = ch.length - 1;
		while (i < j) {
			while (ch[i] == '_') {
				i++;
			}
			while (ch[j] == '_') {
				j--;
			}
			if (i < j) {
				char temp = ch[i];
				ch[i] = ch[j];
				ch[j] = temp;
				i++;
				j--;
			}
		}
		String res = "";
		for (int k = 0; k < s.length(); k++) {
			res += ch[k];
		}
		System.out.println(res);
	}
}
