package hackerrank.projecteuler;

import java.util.Scanner;

/**
 * Created by kazanture on 4/23/2017.
 */
public class ProjectEuler9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testNo = in.nextInt();
        for (int i = 0; i < testNo; i++) {
            int maxProduct=-1;
            int number = in.nextInt();//a+b+c=number; min a =1 min b=2 min c =3;
            boolean found=false;
            for(int a=number/3;a>=1;a--){
                for(int b=a+1;b<=number/2;b++){
                    int c=number-(a+b);
                    if((a*a+b*b)==c*c){
                        maxProduct=a*b*c;
                        found=true;
                        break;
                    }
                }
                if(found) break;
            }
            System.out.println(maxProduct);
        }
    }
}
