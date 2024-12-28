/* Write a Java function to determine whether two given strings are anagrams of each other.
   Two strings are considered anagrams if they contain the same characters 
   in the same frequency, but their order can differ.
   The program should return Anagrams if the strings are anagrams and Not Anagrams otherwise. 
   Ignore case sensitivity (e.g., "Listen" and "Silent" are anagrams).     */

package string_programs;

public class P21CheckGivenStringsAreAnagramOrNotWithoutUsingInbuiltMethods {
	public static void main(String[] args) {
		String s1 = "Listen";
		String s2 = "Silent";
		if (s1.length() != s2.length()) {
			System.out.println("Both Strings are not Anagram");
		} else {
			s1 = convertLowerCase(s1);
			s2 = convertLowerCase(s2);

			char[] ch1 = convertCharArray(s1);
			char[] ch2 = convertCharArray(s2);

			bubbleSort(ch1);
			bubbleSort(ch2);

			for (int i = 0; i < ch1.length; i++) {
				if (ch1[i] != ch2[i]) {
					System.out.println("Anagrams");
					return;
				}
			}
			System.out.println("Not Anagrams");
		}
	}

	public static void bubbleSort(char[] ch) {
		for (int i = 0; i < ch.length - 1; i++) {
			for (int j = 0; j < ch.length - 1 - i; j++) {
				if (ch[j] > ch[j + 1]) {
					char temp = ch[j];
					ch[j] = ch[j + 1];
					ch[j + 1] = temp;
				}
			}
		}
	}

	public static char[] convertCharArray(String s) {
		char[] ch = new char[s.length()];
		for (int i = 0; i < ch.length; i++) {
			ch[i] = s.charAt(i);
		}
		return ch;
	}

	public static String convertLowerCase(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				res += (char) (ch + 32);
			} else {
				res += ch;
			}
		}
		return res;
	}
}
