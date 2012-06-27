/**
 * User: pete
 * Date: Nov 18, 2008
 */
public class Problem1 {

    /*
        Add all the natural numbers below one thousand that are multiples of 3 or 5.
    */        

    public static void main( String[] args ) {

        int sum = 0;

        for( int i = 1; i < 1000; i++ )
            if( i % 3 == 0 || i % 5 == 0 )
                sum += i;

        System.out.println( "Sum: " + sum );
    }
}