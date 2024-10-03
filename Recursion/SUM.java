package Recursion;

import static Recursion.SUM.sumNum;

public class SUM {

    static int sumNum(int n) {
        if (n == 0)
            return 0;
        else
            return n + sumNum(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Sum of first " + n + " natural numbers: " + sumNum(n));

    }
}
