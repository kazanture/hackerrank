package hackerrank.WorldCodesprint6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by kazanture on 4/24/2017.
 */
public class CombinationLock {
    public static void main(String[] args) {

        ArrayList currentNumbers=new ArrayList();
        ArrayList targetNumbers=new ArrayList();
        Scanner in = new Scanner(System.in);
        for(int i=0;i<5;i++){
            currentNumbers.add(in.nextInt());
        }
        for(int i=0;i<5;i++){
            targetNumbers.add(in.nextInt());
        }
        int totalMoves=0;
        for(int i=0;i<5;i++){
            int currentNumber=(int)currentNumbers.get(i);
            int targetNumber=(int)targetNumbers.get(i);
            int absDif=Math.abs(currentNumber-targetNumber);
            if(absDif<5){
                totalMoves+=absDif;
            }else{
                totalMoves+=10-absDif;
            }
        }
        System.out.println(totalMoves);

    }

}
