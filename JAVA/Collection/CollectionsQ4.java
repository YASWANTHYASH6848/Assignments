import java.util.*;

public class CollectionsQ4 {
    int date,month,year;
    
    public CollectionsQ4(int date,int month,int year){
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public String toString(){
        return date+"-"+month+"-"+year;
    }

    public int getYear(){
        return year;
    }
    
    public static void main(String[] args) {
        LinkedList<CollectionsQ4> dob = new LinkedList<>();
        

        dob.add(new CollectionsQ4(22,01,2000));
        dob.add(new CollectionsQ4(18,02,1998));
        dob.add(new CollectionsQ4(15,12,1978));
        dob.add(new CollectionsQ4(15,07,2002));
        dob.add(new CollectionsQ4(01,11,1999));
        dob.add(new CollectionsQ4(29,05,2017));
        dob.add(new CollectionsQ4(11,02,1992));

        for (int i = 0 ; i<dob.size();i++){
            int year = dob.get(i).getYear();
            if (year%400==0 || year%100==0 || year%4==0){
                System.out.println(dob.get(i)+" : Born in Leap Year.");
            }else{
                System.out.println(dob.get(i)+" : Not Born in a Leap Year.");
            }
            
        }
    }
    
}