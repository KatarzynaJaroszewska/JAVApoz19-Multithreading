package pl.sda.thread;

import java.util.concurrent.FutureTask;

public class Main {

    public static void main(String[] args) {
        new LoggingThread().start();
        new Thread(new LoggingRunnable()).start();
        new Thread(new FutureTask<>(new LoggingCallable())).start();
    }
}
