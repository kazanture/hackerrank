package hackerrank.thirtydaysofcode;

import java.util.Scanner;

/**
 * Created by kazanture on 4/24/2017.
 * https://www.hackerrank.com/challenges/30-recursion
 */
public class Day9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(factorial(n));

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
    public static int factorial(int input){

        if(input==2){
            return 2;
        }else{
            return input*factorial(input-1);
        }
    }
}
