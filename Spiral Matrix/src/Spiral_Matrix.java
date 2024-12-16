import java.util.*;

public class Spiral_Matrix {
	
	/*
	 * leetcode: 54. Spiral Matrix
	 * 
	 * Given an m x n matrix, return all elements of the matrix in spiral order.
	 * 
	 * Example 1:
	 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]] Output: [1,2,3,6,9,8,7,4,5] 
	 * 
	 * Example 2:

	 * Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]] Output:
	 * [1,2,3,4,8,12,11,10,9,5,6,7]
	 * 
	 */
	
	public static void main(String[] args) {
//			int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		int rows = matrix.length;
		int cols = matrix[0].length;

		List<Integer> result = new ArrayList<>();

		int up = 0;
		int left = 0;
		int right = cols - 1;
		int down = rows - 1;

		while (result.size() < rows * cols) {

			for (int col = left; col <= right; col++) {
				result.add(matrix[up][col]);
			}

			for (int row = up + 1; row <= down; row++) {
				result.add(matrix[row][right]);
			}

			if (up != down) {
				for (int col = right - 1; col >= left; col--) {
					result.add(matrix[down][col]);
				}
			}

			if (left != right) {
				for (int row = down - 1; row > up; row--) {
					result.add(matrix[row][left]);
				}
			}

			up++;
			left++;
			right--;
			down--;

		}
		
		System.out.println(result);
	}

}
