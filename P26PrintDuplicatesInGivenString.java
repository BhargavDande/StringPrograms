package string_programs;

public class P26PrintDuplicatesInGivenString {
	public static void main(String[] args) {
		String s = "helloworld";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != '@') {
				int c = 0;
				for (int j = i + 1; j < ch.length; j++) {
					if (ch[i] == ch[j]) {
						c++;
						ch[j] = '@';
					}
				}
				if (c > 0) {
					System.out.println(ch[i]);
				}
			}
		}
	}
}
