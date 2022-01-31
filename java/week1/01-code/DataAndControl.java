public class DataAndControl {

    public static void main( String[] args ) {
        System.out.println( "Hello, world!" );

        int var1 = 1024;
        int var2;

        var2 = var1 / 2;
        System.out.println( "var1 contains: " + var1 );
        System.out.print( "var2 contains: " );
        System.out.println( var2 );

        boolean comp, comp2;
        comp = true;
        comp2 = var2 > var1;
        System.out.println( "comp contains: " + comp );
		System.out.print( "comp2 contains: " );
        System.out.println( comp2 );

        // Strings
        String s = "This is a string";
        System.out.println( s.charAt( 2 ));
        System.out.println( "The length of s is: " + s.length());
        System.out.println( s.substring( 1, 4 ));



        int i;
        for( i = 1; i <= 5; i++ )
        {
            System.out.println( i );
        }

        System.out.println( "Next..." );

        int j;
        for( j = 0; j < 5; j++ )
        {
            System.out.println( j );
        }

        System.out.println( "Next..." );
        for( ; j > 0; j-- )
        {
            System.out.println( j );
        }


    } 

}