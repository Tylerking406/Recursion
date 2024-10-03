package Recursion;

import java.util.Scanner;

public class Fib {
    static int fibonacci(int n) {
        if (n == 0 || n == 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        System.out.println("Fibonacci series up to " + n + "th term: "+fibonacci(n));
    }
}
