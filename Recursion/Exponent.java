package Recursion;

import java.util.Scanner;

public class Exponent {

    static int exp(int m, int n){
        if(n==0)
            return 1;
        if(n ==1)
            return m;
        else
            return m*exp(m,n-1);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base : ");
        int base = input.nextInt();
        System.out.print("\nEnter the exp : ");
        int exponent = input.nextInt();

        System.out.printf("The answer for %d^%d = %d",base,exponent,exp(base,exponent));
    }
}
