package hackerrank.datastructures.arrays;

import java.util.Scanner;

/**
 * Created by kazanture on 4/23/2017.
 */
public class LeftRotation {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numberOfIntegers = in.nextInt();
        int numberOfRotations = in.nextInt();
        int array[]=new int[numberOfIntegers];
        in.nextLine();
        for(int j=0;j<numberOfIntegers;j++){
            array[j]=in.nextInt();
        }

        for(int k=0;k<numberOfIntegers;k++){
            int newValueIndex=(k+numberOfRotations)%numberOfIntegers;
            System.out.print(array[newValueIndex]);
            if(k!=numberOfIntegers-1){
                System.out.print(" ");
            }
        }

    }
}
