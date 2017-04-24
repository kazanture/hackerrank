package hackerrank.thirtydaysofcode;

import java.util.Scanner;

/**
 * Created by kazanture on 4/24/2017.
 * https://www.hackerrank.com/challenges/30-2d-arrays
 */
public class Day11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int largestSum=-1*Integer.MAX_VALUE;
        for(int x=0;x<4;x++){
            for(int y=0;y<4;y++){
                int sum=arr[x][y]+arr[x][y+1]+arr[x][y+2]+arr[x+1][y+1]+arr[x+2][y]+arr[x+2][y+1]+arr[x+2][y+2];
                if(sum>largestSum){
                    largestSum=sum;
                }
            }
        }
        System.out.println(largestSum);
    }
}
