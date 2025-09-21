package threads;
// what we want is to run both of these methods at the same time parallel using threads
// first step to create a thread class is extending it with the Thread class
// now it is imp to name the method we want to implement "run".
// to call the method in the main function, we do not use the method name there we use start.
// imagine a race being held where the run() is the racers standing at the start position,
// they won't run until we call the start() function


// in this many threads run at the same time, that's why some threads.hello are printed and then some hii,
// what if we want to run these threads one by one??
// we need the thread to sleep after each time it runs,
// so we need to use the sleep method,
// the sleep method throws an exception, so we need to handle it either by try catch(good approach) or by using throws exception in the class itself(bad approach)
// it is not necessary after using sleep in both the methods that they will be printed one after the another only
// they can collide to, like two threads.hello can be printed in a row before printing the next threads.hi, because the time of them might collide at some point so it is all upto the scheduler
class hello extends Thread{

    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("hello");
            // using sleep to interrupt the thread running:
            try {
                Thread.sleep(3);    // time in milliseconds for how much we want to stop the thread execution
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

class hi extends Thread{

    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(3);    // time in milliseconds for how much we want to stop the thread execution
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

public class threadss {

    public static void main(String[] args) {
        hello hel = new hello();
        hi h = new hi();

        hel.start();
        h.start();
        System.out.println(hel.getPriority());  // a thread can have priority ranging from 1 to 10
        hel.setPriority(Thread.MAX_PRIORITY);   // even though we have set the priority to max it does not mean it will be assigned to the thread
                                                // it only means that we are suggesting the scheduler to give this thread the maximum priority, but different schedulers,
                                                // follow different algo to decide the priority of the scheduler
    }

}
