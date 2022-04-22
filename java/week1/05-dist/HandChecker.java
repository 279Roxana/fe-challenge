import java.io.*;
import java.util.*;

public class HandChecker {
    public static void main( String[] args )    {        
        String s = "";
        String snippet = "";

        String[] t = { "Ace of Diamonds, 2 of Diamonds, 3 of Diamonds, 4 of Diamonds, 5 of Diamonds|straight flush", "Ace of Diamonds, King of Diamonds, 2 of Diamonds, 3 of Diamonds, 4 of Diamonds|flush", "Ace of Diamonds, King of Diamonds, Queen of Diamonds, Jack of Diamonds, 10 of Hearts|straight", "Ace of Diamonds, King of Diamonds, Queen of Diamonds, Jack of Diamonds, 9 of Hearts|none", "Ace of Diamonds, 2 of Hearts, 3 of Spades, 5 of Clubs, 3 of Clubs|none" };

        for( int i = 0; i < 5; i++ )
        {
            if( i == 0 ) {
                {
                    Hand a = new Hand( "1 1 2 1 3 1 4 1 5 1" );
                    s = a.toString() + "|" + a.status();
                }
                snippet = "{\n    Hand a = new Hand( \"1 1 2 1 3 1 4 1 5 1\" );\n    s = a.toString() + \"|\" + a.status();\n}";
            }
            if( i == 1 ) {
                {
                    Hand a = new Hand( "1 1 13 1 2 1 3 1 4 1" );
                    s = a.toString() + "|" + a.status();
                }
                snippet = "{\n    Hand a = new Hand( \"1 1 13 1 2 1 3 1 4 1\" );\n    s = a.toString() + \"|\" + a.status();\n}";
            }
            if( i == 2 ) {
                {
                    Hand a = new Hand( "1 1 13 1 12 1 11 1 10 2" );
                    s = a.toString() + "|" + a.status();
                }
                snippet = "{\n    Hand a = new Hand( \"1 1 13 1 12 1 11 1 10 2\" );\n    s = a.toString() + \"|\" + a.status();\n}";
            }
            if( i == 3 ) {
                {
                    Hand a = new Hand( "1 1 13 1 12 1 11 1 9 2" );
                    s = a.toString() + "|" + a.status();
                }
                snippet = "{\n    Hand a = new Hand( \"1 1 13 1 12 1 11 1 9 2\" );\n    s = a.toString() + \"|\" + a.status();\n}";
            }
            if( i == 4 ) {
                {
                    Hand a = new Hand( "1 1 2 2 3 3 5 0 3 0" );
                    s = a.toString() + "|" + a.status();
                }
                snippet = "{\n    Hand a = new Hand( \"1 1 2 2 3 3 5 0 3 0\" );\n    s = a.toString() + \"|\" + a.status();\n}";
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