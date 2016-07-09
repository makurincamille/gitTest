package MultiThreading;


/**
 * Created by Camille on 09.07.2016.
 */
public class ThreadOne implements Runnable {
    public void run() {
        try {
            SomeClassWithConst.setStatus(1);
            for (int i = 0; i < 20; i++) {
                System.out.println("Switch");
               SomeClassWithConst.setCondition(SomeClassWithConst.isCondition()?false:true);
                System.out.println("---------------------");
                System.out.println("---------------------");
                Thread.sleep(550);
            }
            System.out.println("Thread one finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
