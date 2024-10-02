package Recursion;

import java.util.Scanner;

public class TransposeMatrix {

    private static String reverse(String string){
        int length = string.length();
        if (length <= 1)
            return string;
        else{
            char firstChar = string.charAt(0);
            return reverse(string.substring(1)) + firstChar;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows= input.nextInt();
       // rows= rows +1;
        int columns = input.nextInt();
        int[][] Matrix = new int[rows][columns];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c <columns ; c++) {
                Matrix[r][c] = input.nextInt();
            }

        }

//      Transpose Matrix
        int[][] Transpose = new int[columns][rows];
        for (int c = 0; c < columns; c++) {
            for (int r = 0; r <rows ; r++) {
               Transpose[c][r] = Matrix[r][c];
            }

        }


        for (int r = 0; r < columns; r++) {
            for (int c = 0; c <rows ; c++) {
                System.out.print(Transpose[r][c]+" ");
            }
            System.out.println();

        }


    }
}
