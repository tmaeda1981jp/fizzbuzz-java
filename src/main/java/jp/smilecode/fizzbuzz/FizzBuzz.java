package jp.smilecode.fizzbuzz;

public class FizzBuzz {

    String run(int num) {
        if (num%3 == 0 && num%5 == 0) {
            return "FizzBuzz";
        }
        if (num%3 == 0) {
            return "Fizz";
        }
        if (num%5 == 0) {
            return "Buzz";
        }
        return String.valueOf(num);
    }
    
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i=1; i<=100; i++) {
            System.out.println(fizzBuzz.run(i));
        }
    }
}
