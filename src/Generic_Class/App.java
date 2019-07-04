package Generic_Class;

public class App {
    public static void main(String args[]){

        Box<Integer> integerBox = new Box<Integer>(10);
        Box<String> stringBox = new Box<String>("Hello World");
        Box<Float> floatBox = new Box<Float>(10.f);

        System.out.println("Integer Value : " + integerBox.get());
        System.out.println("String value : " + stringBox.get());
        System.out.println("Float box : " + stringBox.get());

    }



}
