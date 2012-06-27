import library.Utility;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

import java.util.HashSet;
import java.util.Set;

/**
 * User: pete
 */
public class Problem21 {

    private static final Log log = LogFactory.getLog(Problem21.class);

    /*
        Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
        If d(a) = b and d(b) = a, where a  b, then a and b are an amicable pair and each of a and b are called amicable numbers.

        For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

        Evaluate the sum of all the amicable numbers under 10000.
     */

    public static void main( String[] args ) {

        //System.out.println( "220: " + Utility.getSumOfProperDivisors( 220 ) );
        //System.out.println( "284: " + Utility.getSumOfProperDivisors( 284 ) );

        Set<Integer> set = new HashSet<Integer>();

        int sumAll = 0;

        for( int a = 1; a < 10000; a++ ) {

            int b = Utility.getSumOfProperDivisors( a );

            if( b != a ) {

                int sumB = Utility.getSumOfProperDivisors( b );

                if( a == sumB && !set.contains( a ) && !set.contains( b )  ) {
                    System.out.println( "A: " + a + " : B: " + b );
                    sumAll += a;
                    sumAll += b;
                    set.add( a );
                    set.add( b );
                }
            }
        }

        System.out.println( "Sum: " + sumAll );
    }
}