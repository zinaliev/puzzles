package org.zinaliev.puzzles.concurrency;

import java.util.concurrent.locks.ReentrantLock;

public class DeadLock {

    public static void main(String[] args) throws InterruptedException {

        ReentrantLock a = new ReentrantLock();
        ReentrantLock b = new ReentrantLock();

        Thread threadA = new Thread(() -> {
            a.lock();

            while(!b.isLocked())
                System.out.println("Thread A is spin-waiting till lock B is locked");

            b.lock();
            System.out.println("Thread A acquired lock B");
            b.unlock();
            a.unlock();
        });

        Thread threadB = new Thread(() -> {
            b.lock();

            while(!a.isLocked())
                System.out.println("Thread B is spin-waiting till lock A is locked");

            a.lock();
            System.out.println("Thread B acquired lock A");
            a.unlock();
            b.unlock();
        });

        threadA.start();
        threadB.start();

        threadA.join();
        threadB.join();

        System.out.println("Completed");

    }
}
