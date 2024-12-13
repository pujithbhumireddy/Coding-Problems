import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_Words_Containing_Character {
	/*
	 * leetcode: 2942. Find Words Containing Character
	 * 
	 * You are given a 0-indexed array of strings words and a character x.
	 * 
	 * Return an array of indices representing the words that contain the character x.
	 * 
	 * Note that the returned array may be in any order.
	
	 * Example 1:
	 * 
	 * Input: words = ["leet","code"], x = "e" Output: [0,1] Explanation: "e" occurs
	 * in both words: "leet", and "code". Hence, we return indices 0 and 1.
	 * 
	 * Example 2:
	 * 
	 * Input: words = ["abc","bcd","aaaa","cbc"], x = "a" Output: [0,2] Explanation:
	 * "a" occurs in "abc", and "aaaa". Hence, we return indices 0 and 2.
	 * 
	 * Example 3:
	 * 
	 * Input: words = ["abc","bcd","aaaa","cbc"], x = "z" Output: [] Explanation:
	 * "z" does not occur in any of the words. Hence, we return an empty array.
	 */

	public static void main(String[] args) {
//		String[] words = {"leet","code"};
		String[] words = { "abc", "bcd", "aaaa", "cbc" };
//		String[] words = {"abc","bcd","aaaa","cbc"};
		char target = 'a';
		List<Integer> result = new ArrayList<>();

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			for (char ch : word.toCharArray()) {
				if (ch == target) {
					result.add(i);
					break;
				}
			}
		}

		System.out.println(result);

	}

}
