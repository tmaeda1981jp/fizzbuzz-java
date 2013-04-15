package jp.smilecode.fizzbuzz;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.*;
import org.junit.experimental.runners.*;
import org.junit.runner.*;

@RunWith(Enclosed.class)
public class FizzBuzzTest {
    public static class runメソッドのテスト {
        private FizzBuzz fizzbuzz = new FizzBuzz();

        @Test public void runに3の倍数且つ5の倍数となる数値を渡すとFizzBuzzという文字列を返すこと() {
            assertThat(fizzbuzz.say(15), is("FizzBuzz"));
        }

        @Test public void runに3の倍数の数値を渡すとFizzという文字列を返すこと() {
            assertThat(fizzbuzz.say(3), is("Fizz"));
            assertThat(fizzbuzz.say(126), is("Fizz"));
            assertThat(fizzbuzz.say(333), is("Fizz"));
        }
        @Test public void runに5の倍数の数値を渡すとBuzzという文字列を返すこと() {
            assertThat(fizzbuzz.say(5), is("Buzz"));
            assertThat(fizzbuzz.say(50), is("Buzz"));
            assertThat(fizzbuzz.say(500), is("Buzz"));
        }
        @Test public void runに3または5の倍数ではない数値を渡すと渡した数値を文字列として返すこと() {
            assertThat(fizzbuzz.say(4), is(String.valueOf("4")));
            assertThat(fizzbuzz.say(16), is(String.valueOf("16")));
            assertThat(fizzbuzz.say(34), is(String.valueOf("34")));
        }
        @Test(expected=IllegalArgumentException.class)
        public void runに1より小さい数値を渡すとIllegalArgumentsExceptionをthrowすること() {
            fizzbuzz.say(0);
        }
    }
}
