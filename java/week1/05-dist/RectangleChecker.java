import java.io.*;
import java.util.*;

public class RectangleChecker {
    public static void main( String[] args )    {        
        String s = "";
        String snippet = "";

        String[] t = { "true | true | false | true | true | false | false | false | false | ", "true | false | (100,100), (103,104) | (101,101), (103,104) | ", "false | false | (0,0), (99,100) | (0,0), (100,99) | " };

        for( int i = 0; i < 3; i++ )
        {
            if( i == 0 ) {
                {
                	s = "";
                	Rectangle r = new Rectangle( 100, 100, 3, 4 );
                	for( int j = 102; j <= 104; j++ )
                	{
                		for( int k = 103; k <= 105; k++ )
                		{
                			s = s + r.containsPoint( j, k ) + " | ";
                		}
                	}
                }
                snippet = "{\n	s = \"\";\n	Rectangle r = new Rectangle( 100, 100, 3, 4 );\n	for( int j = 102; j <= 104; j++ )\n	{\n		for( int k = 103; k <= 105; k++ )\n		{\n			s = s + r.containsPoint( j, k ) + \" | \";\n		}\n	}\n}";
            }
            if( i == 1 ) {
                {
                	s = "";
                	Rectangle r = new Rectangle( 100, 100, 3, 4 );
                	Rectangle r2 = new Rectangle( 101, 101, 2, 3 );
                	s = s + r.containsRectangle( r2 ) + " | ";
                	s = s + r2.containsRectangle( r ) + " | ";
                	s = s + r.toString() + " | ";
                	s = s + r2.toString() + " | ";
                }
                snippet = "{\n	s = \"\";\n	Rectangle r = new Rectangle( 100, 100, 3, 4 );\n	Rectangle r2 = new Rectangle( 101, 101, 2, 3 );\n	s = s + r.containsRectangle( r2 ) + \" | \";\n	s = s + r2.containsRectangle( r ) + \" | \";\n	s = s + r.toString() + \" | \";\n	s = s + r2.toString() + \" | \";\n}";
            }
            if( i == 2 ) {
                {
                	s = "";
                	Rectangle r = new Rectangle( 99, 100 );
                	Rectangle r2 = new Rectangle( 100, 99 );
                	s = s + r.containsRectangle( r2 ) + " | ";
                	s = s + r2.containsRectangle( r ) + " | ";
                	s = s + r.toString() + " | ";
                	s = s + r2.toString() + " | ";
                }
                snippet = "{\n	s = \"\";\n	Rectangle r = new Rectangle( 99, 100 );\n	Rectangle r2 = new Rectangle( 100, 99 );\n	s = s + r.containsRectangle( r2 ) + \" | \";\n	s = s + r2.containsRectangle( r ) + \" | \";\n	s = s + r.toString() + \" | \";\n	s = s + r2.toString() + \" | \";\n}";
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