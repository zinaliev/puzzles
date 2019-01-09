package org.zinaliev.puzzles.streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalApi {

    public String getPersonLastName(Person person) {
        return Optional.ofNullable(person).map(p -> p.lastName).orElse("");
    }

    public List<Character> getPersonLastNameLetters(Person person) {


        return Optional.ofNullable(person)
                .map(p -> p.lastName)
                .map(ln -> ln.chars().mapToObj(i -> (char) i))
//                .flatMap(ln -> Optional.of(ln.chars().mapToObj(i -> (char) i)))
                .orElse(Stream.empty())
                .collect(Collectors.toList());

    }
}
