import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * User: pete
 * Date: Nov 21, 2008
 */
public class Problem15 {

    /*
        Starting in the top left corner of a 22 grid, there are 6 routes (without backtracking) to the bottom right corner.

        How many routes are there through a 2020 grid?

     */
	public static void main(String[] args) 	{
		double result = 1;

		for( int i=40; i>20; i-- ) {
			result *= i;
			result /= (i-20);
		}

		System.out.println( result );
	}
}