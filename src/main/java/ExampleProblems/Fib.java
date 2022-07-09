package ExampleProblems;

public class Fib {

    public static int fibonicci(int number) {
        int previous = 0;
        int current = 1;

        for(int i = 0; i < number-2; i++) {
            System.out.println(current);
            int temp = current;
            current = current + previous;
            previous = temp;
        }

        return current;
    }

    public static int fibonicciRecursion(int number) {
        return rec(number, 1, 0);
    }

    private static int rec(int number, int current, int previous) {
        if(number == 2) {
            return current;
        } else {
            System.out.println(current);
            return rec(number - 1, current + previous, current);
        }
    }
}
