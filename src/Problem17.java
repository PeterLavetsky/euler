import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: pete
 * Date: May 13, 2009
 */
public class Problem17 {

    private static final Log log = LogFactory.getLog(Problem17.class);

    /*
        If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

        If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?

        NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters.
        The use of "and" when writing out numbers is in compliance with British usage.
     */

    private static final String THOUSAND = "thousand";
    private static final String HUNDRED = "hundred";
    private static final String AND = "and";

    private static Map<Integer,String> words = new HashMap<Integer,String>();
    private static Map<Integer,String> longs = new HashMap<Integer,String>();

    static {

        words.put( 0, "" );
        words.put( 1, "one" );
        words.put( 2, "two" );
        words.put( 3, "three" );
        words.put( 4, "four" );
        words.put( 5, "five" );
        words.put( 6, "six" );
        words.put( 7, "seven" );
        words.put( 8, "eight" );
        words.put( 9, "nine" );
        words.put( 10, "ten" );
        words.put( 11, "eleven" );
        words.put( 12, "twelve" );
        words.put( 13, "thirteen" );
        words.put( 14, "fourteen" );
        words.put( 15, "fifteen" );
        words.put( 16, "sixteen" );
        words.put( 17, "seventeen" );
        words.put( 18, "eighteen" );
        words.put( 19, "nineteen" );

        longs.put( 0, "" );
        longs.put( 2, "twenty" );
        longs.put( 3, "thirty" );
        longs.put( 4, "forty" );
        longs.put( 5, "fifty" );
        longs.put( 6, "sixty" );
        longs.put( 7, "seventy" );
        longs.put( 8, "eighty" );
        longs.put( 9, "ninety" );
    }

    public static void main( String[] args ) {

        int max = 1000;

        int count = 0;

        for( int i = 1; i <= max; i++ ) {

            String rep = String.valueOf( i );

            StringBuilder sb = new StringBuilder();
            int val = 0;

            switch( rep.length() ) {
                case( 1 ):

                    sb.append( grab( rep, 0 ) );
                    log.info( i + " : " + sb.toString() );
                    count += sb.toString().length();
                    break;
                case( 2 ):
                    val = getNum( rep, 0 );

                    //log.info( "Val: " + val );

                    if( val == 1 ) {
                        sb.append( grab( rep, 0, 2 ) );
                    } else {
                        sb.append( longs.get( val ) );
                        sb.append( grab( rep, 1 ) );
                    }

                    log.info( i + " : " + sb.toString() );
                    count += sb.toString().length();
                    break;
                case( 3 ):
                    sb.append( grab( rep, 0 ) );
                    sb.append( HUNDRED );

                    if( getNum( rep, 1 ) == 0 ) {
                        if( getNum( rep, 2 ) != 0 ) {
                            sb.append( AND );
                        }
                    } else {
                        sb.append( AND );
                    }

                    val = getNum( rep, 1 );

                    if( val == 0 ) {
                        sb.append( grab( rep, 2 ) );
                    } else if( val == 1 ) {
                        sb.append( grab( rep, 1, 3 ) );
                    } else {
                        sb.append( longs.get( val ) );
                        sb.append( grab( rep, 2 ) );
                    }

                    log.info( i + " : " + sb.toString() );
                    count += sb.toString().length();
                    break;
                case( 4 ):
                    sb.append( grab( rep, 0 ) );
                    sb.append( THOUSAND );
                    sb.append( grab( rep, 1 ) );

                    if( getNum( rep, 2 ) != 0 )
                        sb.append( HUNDRED );

                    //log.info( "Num: " + getNum( rep, 3 ) );

                    if( getNum( rep, 3 ) != 0 )
                        sb.append( AND );

                    val = getNum( rep, 2 );

                    if( val == 0 || val == 1 ) {
                        sb.append( words.get( val ) );
                    } else {
                        sb.append( longs.get( val ) );
                        sb.append( grab( rep, 3 ) );
                    }

                    log.info( i + " : " + sb.toString() );
                    count += sb.toString().length();
                    break;
            }
        }

        log.info( "Length: " + count );
    }

    private static int getNum( String rep, int index ) {
        return Character.getNumericValue( rep.charAt( index ) );
    }

    private static String grab( String rep, int index ) {
        return words.get( getNum( rep, index )  );
    }

    private static String grab( String rep, int start, int end ) {

        String sub = rep.substring( start, end );

        //log.info( "SUB: " + sub );

        return words.get( Integer.parseInt( sub ) );
    }
}