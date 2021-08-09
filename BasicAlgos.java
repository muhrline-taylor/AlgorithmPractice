import java.util.*;

public class BasicAlgos {
  public static void main(String[] args){
    System.out.println("BasicAlgos");

    // PRINT 1-255
    // for(int i=0; i<256; i++){
    // 	System.out.println(i);
    // }



    // FIND MAX VAL IN ARRAY
//    int[] array = new int[]{1,4,7,2,4,3};
//    int max = 0;
//
//    for(int i=0;i< array.length;i++){
//      if(i==0 || array[i] > max){
//        max = array[i];
//      } else if(array[i] == max){
//        System.out.println("multiple indices with same value!");
//      }
//    }
//
//    System.out.println(max);



    // PRINT ARRAY OF 1-255 WITH ONLY ODD INTS
//    List<Integer> array = new ArrayList<Integer>();
//    for(int j=0; j<256;j++){
//      if(j%2==1){
//        array.add(j);
//      }
//    }
//
//    for(int i=0;i<array.size();i++){
//      System.out.println(array.get(i));
//    }



    // GIVEN AN ARRAY AND A VALUE Y, COUNT AND PRINT THE NUMBER OF ARRAY VALUES >Y
    int[] array = new int[]{1,2,3,4,5,6,7,8};
    int y = 3;


    System.out.println(interpretArray(array, y));


  }


  static int interpretArray(int[] arr, int value){
    int entriesGreaterThanY = 0;
    System.out.println("into interpretArray()");
    System.out.println("Values greater than "+value+":");
      for(int i=0; i<arr.length; i++){
        if(arr[i] > value){
          System.out.println(arr[i]);
          entriesGreaterThanY ++;
        }
      }
      System.out.println("Number of values greater than "+value+":");
      return entriesGreaterThanY;
  }
}

