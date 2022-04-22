import org.junit.*;
import java.util.*;



public class TopTest {

    @Test
    public void getTopThree() {
        String [][] input = {{"b", "a", "c","a", "abba"}, {"Jules", "Jim"}, {"Jules", "Jim", "I", "J"}, {"Adam", "Paul", "Tom", "Pat"}};
        String [][] expected={{"a", "abba", "b"}, {"Jim", "Jules"}, {"I", "J", "Jim"}, {"Adam", "Pat", "Paul"}};
        for (int i = 0; i< input.length; i++) {
            Top t = new Top();
            for (int j = 0; j< input[i].length; j++ ) {
                t.push(input[i][j]);
            }
            ArrayList<String> actual = t.getTopThree();
            Assert.assertEquals(Arrays.asList(expected[i]), actual);
            t.reset();
        }
        System.out.println("Passed all tests");
    }


}
