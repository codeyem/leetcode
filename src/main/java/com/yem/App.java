package com.yem;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
//        ReentrantLock lock = new ReentrantLock();
//        lock.lock();
//        System.out.println(Thread.currentThread().getName());
//        Thread thread = new Thread() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName());
//                lock.lock();
//            }
//        };
//        thread.start();

        ArrayList<String> list = new ArrayList<>();
        list.add("!");
        list.add("!");
        list.add("!");
        list.add("!");
        list.add("!");
        list.add("!");
        list.add("!");
        list.add("!");
        list.add("!");
        list.add("!");
        list.add("!");
        list.remove(1);
    }
}

