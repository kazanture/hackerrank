package hackerrank.BookingComBackEndCodeSprint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by kazanture on 4/24/2017.
 */
public class Reviews {
    public static Map<String,Integer> passionReviews=new HashMap<String,Integer>();

    //reviewer passion id= reviewerid_passionname
    public static Map<String,Integer> reviewerPassionReviews=new HashMap<String,Integer>();



    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numberOfPassions = in.nextInt();
        int numberOfReviews = in.nextInt();
        ArrayList<String> passionList=new ArrayList<String>();

        for(int i=0;i<numberOfPassions;i++){
            String passion=in.next();
            passionReviews.put(passion.toLowerCase(),-1);
            passionList.add(passion.toLowerCase());
        }
        for(int i=0;i<numberOfReviews;i++){
            int reviewerId=in.nextInt();
            long timeStamp=in.nextLong();

            in.nextLine();
            String review=in.nextLine().toLowerCase();

            for (Map.Entry<String, Integer> entry : passionReviews.entrySet())
            {
                String passion=entry.getKey();

                if(review.indexOf(passion)>-1){
                    String reviewerPassionId=reviewerId+"_"+passion;
                    Integer reviewerPoint=reviewerPassionReviews.get(reviewerPassionId);
                    if(reviewerPoint==null){
                        reviewerPoint=0;
                    }
                    if(review.length()>=100){
                        reviewerPoint+=20;
                    }else{
                        reviewerPoint+=10;
                    }
                    long beginDate=1465948800;
                    long endDate=1468540800;
                    if(timeStamp<=endDate&&timeStamp>=beginDate){
                        reviewerPoint+=20;
                    }
                    else{
                        reviewerPoint+=10;
                    }
                    reviewerPassionReviews.put(reviewerPassionId,reviewerPoint);
                    Integer maxPointReviewerId=entry.getValue();
                    if(maxPointReviewerId==-1){
                        passionReviews.put(passion,reviewerId);
                    }else{
                        int maxPointSoFar=reviewerPassionReviews.get(maxPointReviewerId+"_"+passion);
                        if(reviewerPoint>maxPointSoFar){
                            passionReviews.put(passion,reviewerId);
                        }else if(reviewerPoint==maxPointSoFar){
                            if(reviewerId<maxPointReviewerId){
                                passionReviews.put(passion,reviewerId);
                            }
                        }
                    }
                }
            }
        }
        for(int i=0;i<passionList.size();i++){
            String passion=passionList.get(i);
            System.out.println(passionReviews.get(passion));
        }

    }

}
