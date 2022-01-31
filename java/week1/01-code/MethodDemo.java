public class MethodDemo {
    static void showInt( int a )
    {
        System.out.println( a );
    }

    static int addThree( int a )
    {
        a = a + 3;
        return a;
    }

    public static void main(String[] args) {
        showInt( 100 );
        showInt( addThree( 2 ));

        int b = 6;
        int c = addThree( b );
        showInt( c );
        showInt( b );

        int a = 10;
        addThree( a );
        showInt( a );
    }
}
