import library.Palindromes;

/**
 * User: pete
 * Date: Nov 18, 2008
 */
public class Problem4 {

    /*
        A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91  99.

        Find the largest palindrome made from the product of two 3-digit numbers.
    */

    public static void main( String[] args ) {

        int result = 0;
        int largestPalindrome = 0;

        for( int x = 100; x < 1000; x++ ) {
            for( int y = 100; y < 1000; y++ ) {
                result = x * y;
                if( Palindromes.isPalindrome( result ) ) {
                    //System.out.println( "Palindrome: " + result );
                    if( result > largestPalindrome ) {
                        largestPalindrome = result;
                    }
                }
            }
        }

        System.out.println( "Largest Palindrome: " + largestPalindrome );
    }
}