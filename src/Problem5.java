/**
 * User: pete
 * Date: Nov 18, 2008
 */
public class Problem5 {

    /*
        2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

        What is the smallest number that is evenly divisible by all of the numbers from 1 to 20?
     */

    public static void main( String[] args ) {

        long result = 1;

        while( true ) {

            boolean valid = true;
            for( int i = 1; i <= 20; i++ )
                if( valid && result % i != 0 )
                    valid = false;

            if( valid )
                break;

            result++;
        }

        System.out.println( "Result: " + result );
    }
}