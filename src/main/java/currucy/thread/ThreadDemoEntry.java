package currucy.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Description:
 * @Author: ZhaoZhenHua1 Administrator
 * @Date: 2019/11/21 16:33
 */
public class ThreadDemoEntry {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
/*        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        System.out.println("main start");
        thread.start();
        System.out.println("main end");*/

/*        MyCallable myCallable = new MyCallable();
        FutureTask<String> futureTask = new FutureTask<>(myCallable);
        Thread thread1 = new Thread(futureTask);
        System.out.println("main start");
        thread1.start();
        System.out.println("main end");
        System.out.println("main result : "+futureTask.get());*/

/*        MyThread myThread = new MyThread();
        System.out.println("main start");
        myThread.start();
        System.out.println("main end");*/
    }
}
