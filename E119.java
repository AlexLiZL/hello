/* *****************************************************************************
 *  Name:    Alex Li
 *  NetID:   AlexLiZL
 *
 *  Description:  Doing Excersice for ALGS4, Chapter 1.
 *
 **************************************************************************** */

import edu.princeton.cs.algs4.StdOut;

public class E119 {
    public static void main(String[] args) {
        int X = 871229803;
        StdOut.println(Integer.toBinaryString(X));

        String s = "";
        for (int i = X; i > 0; i /= 2) {
            s = i % 2 + s;
        }
    }
}
