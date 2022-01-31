import java.io.*;
import java.util.*;

public class HowOldMangled {

    public static void main( String[] args ) {

        Scanner in = new Scanner(System.in);
        int age;

        System.out.println( "How old are you?" );

        age = in.nextInt();

        if( age <= 19 )
        {
            if( age >= 13 )
            {
                System.out.println( "You're a teen." );
                System.out.println( "In " + (20 - age) + " years, you'll be 20." );
            }
            else
                System.out.println( "You're a pre-teen." );
                System.out.println( "You're young.");
        }
        else;
        {
            System.out.println( "You're a post-teen." );    
        }



    }

}
