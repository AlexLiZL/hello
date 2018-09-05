/* *****************************************************************************
 *  Name:    Alex Li
 *  NetID:   AlexLiZL
 *
 *  Description:  Doing Excersice for ALGS4, Chapter 1.
 *
 **************************************************************************** */

import edu.princeton.cs.algs4.StdOut;

public class E1114 {
    public static void main(String[] args) {
        double num = 8.0;
        StdOut.println(lg(num));

    }

    public static int lg(double n) {
        int len = 0;
        while (!(n < len)) {
            n /= 2;
            len++;
        }
        return len;
    }
}
