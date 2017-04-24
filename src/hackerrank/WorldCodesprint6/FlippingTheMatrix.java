package hackerrank.WorldCodesprint6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by kazanture on 4/24/2017.
 * https://www.hackerrank.com/contests/world-codesprint-6/challenges/flipping-the-matrix
 */
public class FlippingTheMatrix {
    public static void main(String[] args) {

        ArrayList currentNumbers = new ArrayList();
        ArrayList targetNumbers = new ArrayList();
        Scanner in = new Scanner(System.in);
        int queryNumber = in.nextInt();

        for (int i = 0; i < queryNumber; i++) {
            int matrixHalfSize = in.nextInt();
            int matrix[][] = new int[matrixHalfSize * 2][matrixHalfSize * 2];
            int sum = 0;
            for (int j = 0; j < matrixHalfSize * 2; j++) {
                for (int k = 0; k < matrixHalfSize * 2; k++) {
                    matrix[j][k] = in.nextInt();
                }
            }
            for (int j = 0; j < matrixHalfSize; j++) {
                for (int k = 0; k < matrixHalfSize; k++) {
                    int max = matrix[j][k];
                    if (max < matrix[j][matrixHalfSize * 2 - 1 - k]) {
                        max = matrix[j][matrixHalfSize * 2 - 1 - k];
                    }
                    if (max < matrix[matrixHalfSize * 2 - 1 - j][k]) {
                        max = matrix[matrixHalfSize * 2 - 1 - j][k];
                    }
                    if (max < matrix[matrixHalfSize * 2 - 1 - j][matrixHalfSize * 2 - 1 - k]) {
                        max = matrix[matrixHalfSize * 2 - 1 - j][matrixHalfSize * 2 - 1 - k];
                    }

                    sum += max;
                }
            }
            System.out.println(sum);
        }
    }
}
