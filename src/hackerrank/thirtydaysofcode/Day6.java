package hackerrank.thirtydaysofcode;

import java.util.Scanner;

/**
 * Created by kazanture on 4/23/2017.
 */
public class Day6 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int numberOfStrings = in.nextInt();
        in.nextLine();
        for(int j=0;j<numberOfStrings;j++){
            String s=in.nextLine();
            StringBuffer ods=new StringBuffer();
            StringBuffer evens=new StringBuffer();
            for(int k=0;k<s.length();k++){
                if(k%2==0){
                    evens.append(s.charAt(k));
                }else{
                    ods.append(s.charAt(k));
                }
            }
            System.out.println(evens+" "+ods);

        }
    }
}
