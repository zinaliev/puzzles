package org.zinaliev.puzzles.concurrency;

import java.util.concurrent.ForkJoinPool;

public class ForkJoin {

    public static void main(String[] args) {

        DeadLock dl = new DeadLock();

        System.out.println(ForkJoinPool.getCommonPoolParallelism());


    }
}
