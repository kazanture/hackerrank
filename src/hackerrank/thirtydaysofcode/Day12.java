package hackerrank.thirtydaysofcode;

import hackerrank.thirtydaysofcode.Mock.Person;

/**
 * Created by kazanture on 4/24/2017.
 * https://www.hackerrank.com/challenges/30-inheritance
 */

public class Day12  extends Person {
    private int[] testScores;
    Day12(String firstName, String lastName, int id,int[] scores){
        super(firstName,lastName,id);
        this.testScores=scores;
    }

    public char calculate(){
        int sum=0;
        for(int i=0;i<testScores.length;i++){
            sum+=testScores[i];
        }
        int average=sum/testScores.length;
        if(average<40){
            return 'T';
        }
        else if(average<55){
            return 'D';
        }
        else if(average<70){
            return 'P';
        }
        else if(average<80){
            return 'A';
        }
        else if(average<90){
            return 'E';
        }
        else{
            return 'O';
        }
    }
}
