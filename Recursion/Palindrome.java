package Recursion;

import java.util.Scanner;

public class Palindrome {
    public static boolean palindrome(String string){
        int length = string.length();
               if ( string.length()<= 1) //if a string is empty or has 1 char
            return true;

        else{
            char firstChar, lastChar;
            firstChar = string.charAt(0);
            lastChar = string.charAt(length -1);
            if (firstChar == lastChar){
                return palindrome( string.substring(1, length-1) ); //exclude 1st and last char
            }

            else
                return false;
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a text to check: ");
        String text = input.nextLine();
        System.out.print("The answer is "+ palindrome(text));

    }
}
