package hackerrank.projecteuler;

import java.util.Scanner;

/**
 * Created by kazanture on 4/23/2017.
 */
public class ProjectEuler3 {
    public static long findLargestPrimeFactor(long input){
        long largestFactor=0;
        for(int j=2;j<=Math.sqrt(input);j++){
           /* if(!BigInteger.valueOf(j).isProbablePrime(1))
                continue;
*/
            if(input%j==0){
                largestFactor=findLargestPrimeFactor(input/j);
                break;
            }
        }
        if(largestFactor==0)
            largestFactor=input;
        return largestFactor;
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testNo=in.nextInt();
        for(int i=0;i<testNo;i++){
            long input=in.nextLong();

            long largestPrimeFactorNumber=findLargestPrimeFactor(input);

            System.out.println(largestPrimeFactorNumber);
        }
    }
}
