package hackerrank.projecteuler;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by kazanture on 4/23/2017.
 */
public class ProjectEuler6 {
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
    public static void main(String[] args) {
        ArrayList<Integer> palindromeList=new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        int testNo = in.nextInt();

        for (int i = 0; i < testNo; i++) {
            int input = in.nextInt();
            long squareOfSum=calculateSquareOfSum(input);
            long sumOfSquare=calculateSumOfSquare(input);
            System.out.println(Math.abs(squareOfSum-sumOfSquare));
        }
    }
    public static long calculateSquareOfSum(int input){
        long val=(long)input*(input+1)/2;
        return val*val;
    }
    public static long calculateSumOfSquare(int input){
        long sum=0;
        for(int i=1;i<=input;i++){
            sum+=i*i;
        }
        return sum;
    }

    public static long findCommonBig(int x,long y){
        for(long i=y;i<x*y;i++){
            if(i%x==0&&i%y==0){
                return i;
            }
        }
        return x*y;
    }
    public static int indexOf(Integer[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return lo;
    }
}
