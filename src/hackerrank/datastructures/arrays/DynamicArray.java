package hackerrank.datastructures.arrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by kazanture on 4/23/2017.
 */
public class DynamicArray {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> sequenceList=new ArrayList<ArrayList<Integer>>();
        Scanner in = new Scanner(System.in);
        int numberOfSeq = in.nextInt();
        int numberOfQueries = in.nextInt();
        in.nextLine();
        for(int j=0;j<numberOfSeq;j++){
            ArrayList<Integer> sequence=new ArrayList<Integer>();
            sequenceList.add(sequence);
        }
        int lastAns=0;
        for (int i = 0; i < numberOfQueries; i++) {
            int queryType=in.nextInt();
            int x=in.nextInt();
            int y=in.nextInt();
            if(queryType==1){
                int index=(x^lastAns)%numberOfSeq;
                sequenceList.get(index).add(y);

            }else{
                int index=(x^lastAns)%numberOfSeq;
                ArrayList<Integer> sequence=sequenceList.get(index);
                int indexInSeq=y%sequence.size();
                lastAns=sequence.get(indexInSeq);
                System.out.println(lastAns);
            }

            in.nextLine();
        }
    }

}
