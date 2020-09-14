package java_26_optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main02 {
    public static void main(String[] args) {
        List<Optional<String>> listOfOptionals = Arrays.asList(
                Optional.empty(), Optional.of("java"), Optional.empty(), Optional.of("python"), Optional.of("php"), Optional.empty(), Optional.of(""));

       listOfOptionals.stream()
               .filter(s -> s.isPresent()&&!s.get().isEmpty())
               .map(s -> s.get())
               .forEach(System.out::println);


    }
}
