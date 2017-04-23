package hackerrank.projecteuler;

import java.util.Scanner;

/**
 * Created by kazanture on 4/23/2017.
 */
public class ProjectEuler2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long testNo=in.nextInt();
        for(long j=0;j<testNo;j++){

            long sum=0;
            long currentLimit=in.nextLong();
            long prevNo=2;
            long prevPrevNo=1;
            long currentNo=3;
            long total=0;
            while(prevNo+prevPrevNo<=currentLimit){
                currentNo=prevNo+prevPrevNo;
                if(isEven(currentNo))
                    total+=currentNo;
                prevPrevNo=prevNo;
                prevNo=currentNo;
            }
            System.out.println(total+2);

        }
    }
    public static boolean isEven(long number){
        if(number%2==0) return true;else return false;
    }
}
