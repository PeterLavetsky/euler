import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

import java.util.Calendar;

/**
 * User: pete
 */
public class Problem19 {

    private static final Log log = LogFactory.getLog(Problem19.class);

    /*
        You are given the following information, but you may prefer to do some research for yourself.

        1 Jan 1900 was a Monday.
        Thirty days has September,
        April, June and November.
        All the rest have thirty-one,
        Saving February alone,
        Which has twenty-eight, rain or shine.
        And on leap years, twenty-nine.
        A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
        How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
     */

    public static void main( String[] args ) {

        int count = 0;

        Calendar now = Calendar.getInstance();
        now.set( Calendar.YEAR, 1901 );
        now.set( Calendar.MONTH, Calendar.JANUARY );
        now.set( Calendar.DAY_OF_MONTH, 1 );

        while( now.get( Calendar.YEAR ) <= 2000 && now.get( Calendar.MONTH ) <= Calendar.DECEMBER && now.get( Calendar.DAY_OF_MONTH ) <= 31 ) {

            System.out.println( now.getTime() );

            if( now.get( Calendar.DAY_OF_WEEK ) == Calendar.SUNDAY && now.get( Calendar.DAY_OF_MONTH ) == 1 ) {
                System.out.println( "XXX Hit: " + now.getTime() );
                count++;
            }

            now.roll( Calendar.DAY_OF_MONTH, true );

            if( now.get( Calendar.DAY_OF_MONTH ) == 1 ) {

                now.roll( Calendar.MONTH, true );

                if( now.get( Calendar.MONTH ) == Calendar.JANUARY ) {

                    now.roll( Calendar.YEAR, true );
                }

            }
        }

        System.out.println( "Count: " + count );
    }
}