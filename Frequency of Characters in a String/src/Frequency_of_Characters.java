import java.util.*;
public class Frequency_of_Characters {
	
	public static void main(String[] args)
	{
		String str = "coding daily improves the learning ability";
		str = str.replaceAll("\\s+","");
		char[] ch = str.toCharArray();
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(char c : ch)
		{
			map.put(c, map.getOrDefault(c,0)+1);
		}
		
		System.out.println(map);
		
		char maxchar = 0;
		int maxfreq = 0;
		
		Set<Map.Entry<Character, Integer>> ele = map.entrySet();
		for(Map.Entry<Character, Integer> e : ele)
		{
			if(e.getValue() > maxfreq)
			{
				maxfreq = e.getValue();
				maxchar = e.getKey();
			}
		}
		
		System.out.println();
		
		System.out.println(maxchar+" this character has frequency of "+maxfreq);
		
	}

}
