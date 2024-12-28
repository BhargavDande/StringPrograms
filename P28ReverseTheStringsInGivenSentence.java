package string_programs;

public class P28ReverseTheStringsInGivenSentence {
	public static void main(String[] args) {
		String s = "    java   is   a  programming    language  "; // output : language programming a is java
		s = s.trim();
		String[] str = s.split(" +");
		String res = "";
		for (int i = str.length - 1; i >= 0; i--) {
			if (i == str.length - 1) {
				res = res + str[i];
			} else {
				res = res + " " + str[i];
			}
		}
		System.out.println(res);
	}
}
