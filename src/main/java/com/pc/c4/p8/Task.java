package com.pc.c4.p8;

import java.util.Date;

/**
 * Created by Switch on 2017/4/7.
 */
public class Task implements Runnable {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.printf("%s: Starting at : %s\n", name, new Date());
    }
}
