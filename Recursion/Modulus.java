package Recursion;
import java.util.Scanner;

public class Modulus
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int Z = input.nextInt();
        int counter = 0;

        for (int Y = 1; Y <N ; Y++) {
            for (int X = 1; X <N ; X++) {

                //Equation
                if ( ( (X*Y)%N )==Z ){
                    counter++;
                }

            }
        }

        System.out.println(counter);
    }
}
