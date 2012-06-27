import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

import java.math.BigInteger;

/**
 * User: pete
 * Date: May 13, 2009
 */
public class Problem16 {

    private final static Log log = LogFactory.getLog( Problem16.class );

    /*
        2^(15) = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

        What is the sum of the digits of the number 2^(1000)?
     */

    public static void main( String[] args ) {
        BigInteger base = new BigInteger( "2" );
        BigInteger value = base.pow( 1000 );

        String s = value.toString();

        long l = 0;
        for( int i = 0; i < s.length(); i++ ) {
            Character c = new Character( s.charAt( i ) );
            l += Integer.parseInt( c.toString() );
        }

        log.info( l );
    }

    /*
    public static void main(String[] args) {
		long sum = 0;
		char chars[] = BigInteger.valueOf(2).pow(1000).toString().toCharArray();
		for(int n = 0; n<chars.length; n++)
			sum +=Character.digit(chars[n],10);
		System.out.println(sum);
	}
     */
}