import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

/**
 * User: pete
 */
public class Problem18 {

    private static final Log log = LogFactory.getLog(Problem18.class);

    /*
    By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.

        3
        7 4
        2 4 6
        8 5 9 3

        That is, 3 + 7 + 4 + 9 = 23.

        Find the maximum total from top to bottom of the triangle below:

                      75
                     95 64
                    17 47 82
                   18 35 87 10
                  20 04 82 47 65
                 19 01 23 75 03 34
                88 02 77 73 07 63 67
               99 65 04 28 06 16 70 92
              41 41 26 56 83 40 80 70 33
             41 48 72 33 47 32 37 16 94 29
            53 71 44 65 25 43 91 52 97 51 14
           70 11 33 28 77 73 17 78 39 68 17 57
          91 71 52 38 17 14 91 43 58 50 27 29 48
         63 66 04 68 89 53 67 30 73 16 69 87 40 31
        04 62 98 27 23 09 70 98 73 93 38 53 60 04 23
    */

    private static String TEST_STRING = "3:7 4:2 4 6:8 5 9 3";
    
    private static String REAL_STRING = "75:95 64:17 47 82:18 35 87 10:20 04 82 47 65:19 01 23 75 03 34:88 02 77 73 07 63 67:99 65 04 28 06 16 70 92:41 41 26 56 83 40 80 70 33:41 48 72 33 47 32 37 16 94 29:53 71 44 65 25 43 91 52 97 51 14:70 11 33 28 77 73 17 78 39 68 17 57:91 71 52 38 17 14 91 43 58 50 27 29 48:63 66 04 68 89 53 67 30 73 16 69 87 40 31:04 62 98 27 23 09 70 98 73 93 38 53 60 04 23";

    public static int[][] getArray( String array ) {

        String[] rows = array.split( ":" );
        int length = rows.length;

        int[][] rA = new int[length][length];

        for( int i = 0; i < rows.length; i++ ) {
            String[] cols = rows[i].split( " " );

            for( int j = 0; j < cols.length; j++ ) {
                String col = cols[j];
                if( col != null && !col.equals( "" ) )
                    rA[i][j] = Integer.parseInt( col );
            }
        }

        return rA;
    }

    public static void printArray( int[][] array ) {
        for( int i = 0; i < array.length; i++ ) {
            for( int j = 0; j < array[i].length; j++ ) {
                System.out.print( array[i][j] + " " );
            }

            System.out.println( "" );
        }
    }

    public static void main( String[] args ) {

        int[][] ARRAY = getArray( REAL_STRING );

        printArray( ARRAY );

        for( int row = ARRAY.length - 1; row > -1; row-- )
            for( int col = 0; col < row; col++ )
                ARRAY[row - 1][col] += Math.max( ARRAY[row][col], ARRAY[row][col+1] );

        System.out.println( "\nMax: " + ARRAY[0][0] );
    }
}
