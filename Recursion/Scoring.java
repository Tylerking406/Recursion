package Recursion;

import java.util.Scanner;

/*
A program to allow a user to enter a number of inputs and target, it find the max number less than target

 */

public class Scoring {
    private static int maxScore=0;
    private static int N;
    private static int Target;
    private static int[] V; //Array to contain entered user numbers

    static void findMax(int currentScore, int index){

        // score must be less than target
        if (currentScore < Target){

            if (currentScore> maxScore)
                maxScore = currentScore;

            //Base case
            if(index == N)
                return;

            //recursive step
            else {
                findMax(currentScore + V[index], index+1);
                findMax(currentScore * V[index], index+1);
            }

        }
    }

    //main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        N = input.nextInt(); //number of input user will enter

        //Assign Array size
        V = new int[N];
        for (int i = 0; i < N; i++) {
            V[i] = input.nextInt();
        }
        Target = input.nextInt();
        input.close(); //done using scanner

        findMax(1,0);
        System.out.println(maxScore);
    }
}
