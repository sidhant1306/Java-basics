package threads;
// we have an interface runnable with the run method,
// so we don't have to extend our class with the Thread class, it is not good extending it because,
// if we want to extend our class from any other class, it won't be possible because multiple inheritance is not allowed in java,
// now that's why we use implements, implementing it from an interface having the run() method

// now in the main method we have to create two threads, because the start method can not be used on the Runnable interface,
// as the runnable interface only has the run() method,
// and in the thread class we can also assign the thread to some object,
// the thread class has a constructor which takes a Runnable task and as runnable is an interface,
// we all know that we can make a new object of a class(threadOne and threadTwo in this case), of type of some interface(Runnable type in this case).

class threadOne implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class threadTwo implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
public class threadss2 {

    public static void main(String[] args) {
        Runnable obj1 = new threadOne();
        Runnable obj2 = new threadTwo();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }

}
