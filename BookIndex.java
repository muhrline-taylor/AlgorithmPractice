public class BookIndex {

    // UNFINISHED

    public static void main(String[] args){
    int[] thisArray = new int[]{1,3,4,5};

    System.out.println(bookIndex(thisArray));


    }

    public static String bookIndex(int[] array){

        StringBuilder newString = new StringBuilder();

        for(int i=0; i< array.length;i++){
            if(i == 0){
                newString.append(String.valueOf(array[i]));
            }
            System.out.println(newString.charAt(newString.length()-1));
            if(i == 0 && array[i]-1 != array[i-1]){
                newString.append(",");
            }
        }

        String finalString = newString.toString();
        return finalString;
    }


}
