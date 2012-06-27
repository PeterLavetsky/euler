import org.apache.commons.io.LineIterator;
import org.apache.commons.io.FileUtils;

import java.math.BigInteger;
import java.io.File;

/**
 * User: pete
 * Date: Nov 21, 2008
 */
public class Problem13 {

    /*
        Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
     */

    public static void main( String[] args ) throws Exception {

        BigInteger[] array = new BigInteger[100];

        File file = new File( "/cvs/nexus/euler/resources/problem13.txt" );
        LineIterator iterator = FileUtils.lineIterator( file );
        try {
            int count = 0;
            while( iterator.hasNext() ) {
                array[count] = new BigInteger( iterator.nextLine() );
                count++;
            }
        } finally {
            LineIterator.closeQuietly(iterator);
        }

        BigInteger total = BigInteger.ZERO;
        for( int i = 0; i < array.length; i++ )
            total = total.add( array[i] );

        System.out.println( total.toString().substring( 0, 10 ) );
    }
}