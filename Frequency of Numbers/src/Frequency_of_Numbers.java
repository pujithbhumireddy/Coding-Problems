import java.util.*;
import java.util.Map.Entry;

public class Frequency_of_Numbers {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 1, 1, 2, 3, 34, 4, 3, 2, 21, 2, 3, 6, 6, 6, 6, 4, 4, 3, 2, 1, 1, 1, 1, 1 };

		Map<Integer, Integer> Freqmap = new HashMap<>();

		for (int elements : arr) {
			Freqmap.put(elements, Freqmap.getOrDefault(elements, 0) + 1);
		}

		int maxno = -1;
		int maxfreq = 0;

		Set<Map.Entry<Integer, Integer>> set = Freqmap.entrySet();

		for (Map.Entry<Integer, Integer> entry : set) {
			if (entry.getValue() > maxfreq) {
				maxfreq = entry.getValue();
				maxno = entry.getKey();
			}
		}

		System.out.println("the most frequent number is: " + maxno + " having frequency of: " + maxfreq);

	}

}
