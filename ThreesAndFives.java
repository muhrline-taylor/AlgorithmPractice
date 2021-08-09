import java.util.ArrayList;
import java.util.List;

public class ThreesAndFives {

    public static void main(String[] args){

        List<Long> finalList = threesAndFives(new Long(5), new Long(1000));
        for(int i=0; i<finalList.size();i++){
            System.out.println(finalList.get(i));
        }

    }


    public static List<Long> threesAndFives(Long startValue, Long endValue){

        List<Long> newList = new ArrayList<Long>();

        for(Long i=startValue;i<=endValue;i++){
            if(i%3 == 0 && i%5 != 0){
                newList.add(i);
            } else if(i%5 == 0 && i%3 != 0){
                newList.add(i);
            }
        }

        return newList;
    }


}
