package com.thread;

public class ThreadMain {
    public static void main(String[] args) {
        new Thread(new MyThread("Th1")).start();
        new Thread(new MyThread("Th2")).start();
    }
}
