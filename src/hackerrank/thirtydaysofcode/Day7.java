package hackerrank.thirtydaysofcode;

import java.util.Scanner;

/**
 * Created by kazanture on 4/24/2017.
 * https://www.hackerrank.com/challenges/30-arrays
 */
public class Day7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        for(int i=n-1; i >= 0; i--){
            System.out.print(arr[i]+" ");
        }

    }
}
