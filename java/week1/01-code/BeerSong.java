
public class BeerSong {

    public static void main( String[] args ) {
        int bottles = 5;
        boolean repeat = false;
        String word;

        while( bottles > 0 )
        {
        	if( bottles > 1 ) word = "bottles";
        	else word = "bottle";

            if( repeat ) 
            {
                System.out.println( bottles + " " + word 
                    + " of beer on the wall");
                System.out.println( "" );
            }

            System.out.println( bottles + " " + word 
                + " of beer on the wall");
            System.out.println( bottles + " " + word 
                + " of beer");
            System.out.println( "Take one down," );
            System.out.println( "Pass it around," );

            bottles = bottles - 1;
            repeat = true;
        }
        System.out.println( "No more bottles of beer "
            + "on the wall." );
    }
}