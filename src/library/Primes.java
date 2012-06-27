package library;

import java.util.List;
import java.util.ArrayList;
import java.math.BigInteger;

/**
 * User: pete
 * Date: Nov 18, 2008
 */
public class Primes {

    public static List<Long> getPrimes( long max ) {

        List<Long> list = new ArrayList<Long>();

        for( long i = 1; i < max; i++ )
            if( isPrime( i ) ) {
                System.out.println( "Prime: " + i );
                list.add( i );
            }

        return list;
    }

    public static boolean isPrime( long i ) {
        BigInteger bigNumber = BigInteger.valueOf( i );
        if( bigNumber.compareTo( new BigInteger( "2147483647" ) ) == 1 ) {
            if( bigNumber.compareTo( new BigInteger( "9223372036854775807" ) ) == -1 )
                return isNorPrime( i );
            else
                return isBigPrime( bigNumber );
        } else {
            return isNormalPrime( new Integer( i + "" ) );
        }
    }

    private static boolean isBigPrime( BigInteger number ) {

        BigInteger[] remain = number.divideAndRemainder( new BigInteger( new Integer( "2") .toString() ) );

        if( remain[1].compareTo( new BigInteger( "0" ) ) == 0 )
            return false;

        remain = number.divideAndRemainder( new BigInteger( new Integer( "3" ).toString() ) );
        if ( remain[1].compareTo( new BigInteger( "0" ) ) == 0 )
            return false;

        int y = 2, x = ( int )Math.sqrt( number.doubleValue() );

        for ( int i = 5; i <= x; i += y, y = 6 - y ) {
            remain = number.divideAndRemainder( new BigInteger( Integer.toString( i ) ) );
            if ( remain[1].compareTo( new BigInteger( "0" ) ) == 0 )
                return false;
        }

        return true;
    }

    private static boolean isNorPrime( Long number ) {
        if ( number % 2 == 0 || number % 3 == 0 )
            return false;

        int y = 2, x = ( int )Math.sqrt( number );

        for ( int i = 5; i <= x; i += y, y = 6 - y )
            if( number % i == 0 )
                return false;

        return true;
    }

    private static boolean isNormalPrime(Integer number) {
        if ( number == 2 || number == 3 )
            return true;

        if ( number < 2 || number % 2 == 0 || number % 3 == 0)
            return false;

        int y = 2, x = ( int )Math.sqrt( number );
        for ( int i = 5; i <= x; i += y, y = 6 - y )
            if ( number % i == 0 )
                return false;

        return true;
    }
}