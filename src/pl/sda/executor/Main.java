package pl.sda.executor;

import pl.sda.thread.LoggingCallable;
import pl.sda.thread.LoggingRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(new LoggingRunnable());
        executorService.submit(new LoggingCallable());

        //        ExecutorService executorService = Executors.newFixedThreadPool(2);
        //        executorService.submit(new LoggingRunnable());
        //        executorService.submit(new LoggingCallable());

        executorService.shutdown();
    }
}
