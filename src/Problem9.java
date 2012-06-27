import library.Utility;

/**
 * User: pete
 * Date: Nov 18, 2008
 */
public class Problem9 {

    /*
        A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
        a2 + b2 = c2

        For example, 32 + 42 = 9 + 16 = 25 = 52.

        There exists exactly one Pythagorean triplet for which a + b + c = 1000.
        Find the product abc.
     */

    public static void main( String[] args ) {

        for( int a = 1; a < 1000; a++ ) {
            for( int b = 1; b < 1000; b++ ) {
                if( a < b ) {
                    int c2 = ( a * a ) + ( b * b );
                    double c = Math.sqrt( c2 );
                    
                    if( b < c ) {
                        if( a + b + c == 1000 ) {
                            System.out.println( "a: " + a + " b: " + b + " c: " + c );
                            System.out.println( a * b * c );
                            break;
                        }
                    }
                }
            }
        }
    }
}