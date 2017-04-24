package hackerrank.WorldCodesprint6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by kazanture on 4/24/2017.
 * https://www.hackerrank.com/contests/world-codesprint-6/challenges/bonetrousle
 */
public class Bonetrousle {
    HashMap<Long, Long> usedNumbers = new HashMap<Long, Long>();
    private static long sumInStack = 0;
    private static HashMap<Long, Long> combination = new HashMap<Long, Long>();
    private static StringBuffer resultString = new StringBuffer();

    public static void main(String[] args) {

        ArrayList currentNumbers = new ArrayList();
        ArrayList targetNumbers = new ArrayList();
        Scanner in = new Scanner(System.in);
        int tripNumber = in.nextInt();
        in.nextLine();
        for (int i = 0; i < tripNumber; i++) {
            long numberOfSticksToBuy = in.nextLong();
            long numberOfBoxesForSale = in.nextLong();
            long numberOfBoxesToBuy = in.nextInt();
            combination.clear();
            sumInStack = 0;
            resultString = new StringBuffer();

            if (numberOfSticksToBuy < numberOfBoxesForSale) {
                numberOfBoxesForSale = numberOfSticksToBuy;
            }

            int result = findBoxes(numberOfSticksToBuy, numberOfBoxesForSale, numberOfBoxesToBuy);
            if (result == 0) {
                if (resultString.toString().isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(resultString);
                }
            } else {
                System.out.println("-1");
            }


        }
    }

    static int findBoxes(long target, long maxBoxCount, long targetBoxCount) {
        int result = -1;

        if (maxBoxCount < 1000000000 && target > ((double) maxBoxCount / 2.0) * ((double) maxBoxCount + 1)) {
            return -1;
        }
        if (targetBoxCount == 0) {
            return -1;
        }
        if (targetBoxCount == 1 && target <= maxBoxCount) {
            if (combination.get(target) != null) {
                return -1;
            }
            combination.put(target, target);
            resultString.append(target);
            return 0;
        }

        if (target >= maxBoxCount) {
            long minimumNeeded = (targetBoxCount * (targetBoxCount - 1L)) / 2L;
            long maximumCanGet = target - minimumNeeded;
            boolean weCanQuit = false;
            if (maximumCanGet < 1) {
                return -1;
            }
            if (maximumCanGet > maxBoxCount) {
                maximumCanGet = maxBoxCount;
            } else {
                weCanQuit = true;
            }
            if (combination.get(maximumCanGet) != null) {
                return -1;
            }
            combination.put(maximumCanGet, maximumCanGet);
            resultString.append(maximumCanGet).append(" ");
            if (weCanQuit) {
                for (int i = 1; i < (targetBoxCount); i++) {
                    if (combination.get(new Long(i)) != null) {
                        return -1;
                    }
                    combination.put(new Long(i), new Long(i));
                    resultString.append(i);
                    if (i != (targetBoxCount - 1)) {
                        resultString.append(" ");
                    }
                }
                return 0;
            }
            long nextMaxBoxCount = target - maximumCanGet;
            if (nextMaxBoxCount > maxBoxCount - 1)
                nextMaxBoxCount = maxBoxCount - 1;
            result = findBoxes(target - maximumCanGet, nextMaxBoxCount, targetBoxCount - 1);
        }

        return result;

    }

}
