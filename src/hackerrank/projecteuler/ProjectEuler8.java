package hackerrank.projecteuler;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by kazanture on 4/23/2017.
 */
public class ProjectEuler8 {
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
        for (int i = 0; i < testNo; i++) {
            int digitCount = in.nextInt();
            int consDigits = in.nextInt();
            in.nextLine();
            String numberAsString=in.nextLine();
            int multCount=0;
            long product=1;
            long biggestProduct=0;
            Queue digits = new LinkedList();
            for (int j = 0; j < numberAsString.length(); j++)
            {
                int currentDigit = numberAsString.charAt(j) - '0';
                if(digits.size()<consDigits){
                    digits.add(currentDigit);
                }else{
                    product=calculateProduct(digits);
                    if(product>biggestProduct){
                        biggestProduct=product;
                    }
                    digits.poll();
                    digits.add(currentDigit);
                }
            }
            System.out.println(biggestProduct);
        }
    }
    public static long calculateProduct(Queue digits){
        long product=1;

        for(int i=0;i<digits.size();i++){
            int digit=(int)digits.poll();
            product*=digit;
            digits.add(digit);
        }
        return product;
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
