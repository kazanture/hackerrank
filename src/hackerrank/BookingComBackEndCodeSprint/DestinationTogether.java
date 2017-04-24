package hackerrank.BookingComBackEndCodeSprint;

import java.util.Scanner;

/**
 * Created by kazanture on 4/24/2017.
 */
public class DestinationTogether {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m= in.nextInt();
        int c= in.nextInt();
        int comb=n+m-c-1;
        System.out.println(fac(comb));


    }
    private static long fac(long number){
        if(number==0){
            return 1;
        }else{
            return number*fac(number-1);
        }
    }
}
