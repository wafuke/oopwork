package oop;
public class FactorialCalculator {

    // Recursive method to compute the factorial of a number
    public static int factorial(int n) {
        // Base case: if n is 0, the factorial is 1
        if (n == 0) {
            return 1;
        } else {
            // Recursive case: n! = n * (n-1)!
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number); // Calculates the factorial of 5
        System.out.println(number + "! = " + result); // Output: 5! = 120
    }
}


