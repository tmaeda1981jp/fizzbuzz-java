package jp.smilecode.fizzbuzz;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.*;
import org.junit.experimental.runners.*;
import org.junit.runner.*;

@RunWith(Enclosed.class)
public class FizzBuzzTest {
    public static class runメソッドのテスト {
        private FizzBuzz instance = new FizzBuzz();
        @Test public void runに3を渡すとFizzを返すこと() {
            assertThat(instance.run(3), is("Fizz"));
        }
        @Test public void runに5を渡すとBuzzを返すこと() {
            assertThat(instance.run(5), is("Buzz"));
        }
        @Test public void runに15を渡すとFizzBuzzを返すこと() {
            assertThat(instance.run(15), is("FizzBuzz"));
        }
    }
}
