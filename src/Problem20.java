import library.Utility;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

/**
 * User: pete
 */
public class Problem20 {

    private static final Log log = LogFactory.getLog(Problem20.class);

    /*
        n! means n  (n  1)  ...  3  2  1

        For example, 10! = 10  9  ...  3  2  1 = 3628800,
        and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

        Find the sum of the digits in the number 100!
     */

    public static void main( String[] args ) {

        String rVal = Utility.getFactorialAsString( 100 );

        System.out.println( rVal );

        System.out.println( Utility.addDigitsInNumber( rVal ) );

    }
}
