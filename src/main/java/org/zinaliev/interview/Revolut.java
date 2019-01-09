package org.zinaliev.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Revolut {

    private final ForkJoinPool fjp = new ForkJoinPool(1);

    public Revolut() {

    }

    public Map<Character, Integer> countCharsFrequencies(String source) {

        if (source == null)
            throw new IllegalArgumentException("input string can not be null");

        Map<Character, Integer> result = new HashMap<>();

        for (int i = 0; i < source.length(); i++) {
            result.merge(source.charAt(i), 1, Integer::sum);
        }

        return result;
    }

    public Map<Character, Long> countCharsFrequenciesOfStream(Stream<Character> sourceStream) {
        if (sourceStream == null)
            throw new IllegalArgumentException("input stream can not be null");

        final AtomicLong processed = new AtomicLong();


        try {
            return new ForkJoinPool(2).submit(() -> sourceStream
                    .parallel()
                    .limit((long) Integer.MAX_VALUE - 1)
//                    .peek(c -> System.out.println(Thread.currentThread().getName() + "-" + Thread.currentThread().getId() + " : " + processed.incrementAndGet()))
//                    .collect(Collectors.groupingByConcurrent(c -> c, Collectors.counting()));
                    .collect(Collectors.toConcurrentMap(
                            c -> c,
                            c -> 1L,
                            Long::sum
                    ))).get();

//            return sourceStream
//                    .parallel()
//                    .limit((long) Integer.MAX_VALUE + 1)
//                    .collect(Collectors.toConcurrentMap(
//                            c -> c,
//                            c -> 1L,
//                            Long::sum
//                    ));

        } catch (Throwable e) {

            System.out.println(ForkJoinPool.commonPool());
            System.out.println("Managed to process " + processed.get() + " items");
            try {
                throw e;
            } catch (InterruptedException | ExecutionException e1) {
                e1.printStackTrace();
                return null;
            }
        }
    }
}
