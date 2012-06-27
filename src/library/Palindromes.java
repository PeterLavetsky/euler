package library;

/**
 * User: pete
 * Date: Nov 18, 2008
 */
public class Palindromes {

    public static boolean isPalindrome( long number ) {
        long forwards = number, backwards = 0;

        while( forwards > 0 ) {
            backwards = backwards * 10 + forwards % 10;
            forwards = forwards / 10;
        }

        return backwards == number;
    }
}