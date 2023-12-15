package exam01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex02 {
    public static void main(String[] args) {
        String[] words1 = {"aaa", "aaa", "bb", "ccc", "ccc", "abcd"};
        Arrays.stream(words1)
                .distinct().filter(s -> s.length() >= 3)
                .forEach(System.out::println);

        System.out.println();

        List<String> words2 = Arrays.asList("aaa", "aaa", "bb", "ccc", "ccc", "abcd");
        Stream<String> stm = words2.stream();
                stm.distinct()
                .filter(s -> s.length() >= 3)
                .forEach(System.out::println);

        /** 스트림은 일회용이라 작동안됨
        stm.distinct()
                .filter(s -> s.length() >= 3)
                .forEach(System.out::println);
         */

        System.out.println(words2);

    }
}
