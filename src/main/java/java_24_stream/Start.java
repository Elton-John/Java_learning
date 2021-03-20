package java_24_stream;

import java_00_revision.Arr;
import java_00_revision.Calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Start {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        String hello = "9119";

        hello.chars().mapToObj(value -> (char) value).forEach(character -> {
            String s = character.toString();
            int n = Integer.parseInt(s);
            n = n * n;
            builder.append(n);

        });
        System.out.println(builder.toString());

        int[] intArr = {1, 5, 10};
        String[] stringArr = {"Ala", "ma", "kota"};
        char[] charArr = {'a', 'b', 'c'};
        Arrays.stream(intArr);
        Arrays.stream(stringArr);
        Stream<Character> stream = new String(charArr).chars().mapToObj(value -> (char) value);
        String word = new String(charArr);
        System.out.println(word);
        // stream.forEach(System.out::println);
        Stream<Character> stream1 = IntStream.range(0, charArr.length).mapToObj(value -> charArr[value]);
        //  stream1.forEach(System.out::println);

        Stream<Character> concat = Stream.concat(stream, stream1);
        concat.forEach(System.out::println);
        Stream<Integer> integerStream = Stream.of(2, 5, 10);
        Stream<String> stringStream = Stream.of("2", "5");
        Stream<Character> characterStream = Stream.of('a', 'b', 'c');

        IntStream intStream = stringStream.mapToInt(Integer::parseInt);
        List<String> list = new ArrayList<>();
        list.add("ljlj");
        list.add("ljljff");

        List<String> stringList = list.stream().filter(v -> v.length() > 2).collect(Collectors.toList());
        int[] ints = Arrays.stream(intArr).filter(v -> v > 0).toArray();

//        String[] strings = (String[]) Arrays.stream(stringArr).filter(v ->  v.length()>0).toArray();


        StringBuilder myBuilder = new StringBuilder();
        Stream<Character> chStream = new String(charArr).chars().mapToObj(v -> (char) v);
        chStream.forEach(myBuilder::append);
        char[] chars = myBuilder.toString().toCharArray();


        List<Integer> collect = integerStream.collect(Collectors.toList());

        String reduce = stringList.stream().reduce("", String::concat);
        System.out.println(reduce);


//        System.out.println(getUpperEverySecondLetter("abba"));
//        int missing = 0;
//        int[] sorted = Arrays.stream(intArr).sorted().toArray();
//        for (int i = 0; i < sorted.length; i++) {
//            int actual = sorted[i];
//            int next = sorted[i + 1];
//            if (actual != next - 1) {
//                missing = actual + 1;
//            }
//        }
     //   System.out.println(fibonacci(10));
     //   System.out.println(fibonacci(100));

        System.out.println(factorial(4));

    }

    public static long fibonacci(int n) {
        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];

    }

    public static int factorial (int n){
        if(n<=1){
            return 1;
        }
        return n * factorial(n-1);
    }


    public static String getUpperEverySecondLetter(String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        return new String(chars);
    }


}
