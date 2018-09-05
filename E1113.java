/* *****************************************************************************
 *  Name:    Alex Li
 *  NetID:   AlexLiZL
 *
 *  Description:  Doing Excersice for ALGS4, Chapter 1.
 *
 **************************************************************************** */

import edu.princeton.cs.algs4.StdOut;

public class E1113 {
    public static void main(String[] args) {
        int[][] a = new int[][] {
                { 1, 2, 3, 4 }, { 2, 4, 2, 5 }, { 7, 2, 8, 3 }, { 8, 3, 7, 3 }, { 7, 3, 7, 5 },
                { 5, 8, 0, 2 }
        };
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                StdOut.printf("a[%d][%d]:%d  ", j + 1, i + 1, a[j][i]);
            }
            StdOut.printf("\n");
        }
    }
}
