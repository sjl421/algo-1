package algo;

/**
 * Created by akhalikov on 21.09.2015.
 */
class BinominalCoefficient {

    static long binom(int n, int m) {
        int i, j;
        long bc[][] = new long[Integer.MAX_VALUE][Integer.MAX_VALUE];

        for (i = 0; i <= n; i++) bc[i][0] = 1;
        for (j = 0; j <= n; j++) bc[j][j] = 1;

        return bc[n][m];
    }
}
