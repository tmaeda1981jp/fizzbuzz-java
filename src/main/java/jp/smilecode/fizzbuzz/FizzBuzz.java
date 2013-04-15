package jp.smilecode.fizzbuzz;

class FizzBuzz {

    String say(int num) throws IllegalArgumentException {
        if (num < 1) {
            throw new IllegalArgumentException("1以上の数を指定してください．");
        }
        if (num%3 == 0 && num%5 == 0) return "FizzBuzz";
        if (num%3 == 0) return "Fizz";
        if (num%5 == 0) return "Buzz";
        return String.valueOf(num);
    }
    
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i=1; i<=100; i++) {
            System.out.println(fizzBuzz.say(i));
        }
    }
}
