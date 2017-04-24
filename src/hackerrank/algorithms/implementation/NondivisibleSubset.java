package hackerrank.algorithms.implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by kazanture on 4/24/2017.
 * https://www.hackerrank.com/challenges/non-divisible-subset
 */
public class NondivisibleSubset {
    public static ArrayList<String> visitedList=new ArrayList<String>();
    public static Map<Long,Long> reverseMap =new HashMap<Long,Long>();
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numberOfIntegers = in.nextInt();
        int divideBy=in.nextInt();
        for(int i=0;i<numberOfIntegers;i++){
            long number=in.nextLong();
            long numberRemain=number%divideBy;
            long numberReverse=divideBy-numberRemain;
            Long reverseCounter=reverseMap.get(numberReverse);
            if(reverseCounter==null){
                reverseCounter=new Long(0);
            }
            reverseMap.put(numberReverse,reverseCounter+1);
        }
        int memberCount=0;
        for(int i=0;i<divideBy/2;i++){

            if((i+1)==(divideBy-(i+1))){
                continue;
            }
            Long reverseCount=reverseMap.get(new Long(i+1));
            if(reverseCount==null){
                reverseCount=0L;
            }
            Long reverseCountOther=reverseMap.get(new Long(divideBy-(i+1)));
            if(reverseCountOther==null){
                reverseCountOther=0L;
            }

            if(reverseCount<reverseCountOther){
                memberCount+=reverseCountOther;
            }else{
                memberCount+=reverseCount;
            }
        }
        if(divideBy%2==0&&(reverseMap.get(new Long(divideBy/2))!=null)){
            memberCount++;
        }
        if(reverseMap.get(new Long(divideBy))!=null){
            memberCount++;
        }
        System.out.println(memberCount);
    }
}
