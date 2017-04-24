package hackerrank.WorldCodesprint6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by kazanture on 4/24/2017.
 * https://www.hackerrank.com/contests/world-codesprint-6/challenges/bon-appetit
 */
public class BonApetit {
    public static void main(String[] args) {

        ArrayList itemCostList=new ArrayList();
        Scanner in = new Scanner(System.in);
        int numberOfItems = in.nextInt();
        int nonAnnaItemIndex=in.nextInt();
        int costOfNonAnna=0;
        long totalCost=0;
        for (int i = 0; i < numberOfItems; i++) {
            int cost = in.nextInt();
            if(i==nonAnnaItemIndex){
                costOfNonAnna=cost;
            }
            itemCostList.add(cost);
            totalCost+=cost;

        }
        int annaShouldPay=(int)(totalCost-costOfNonAnna)/2;
        int amountCharged=in.nextInt();
        if(annaShouldPay==amountCharged){
            System.out.println("Bon Appetit");
        }
        else{
            System.out.println(amountCharged-annaShouldPay);
        }
    }
}
