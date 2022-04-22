package fraction;

import org.junit.Assert;
import org.junit.Test;


public final class FractionImplTest {

    @Test
    public void addTest1() {
        FractionImpl a =  new FractionImpl(2, 4);
        FractionImpl b = new FractionImpl(2, 4);
        String actual = b.add(a).toString();
        String expected = "1/1";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTest2() {
        FractionImpl a =  new FractionImpl(-2, 3);
        FractionImpl b = new FractionImpl(5, 2);
        String actual = b.add(a).toString();
        String expected = "11/6";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void subtractionTest1(){
        FractionImpl a = new FractionImpl(2, 3);
        FractionImpl b = new FractionImpl(2, 3);
        String actual = a.subtract(b).toString();
        String expected = "0/1";
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void subtractionTest2(){
        FractionImpl a = new FractionImpl(2, 5);
        FractionImpl b = new FractionImpl(4, 3);
        String actual = a.subtract(b).toString();
        String expected = "-14/15";
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void multiplyTest1(){
        FractionImpl a = new FractionImpl(2, 3);
        FractionImpl b = new FractionImpl(4, 5);
        String actual = b.multiply(a).toString();
        String expected = "8/15";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multiplyTest2(){
        FractionImpl a = new FractionImpl(1, 1);
        FractionImpl b = new FractionImpl(4, 5);
        String actual = b.multiply(a).toString();
        String expected = "4/5";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void divisionTest1(){
        FractionImpl a = new FractionImpl(3, 2);
        FractionImpl b = new FractionImpl(1, 5);
        String actual = a.divide(b).toString();
        String expected = "15/2";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void divisionTest2(){
        FractionImpl a = new FractionImpl(4, 1);
        FractionImpl b = new FractionImpl(1, 5);
        String actual = a.divide(b).toString();
        String expected = "20/1";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void absTest1(){
        FractionImpl a = new FractionImpl("8/-12");
        String expected = "-2/3";
        String actual = a.abs().toString();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void normaliseTest1(){
        FractionImpl a = new FractionImpl("8/12");
        String expected = "2/3";
        String actual = a.abs().toString();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void negateTest1(){
        FractionImpl a = new FractionImpl("3/5");
        String expected = "-3/5";
        String actual = a.negate().toString();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void negateTest2(){
        FractionImpl a = new FractionImpl("-3/5");
        String expected = "3/5";
        String actual = a.negate().toString();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void equalsTest1(){

        FractionImpl a = new FractionImpl(7,3);
        Assert.assertTrue(a.equals(a));
    }

    @Test
    public void equalsTest2(){

        FractionImpl a = new FractionImpl(7,3);
        FractionImpl b = new FractionImpl(3,7);
        Assert.assertFalse(a.equals(b));
    }

    @Test
    public void inverseTest1(){
        FractionImpl a = new FractionImpl(3,7);
        String actual =  a.inverse().toString();
        String expected = "7/3";
        Assert.assertEquals(expected,actual);

    }


    @Test
    public void compareTest1(){
        FractionImpl a = new FractionImpl(1,5);
        FractionImpl b = new FractionImpl(3,5);
        int expected = -1;
        int actual = a.compareTo(a);
        Assert.assertEquals(expected,actual);

    }


}




