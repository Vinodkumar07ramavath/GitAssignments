package vinodkumar;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.FizzBuzzConverter;

public class FizzBuzzTest
{
    @Test
    public void Numbers(){
        FizzBuzzConverter fbc=new FizzBuzzConverter();
        Assert.assertEquals("1",fbc.convert(1));
        Assert.assertEquals("2",fbc.convert(2));
        Assert.assertEquals("3",fbc.convert(3));
        Assert.assertEquals("4",fbc.convert(4));
    }
    @Test
    public void Five() {
        FizzBuzzConverter fbc = new FizzBuzzConverter();
        Assert.assertEquals("fizz", fbc.convert(5));
    }
    @Test
    public void Seven() {
        FizzBuzzConverter fbc = new FizzBuzzConverter();
        Assert.assertEquals("buzz", fbc.convert(7));
    }
    @Test
    public void FiveAndSeven() {
        FizzBuzzConverter fbc = new FizzBuzzConverter();
        Assert.assertEquals("fizzbuzz", fbc.convert(35));
    }
    @Test
    public void Output(){
        FizzBuzzConverter fizzBuzz=new FizzBuzzConverter();
        for(int i=1;i<=10;i++)
            System.out.println(fizzBuzz.convert(i));
    }
}
