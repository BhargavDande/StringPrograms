package string_programs;

public class P23ReverseEachWordInGivenSentence {
	public static void main(String[] args) {
		String s = "java is a programming language"; // output : avaj si a gnimmargorp egaugnal
		String res = "";
		String[] str = s.split(" +");

		for (int i = 0; i < str.length; i++) {
			StringBuilder sb = new StringBuilder(str[i]);
			if (i == 0) {
				res = res + sb.reverse();
			} else {
				res = res + " " + sb.reverse();
			}
		}
		System.out.println(res);
	}
}
