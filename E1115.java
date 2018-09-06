/* *****************************************************************************
 *  Name:    Alex Li
 *  NetID:   AlexLiZL
 *
 *  Description:  Doing Excersice for ALGS4, Chapter 1.
 *
 **************************************************************************** */

import edu.princeton.cs.algs4.StdOut;

public class E1115 {
    public static void main(String[] args) {
        int[] array = new int[] {
                1, 22222222, 3, 4, 5, 6, 7, 8, 3, 5, 6, 7, 4, 5, 7, 0, 0, 0, 0, 3, 6, 8, 3,
                };
        int M = 10;
        int[] result = histogram((array), M);
        StdOut.println("Length=" + array.length);
        int len = 0;
        for (int i = 0; i < result.length; i++) {
            StdOut.printf("result[%d]=%d\n", i, result[i]);
            len += result[i];
        }
        StdOut.println("Len=" + len);

    }

    private static int[] histogram(int[] a, int m) {
        if (a.length == 0)
            return null;
        int[] r = new int[m];
        for (int i = 0; i < m; i++) {
            r[i] = 0;
        }
        for (int i = 0; i < a.length; i++) {
            int tmp = a[i];
            while ((tmp / 10) > 0) {
                r[tmp % 10]++;
                tmp = tmp / 10;
            }
            r[tmp]++;

        }
        return r;
    }
}
