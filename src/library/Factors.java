package library;

import java.util.*;

/**
 * User: pete
 * Date: Nov 18, 2008
 */
public class Factors {

    public static Set<Long> getFactors( long number ) {

        Set<Long> firstFactors = new TreeSet<Long>();

        int squareRoot = ( int )Math.sqrt( number );
        for( long i = 1; i <= squareRoot; i++ )
            if( number % i == 0 )
                firstFactors.add( i );

        Set<Long> secondFactors = new TreeSet<Long>( firstFactors );

        for( long factor : firstFactors )
            if( factor < ( number / factor ) )
                secondFactors.add( number / factor );

        return secondFactors;
    }

    public static Set<Long> OLDgetFactors( long number ) {

        Set<Long> factors = new TreeSet<Long>();

        for( long i = 1; i <= number / 2; i++ )
            if( number % i == 0 )
                factors.add( i );

        factors.add( number ); //Add number itself as a factor

        return factors;
    }

    public static void main( String[] args ) {

        long max = 76576500, start = System.currentTimeMillis();

        Set<Long> factors = OLDgetFactors( max );
        System.out.println( "O: " + factors.size() + " : " + ( System.currentTimeMillis() - start ) );
        /* for( long factor : factors )
            System.out.println( "   " + factor ); */

        start = System.currentTimeMillis();

        factors = getFactors( max );
        System.out.println( "N: " + factors.size() + " : " + ( System.currentTimeMillis() - start ) );
        /* for( long factor : factors )
            System.out.println( "   " + factor ); */
    }
}