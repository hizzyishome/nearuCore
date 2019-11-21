package currucy.thread;

import java.util.concurrent.Callable;

/**
 * @Description:
 * @Author: ZhaoZhenHua1 Administrator
 * @Date: 2019/11/21 18:45
 */
public class MyCallable implements Callable<String> {
    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public String call() throws Exception {
        System.out.println("in call print");
        return "my callable run!";
    }
}

