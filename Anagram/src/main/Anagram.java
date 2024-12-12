package main;

import java.util.Arrays;

public class Anagram {

	public static boolean isAnagram(String str1, String str2) {
		if (str1.length() != str2.length())
			return false;

		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		String s1 = new String(ch1);
		String s2 = new String(ch2);

		if (s1.equals(s2))
			return true;

		return false;

	}

	public static void main(String[] args) {
		String str1 = "good";
		String str2 = "godo";

		if (isAnagram(str1, str2)) {
			System.out.println(str1 + " , " + str2 + ": this both are anagram");
		} else {
			System.out.println(str1 + " , " + str2 + ": this both are not anagram");
		}
	}

}
