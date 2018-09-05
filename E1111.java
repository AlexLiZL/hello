/* *****************************************************************************
 *  Name:    Alex Li
 *  NetID:   AlexLiZL
 *
 *  Description:  Doing Excersice for ALGS4, Chapter 1.
 *
 **************************************************************************** */

import edu.princeton.cs.algs4.StdOut;

public class E1111 {
    public static void main(String[] args) {
        boolean[][] a = new boolean[][] {
                { true, true, false }, { false, false, false },
                { false, true, true }, { true, false, true }, { false, false, true }
        };
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                StdOut.printf("%d%d", i + 1, j + 1);
                if (a[i][j]) {
                    StdOut.printf("* ");
                }
                else {
                    StdOut.printf("  ");
                }
            }
            StdOut.printf("\n");
        }
    }
}
