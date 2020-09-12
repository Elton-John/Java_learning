package java_24_stream;


import org.apache.logging.log4j.core.util.JsonUtils;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.System.out;

public class MainAllMethodsToCreateStream {
    public static void main(String[] args) {
        // z kolekcji – za pomocą metody stream() lub parallelStream() interfejsu Collection,
        List<String> list = new ArrayList<>();
        list = Arrays.asList("sowa", "kot", "żółw", "hippo");
        List<String> collect = list.stream().
                filter(s -> s.length() > 3)
                .collect(Collectors.toList());
        out.println(collect);

        //z tablicy – za pomocą statycznej metody stream z klasy Arrays, np. Arrays.stream(array)
        String[] array = {"poniedziałek", "wtorek", "niedziela"};
        String[] arrayAfterStream = Arrays.stream(array).
                filter(s -> s.startsWith("p") || s.startsWith("w"))
                .toArray(String[]::new);
        out.println(Arrays.toString(arrayAfterStream));

        //z napisów – za pomocą metody chars()
        String word = "Longword";
        String sentence = "There are some words";

        word.chars()
                .mapToObj(value -> (char) value)
                .forEach(value -> out.print(value + " + "));
        out.println();

        sentence.chars()
                .mapToObj(value -> (char) value)
                .forEach(value -> out.print(value + " + "));

        out.println();
        //z podanych wartości – za pomocą metody Stream.of(zestaw wartości)
        Stream.of(1, 2, 3, 4, 5).filter(integer -> integer > 3).forEach(out::println);
        List<Integer> collect1 = Stream.of(1, 2, 3, 4, 5)
                .filter(integer -> integer > 3)
                .collect(Collectors.toList());
        out.println(collect1);

        Stream<String> stringStream = Stream.of("jeden", "dwa", "trzy");
        stringStream.forEach(out::println);

        //z plików – za pomocą statycznej metody lines() klasy Files
        Path path = Paths.get("test000000000.txt");
        List<String> newList = new ArrayList<>();
        try {
            Files.lines(path).forEach(s -> {
                String format = String.format("%s%s", s, sentence);
                newList.add(format);
            });
            Files.write(path,newList);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
