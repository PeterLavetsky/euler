import library.Primes;
import library.Factors;

/**
 * User: pete
 * Date: Nov 18, 2008
 */
public class Problem3 {

    /*
        The prime factors of 13195 are 5, 7, 13 and 29.

        What is the largest prime factor of the number 600851475143 ?
     */

    public static void main( String[] args ) {

        long num = 600851475143l;
        long largestPrimeFactor = 0;

        for( Long l : Factors.getFactors( num ) )
            if( Primes.isPrime( l ) )
                if( l > largestPrimeFactor )
                    largestPrimeFactor = l;

        System.out.println( "Largest Prime Factor: " + largestPrimeFactor );
    }
}