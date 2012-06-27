/**
 * User: pete
 * Date: Nov 21, 2008
 */
public class Problem14 {

    /*
        The following iterative sequence is defined for the set of positive integers:

        n n/2 (n is even)
        n 3n + 1 (n is odd)

        Using the rule above and starting with 13, we generate the following sequence:
        13 40 20 10 5 16 8 4 2 1

        It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

        Which starting number, under one million, produces the longest chain?
     */

    public static void main( String[] args ) {
        long max = 0, number = 0, thisMax = 0;

        for( long i = 1; i < 1000000; i++ ) {
            thisMax = recursive( i, 1 );
            if( thisMax > max ) {
                max = thisMax;
                number = i;
            }
        }

        System.out.println( number + " : " + max );
    }

    public static long recursive( long start, long count ) {
        if( start == 1 )
            return count;

        return recursive( start % 2 == 0 ? start / 2 : ( 3 * start ) + 1, count + 1 );
    }
}