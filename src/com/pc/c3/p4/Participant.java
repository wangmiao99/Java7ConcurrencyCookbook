package com.pc.c3.p4;

import java.util.concurrent.TimeUnit;

/**
 * Created by Switch on 2017/4/5.
 */
public class Participant implements Runnable {
    private VideoConference conference;

    private String name;

    public Participant(VideoConference conference, String name) {
        this.conference = conference;
        this.name = name;
    }

    @Override
    public void run() {
        long duration = (long) (Math.random() * 10);
        try {
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        conference.arrive(name);
    }
}
