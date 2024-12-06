package main;

import java.util.Scanner;

public class NumberofEmployeesWhoMettheTarget {

	public static void main(String[] args) {

		/*
		 * Number of Employees Who Met the Target?
		 * 
		 * There are in employees in a company, numbered from 0 to n 1. Each employee i
		 * has worked for hours [i] hours in the company. The company requires each
		 * employee to work for at least target hours. You are given a 0-indexed array
		 * of non-negative integers hours of length n and a non-negative integer target.
		 * Return the integer denoting the number of employees who worked at least
		 * target hours. Example 1: Input: hours = [0,1,2,3,4], target = 2 Output: 3
		 * Explanation: The company wants each employee to work for at least 2 hours.
		 */

		int count = 0;
		int[] hours = { 0, 1, 2, 3, 4, 5 };

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the target");
		int target = sc.nextInt();

		/*
		 * for(int i = 0; i < hours.length; i++) { if(hours[i] >= target) { count++; } }
		 */

		for (int hour : hours) // for each loop
			if (hour >= target)
				count++;

		System.out.println("No.of employees met the target are: " + count);

		sc.close();
	}

}