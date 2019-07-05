package StringRecursiveReversal;

//Program to reverse a string using recursive methods.

public class StringRecursiveReversal {

    String reverse = "";

    public String reverseString(String string){

        if(string.length() == 1){
            return string;
        }else{
            reverse += string.charAt(string.length()-1)
                    +reverseString(string.substring(0,string.length()-1));
            return reverse;
        }
    }
    public static void main(String arrgs[]){
        StringRecursiveReversal stringRecursiveReversal = new StringRecursiveReversal();
        System.out.println("Result: " + stringRecursiveReversal.reverseString("Java4You"));
    }

}
