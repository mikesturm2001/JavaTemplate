package ExampleProblems;

public class FizzBuzz {


    public String calculateFizzBuzz(int x) {
        int mod3 = x % 3;
        int mod5 = x % 5;

        String output = "";

        if ((mod3 == 0) && (mod5 == 0)) {
            output = "Fizz Buzz";
        } else if (mod3 == 0) {
            output = "Fizz";
        } else if (mod5 == 0) {
            output = "Buzz";
        }

        return output;
    }
}
