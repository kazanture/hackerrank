package hackerrank.WorldCodesprint6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by kazanture on 4/24/2017.
 * https://www.hackerrank.com/contests/world-codesprint-6/challenges/abbr
 */
public class Abbreviation {
    public static void main(String[] args) {

        ArrayList currentNumbers = new ArrayList();
        ArrayList targetNumbers = new ArrayList();
        Scanner in = new Scanner(System.in);
        int queryNumber = in.nextInt();
        in.nextLine();
        for (int i = 0; i < queryNumber; i++) {
            boolean isYes = true;
            String stringA = in.nextLine();
            String stringB = in.nextLine();
            String upperA = upper(stringA);
            if (isSafe(upperA, stringB)) {
                while (!stringB.isEmpty() && !stringA.isEmpty()) {
                    if (stringA.toUpperCase().charAt(0) == stringB.charAt(0)) {
                        stringB = stringB.substring(1);
                    }
                    stringA = stringA.substring(1);
                }
                if (stringB.isEmpty()) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }
    }

    static boolean isSafe(String stringA, String stringB) {
        while (!stringB.isEmpty() && !stringA.isEmpty()) {
            if (stringA.charAt(0) == stringB.charAt(0)) {
                stringB = stringB.substring(1);
                stringA = stringA.substring(1);
            } else {
                stringB = stringB.substring(1);
            }

        }
        if (!stringA.isEmpty()) {
            return false;
        }
        return true;
    }

    static String upper(String str) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.toUpperCase().charAt(i)) {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    static boolean isLowerCase(String a) {
        if (a.equals(a.toLowerCase())) {
            return true;
        }
        return false;
    }

}
