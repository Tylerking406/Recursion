package Recursion;

import java.util.Scanner;

public class ReshapeMatrix {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int rows, cols;
        rows = input.nextInt();
        cols = input.nextInt();

        //original matrix
        int[][] originalMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                originalMatrix[i][j] = input.nextInt();
            }
        }

        //transpose matrix
        int[][] transposeMatrix = new int[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                transposeMatrix[i][j] = originalMatrix[j][i];
            }
        }

        //print transpose
//        for (int i = 0; i < cols; i++) {
//            for (int j = 0; j < rows; j++) {
//                System.out.print(transposeMatrix[i][j] + " ");
//            }
//            System.out.println();
//        }
         //clocking matrix
        int[][] clockwiseMatrix = new int[rows][cols];
        for (int i = 0; i < cols; i++) {
            for (int j = rows-1; j >=0; j--) {
                clockwiseMatrix[i][j] = transposeMatrix[i][j];
            }
        }

        //print clockwise
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(clockwiseMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    }
