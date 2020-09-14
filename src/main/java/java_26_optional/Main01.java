package java_26_optional;

import java.util.Optional;

public class Main01 {
    public static void main(String[] args) {
        Optional<String> fullName = Optional.ofNullable( null );


        System.out.println("Is full name set? Answer: " + fullName.isPresent());
        System.out.println("Full name is " + fullName.orElseGet(() -> "unknown"));
        System.out.println(fullName.map(s -> "Hi, "+s).orElse("Hi, my guest!"));

    }
}
