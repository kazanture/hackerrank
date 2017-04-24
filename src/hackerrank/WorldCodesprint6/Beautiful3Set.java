package hackerrank.WorldCodesprint6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by kazanture on 4/24/2017.
 * https://www.hackerrank.com/contests/world-codesprint-6/challenges/beautiful-3-set
 */
public class Beautiful3Set {
    private static int[] usedX;
    private static int[] usedY;
    private static int[] usedZ;

    public class Triplet {
        public int x;
        public int y;
        public int z;
    }

    public static ArrayList wholeList = new ArrayList();
    public static int elementCount = 0;

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        elementCount = (n * 2) / 3 + 1;


        usedX = new int[n + 1];
        usedY = new int[n + 1];
        usedZ = new int[n + 1];
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < elementCount; i++) {
            Beautiful3Set solution = new Beautiful3Set();
            ArrayList newXList = new ArrayList();
            int x = i;
            for (int j = 0; j <= n - x; j++) {
                int yOffset = elementCount / 2;
                if (elementCount % 2 == 0) {
                    yOffset++;
                }
                int y = (j + yOffset) % (n - x + 1);
                int z = n - (x + y);

                Triplet triplet = solution.new Triplet();
                triplet.x = x;
                triplet.y = y;
                triplet.z = z;
                newXList.add(triplet);
            }
            wholeList.add(newXList);
        }

        shrinkList(0, n);
        System.out.println(elementCount);

        while (!shrinkStack.isEmpty()) {
            Triplet triplet = (Triplet) shrinkStack.pop();
            System.out.println(triplet.x + " " + triplet.y + " " + triplet.z);
        }


    }

    private static Stack shrinkStack = new Stack();
    private static Stack tmpStack = new Stack();

    private static int shrinkList(int begin, int max) {

        if (tmpStack.size() == elementCount) {
            shrinkStack = tmpStack;
            return 0;
        }
        for (int i = begin; i < wholeList.size(); i = i + 1) {
            ArrayList xList = (ArrayList) wholeList.get(i);
            for (int j = 0; j < xList.size(); j++) {
                Triplet triplet = (Triplet) xList.get(j);
                if (usedX[triplet.x] == 0 && usedY[triplet.y] == 0 && usedZ[triplet.z] == 0) {
                    usedX[triplet.x] = 1;
                    usedY[triplet.y] = 1;
                    usedZ[triplet.z] = 1;

                    tmpStack.push(triplet);
                    int ret = shrinkList(i + 1, max);
                    if (ret == 0) {
                        return 0;
                    }

                    tmpStack.pop();
                    usedX[triplet.x] = 0;
                    usedY[triplet.y] = 0;
                    usedZ[triplet.z] = 0;
                }
            }

        }
        return 1;
    }
}
