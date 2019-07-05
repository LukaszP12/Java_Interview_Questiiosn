package MyDeadlock;
/*
Deadlock describes a situation where two or more threads are blocked forever, waiting for each other.
Deadlocks can occur in Java when the synchronized keyword causes the executing thread to block while waiting to get the lock,
associated with the specified object. Since the thread might already hold locks associated with other objects,
two threads could each be waiting for the other to release a lock. In such case, they will end up waiting forever.
 */

public class MyDeadlock {

    String str1 = "Java";
    String str2 = "UNIX";

    Thread thread1 = new Thread("My Thread"){
        public void run(){
            synchronized (str1){
                synchronized ((str2)){
                    System.out.println(str1 + str2);
                }
            }
        }
    };

    Thread thread2 = new Thread("My Thread 2"){
        public void run(){
            synchronized (str2){
                synchronized (str1){
                    System.out.println(str2+str1);
                }
            }
        }
    };

    public static void main(String args[]){
        MyDeadlock myDeadlock = new MyDeadlock();
        myDeadlock.thread1.start();
        myDeadlock.thread2.start();
    }

}