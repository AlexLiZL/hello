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

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class E113 {
    public static void main(String[] args) {
        double[] number;
        while (!StdIn.isEmpty()) {
            number = StdIn.readAllDoubles();
        }
        if (number[0] == number[1]) {
            if (number[1] == number[2]) {
                StdOut.println("equal");
            }
        }
        else
            StdOut.println("not equal");
    }
}
