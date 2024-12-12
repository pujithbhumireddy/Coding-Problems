
public class Longest_Palindromic_SubString {
	
	/*
	 * leetcode: 5. Longest Palindromic Substring* Given a string s, return the
	 * longest palindromic substring in s.
	 *
	 * Example 1:
	 * 
	 * Input: s = "babad" Output: "bab" Explanation: "aba" is also a valid answer.
	 * Example 2:
	 * 
	 * Input: s = "cbbd" Output: "bb"
	 */

	public static boolean isLongPalSs(String str) {

		if (str == "" && str.length() == 0) {
			return false;
		}

		int left = 0;
		int right = str.length() - 1;

		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}

			left++;
			right--;
		}

		return true;
	}

	public static void main(String[] args) {
		String str = "cbbd";

		int len = str.length();
		String longestSubString = "";

		for (int i = 0; i < len; i++) {
			String substr = "";
			for (int j = i; j < len; j++) {
				substr += (str.charAt(j) + "");

				if (isLongPalSs(substr) && substr.length() > longestSubString.length()) {
					longestSubString = substr;
				}
			}
		}

		System.out.println("the Longest Palindrome SubString :" + longestSubString);

	}

}
