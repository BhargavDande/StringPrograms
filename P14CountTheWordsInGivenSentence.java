package string_programs;

public class P14CountTheWordsInGivenSentence {
	public static void main(String[] args) {
		String s = "java is a programming language";
		int wc = 0;
		for (int i = 0; i < s.length(); i++) {
			if ((i == 0 && s.charAt(i) != ' ') || (s.charAt(i) != ' ' && s.charAt(i - 1) == ' ')) {
				wc++;
			}
		}
		System.out.println(wc);
	}
}
