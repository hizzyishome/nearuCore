package currucy.executor;

import currucy.thread.MyRunnable;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description:
 * @Author: ZhaoZhenHua1 Administrator
 * @Date: 2019/11/21 18:58
 */
public class DemoEntry {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            if (i == 8) {
                executorService.shutdownNow();
            }
            executorService.execute(new MyRunnable());
        }
        executorService.shutdown();
    }
}
