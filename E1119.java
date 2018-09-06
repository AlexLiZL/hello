/* *****************************************************************************
 *  Name:    Alex Li
 *  NetID:   AlexLiZL
 *
 *  Description:  Doing Excersice for ALGS4, Chapter 1.
 *
 **************************************************************************** */

import edu.princeton.cs.algs4.StdOut;

public class E1119 {
    public static void main(String[] args) {
        long[] R = new long[100];
        R[0] = 0;
        R[1] = 1;
        for (int N = 2; N < 100; N++) {
            R[N] = R[N - 1] + R[N - 2];
            StdOut.println(N + " " + R[N]);

        }
    }

    public static long F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N - 1) + F(N - 2);
    }
}
