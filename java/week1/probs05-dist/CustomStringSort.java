// 13119138
// rcocia01@student.bbk.ac.uk

import java.io.*;
import java.util.*;


interface PredicateStringPair
{
    boolean better( String a, String b );
}


public class CustomStringSort {

    public static Comparator<String> createComparator( PredicateStringPair pred )
    {
        Comparator<String> comparator = (a,b)->{
            if(pred.better(a,b)){
                return -1;
            }else if(pred.better(b,a)){
                return 1;
            }else{
                return 0;
            }
        };

        return comparator;
    }

    public static void sortStrings( ArrayList<String> lst, PredicateStringPair pred )
    {
        Comparator<String> comparable = createComparator(pred);
        Collections.sort(lst, comparable);
    }

    public static void sortStringsLonger( ArrayList<String> lst )
    {
        PredicateStringPair longest = (a, b) -> {
            if (a.length() > b.length()) {
                return true;
            }
            else {
                return false;
            }
        };

        sortStrings(lst, longest);
    }

    public static void sortStringsNumAs( ArrayList<String> lst )
    {
        PredicateStringPair sortString = (a,b) -> {
            if(a.chars().filter(ch -> ch == 'a').count() > b.chars().filter(ch -> ch == 'a').count()){
                return true;
            }else{
                return false;
            }
        };
        sortStrings(lst, sortString);

    }

    public static void sortStringsDictionary( ArrayList<String> lst )
    {
        PredicateStringPair stringOrder = (a,b)->{

                if(a.toLowerCase().compareTo(b.toLowerCase()) <= 0){
                    return true;
                }else{
                    System.out.println(b);

                    return false;
                }
        };

        sortStrings(lst, stringOrder);

    };

  
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();

        fruits.add("Strawberry");
        fruits.add("strawberries");
        fruits.add("Kiwi");
        fruits.add("kiwis");
        fruits.add("Banana");
        fruits.add("bananas");

        System.out.println( fruits );
        sortStringsLonger( fruits );
        System.out.println( fruits );
        
        sortStringsNumAs( fruits );
        System.out.println( fruits );

        fruits.add( "@plum" );
        fruits.add( "@kumquat" );
        fruits.add( "banana" );
        fruits.add( "3 oranges" );
        fruits.add( "9 oranges" );
        fruits.add( "33 oranges" );
        System.out.println( fruits );
        sortStringsDictionary( fruits );
        System.out.println( fruits );
    }
}
