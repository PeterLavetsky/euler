package library;

/**
 * User: pete
 * Date: Nov 18, 2008
 */
public class Utility {

    public static boolean isWholeNumber( double number ) {
        try {
            
            return true;
        } catch( Exception e ) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main( String[] args ) {

        System.out.println( 696 % 10 );

        System.out.println( isWholeNumber( 696.0 ) );
    }
}