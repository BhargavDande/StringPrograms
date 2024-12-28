/* Write a Java function to determine whether two given strings are anagrams of each other.
   Two strings are considered anagrams if they contain the same characters 
   in the same frequency, but their order can differ.
   The program should return Anagrams if the strings are anagrams and Not Anagrams otherwise. 
   Ignore case sensitivity (e.g., "Listen" and "Silent" are anagrams).     */

package string_programs;

import java.util.Arrays;

public class P20CheckBothStringsAreAnagramOrNot {
	public static void main(String[] args) {
		String s1 = "Listen";
		String s2 = "Silent";
		if (s1.length() != s2.length()) {
			System.out.println("Both Strings are not Anagram.");
		} else {
			s1 = s1.toLowerCase();
			s2 = s2.toLowerCase();
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			String temp1 = new String(ch1);
			String temp2 = new String(ch2);
			if (temp1.equals(temp2)) {
				System.out.println("Anagrams");
			} else {
				System.out.println("Not Anagrams");
			}
		}
	}
}
