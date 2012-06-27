import library.Primes;

/**
 * User: pete
 * Date: Nov 19, 2008
 */
public class Problem10 {

    /*
        The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

        Find the sum of all the primes below two million.
     */

    public static void main( String[] args ) {

        long sum = 0;

        for( long i = 1; i < 2000000; i++ )
            if( Primes.isPrime( i ) )
                sum += i;

        System.out.println( "SUM: " + sum );        
    }
}