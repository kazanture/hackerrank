package hackerrank.datastructures.strings;

import java.util.Scanner;

/**
 * Created by kazanture on 4/24/2017.
 * https://www.hackerrank.com/challenges/camelcase
 */
public class CamelCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int wordCount=1;
        for(int i=0;i<s.length();i++){
            char currentChar=s.charAt(i);
            if(currentChar<='Z'){
                wordCount++;
            }

        }
        System.out.println(wordCount);
    }
}
