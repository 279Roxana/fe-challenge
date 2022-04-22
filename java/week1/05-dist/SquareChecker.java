import java.io.*;
import java.util.*;

public class SquareChecker {
    public static void main( String[] args )    {        
        String s = "";
        String snippet = "";

        String[] t = { "true | false | (-1,-1), (9,9) | (0,0), (9,9) | " };

        for( int i = 0; i < 1; i++ )
        {
            if( i == 0 ) {
                {
                	s = "";
                	Square r = new Square( -1, -1, 10 );
                	Square r2 = new Square( 9 );
                	s = s + r.containsRectangle( r2 ) + " | ";
                	s = s + r2.containsRectangle( r ) + " | ";
                	s = s + r.toString() + " | ";
                	s = s + r2.toString() + " | ";
                }
                snippet = "{\n	s = \"\";\n	Square r = new Square( -1, -1, 10 );\n	Square r2 = new Square( 9 );\n	s = s + r.containsRectangle( r2 ) + \" | \";\n	s = s + r2.containsRectangle( r ) + \" | \";\n	s = s + r.toString() + \" | \";\n	s = s + r2.toString() + \" | \";\n}";
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