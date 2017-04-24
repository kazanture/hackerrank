package hackerrank.BookingComBackEndCodeSprint;

import java.util.*;

/**
 * Created by kazanture on 4/24/2017.
 */
public class CouplingPassions {
    public static Map<String,Integer> passionGuests=new HashMap<String,Integer>();


    public class Destination{
        String name;
        double latitude;
        double longitude;
        ArrayList<String> passionList=new ArrayList<String>();

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getLatitude() {
            return latitude;
        }

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }

        public double getLongitude() {
            return longitude;
        }

        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }

        public ArrayList<String> getPassionList() {
            return passionList;
        }

        public void setPassionList(ArrayList<String> passionList) {
            this.passionList = passionList;
        }
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numberOfGuests = in.nextInt();

        for(int i=0;i<numberOfGuests;i++){
            int numberOfPassions=in.nextInt();
            for(int j=0;j<numberOfPassions;j++){
                String passion=in.next();
                Integer passionCount=passionGuests.get(passion);
                if(passionCount==null){
                    passionGuests.put(passion,1);
                }else{
                    passionCount++;
                    passionGuests.put(passion,passionCount);
                }
            }
        }
//        passionGuests=sortByValue(passionGuests);
        int numberOfLocations = in.nextInt();
        ArrayList<Destination> destinationList=new ArrayList<Destination>();
        for(int i=0;i<numberOfLocations;i++){
            String destinationName=in.next();
            double latitude=in.nextDouble();
            double longitude=in.nextDouble();
            CouplingPassions container=new CouplingPassions();
            Destination destination=container.new Destination();
            destination.setName(destinationName);
            destination.setLatitude(latitude);
            destination.setLongitude(longitude);
            int numberOfPassions=in.nextInt();
            for(int j=0;j<numberOfPassions;j++){
                String passion=in.next();
                if(passionGuests.get(passion)!=null) {
                    destination.getPassionList().add(passion);
                }
            }
            destinationList.add(destination);
        }
        Map<String,Integer> destinationPairMap=new HashMap<String,Integer>();
        int maxSatisfactionCount=Integer.MIN_VALUE;
        Destination candidate1=null;
        Destination candidate2=null;
        double currentDistance=Double.MAX_VALUE;
        for(int i=0;i<destinationList.size();i++){
            for(int j=i+1;j<destinationList.size();j++){
                destinationPairMap.clear();
                Destination destination1=destinationList.get(i);
                Destination destination2=destinationList.get(j);
                for(int k=0;k<destination1.getPassionList().size();k++){
                    String passion=destination1.getPassionList().get(k);
                    destinationPairMap.put(passion,0);
                }
                for(int k=0;k<destination2.getPassionList().size();k++){
                    String passion=destination2.getPassionList().get(k);
                    destinationPairMap.put(passion,0);

                }
                if(destinationPairMap.size()>maxSatisfactionCount){
                    candidate1=destination1;
                    candidate2=destination2;
                    currentDistance=getDistance(destination1.getLatitude(),destination1.getLongitude(),destination2.getLatitude(),destination2.getLongitude());
                    maxSatisfactionCount=destinationPairMap.size();
                }
                else if(destinationPairMap.size()==maxSatisfactionCount){
                    double distance=getDistance(destination1.getLatitude(),destination1.getLongitude(),destination2.getLatitude(),destination2.getLongitude());
                    if(distance<currentDistance){
                        candidate1=destination1;
                        candidate2=destination2;
                        currentDistance=distance;
                    }
                }

            }
        }

        ArrayList<String> choosenDestinations=new ArrayList<String>();
        choosenDestinations.add(candidate1.getName());
        choosenDestinations.add(candidate2.getName());
        Collections.sort(choosenDestinations);;
        System.out.println(choosenDestinations.get(0)+" "+choosenDestinations.get(1));


    }



    public static double getDistance(double lat1,double lon1,double lat2,double lon2) {
        int EARTH_RADIUS = 6371;//in km
        double p1latInRadians  = Math.toRadians( lat1 );
        double p2latInRadians  = Math.toRadians( lat2 );
        double p1lonInRadians  = Math.toRadians( lon1 );
        double p2lonInRadians  = Math.toRadians( lon2 );

        return Math.acos( Math.sin( p1latInRadians ) * Math.sin( p2latInRadians ) +
                Math.cos( p1latInRadians ) * Math.cos( p2latInRadians ) *
                        Math.cos( p2lonInRadians - p1lonInRadians) ) * EARTH_RADIUS;
    }
}
