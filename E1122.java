/* *****************************************************************************
 *  Name:    Alex Li
 *  NetID:   AlexLiZL
 *
 *  Description:  Doing Excersice for ALGS4, Chapter 1.
 *
 **************************************************************************** */

import edu.princeton.cs.algs4.StdOut;

public class E1122 {
    public static void main(String[] args) {
        int k = 9;
        int[] array = new int[] {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 18, 21, 22, 23, 33, 233, 922
        };
        int d = 0;
        StdOut.println(rank(k, array, d));
    }

    public static int rank(int key, int[] a, int depth) {
        return rank(key, a, 0, a.length - 1, depth);
    }

    public static int rank(int key, int[] a, int lo, int hi,
                           int depth) { //如果key存在于a[]中，它的索引不会小于lo且不会大于hi
        depth++;
        for (int i = 0; i < depth; i++)
            StdOut.printf("\t");
        StdOut.printf("%d:%d\t%d\n", depth, lo, hi);

        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) return rank(key, a, lo, mid - 1, depth);
        else if (key > a[mid]) return rank(key, a, mid + 1, hi, depth);
        else return mid;
    }
}
