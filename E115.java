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

public class E115 {
    public static void main(String[] args) {
        double x = 0;
        double y = 0;
        while (!StdIn.isEmpty()) {
            x = StdIn.readDouble();
            y = StdIn.readDouble();
            if ((x > 0 && x < 1) && (y > 0 && y < 1))
                StdOut.println("true");
            else
                StdOut.println("false");
        }
    }
}
