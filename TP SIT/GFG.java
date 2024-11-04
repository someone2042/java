// Java program to decompose
// a matrix using Cholesky
// Decomposition

class GFG {

	// static int MAX = 100;
	static void Cholesky_Decomposition(int[][] matrix,
			int n) {
		int[][] lower = new int[n][n];

		// Decomposing a matrix
		// into Lower Triangular
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				int sum = 0;

				// summation for diagonals
				if (j == i) {
					for (int k = 0; k < j; k++)
						sum += (int) Math.pow(lower[j][k], 2);
					lower[j][j] = (int) Math.sqrt(matrix[j][j] - sum);
				}

				else {

					// Evaluating L(i, j)
					// using L(j, j)
					for (int k = 0; k < j; k++)
						sum += (lower[i][k] * lower[j][k]);
					lower[i][j] = (matrix[i][j] - sum) / lower[j][j];
				}
			}
		}

		// Displaying Lower
		// Triangular and its Transpose
		System.out.println(" Lower Triangular\t Transpose");
		for (int i = 0; i < n; i++) {

			// Lower Triangular
			for (int j = 0; j < n; j++)
				System.out.print(lower[i][j] + "\t");
			System.out.print("");

			// Transpose of
			// Lower Triangular
			for (int j = 0; j < n; j++)
				System.out.print(lower[j][i] + "\t");
			System.out.println();
		}
	}

	// Driver Code
	public static void main(String[] args) {
		int n = 4;
		int[][] matrix = new int[][] {
				{ 4, 12, 12, 16 },
				{ 12, 37, 37, 43 },
				{ 12, 37, 43, 98 },
				{ 16, 43, 98, 10 }
		};

		Cholesky_Decomposition(matrix, n);
	}
}

// This code is contributed by mits
