package pl.sda.thread;

import java.util.concurrent.Callable;

import static java.lang.Thread.sleep;

public class LoggingCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 3");
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return "";
    }
}
