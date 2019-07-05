package MyArrayList;

import java.util.Arrays;

public class MyArrayList {

    private Object[] myStore;
    private int actSize = 0;

    public MyArrayList() {
        myStore = new Object[10];
    }

    public Object get(int index){
        if(index < actSize){
            return myStore[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void add(Object object){
        if(myStore.length-actSize <= 5){
            increaseListSize();
        }
        myStore[actSize++] = object;
    }

    public Object remove(int index){
        if(index < actSize){
            Object object = myStore[index];
            myStore[index] = null;
            int tmp = index;
            while (tmp < actSize){
                myStore[tmp] = myStore[tmp+1];
                myStore[tmp+1] = null;
                tmp++;
            }
            actSize--;
            return object;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public int size(){
        return actSize;
    }

    private void increaseListSize(){
        myStore = Arrays.copyOf(myStore,myStore.length*2);
        System.out.println("\nNew length: " + myStore.length);
    }

    public static void main(String args[]){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(new Integer(2));
        myArrayList.add(new Integer(5));
        myArrayList.add(new Integer(1));
        myArrayList.add(new Integer(23));
        myArrayList.add(new Integer(14));
        for(int i=0;i<myArrayList.size();i++){
            System.out.println(myArrayList.get(i)+" ");
        }
        myArrayList.add(new Integer(29));
        System.out.println("Element at index 3: " + myArrayList.get(3));
        System.out.println("List size: " + myArrayList.size());
        System.out.println("Removing element at index 2: " + myArrayList.remove(2));
        for (int i=0; i<myArrayList.size();i++){
            System.out.println(myArrayList.get(i)+" ");
        }
    }

}