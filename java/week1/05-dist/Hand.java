// 13119138
// rcocia01@student.bbk.ac.uk

import java.io.*;
import java.util.*;


 class Card {
 }

public class Hand
{

    Hand( String str )
    {
    }


    public String toString()
    {
        return "";
    }


    public String status() // return "straight flush", "straight", "flush", or "none"
    {
        return( "none" );
    }



    public static void main(String[] args) {
        // sample testing code
        Hand h = new Hand( "1 1 2 1 3 1 4 1 5 1" );
        System.out.println( h.toString() );
        System.out.println( h.status() );
    }

}

