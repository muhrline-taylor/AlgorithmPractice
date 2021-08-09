public class IsPalindrome {

    public static void main(String[] args){

        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("racecar"));



    }

    public static boolean isPalindrome(String input){

        String newInput = "";

        for(int i=input.length()-1; i>=0;i--){
            newInput += input.charAt(i);
        }
        if(newInput.equals(input)){
            return true;
        }
        return false;
    }

}
