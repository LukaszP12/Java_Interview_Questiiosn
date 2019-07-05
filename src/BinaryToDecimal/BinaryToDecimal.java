package BinaryToDecimal;

//convert binary format to decimal number using numeric operations

public class BinaryToDecimal {

    public int getDecimalFromBinary(int binary){

        int decimal = 0;
        int power = 0;
        while (true){
            if(binary == 0){
                break;
            } else {
                int tmp = binary%10;
                decimal += tmp*Math.pow(2,power);
                binary = binary/10;
                power++;
            }
        }
        return decimal;
    }
    public static void main(String args[]){
        BinaryToDecimal binaryToDecimal = new BinaryToDecimal();
        System.out.println("11 ===> "+binaryToDecimal.getDecimalFromBinary(11));
        System.out.println("110 ===> "+binaryToDecimal.getDecimalFromBinary(110));
        System.out.println("100110 ===> "+binaryToDecimal.getDecimalFromBinary(100110));
    }

}
