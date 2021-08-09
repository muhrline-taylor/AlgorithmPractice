public class ParensValid {

    public static void main(String[] args){

        System.out.println(parensValid("asdv(adfg(kln)kn"));
        System.out.println(parensValid("asdv(adfg(kln)kn)"));
        System.out.println(parensValid("adfg)lkandfg("));

        System.out.println(bothValid("kjn{klnadsfg(iu)iubagf}"));
        System.out.println(bothValid("kjnklnadsfg(iu)iubagf}"));
    }

    public static boolean parensValid(String input){

        int parenCounter = 0;

        for(int i=0; i<input.length();i++){
            if(input.charAt(i) == '('){
                parenCounter ++;
            } else if(input.charAt(i) == ')') {
                parenCounter--;
            }
            if(parenCounter < 0){
                return false;
            }
        }
        if(parenCounter == 0){
            return true;
        } else {
            return false;
        }
    }

    public static boolean bracesValid(String input){

        int braceCounter = 0;

        for(int i=0;i<input.length(); i++){
            if(input.charAt(i) == '{'){
                braceCounter ++;
            } else if(input.charAt(i) == '}'){
                braceCounter --;
            }
            if(braceCounter < 0){
                return false;
            }
        }
        if(braceCounter == 0){
            return true;
        } else {
            return false;
        }

    }

    public static boolean bothValid(String input){

        if(parensValid(input) == true && bracesValid(input) == true){
            return true;
        }
        return false;
    }


}
