package hackerrank.thirtydaysofcode;

import java.util.Scanner;

/**
 * Created by kazanture on 4/23/2017.
 */
public class Day2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Write your calculation code here.

        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round((double)mealCost*(1+(double)(tipPercent+taxPercent)/100.0));

        // Print your result
        System.out.println("The total meal cost is "+totalCost+" dollars.");
    }
}
