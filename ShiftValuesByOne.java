public class ShiftValuesByOne {

    public static void main(String[] args){

        int[] newArray = new int[]{1,2,3,4,5};

        int[] finalArray = shiftValues(newArray);
        for(int i=0; i<finalArray.length;i++){
            System.out.println(finalArray[i]);
        }

    }



    public static int[] shiftValues(int[] array){


        int[] shiftedArray = array;

        for(int i=0;i< array.length;i++){
            if(i != 0 && i != array.length){
                shiftedArray[i-1] = array[i];
            }
        }
        shiftedArray[shiftedArray.length-1] = 0;

        return shiftedArray;
    }



}
