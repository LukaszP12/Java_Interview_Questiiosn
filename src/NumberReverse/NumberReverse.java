package NumberReverse;

public class NumberReverse {

    public int reverseNumber (int number){

        int reverse = 0;
        while (number != 0){
            reverse = (reverse*10)+(number%10);
            number = number/10;
        }
        return reverse;
    }

    public static void main(String args[]){
        NumberReverse nr = new NumberReverse();
        System.out.println("Result: " + nr.reverseNumber(16538));
    }
}
