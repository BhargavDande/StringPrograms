package string_programs;

public class P27PrintOccurranceOfEachCharacterInGivenString {
	public static void main(String[] args) {
		String s = "helloworld";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != '@') {
				int c = 1;
				for (int j = i + 1; j < ch.length; j++) {
					if (ch[i] == ch[j]) {
						c++;
						ch[j] = '@';
					}
				}
				System.out.println(ch[i] + " -> " + c);
			}
		}
	}
}
