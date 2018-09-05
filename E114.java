/* *****************************************************************************
 *  Name:    Alan Turing
 *  NetID:   aturing
 *  Precept: P00
 *
 *  Partner Name:    Ada Lovelace
 *  Partner NetID:   alovelace
 *  Partner Precept: P00
 *
 *  Description:  Prints 'Hello, World' to the terminal window.
 *                By tradition, this is everyone's first program.
 *                Prof. Brian Kernighan initiated this tradition in 1974.
 *
 **************************************************************************** */

import edu.princeton.cs.algs4.StdOut;

public class E114 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 1;
        if (a > b)
            c = 0;
        else
            b = 0;
        StdOut.println(c);
        StdOut.println(b);
    }
}
