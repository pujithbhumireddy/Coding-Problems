import java.util.*;
public class Two_sum {
	
	/*
	 * Leetcode: 1. Two Sum
	 * 
	 * Given an array of integers nums and an integer target, return indices of the
	 * two numbers such that they add up to target.
	 * 
	 * You may assume that each input would have exactly one solution, and you may
	 * not use the same element twice.
	 * 
	 * You can return the answer in any order.

	 * Example 1:
	 * Input: nums = [2,7,11,15], target = 9 Output: [0,1] Explanation: Because
	 * nums[0] + nums[1] == 9, we return [0, 1].
	 * 
	 * Example 2:
	 * Input: nums = [3,2,4], target = 6 Output: [1,2] 
	 * 
	 * Example 3:
	 * Input: nums = [3,3], target = 6 Output: [0,1]
	 */
	
	public static void main(String[] args)
	{
		int[] nums = new int[] {2,7,11,15};
//		int[] nums = new int[] {3,3};
		int target = 22;
		
		int[] result = istwosum(nums, target);
		
		if (result.length == 2) {
			System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
		} else {
			System.out.println("No solution found.");
		}
	
	}
	
	public static int[] istwosum(int[] nums, int target)
	{
		int len = nums.length;
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<len;i++)
		{
			int x = nums[i];
			int y = target - nums[i];
			
			if(map.containsKey(y))
			{
				return new int[] {map.get(y),i};
			}
			
			map.put(x, i);
		}
		
		return new int[] {};
	}
	
	

}
