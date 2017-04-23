package hackerrank.thirtydaysofcode;

import java.util.Scanner;

/**
 * Created by kazanture on 4/23/2017.
 */
public class Day5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(N+" x "+i+" = "+N*i);
        }
    }
}
