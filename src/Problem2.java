import library.Fibonaccis;

/**
 * User: pete
 * Date: Nov 18, 2008
 */
public class Problem2 {

    /*
        Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

        1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

        Find the sum of all the even-valued terms in the sequence which do not exceed four million.
     */

    public static void main( String[] args ) {

        long sum = 0;

        for( Long l : Fibonaccis.getFibonaccis( 4000000 ) )
            if( l % 2 == 0)
                sum += l;

        System.out.println( "Sum: " + sum );
    }
}