
class GFG {

	static void Cholesky_Decomposition(int[][] matrix, int n) {
		int[][] lower = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				int sum = 0;

				if (j == i) {
					for (int k = 0; k < j; k++)
						sum += (int) Math.pow(lower[j][k], 2);
					lower[j][j] = (int) Math.sqrt(matrix[j][j] - sum);
				}

				else {

					for (int k = 0; k < j; k++)
						sum += (lower[i][k] * lower[j][k]);
					lower[i][j] = (matrix[i][j] - sum) / lower[j][j];
				}
			}
		}

		System.out.println(" Lower Triangular\t Transpose");
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++)
				System.out.print(lower[i][j] + "\t");
			System.out.print("");

			for (int j = 0; j < n; j++)
				System.out.print(lower[j][i] + "\t");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n = 3;
		int[][] matrix = new int[][] {
				{ 4, 12, 12 },
				{ 12, 37, 37 },
				{ 12, 37, 43 }
		};

		Cholesky_Decomposition(matrix, n);
	}
}
