package hackerrank.projecteuler;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by kazanture on 4/23/2017.
 */
public class ProjectEuler7 {
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
    public static boolean isPalindrome(Integer number){
        String numberAsString=number.toString();
        StringBuffer stringBuffer=new StringBuffer(numberAsString);
        stringBuffer.reverse();
        return stringBuffer.toString().equals(numberAsString);
    }
    public static ArrayList<Long> primeNumbers=new ArrayList<Long>();
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testNo = in.nextInt();
        primeNumbers.add(2L);
        for (int i = 0; i < testNo; i++) {
            int input = in.nextInt();
            if(primeNumbers.size()>input)
            {

            }else{
                updatePrimeNumbers(input);
            }
            System.out.println(primeNumbers.get(input-1));
        }
    }
    public static void updatePrimeNumbers(int input){
        long biggestPrimeNumber=primeNumbers.get(primeNumbers.size()-1);
        long i=biggestPrimeNumber+1;
        while(primeNumbers.size()<input){
            if(isPrime(i)){
                primeNumbers.add(i);
            }
            i++;
        }
    }
    public static boolean isPrime(long input){
        for(Long primeNumber:primeNumbers){
            if(input%primeNumber==0)
                return false;
        }
        return true;
    }
}
