package com.pc.c4.p10;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * Created by Switch on 2017/4/7.
 */
public class ExecutableTask implements Callable<String> {
    private String name;

    public ExecutableTask(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        try {
            long duration = (long) (Math.random() * 10);
            System.out.printf("%s: Waiting %d seconds for results.\n", this.name, duration);
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
        }
        return "Hello, world. I'm " + name;
    }

    public String getName() {
        return name;
    }
}
