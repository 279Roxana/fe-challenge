import java.io.*;
import java.util.*;

public class ChessChecker {
    public static void main( String[] args )    {        
        String s = "";
        String snippet = "";

        String[] t = { "false | true | ", "true | false | ", "true | false | " };

        for( int i = 0; i < 3; i++ )
        {
            if( i == 0 ) {
                {
                	s = "";
                    Chess.ChessPiece a = new Chess.King( 0, 0 );
                    Chess.ChessPiece b = new Chess.Queen( 2, 2 );
                    s = s + a.canAttack( b ) + " | ";
                    s = s + b.canAttack( a ) + " | ";
                }
                snippet = "{\n	s = \"\";\n    Chess.ChessPiece a = new Chess.King( 0, 0 );\n    Chess.ChessPiece b = new Chess.Queen( 2, 2 );\n    s = s + a.canAttack( b ) + \" | \";\n    s = s + b.canAttack( a ) + \" | \";\n}";
            }
            if( i == 1 ) {
                {
                	s = "";
                    Chess.ChessPiece a = new Chess.Bishop( 0, 0 );
                    Chess.ChessPiece b = new Chess.Rook( 2, 2 );
                    s = s + a.canAttack( b ) + " | ";
                    s = s + b.canAttack( a ) + " | ";
                }
                snippet = "{\n	s = \"\";\n    Chess.ChessPiece a = new Chess.Bishop( 0, 0 );\n    Chess.ChessPiece b = new Chess.Rook( 2, 2 );\n    s = s + a.canAttack( b ) + \" | \";\n    s = s + b.canAttack( a ) + \" | \";\n}";
            }
            if( i == 2 ) {
                {
                	s = "";
                    Chess.ChessPiece a = new Chess.Knight( 3, 4 );
                    Chess.ChessPiece b = new Chess.Queen( 2, 2 );
                    s = s + a.canAttack( b ) + " | ";
                    s = s + b.canAttack( a ) + " | ";
                }
                snippet = "{\n	s = \"\";\n    Chess.ChessPiece a = new Chess.Knight( 3, 4 );\n    Chess.ChessPiece b = new Chess.Queen( 2, 2 );\n    s = s + a.canAttack( b ) + \" | \";\n    s = s + b.canAttack( a ) + \" | \";\n}";
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