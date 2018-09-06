/* *****************************************************************************
 *  Name:    Alex Li
 *  NetID:   AlexLiZL
 *
 *  Description:  Doing Excersice for ALGS4, Chapter 1.
 *
 **************************************************************************** */

import edu.princeton.cs.algs4.StdOut;

public class E1120 {
    public static void main(String[] args) {
        StdOut.println(jc(1000));
    }

    public static double jc(int n) {
        if (n == 1) return 0;
        return Math.log(n) + jc(n - 1);
    }
}
