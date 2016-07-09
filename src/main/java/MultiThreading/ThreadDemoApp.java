package MultiThreading;

/**
 * Created by Camille on 09.07.2016.
 */
public class ThreadDemoApp {
    public void run() {
        Thread one = new Thread(new ThreadOne());
        Thread two = new Thread(new ThreadTwo());

        two.start();
        try {
            two.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        one.start();
    }
}
