package library;

import java.util.List;
import java.util.ArrayList;

/**
 * User: pete
 * Date: Nov 18, 2008
 */
public class Fibonaccis {

    public static List<Long> getFibonaccis( long max ) {

        List<Long> fibonaccis = new ArrayList<Long>();

        long a = 0;
        long b = 1;

        while( a < max ) {
            fibonaccis.add( a );

            a = a + b;
            b = a - b;
        }

        return fibonaccis;
    }
}