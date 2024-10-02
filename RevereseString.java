package Recursion;

import java.util.Scanner;

public class RevereseString {

    static String rev(String string){
        if(string.length() <=1)
            return string;
        else{
            char lastChar =string.charAt(string.length()-1);
            return String.valueOf(lastChar)+rev(string.substring(0, string.length()-1)); //return text without lastChar
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a text to Reverse: ");
        String text = input.nextLine();
        System.out.printf("%s reversed is %s.",text,rev(text));

    }
}
