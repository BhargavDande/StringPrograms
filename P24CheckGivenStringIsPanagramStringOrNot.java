/*Write a Java function to determine whether a given string is a pangram. 
  A string is considered a pangram if it contains every letter of the 
  English alphabet (a-z) at least once, case-insensitively.
  Ignore numbers, spaces, and special characters. 
  The function should return Pangram if the string is a pangram and Not a Pangram otherwise.    */

package string_programs;

public class P24CheckGivenStringIsPanagramStringOrNot {
	public static void main(String[] args) {
		String s = "The quick brown fox jumps over a lazy dog".toLowerCase();
		String ref = "abcdefghijklmnopqrstuvwxyz";
		boolean flag = true;
		for (int i = 0; i < ref.length(); i++) {
			if (s.indexOf(ref.charAt(i)) == -1) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println("Pangram");
		} else {
			System.out.println("Not a Pangram");
		}
	}
}
