package hackerrank.projecteuler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by kazanture on 4/23/2017.
 */
public class ProjectEuler4 {
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
        long biggestPalindrome = 0;
        for(int n=100;n<1000;n++){
            for(int m=0;m<1000;m++){
                int value=n*m;
                if(palindromeList.indexOf(value)==-1){
                    if(isPalindrome(value)){
                        palindromeList.add(value);
                    }
                }
            }
        }
        Collections.sort(palindromeList);
        for (int i = 0; i < testNo; i++) {
            int input = in.nextInt();
            int index=indexOf(palindromeList.toArray(new Integer[palindromeList.size()]),input);

            System.out.println(palindromeList.get(index-1));
        }
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
