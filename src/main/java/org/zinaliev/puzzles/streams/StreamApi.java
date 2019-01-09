package org.zinaliev.puzzles.streams;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamApi {

    public Map<Character, Integer> countFrequenciesStream(String source) {
        return source.chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(
                        c -> c,
                        Collectors.reducing(0, c -> 1, Integer::sum)
                ));
    }

    public Map<Character, Integer> countFrequenciesCTM(String source) {
        return source.chars().mapToObj(i -> (char) i)
                .collect(Collectors.toMap(
                        c -> c,
                        c -> 1,
                        Integer::sum
                ));
    }

    public Map<Character, Integer> countFrequenciesCC(String source) {
        return source.chars()
                .mapToObj(i -> (char) i)
                .collect(Collector.of(
                        (Supplier<Map<Character, Integer>>) HashMap::new,
                        (s, c) -> s.merge(c, 1, Integer::sum),
                        (s1, s2) -> {
                            s2.forEach((c, i) -> s1.merge(c, i, Integer::sum));
                            return s1;
                        },
                        Collector.Characteristics.UNORDERED
                ));
    }

    public Map<Character, Integer> countFrequenciesNewMap(String source) {
        Map<Character, Integer> map = new HashMap<>();

        source.chars().forEach(c -> {
            map.merge((char) c, 1, Integer::sum);
        });

        return map;
    }

    public int countLetter(String a, Character c) {
        return (int) a.chars().filter(i -> c.equals((char) i)).count();
    }

    public char firstOrX(String a) {
        return (char) a.chars().findFirst().orElse('x');
    }

    public char lastOrZ(String a) {
        return (char) a.chars().skip(a.length() > 1 ? a.length() - 1 : 0).findAny().orElse('z');
    }

    public char findOrThrow(String a, Character c) {
        return (char) a.chars().filter(i -> c.equals((char) i)).findFirst().getAsInt();
    }

    public char getNthCharOrThrow(String a, int n) {
        return (char) a.chars().skip(n - 1).findFirst().getAsInt();
    }

    public String substring(String a, int from, int count) {
        return a.chars()
                .skip(from)
                .limit(count)
                .mapToObj(i -> (char) i)
                .map(String::valueOf)
                .reduce("", String::concat);
    }

    public boolean isFirsAndLastNameUniqueCC(List<Person> persons) {
        return persons.size() == persons.stream()
                .collect(Collector.of(
                        (Supplier<HashSet<String>>) HashSet::new,
                        (s, p) -> s.add(p.firstName + "-" + p.lastName),
                        (s1, s2) -> {
                            s1.addAll(s2);
                            return s1;
                        },
                        HashSet::size
                ));
    }

    public boolean isFirsAndLastNameUnique(List<Person> persons) {
        return persons.size() == persons.stream()
                .map(p -> p.firstName + "-" + p.lastName)
                .distinct()
                .count();
    }

    public List<Character> getUniqueFirstNamesChars(List<Person> persons) {
        return persons.stream()
                .flatMap(p -> p.firstName.chars().mapToObj(i -> (char) i))
                .distinct()
                .collect(Collectors.toList());
    }

    public List<Person> getMales(List<Person> persons) {
        return persons.stream()
                .filter(Person::isMale)
                .collect(Collectors.toList());
    }

    public Map<String, Person> getFirstOnesGroupedByFirstName(List<Person> persons) {
        return persons.stream()
                .collect(Collectors.groupingBy(
                        p -> p.firstName,
                        Collectors.reducing(null, p -> p, (p1, p2) -> p1 != null ? p1 : p2)
                ));
    }

    public Map<String, Double> getAverageAgeByFirstName(List<Person> persons) {
        double averageAge = persons.stream().mapToInt(p -> p.age).average().orElse(0.0d);

        return persons.stream()
                .collect(Collectors.groupingBy(
                        p -> p.firstName,
                        Collectors.averagingInt(p -> p.age)
                ));
    }

    public Map<String, Integer> getAverageIntAgeByFirstName(List<Person> persons) {

        return persons.stream()
                .collect(Collectors.groupingBy(
                        p -> p.firstName,
                        Collector.of(
                                () -> new int[2],
                                (a, p) -> {
                                    a[0] += p.age;
                                    a[1]++;
                                },
                                (a, b) -> {
                                    a[0] += b[0];
                                    a[1] += b[1];
                                    return a;
                                },
                                (a) -> a[1] == 0 ? 0 : a[0] / a[1]
                        )
                ));
    }

    public int getMaxMinDiff(List<Integer> numbers) {
        IntSummaryStatistics stats = numbers.stream().collect(Collectors.summarizingInt(n -> n));
        return stats.getMax() - stats.getMin();
    }

    public int getOddSum(List<Integer> numbers) {
        //numbers.stream().collect(Collectors.summingInt(n -> n % 2 == 0 ? n : 0)); // <- alternative version
        return numbers.stream().mapToInt(n -> n % 2 == 0 ? n : 0).sum();
    }

    public int getAverageOfItemsMinusOne(List<Integer> numbers) {
        return (int) numbers.stream().mapToInt(n -> n - 1).average().orElse(0);
    }

    public Map<Boolean, List<Integer>> splitOddAndEven(List<Integer> numbers) {
        return numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
    }

    public Map<Character, String> mapBy1stCharJoining2ndChars(List<String> items) {
        return items.stream()
                .collect(Collectors.toMap(
                        s -> s.charAt(0),
                        s -> s.substring(1, 2),
                        (v1, v2) -> v1 + ":" + v2
                ));
    }


}
