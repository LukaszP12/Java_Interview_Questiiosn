package MyPrimeNumCheck;

public class MyPrimeNumCheck {

    public boolean isPrimeNumber(int number){

        for(int i=2; i<=number/2; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        MyPrimeNumCheck myPrimeNumCheck = new MyPrimeNumCheck();
        System.out.println("Is 17 a prime number ? " + myPrimeNumCheck.isPrimeNumber(17));
        System.out.println("Is 19 a prime number ? " + myPrimeNumCheck.isPrimeNumber(19));
        System.out.println("Is 15 a prime number ? " + myPrimeNumCheck.isPrimeNumber(15));

    }

}
