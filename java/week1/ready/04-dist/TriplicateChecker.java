import java.io.*;
import java.util.*;

public class TriplicateChecker {
    public static void main( String[] args )    {        
        String s = "";
        String snippet = "";

        String[] t = { "[1, 2, 3, 4, 5, 1][1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 1, 1, 1]", "[1, 1, 2, 3, 4, 5, 1][1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 1, 1, 1]" };

        for( int i = 0; i < 2; i++ )
        {
            if( i == 0 ) {
                {
                	s = "";
                	ArrayList<Integer> ilist = new ArrayList<Integer>();
                	for( int j = 1; j <= 5; j++ ) ilist.add( j );
                	ilist.add( 1 );
                    s = s + ilist.toString();
                    Triplicate.triplicate( ilist );
                    s = s + ilist.toString();
                }
                snippet = "{\n	s = \"\";\n	ArrayList<Integer> ilist = new ArrayList<Integer>();\n	for( int j = 1; j <= 5; j++ ) ilist.add( j );\n	ilist.add( 1 );\n    s = s + ilist.toString();\n    Triplicate.triplicate( ilist );\n    s = s + ilist.toString();\n}";
            }
            if( i == 1 ) {
                {
                	s = "";
                	ArrayList<Integer> ilist = new ArrayList<Integer>();
                	ilist.add( 1 );
                	for( int j = 1; j <= 5; j++ ) ilist.add( j );
                	ilist.add( 1 );
                    s = s + ilist.toString();
                    Triplicate.triplicate( ilist );
                    s = s + ilist.toString();
                }
                snippet = "{\n	s = \"\";\n	ArrayList<Integer> ilist = new ArrayList<Integer>();\n	ilist.add( 1 );\n	for( int j = 1; j <= 5; j++ ) ilist.add( j );\n	ilist.add( 1 );\n    s = s + ilist.toString();\n    Triplicate.triplicate( ilist );\n    s = s + ilist.toString();\n}";
            }


            if( !s.equals( t[i]))
            {
                System.out.println( "---- On code snippet:" );
                System.out.println( snippet );
                System.out.println( "---- Expected value of String s:" );
                System.out.println( t[i] );
                System.out.println( "---- Actual value of String s:" );
                System.out.println( s );
                return;
            }
        }
        System.out.println( "Passed all tests." );
      
    }
}