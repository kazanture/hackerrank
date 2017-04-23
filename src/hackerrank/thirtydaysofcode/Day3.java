package hackerrank.thirtydaysofcode;

import java.util.Scanner;

/**
 * Created by kazanture on 4/23/2017.
 */
public class Day3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans="";

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if(n%2==1){
            ans = "Weird";
        }
        else{
            if(n<=5&&n>=2){
                ans="Not Weird";
            }
            else if(n<=20&&n>=6){
                ans="Weird";
            }
            else if(n>20){
                ans="Not Weird";
            }
            // Complete the code
        }
        System.out.println(ans);
    }
}
