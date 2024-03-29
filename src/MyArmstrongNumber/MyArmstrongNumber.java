package MyArmstrongNumber;

public class MyArmstrongNumber {

    public boolean isArmstrongNumber(int number){

        int tmp = number;
        int noOfDigits = String.valueOf(number).length();
        int sum = 0;
        int div = 0;
        while (tmp > 0)
        {
            div = tmp % 10;
            int temp = 1;
            for(int i=0;i<noOfDigits;i++){
                temp *= div;
            }
            sum += temp;
            tmp = tmp/10;
        }
        if (number == sum){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]){
        MyArmstrongNumber myArmstrongNumber = new MyArmstrongNumber();
        System.out.println("Is 371 Armstrong number ? " + myArmstrongNumber.isArmstrongNumber(371));
        System.out.println("Is 523 Armstrong number ? " + myArmstrongNumber.isArmstrongNumber(523));
        System.out.println("Is 153 Armstrong number ? " + myArmstrongNumber.isArmstrongNumber(153));
    }


}