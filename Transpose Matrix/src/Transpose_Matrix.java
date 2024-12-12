
public class Transpose_Matrix {

	public static void main(String[] args) {
		
		/*
		 * leetcode: 867. Transpose Matrix* Given a 2D integer array matrix, return the
		 * transpose of matrix.
		 * 
		 * The transpose of a matrix is the matrix flipped over its main diagonal,
		 * switching the matrix's row and column indices. 
		 * 
		 * Example 1:
		 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]] Output: [[1,4,7],[2,5,8],[3,6,9]]
		 * 
		 * Example 2:
		 * Input: matrix = [[1,2,3],[4,5,6]] Output: [[1,4],[2,5],[3,6]]
		 */
		
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };

		int rowlen = matrix.length;
		int collen = matrix[0].length;
		int[][] outputmatrix = new int[collen][rowlen];

		for (int i = 0; i < rowlen; i++) {
			for (int j = 0; j < collen; j++) {
				outputmatrix[j][i] = matrix[i][j];
			}
		}

		System.out.println("Matrix");

		for (int i = 0; i < rowlen; i++) {
			for (int j = 0; j < collen; j++) {
				System.out.print(matrix[i][j] + " ");
			}

			System.out.println();
		}

		System.out.println("Transpose Matrix");
		for (int i = 0; i < collen; i++) {
			for (int j = 0; j < rowlen; j++) {
				System.out.print(outputmatrix[i][j] + " ");
			}

			System.out.println();
		}

	}

}
