package string_programs;

public class P11PrintCountOfVowelsConsonantsDigitsSpecialCharsInGivenString {
	public static void main(String[] args) {
		String s = "cauliFlower!123@--".toLowerCase();
		int vol = 0;
		int con = 0;
		int spc = 0;
		int digc = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'a' && c <= 'z') {
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vol++;
				} else {
					con++;
				}
			} else if (c >= '0' && c <= '9') {
				digc++;
			} else {
				spc++;
			}
		}
		System.out.println("vol : " + vol);
		System.out.println("con : " + con);
		System.out.println("digits : " + digc);
		System.out.println("special chars : " + spc);
	}
}
