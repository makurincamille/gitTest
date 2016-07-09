package MultiThreading;

/**
 * Created by Camille on 09.07.2016.
 */
public class ThreadTwo implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 20; i++) {
               // System.out.println("Thread two is running. Iteration = " +i);
                System.out.println("Condition = "+SomeClassWithConst.isCondition());
                Thread.sleep(400);
            }
            System.out.println("Thread two finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

