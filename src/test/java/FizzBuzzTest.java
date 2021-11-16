import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class FizzBuzzTest {

    @Test
    public void testIntegerZero(){
        assertThat(FizzBuzz.of(0), is("0"));
    }

    @Test
    public void testInteger1(){
        assertThat(FizzBuzz.of(1), is("1"));
    }

    @Test
    public void testFizzIsReturnsTrueWhenIntegerIs3(){
        assertThat(FizzBuzz.of(3), is("Fizz"));

    }

    @Test
    public void testBuzzIsReturnsTrueWhenIntegerIs5(){
        assertThat(FizzBuzz.of(5), is("Buzz"));

    }

    @Test
    public void testFizzIsReturnsTrueWhenIntegerIs6(){
        assertThat(FizzBuzz.of(6), is("Fizz"));

    }

    @Test
    public void testBuzzIsReturnsTrueWhenIntegerIs10(){
        assertThat(FizzBuzz.of(10), is("Buzz"));

    }

    @Test
    public void testFizzBuzzIsReturnsTrueWhenIntegerIs15(){
        assertThat(FizzBuzz.of(10), is("Buzz"));

    }
}
