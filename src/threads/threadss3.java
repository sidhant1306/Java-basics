package threads;

// *******************************  RACE CONDITION IN JAVA  *****************************************************

// what we want to do here is, that we need two threads to use the same method at the same time with,
// shared resources,
// the problem here is that, if we use two threads at the same time with a single or multiple shared resources,
// there are going to be time instances when both of the threads will reach the resource at the same time,
// so if we want to perform mutations(change in value) on some variable which is shared by both the threads,
// there are high chances that they will reach the resource variable at the same time

// counter is a class that have a common variable count, and everytime we call the increment function, it will increase the count by 1.


// now when we start both the threads, it means while it has been starting and being implemented,
// the sout function can also run so we get 0 everytime we run the code because even before the threads,
// starts running the sout function is implemented,
// to stop this we use join, which means the further code will wait for getting executed,
// until both the threads are finished executing.
// but even this is not enough, because there might be some times when both threads will reach to the function as the same time,
// and pick up the same value of count and perform increment on it

// so to fix it, we need to use the keyword, Synchronize in our method declaration, which will make sure that only one thread accesses the function at a time.
// so when t1 is calling the function, t2 has to wait.

import org.w3c.dom.css.Counter;

class counter {
    int count = 0;
    public synchronized void increment(){
        count++;
    }

}
public class threadss3 {
    public static void main(String[] args) throws InterruptedException {

        counter c = new counter();
        // step 1: creating a runnable object(lambda expression) to make a thread
        Runnable obj1 = () ->
        {
            for (int i = 1; i <= 20000; i++) {
                c.increment();
            }
        };

        Runnable obj2 = () ->
        {
            for (int i = 1; i <= 20000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

      t1.start();
      t2.start();
      // when we start both the threads, it means while it has been starting and being implemented,
        // the sout function can also run so we get 0 everytime we run the code because even before the threads,
        // starts running the sout function is implemented,
        // to stop this we use join, which means the further code will wait for getting executed,
        // until both the threads are finished executing.
      t1.join();
      t2.join();
        System.out.println(c.count);

    }
}
