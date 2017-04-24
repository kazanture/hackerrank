package hackerrank.thirtydaysofcode;

import java.util.Scanner;

/**
 * Created by kazanture on 4/24/2017.
 * https://www.hackerrank.com/challenges/30-scope
 */
class Difference {
    private int[] elements;
    public int maximumDifference;

    Difference(int[] elements) {
        this.elements = elements;

    }

    public void computeDifference() {
        int minimum = 100;
        int maximum = 1;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] < minimum) {
                minimum = elements[i];
            }
            if (elements[i] > maximum) {
                maximum = elements[i];
            }
        }
        this.maximumDifference = maximum - minimum;
    }
} // End of Difference class

public class Day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
