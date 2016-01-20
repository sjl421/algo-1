package careercup.chapter01;

/**
 * Write an algorithm such that if an element in an MxN matrix is 0,
 * its entire row and column is set to 0.
 */
class ZeroMatrix {
  static int[][] makeZeros(int[][] matrix) {
    int m = matrix.length,
        n = matrix[0].length;

    boolean[] zeroCols = new boolean[n],
              zeroRows = new boolean[m];

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (matrix[i][j] == 0) {
          zeroCols[j] = true;
          zeroRows[i] = true;
        }
      }
    }
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (zeroRows[i] || zeroCols[j])
          matrix[i][j] = 0;
      }
    }
    return matrix;
  }
}
