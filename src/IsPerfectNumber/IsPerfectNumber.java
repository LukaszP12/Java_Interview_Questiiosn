package IsPerfectNumber;

public class IsPerfectNumber {

    public boolean IsPerfectNumber(int number){

        int temp = 0;
        for(int i=1;i<=number/2;i++){
            if(number%i == 0){
                temp += i;
            }
        }

        if(temp == number){
            System.out.println("It is a perfect number");
            return true;
        } else {
            System.out.println("It is not a perfect number");
            return false;
        }
    }

    public static void main(String args[]){
        IsPerfectNumber isPerfectNumber = new IsPerfectNumber();
        System.out.println("Is perfect number: " + isPerfectNumber.IsPerfectNumber(28));
        System.out.println("Is perfect number: " + isPerfectNumber.IsPerfectNumber(6));
    }

}
