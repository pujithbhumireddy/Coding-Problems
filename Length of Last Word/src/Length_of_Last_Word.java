import java.util.Arrays;

public class Length_of_Last_Word {
	
	/*
	 * Leetcode: 58. Length of Last Word
	 * 
	 * Given a string s consisting of words and spaces, return the length of the
	 * last word in the string.
	 * 
	 * A word is a maximal substring consisting of non-space characters only.

	 * Example 1:
	 * 
	 * Input: s = "Hello World" Output: 5 Explanation: The last word is "World" with
	 * length 5.
	 * 
	 * Example 2:
	 * 
	 * Input: s = "   fly me   to   the moon  " Output: 4 Explanation: The last word
	 * is "moon" with length 4. 
	 * 
	 * Example 3:
	 * 
	 * Input: s = "luffy is still joyboy" Output: 6 Explanation: The last word is
	 * "joyboy" with length 6.
	 */

	public static void main(String[] args) {

		String s = "hello world";

		int len = 0;
		int i = s.length() - 1;

		while (i >= 0 && s.charAt(i) == ' ') {
			i--;
		}

		while (i >= 0 && s.charAt(i) != ' ') {
			len++;
			i--;
		}

		System.out.println(len);

	}

}
