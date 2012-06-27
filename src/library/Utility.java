package library;

import java.math.BigInteger;

/**
 * User: pete
 * Date: Nov 18, 2008
 */
public class Utility {

    public static boolean isWholeNumber( double number ) {
        try {
            
            return true;
        } catch( Exception e ) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main( String[] args ) {

        System.out.println( 696 % 10 );

        System.out.println( isWholeNumber( 696.0 ) );
    }

    public static String getFactorialAsString( long max ) {

        BigInteger reallyBig = new BigInteger("1");

        for( long current = max; current >0; current-- )
            reallyBig = reallyBig.multiply( new BigInteger( String.valueOf( current ) ) );

        return reallyBig.toString();
    }

    public static long addDigitsInNumber( long number ) {
        return addDigitsInNumber( String.valueOf( number ) );
    }

    public static long addDigitsInNumber( String asAString ) {

        long total = 0;

        for( int i = 0; i < asAString.length(); i++ )
            total += Character.getNumericValue( asAString.charAt( i ) );

        return total;
    }

    public static int getSumOfProperDivisors( int max ){

        int sum = 0;

        for( int i = 1; i < max; i++ )
            if( max % i == 0 )
                sum += i;

        return sum;
    }
}