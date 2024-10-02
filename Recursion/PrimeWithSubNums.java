package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeWithSubNums {
//    private static int primeNumber = -1;

    //check if a number is prime number
    private static boolean isPrime(int n){
//        if(n==1)
//            return true;
        if(n<2)
            return false;
        if (n == 2 || n == 3) return true; // 2 and 3 are prime
        if ( (n%2==0) || (n%3==0))
            return false;
        for (int i = 5; i < Math.sqrt(n); i++) {
            if (n%i==0) return false;
        }
        return true;
    }

    //check if number is prime
    private static int checker(int n){
        boolean state = isPrime(n);
        if(state)
            return n;
        if(n<2)
            return -1;
        else{
            return checker(n-1);
        }

    }

    private static String subString(int n){
        String string = String.valueOf(n);
        if (n <=2)
            return "-1";
        else if (string.length() <= 1 )
            return string;
         else{//Arinao
            for (int i = 0; i < string.length(); i++) {
                String sub =string.substring(string.length()-1-i);
                if (!isPrime(Integer.parseInt(sub))){
                    n--;
                    int a=checker(n);
                    return subString(a);
                }

            }
            return string;
        }
    }
    //main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println(subString(n-1));
    }
}
