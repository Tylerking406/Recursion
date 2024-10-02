package Recursion;
//This program finds the permutation of a string, it implements DFS using recursion

import java.util.Scanner;

public class Permutation {

    private static String swap(String str, int i,int j){
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;

        return String.valueOf(charArray);

    }

    private static void calculate(String string, int left,int right){
        //base case
        if(left == right){
            System.out.println(string);
        }
        // Recursive step
        else{
            //nb loops will be created in their own call stacks
            for (int i = left; i <= right ; i++) {
                String swapped = swap(string,left,i);
                calculate(swapped,left+1,right);
            }
        }
    }

    //main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();

        calculate(string,0,string.length()-1);
    }
}
