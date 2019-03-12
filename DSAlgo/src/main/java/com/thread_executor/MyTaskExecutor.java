package com.thread_executor;

import java.util.concurrent.Executor;

public class MyTaskExecutor implements Executor {
    @Override
    public void execute(Runnable command) {
        new Thread(command).start();
    }
}
