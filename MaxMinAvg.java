public class MaxMinAvg {


    public static void main(String[] args){

        int[] newArray = new int[]{1,2,3,4,5,6,7,8};

        minMaxAvg(newArray);

    }


    public static void minMaxAvg(int[] array){
        int min = array[0];
        int max = array[0];
        float sum = 0;

        for(int i=0; i< array.length;i++){
            if(array[i] < min){
                min = array[i];
            } else if(array[i] > max){
                max = array[i];
            } else if(array[i] == min && i != 0 || array[i] == max && i != 0){
                System.out.println("WARNING: Duplicate values detected!");
            }
            sum += array[i];
        }
        float avg = sum / array.length;
        System.out.println("Min = "+min);
        System.out.println("Max = "+max);
        System.out.println("Avg = "+avg);

    }
}
