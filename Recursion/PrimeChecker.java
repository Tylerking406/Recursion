 package Recursion;

import java.util.Scanner;

public class PrimeChecker {

    private static boolean isPrime(int num){
        if (num<2)
            return false;
        if (num==3 || num ==2)
            return true;
        else if(num%2==0 || num%3==0 )
            return false;
        for (int i = 5; i < num; i++) {
            if (num %i ==0) return false;
        }

            return true;
    }

    private static int checker (int n){
        boolean state = isPrime(n);
        if (state || n==0)
            return n;
        else if (n<=1) {
            return -1;
        } else
            return checker(n-1);
    }


    private static String subStringChecker(int n){

        //split into substrings 140
        String string = String.valueOf(n);
        int length = string.length();
        //int[] moder = {1,10,100,1000,10000};
        int moder=1;
        StringBuilder sb = new StringBuilder();
        int tracker =0;
        for (int i = 0; i < length; i++) {
            int current = n%(moder*10);
            int checked =checker(current);

            if(checked == 0)
                tracker++;
            else if (tracker != 0){
                tracker =0;
                sb.insert(0,checked);
            }
            else
                sb.insert(0,checked/moder);
            moder*=10;
        }
        return sb.toString();

    }




    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.println(subStringChecker(number-1));

    }
}