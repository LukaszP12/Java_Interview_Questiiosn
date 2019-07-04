package MySingleton;
//Singleton class means you can create only one object for the given class.
//Constructor - private, so that we can restrict the creation of the object
//Provide a static method to get instance of the object

public class MySingleton {

    private static MySingleton myObj;

    static {
        myObj = new MySingleton();
    }

    private MySingleton() {
    }

    public static MySingleton getInstance(){
        return myObj;
    }

    public void testMe(){
        System.out.println("Hey.... it is working!!!");
    }

    public static void main(String args[]){
        MySingleton ms = getInstance();
        ms.testMe();
    }

}
