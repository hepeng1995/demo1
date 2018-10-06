package ThreadDemo;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {
    public static void main(String[] args) {
        ExecutorService es= Executors.newFixedThreadPool(2);
        es.submit(new MyRunnable());
        es.submit(new MyRunnable());
        es.shutdown();
    }
}

