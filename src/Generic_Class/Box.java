package Generic_Class;//A generic class declaration looks like a non-generic class declaration, except that
//the class name is followed by a type parameter section.

//The type parameter section of a generic class can have one or more type parameters
//separated by commas. These classes are know as parameterized classes of parameterized
//types because they accept one or more parameters

public class Box<T> {
    private T t;
    //Once it has been instantiated with a type, the object will only be able to work with that type

    public T get() {
        return t;
    }

    public Box(T t) {
        this.t = t;
    }




}
