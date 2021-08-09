public class CoinChange {

    public static void main(String[] args){

        generateChange(19.99, 50.25);


    }



    public static void generateChange(double price, double amountGiven){

        double changeDue = amountGiven-price;

        System.out.println("Change due: "+changeDue);

        Long simpleChangeDue = (long) (changeDue * 100);



        if(simpleChangeDue > 100){
            Long dollarRemainder = simpleChangeDue%100;
            simpleChangeDue = simpleChangeDue-dollarRemainder;
            Long dollarsOwed = simpleChangeDue/100;


            System.out.println("Dollars due: "+dollarsOwed);

            if(dollarRemainder > 25){
                Long quarterRemainder = dollarRemainder%25;
                Long quartersOwed = dollarRemainder/25;

                System.out.println("Quarters owed: "+quartersOwed);

                if(quarterRemainder > 10){
                    Long dimeRemainder = quarterRemainder%10;
                    Long dimesOwed = quarterRemainder/10;

                    System.out.println("Dimes owed: "+dimesOwed);

                    if(dimeRemainder > 5){
                        Long nickelRemainder = dimeRemainder%5;
                        Long nickelsOwed = dimeRemainder/5;

                        System.out.println("Nickels owed: "+nickelsOwed);

                        Long penniesOwed = nickelRemainder;

                        System.out.println("Pennies owed: "+penniesOwed);
                    } else {
                        Long penniesOwed = dimeRemainder;

                        System.out.println("Nickels owed: 0");
                        System.out.println("Pennies owed: "+penniesOwed);
                    }
                } else {
                    Long penniesOwed = quarterRemainder;

                    System.out.println("Dimes owed: 0");
                    System.out.println("Nickels owed: 0");
                    System.out.println("Pennies owed: "+penniesOwed);
                }


            } else {
                Long penniesOwed = dollarRemainder;

                System.out.println("Quarters owed: 0");
                System.out.println("Dimes owed: 0");
                System.out.println("Nickels owed: 0");
                System.out.println("Pennies owed: "+penniesOwed);
            }
        }



    }


}
