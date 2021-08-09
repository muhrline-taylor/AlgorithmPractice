public class SquareValues {

    public static void main(String[] args){
        int[] newArray = new int[]{1,2,3,4,5,6};

        int[] finalArray = squareValues(newArray);

        for(int i=0;i<finalArray.length;i++){
            System.out.println(finalArray[i]);
        }


    }


    public static int[] squareValues(int[] array){
        int[] squaredArray = array;

        for(int i=0; i<array.length;i++){
            squaredArray[i] = squaredArray[i]*squaredArray[i];
        }

        return squaredArray;
    }


}
