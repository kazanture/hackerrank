package hackerrank.projecteuler;
import java.util.*;


/**
 * Created by kazanture on 4/23/2017.
 */
public class ProjectEuler1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testNo=in.nextInt();
        for(int j=0;j<testNo;j++){

            int sum=0;
            long currentNumber=in.nextInt();
            long n=(currentNumber-1)/3;
            long m=(currentNumber-1)/5;
            long k=(currentNumber-1)/15;
            long result=3*n*(n+1)/2+5*m*(m+1)/2-15*k*(k+1)/2;
            System.out.println(result);

        }
    }
}
