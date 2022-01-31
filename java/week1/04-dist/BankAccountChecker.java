import java.io.*;
import java.util.*;

public class BankAccountChecker {
    public static void main( String[] args )    {        
        String s = "";
        String snippet = "";

        String[] t = { "Min: -10, Max: -2", "Min: 5, Max: 20", "Min: -8, Max: -8", "Min: -10000, Max: 10000" };

        for( int i = 0; i < 4; i++ )
        {
            if( i == 0 ) {
                {
                    BankAccount c = new BankAccount( -10 );
                    c.updateBalance( -2 );
                    c.updateBalance( -5 );
                    s = "Min: " + c.getMin() + ", Max: " + c.getMax();
                }
                snippet = "{\n    BankAccount c = new BankAccount( -10 );\n    c.updateBalance( -2 );\n    c.updateBalance( -5 );\n    s = \"Min: \" + c.getMin() + \", Max: \" + c.getMax();\n}";
            }
            if( i == 1 ) {
                {
                    BankAccount c = new BankAccount( 10 );
                    c.updateBalance( 20 );
                    c.updateBalance( 5 );
                    s = "Min: " + c.getMin() + ", Max: " + c.getMax();
                }
                snippet = "{\n    BankAccount c = new BankAccount( 10 );\n    c.updateBalance( 20 );\n    c.updateBalance( 5 );\n    s = \"Min: \" + c.getMin() + \", Max: \" + c.getMax();\n}";
            }
            if( i == 2 ) {
                {
                    BankAccount c = new BankAccount( -8 );
                    c.updateBalance( -8 );
                    s = "Min: " + c.getMin() + ", Max: " + c.getMax();
                }
                snippet = "{\n    BankAccount c = new BankAccount( -8 );\n    c.updateBalance( -8 );\n    s = \"Min: \" + c.getMin() + \", Max: \" + c.getMax();\n}";
            }
            if( i == 3 ) {
                {
                    BankAccount c = new BankAccount( 10000 );
                    c.updateBalance( -10000 );
                    s = "Min: " + c.getMin() + ", Max: " + c.getMax();
                }
                snippet = "{\n    BankAccount c = new BankAccount( 10000 );\n    c.updateBalance( -10000 );\n    s = \"Min: \" + c.getMin() + \", Max: \" + c.getMax();\n}";
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