import java.io.*;
import java.util.*;

public class DateChecker {
    public static void main( String[] args )    {        
        String s = "";
        String snippet = "";

        String[] t = { "30/11 | 01/12 | 31/12 | 01/01 | ", "01/01 | 02/02 | 06/03 | 07/04 | " };

        for( int i = 0; i < 2; i++ )
        {
            if( i == 0 ) {
                {
                        s = "";
                
                        Date b = new Date( 30, 11 );
                        s += b.toString() + " | ";
                
                        b.addDays( 1 );
                        s += b.toString() + " | ";
                
                        b.addDays( 30 );
                        s += b.toString() + " | ";
                
                        b.addDays( 5 );
                        s += b.toString() + " | ";
                }
                snippet = "{\n        s = \"\";\n\n        Date b = new Date( 30, 11 );\n        s += b.toString() + \" | \";\n\n        b.addDays( 1 );\n        s += b.toString() + \" | \";\n\n        b.addDays( 30 );\n        s += b.toString() + \" | \";\n\n        b.addDays( 5 );\n        s += b.toString() + \" | \";\n}";
            }
            if( i == 1 ) {
                {
                        s = "";
                
                        Date b = new Date( 1, 32 );
                        s += b.toString() + " | ";
                
                        b.addDays( 32 );
                        s += b.toString() + " | ";
                
                        b.addDays( 32 );
                        s += b.toString() + " | ";
                
                        b.addDays( 32 );
                        s += b.toString() + " | ";
                }
                snippet = "{\n        s = \"\";\n\n        Date b = new Date( 1, 32 );\n        s += b.toString() + \" | \";\n\n        b.addDays( 32 );\n        s += b.toString() + \" | \";\n\n        b.addDays( 32 );\n        s += b.toString() + \" | \";\n\n        b.addDays( 32 );\n        s += b.toString() + \" | \";\n}";
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